/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.moves.Anulacion;
import mx.edu.itsur.pokebatalla.moves.BombaSonica;
import mx.edu.itsur.pokebatalla.moves.Destructor;
import mx.edu.itsur.pokebatalla.moves.Movimiento;


/**
 *
 * @author Mario Adrian Nambo Cisneros
 */
public class Persian extends Pokemon implements Serializable{
    public enum Movimientos {
        ANULACION,
        DESTRUCTOR,
        BOMBASONICA
        
    }

    //Constructor default
    public Persian() {
        this.tipo = "NORMAL";
        this.hp = 65;
        this.ataque = 70;
        this.defensa = 60;
        this.nivel = 1;
        this.precision = 5;

    }    
    
    //Constructor alterno 1
    public Persian(String nombre){
        this(); 
        this.nombre = nombre;
    }
    @Override
    public Enum[] getMovimientos() {
        return Persian.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
          if (this.hp <= 0) {
            System.out.println("Pikachu esta agotado y no puede realizar mas movimientos.");
            return;
        }

        //Obtener el movimiento de acuerdo a su numero ordinal
        Persian.Movimientos movimientoAUtilizar
                = Persian.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ANULACION:
                instanciaMovimiento = new Anulacion();
                break;
            case DESTRUCTOR:
                instanciaMovimiento = new Destructor();
                break;
            case BOMBASONICA:
                instanciaMovimiento = new BombaSonica();
                break;
            default:
                throw new AssertionError();
        }
    }
    
   
    
    
    
    }
