/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;
import java.io.Serializable;
import mx.edu.itsur.pokebatalla.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.moves.Latigo;
import mx.edu.itsur.pokebatalla.moves.Movimiento;

/**
 *
 * @author Mario Adrian Nambo Cisneros
 */
public class Bullbasaur extends Pokemon implements Serializable {

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
    @Override
    public Enum[] getMovimientos() {
        return Bullbasaur.Movimientos.values();
    }
    @Override
     public void atacar(Pokemon oponente, int ordinalMovimiento) {
           if (this.hp <= 0) {
            System.out.println("Bulbasaur esta agotado y no puede realizar mas movimientos.");
            return;
        }

        //Obtener el movimiento de acuerdo a su numero ordinal
        Pikachu.Movimientos movimientoAUtilizar
                = Pikachu.Movimientos.values()[ordinalMovimiento];

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
