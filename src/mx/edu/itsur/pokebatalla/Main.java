/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.Pikachu;

import mx.edu.itsur.pokebatalla.model.Machop;
import mx.edu.itsur.pokebatalla.model.Persian;
import mx.edu.itsur.pokebatalla.model.Sandshrew;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.utils.FileManager;

/**
 *
 * @author FJML1983
 */
public class Main implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Batalla v = FileManager.leerPartida();

        if (v == null) {
            System.out.println("Hello PokeBatalla!");
            Pikachu a = new Pikachu("MARIO");
            Machop b = new Machop("Luis");
            Sandshrew c = new Sandshrew("bryan");
            Persian d = new Persian("Jose");

            Entrenador en1 = new Entrenador("Maria");
            en1.capturarPokemon(a);
            en1.capturarPokemon(b);

            Entrenador en2 = new Entrenador("Juanita");
            en2.capturarPokemon(c);
            en2.capturarPokemon(d);

            v = new Batalla(en1, en2);
        }
        v.IniciarBatalla();

    }

}
