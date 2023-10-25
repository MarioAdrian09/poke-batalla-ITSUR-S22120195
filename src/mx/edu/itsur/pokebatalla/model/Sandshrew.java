/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.moves.BombaSonica;
import mx.edu.itsur.pokebatalla.moves.Hiperrayo;
import mx.edu.itsur.pokebatalla.moves.LanzaLlamas;
import mx.edu.itsur.pokebatalla.moves.Movimiento;
import mx.edu.itsur.pokebatalla.moves.PantallaDeLuz;
import mx.edu.itsur.pokebatalla.moves.PatadaGiro;
import mx.edu.itsur.pokebatalla.moves.Refugio;

/**
 *
 * @author MARIO ADRIAN NAMBO CISNEROS
 */
public class Sandshrew extends Pokemon{

      public enum Movimientos {
    PATADAGIRO,
    HIPERRAYO, 
    REFUIGO,
    }
    //Constructor default
    public Sandshrew() {
        this.tipo = "LUCHA";
        this.hp = 50;
        this.ataque = 75;
        this.defensa = 85;
        this.nivel = 1;
        this.precision = 5;
    }    
    
    //Constructor alterno 1
    public Sandshrew (String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
     public void atacar(Pokemon oponente, Sandshrew.Movimientos movimientoUtilizar)
    {
        Movimiento instanciaMovimiento;
        switch(movimientoUtilizar){
            case PATADAGIRO:
            instanciaMovimiento = new PatadaGiro();
                break;
            case HIPERRAYO:
                instanciaMovimiento = new Hiperrayo();
                break;
            case REFUIGO:
                instanciaMovimiento = new Refugio();
                break;
          
                default:
                throw new AssertionError();
        }
         instanciaMovimiento.utilizar(this, oponente);
    }
    
    
}
