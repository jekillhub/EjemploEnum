package main;

import contextoProblema.Automovil;
import contextoProblema.Marca;

public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil(Marca.FORD.getMarca());
        System.out.println("La marca es " + automovil.getMarca());
        automovil.setMarca(Marca.NISSAN.getMarca());
        System.out.println("La marca es " + automovil.getMarca());
    }
}
