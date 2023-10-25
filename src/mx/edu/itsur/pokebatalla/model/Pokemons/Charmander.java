package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.util.ArrayList;

/**
 Sra. Evelyn
 */
public class Charmander extends Pokemon {
    public Charmander(){
        
        this.tipo = "FUEGO";
        this.hp = 39;
        this.ataque = 52;
        this.defensa = 43;
        this.nivel = 1;
        this.precision = 4;
        //this.habilidades = new ArrayList<>();
        //this.habilidades.add("ARAÑAZO");
        //this.habilidades.add("GRUÑIDO");
    }
    public Charmander(String nombre){
        this(); 
        this.nombre = nombre;
    }
     public void atacar(Pokemon oponente, String habilidad)
    {
        if(habilidad.equals("ARAÑAZO"))
        {
            System.out.println("REALIZANDO EL ATAQUE DE ARAÑAZO");
        }
        else if(habilidad.equals("GRUÑIDO"))
                {
                    System.out.println("REALIZANDO EL ATAQUE DE GRUÑIDO");
                }
    }
    
}
