/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author MARIO ADRIAN NAMBO CISNEROS
 */
public class Sandshrew extends Pokemon{

    //Constructor default
    public Sandshrew() {
        this.tipo = "LUCHA";
        this.hp = 50;
        this.ataque = 75;
        this.defensa = 85;
        this.nivel = 1;
        this.precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("DISPARO LODO");
        this.habilidades.add("AVALANCHA");
        //....
    }    
    
    //Constructor alterno 1
    public Sandshrew (String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("DISPARO LODO")){
          
            System.out.println("Realizando DISPARO LODO");
        }
        else if(habilidad.equals("AVALANCHA")){
            
            System.out.println("Realizando AVALANCHA");            
        }
    
    
    }
}
