/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;


import mx.edu.itsur.pokebatalla.model.Pikachu;

import mx.edu.itsur.pokebatalla.model.Machop;
import mx.edu.itsur.pokebatalla.model.Persian;
import mx.edu.itsur.pokebatalla.model.Sandshrew;


/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        
        
        Pikachu a = new Pikachu("MARIO");
        Machop b = new Machop("Luis");
        Sandshrew c = new Sandshrew("bryan");
        Persian d = new Persian("Jose");
        
        
        
        b.atacar(a, Machop.Movimientos.Contraataque);
        a.atacar(b, Pikachu.Movimientos.IMPACTRUENO);
        c.atacar(d, Sandshrew.Movimientos.REFUIGO);
       d.atacar(c, Persian.Movimientos.BOMBASONICA);
       d.atacar(d, Persian.Movimientos.DESTRUCTOR);
       b.atacar(d, Machop.Movimientos.LanzaLlamas);
        
        /**
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        Persian persianSalvaje = new Persian() ;
        Machop machopSalvaje = new Machop() ;
        Sandshrew sandshrewSalvaje = new Sandshrew() ;
        Bullbasaur bullbasaurSalvaje = new Bullbasaur() ;
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("Pedro");        
        Pikachu miPikachu = pikachuSalvaje;
        miPikachu.atacar(charmanderSalvaje);
        
        ////
        charmanderSalvaje.setNombre("Dinora");        
        Charmander miCharmander = charmanderSalvaje;
        miCharmander.atacar(pikachuSalvaje);
        miCharmander.atacar(pikachuSalvaje, "ASCUAS");
        
        //
        bullbasaurSalvaje.setNombre("Alanbrillo");        
        Bullbasaur miBullbasaur = bullbasaurSalvaje;
        miBullbasaur.atacar(persianSalvaje);
        miBullbasaur.atacar(persianSalvaje, "LATIGO");
        
        //
        persianSalvaje.setNombre("David");        
        Persian miPersian = persianSalvaje;
        miPersian.atacar(bullbasaurSalvaje);
        miPersian.atacar(bullbasaurSalvaje, "JOYA DE LUZ");
        
        //
        machopSalvaje.setNombre("Motomoto");        
        Machop miMachop = machopSalvaje;
        miMachop.atacar( sandshrewSalvaje);
        miMachop.atacar( sandshrewSalvaje, "GOLPE KARATE");
        //
        //  Sandshrew//
        sandshrewSalvaje.setNombre("Kevin");        
        Sandshrew miSandshrew = sandshrewSalvaje;
        miSandshrew.atacar(machopSalvaje);
        miSandshrew.atacar(machopSalvaje, "AVALANCHA");
        */
    }
    
}
