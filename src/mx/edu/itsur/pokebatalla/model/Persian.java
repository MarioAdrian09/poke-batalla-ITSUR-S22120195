/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author Mario Adrian Nambo Cisneros
 */
public class Persian extends Pokemon{

    //Constructor default
    public Persian() {
        this.tipo = "NORMAL";
        this.hp = 65;
        this.ataque = 70;
        this.defensa = 60;
        this.nivel = 1;
        this.precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("JOYA DE LUZ");
        this.habilidades.add("JUEGO SUCIO");
        //....
    }    
    
    //Constructor alterno 1
    public Persian(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("JOYA DE LUZ")){
          
            System.out.println("Realizando JOYA DE LUZ");
        }
        else if(habilidad.equals("JUEGO SUCIO")){
            
            System.out.println("Realizando JUEGO SUCIO");            
        }
    
    
    
    
    
    
    }}
