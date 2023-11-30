/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.io.Serializable;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.moves.Contraataque;
import mx.edu.itsur.pokebatalla.moves.LanzaLlamas;
import mx.edu.itsur.pokebatalla.moves.Movimiento;
import mx.edu.itsur.pokebatalla.moves.PantallaDeLuz;

/**
 *
 * @author Mario Adrian Nambo Cisneros
 */
public class Machop extends Pokemon implements Serializable{
     public enum Movimientos {
    Contraataque,
    PantallaDeLuz, 
    LanzaLlamas,
    }

    //Constructor default
    public Machop() {
        this.tipo = "LUCHA";
        this.hp = 70;
        this.ataque = 80;
        this.defensa = 50;
        this.nivel = 1;
        this.precision = 3;
    }    
    
    //Constructor alterno 1
    public Machop(String nombre){
        this(); 
        this.nombre = nombre;
    }
    @Override
    public Enum[] getMovimientos() {
        return Machop.Movimientos.values();
    }
    
    @Override
     public void atacar(Pokemon oponente, int ordinalMovimiento)
    {
          if (this.hp <= 0) {
            System.out.println("Pikachu esta agotado y no puede realizar mas movimientos.");
            return;
        }

        //Obtener el movimiento de acuerdo a su numero ordinal
        
        Machop.Movimientos movimientoAUtilizar
                = Machop.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch(movimientoAUtilizar){
            case Contraataque:
            instanciaMovimiento = new Contraataque();
                break;
            case PantallaDeLuz:
                instanciaMovimiento = new PantallaDeLuz();
                break;
            case LanzaLlamas:
                instanciaMovimiento = new LanzaLlamas();
                break;
          
                default:
                throw new AssertionError();
        }
         instanciaMovimiento.utilizar(this, oponente);
    }
    }
