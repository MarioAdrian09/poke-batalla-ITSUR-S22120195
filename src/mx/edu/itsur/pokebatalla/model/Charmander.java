/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.moves.Movimiento;

/**
 *
 * @author FJML1983
 */
public class Charmander extends Pokemon implements Serializable{
     public enum Movimientos {
        ATAQUE_RAPIDO,
    }

    public Charmander() {
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Charmander(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    @Override
    public Enum[] getMovimientos() {
        return Charmander.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente,int ordinalMovimiento) {
          if (this.hp <= 0) {
            System.out.println("Pikachu esta agotado y no puede realizar mas movimientos.");
            return;
        }

        //Obtener el movimiento de acuerdo a su numero ordinal
        Pikachu.Movimientos movimientoAUtilizar
                = Pikachu.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;

            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);

    }
}
