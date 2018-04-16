package com.company.Fuegos;

import java.util.ArrayList;
import java.util.List;

public class Pack extends Fuegos{
    //creo su atributo q es una List de clase Fuego
    private List<Fuegos> listaFuegosClasePack;

    //creo el constructor para inicializar esa lista y que quede vacia pero inicializada, xq si no queda null y da error

    public Pack(){
        listaFuegosClasePack = new ArrayList<>();
    }
    //override el explotar de Fuego pero le hago un foreach que recorre la listaFuegosClasePack que va a contener
    // fuegos individuales o packs (porque cuando cree un pack desde Main le voy a agregar individuales y packs a traves
    // del metodo addFuegosAllPack que creo aca en la clase Pack
    @Override
    public void explotar(){
        for(Fuegos cadaFuego : listaFuegosClasePack){
            cadaFuego.explotar();

        }
    }
    //metodo para agregar fuegos individuales o packs a cada objeto pack que cree desde el MAIN
    public void addFuegosAlPack(Fuegos cualFuegoAgrego){
        listaFuegosClasePack.add(cualFuegoAgrego);
    }

}
