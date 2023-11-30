/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.moves;

import mx.edu.itsur.pokebatalla.model.Pokemon;

/**
 *
 * @author Mario Adrian Nambo Cisneros
 */
public class Movimiento {

    enum TiposDeMovimiento {
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR

    }

    TiposDeMovimiento tipo;
    String clase;
    int potencia;
    int precision;
    int puntosPoder;

    public void utilizar(Pokemon usuario, Pokemon objetivo) {
        //Calcular el daño
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.puntosPoder; //this.getPoder();
        int defensaObjetivo = objetivo.getDefensa();

        //Calcular el modificador, considerando tipos.
        double modificador = 1.0; // Modificador base (sin modificaciones)       
        //if ()... POR HACER        

        int danio = (int) (((((2 * nivelAtacante / 5 + 2)
                * ataqueAtacante
                * poderMovimiento / defensaObjetivo)
                / 50) + 2) * modificador);

        objetivo.recibirDanio(danio);

        //Imprimir efecto del movimiento en consola
        System.out.println(
                usuario.getClass().getSimpleName() + " aplica "
                + this.getClass().getSimpleName() + " a "
                + objetivo.getClass().getSimpleName() + " y causa danio de "
                + danio);
        if(objetivo.gethp()<=0)
        {
        System.out.println("El objetivo quedo asi: " + 0);
        }
        else 
        {
            System.out.println("El objetivo quedo asi "+ objetivo);
        }
        
        
        

    }

}
