/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.Pokemon;
import mx.edu.itsur.pokebatalla.model.utils.FileManager;

/**
 *
 * * @author MARIO ADRIAN NAMBO CISNEROS
 */
public class Batalla implements Serializable {

    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    public void guardarProgreso() {
        FileManager.guardarPartida(this);
    }

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void IniciarBatalla() {
        System.out.println(" ******************************************************** LA BATALLA ESTA POR INICIAR ********************************************************");
        System.out.println("LOS OPONENTES SON: ");
        System.out.println(entrenador1.getNombre() + "    <----------------V.S--------------->   " + entrenador2.getNombre());

        System.out.println("");

        do {
            try {
                EligeUnPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente cuentas con:  " + "{" + entrenador1.getPokemonsCapturados().size() + "}" + "  Elige alguno de tus Pokemons");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                EligeUnPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente cuentas con:  " + "{" + entrenador2.getPokemonsCapturados().size() + "}" + "  Elige alguno de tus Pokemons");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Turno del entrenador: " + entrenadorEnTurno.getNombre());

            if (oponente.getPokemonActual() == null) {
                System.out.println("No hay un Pokémon actualmente seleccionado para el oponente");
                return;
            }

            EligeUnAtaque(entrenadorEnTurno, oponente.getPokemonActual());

            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                EligeOtroPokemon(entrenadorEnTurno);

                // Repetir el turno del entrenador que no desea cambiar de Pokémon
                /*
                while (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                    System.out.println("Este entrenador no puede avanzar sin cambiar de Pokémon.");
                    EligeOtroPokemon(entrenadorEnTurno);
                }
                 */
            }

            if (oponente.estaDerrotado()) {
                System.out.println("¡El entrenador " + oponente.getNombre() + " ha sido derrotado!");
                System.out.println(" <-------------------*****LA BATALLA A FINALIZADO  *****------------------->");
                batallaFinalizada = true;
            } else {
                guardarProgreso();
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void EligeUnPokemon(Entrenador entrenadorEnturno) {
        int idx = 1;
        System.out.println("████████████████████████████████████████████");
        for (Pokemon pokemon : entrenadorEnturno.getPokemonsCapturados()) {
            if (pokemon.gethp() < 0) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName() + "  0");
            } else {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName() + " " + pokemon.gethp());
            }
            idx++;
            System.out.println("████████████████████████████████████████████");
        }
        System.out.println("");
        System.out.println("Elige un  pokemon " + entrenadorEnturno.getNombre());

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = entrenadorEnturno.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        entrenadorEnturno.setPokemonActual(pokemonSeleccionado);
    }

    //****************************Metodo para atacar****************************
    private void EligeUnAtaque(Entrenador entrenadorEnturno, Pokemon oponente) {

        Pokemon pokemonActual = entrenadorEnturno.getPokemonActual();

        System.out.println("-----------------------------------------------------");
        System.out.println("Seleccione un ataque para " + pokemonActual.getClass().getSimpleName() + ":");

        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("-----------------------------------------------------");

        int opcionAtaque = -1;
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String input = br.readLine();

                // Intentar convertir la entrada a un entero
                opcionAtaque = Integer.parseInt(input);

                if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
                    System.out.println("La opción de ataque no es válida. Inténtalo de nuevo.");
                } else {
                    break;  
                }
            } catch (IOException ex) {
                System.out.println("Error al leer la entrada. Inténtalo de nuevo.");
                ex.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Por favor, ingrese un número válido. Inténtalo de nuevo.");
            }
        }

        //llamar al metodo instruirMovimientoAlPokemonActual
        entrenadorEnturno.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    }

    ///Cambiar pokemon
    private void EligeOtroPokemon(Entrenador entrenador) {
        System.out.println("¿Deseas cambiar de Pokémon? (S/N)");

        char respuesta = 'N';

        while (true) {
            try {
                respuesta = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
                break;  // Salir  si no hay excepciones
            } catch (IOException ex) {
                System.out.println("OCURRIO UN ERROR INTENTA DE NUEVO");
                ex.printStackTrace();
            }
        }

        if (respuesta == 'S' || respuesta == 's') {

            System.out.println("Pokémon disponibles:");
            int idx = 1;
            for (Pokemon pokemon : entrenador.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }

            System.out.println("Elige un nuevo Pokémon:");

            char auxLectura = '0';

            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            int indicePokemonNuevo = Character.getNumericValue(auxLectura) - 1;

            // Verificar si el indice es valido antes de seleccionar el nuevo Pokemon
            if (indicePokemonNuevo >= 0 && indicePokemonNuevo < entrenador.getPokemonsCapturados().size()) {
                Pokemon nuevoPokemon = entrenador.getPokemonsCapturados().get(indicePokemonNuevo);
                entrenador.setPokemonActual(nuevoPokemon);
                System.out.println("Has cambiado a " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
            } else {
                System.out.println("La opción de Pokémon no es válida. Intenta de nuevo.");
            }
        }
    }
}
