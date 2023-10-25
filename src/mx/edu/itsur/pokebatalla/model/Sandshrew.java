/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;


import mx.edu.itsur.pokebatalla.moves.Hiperrayo;
import mx.edu.itsur.pokebatalla.moves.Movimiento;
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

    public Sandshrew() {
        this.tipo = "LUCHA";
        this.hp = 50;
        this.ataque = 75;
        this.defensa = 85;
        this.nivel = 1;
        this.precision = 5;
    }    
    

    public Sandshrew (String nombre){
        this();
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
