package mx.edu.itsur.pokebatalla.model.utils;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;

public class FileManager {

    public static final String Partida = "partida.foquemon";

    public static void guardarPartida(Batalla v) {
        try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(Partida))) {
            escritorDeObjetos.writeObject(v);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Batalla leerPartida() {
        Batalla v = null;
        try (ObjectInputStream lectorDeObjetos = new ObjectInputStream(new FileInputStream(Partida))) {
            v = (Batalla) lectorDeObjetos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return v;
    }

}
