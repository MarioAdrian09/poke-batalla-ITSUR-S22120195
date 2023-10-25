package mx.edu.itsur.pokebatalla.model.Pokemons;
/**
 Sra. Evelyn
 */
public class Bullbasaur extends Pokemon {

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    
    
}
