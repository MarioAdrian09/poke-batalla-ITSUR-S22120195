/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;
import mx.edu.itsur.pokebatalla.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.moves.Latigo;
import mx.edu.itsur.pokebatalla.moves.Movimiento;

/**
 *
 * @author Mario Adrian Nambo Cisneros
 */
public class Bullbasaur extends Pokemon {

     public enum Movimientos {
        ATAQUE_RAPIDO,
        LATIGO
    }

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre) {
        this(); 
        this.nombre = nombre;

    }
     public void atacar(Pokemon oponente, Bullbasaur.Movimientos movimientoAUtilizar) {

        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case LATIGO:
                instanciaMovimiento = new Latigo();
                break;
            default:
                throw new AssertionError();
        }


        instanciaMovimiento.utilizar(this, oponente);

    }

    
}
