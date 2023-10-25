package mx.edu.itsur.pokebatalla.model.Pokemons;
import java.util.List;
import mx.edu.itsur.pokebatalla.moves.Movimiento;
/**
 Sra. Evelyn
 */
public class Pokemon {
        protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected List<Movimiento> movimientos;

    Pokemon() {
    }

    //Getters
    public int getNivel() {
        return nivel;
    }
    public int getAtaque() {
        return ataque;
    }    
    public int getDefensa(){
        return defensa;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos 
    public void recibirDanio(int danio){
        this.hp = this.hp - danio;
    }        


    @Override
    public String toString() {

        return this.getClass().getSimpleName() + 
                "{tipo:" + tipo + " hp:" + hp + "}";
    }

}
