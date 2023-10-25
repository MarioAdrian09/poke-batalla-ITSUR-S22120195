package mx.edu.itsur.pokebatalla.moves;

public class AtaqueArena extends MovimientoEstado {
    public AtaqueArena()
    {
        this.tipo = TiposDeMovimiento.ROCA;
        this.potencia = 0;
        this.precision = 100;
        this.puntosPoder = 15;
    }
}
