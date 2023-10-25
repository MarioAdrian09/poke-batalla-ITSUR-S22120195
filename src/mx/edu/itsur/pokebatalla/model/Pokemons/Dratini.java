package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.moves.BesoAmoroso;
import mx.edu.itsur.pokebatalla.moves.BombaHuevo;
import mx.edu.itsur.pokebatalla.moves.BombaSonica;
import mx.edu.itsur.pokebatalla.moves.ColaDragon;
import mx.edu.itsur.pokebatalla.moves.DanzaDragon;
import mx.edu.itsur.pokebatalla.moves.FuriaDragon;
import mx.edu.itsur.pokebatalla.moves.Movimiento;

/**
 Sra. Evelyn
 * s22120162
 */

public class Dratini extends Pokemon{
     public enum Movimientos {
      FURIADRAGON,
      COLADRAGON,
      DANZADRAGON
    }
    public Dratini()
            {
                this.tipo = ("DRAGON");
                this.ataque = 64;
                this.defensa = 45;
                this.hp = 41;
                this.nivel = 1;
                this.precision = 3;
                //this.habilidades  = new ArrayList<>();
                //this.habilidades.add("CONTRICCION");
                //this.habilidades.add("MALICIOSO");
            }
     public Dratini(String nombre)
   {
       this();
       this.nombre = nombre;
   }
       public void atacar(Pokemon oponente, Dratini.Movimientos movimientoAUtilizar) {
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case FURIADRAGON:
                instanciaMovimiento = new FuriaDragon();
                break;
            case COLADRAGON:
                instanciaMovimiento = new ColaDragon();
                break;
            case DANZADRAGON:
                instanciaMovimiento = new DanzaDragon();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }
     instanciaMovimiento.utilizar(this, oponente);
       }
}
