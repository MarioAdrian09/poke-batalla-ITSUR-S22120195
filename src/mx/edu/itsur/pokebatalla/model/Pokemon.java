/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.List;

/**
 *
 * @author FJML1983
 */
public class Pokemon {

    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected List<String> habilidades;

    Pokemon() {
    }

 public int getNivel() {
        return nivel;
    }
    public int getAtaque() {
        return ataque;
    }    
    public int getDefensa(){
        return defensa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void recibirDanio(int danio){
        this.hp = this.hp - danio;
    }        

    @Override
    public String toString() {

        return this.getClass().getSimpleName() + 
                "{tipo:" + tipo + " hp:" + hp + "}";
    }

}
