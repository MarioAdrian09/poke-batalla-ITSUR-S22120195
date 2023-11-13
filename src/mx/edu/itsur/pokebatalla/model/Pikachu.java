/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import mx.edu.itsur.pokebatalla.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.moves.Latigo;
import mx.edu.itsur.pokebatalla.moves.Movimiento;

/**
 *
 * @author FJML1983
 */
public class Pikachu  extends Pokemon{
 public enum Movimientos {
        IMPACTRUENO,
        ATAQUE_RAPIDO,
        LATIGO
    }

    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
    }

    public Pikachu(String nombre) {
        this(); 
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Pikachu.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente,  int ordinalMovimiento) {
                if (this.hp <= 0) {
            System.out.println("Pikachu esta agotado y no puede realizar mas movimientos.");
            return;
        }

        
        Pikachu.Movimientos movimientoAUtilizar
                = Pikachu.Movimientos.values()[ordinalMovimiento];
        
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case IMPACTRUENO:
                instanciaMovimiento = new Impactrueno();
                break;
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
