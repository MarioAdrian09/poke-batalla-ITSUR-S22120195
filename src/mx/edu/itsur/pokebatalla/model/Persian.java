/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import mx.edu.itsur.pokebatalla.moves.Anulacion;
import mx.edu.itsur.pokebatalla.moves.BombaSonica;
import mx.edu.itsur.pokebatalla.moves.Destructor;
import mx.edu.itsur.pokebatalla.moves.Movimiento;


/**
 *
 * @author Mario Adrian Nambo Cisneros
 */
public class Persian extends Pokemon{
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
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, Persian.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
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
