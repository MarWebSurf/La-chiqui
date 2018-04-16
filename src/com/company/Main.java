package com.company;

import com.company.Fuegos.Individuales;
import com.company.Fuegos.Pack;
import com.company.Invitado.DH;

public class Main {

    public static void main(String[] args) {
	// write your code here// invoco los metodos que cree en todas las otras clases. creo fuegos indiciduales, creo
        //packs, y puedo conformar que tiene ese pack adentro agregandole(a traves del metodo addFuegosAlPack) fuegos
        //individuales y/o otros packs sin especificar mas que el nombre ya que ambos son de la clase Fuego .
        //Creo invitados , creo un evento, y a esse evento le agrego a su lista de invitados a traves de su metodo
        // agregarInvitado. Agrego los fuegos individuales y packs que cree recien a la lista FuegosLista que tiene
        // ese evento. Finalmente invoco el metodo encenderVelas que tiene ese evento. Viva la chiqui conchuda.
        //
        System.out.println("gdfgdsfgsdf");
        System.out.println("ÿyyyyyyyy");

        Individuales individual1 = new Individuales();
        Individuales individual2 = new Individuales();
        Pack pack1 = new Pack();
        pack1.addFuegosAlPack(individual2);
        Pack pack2 = new Pack();
        pack1.addFuegosAlPack(individual2);
        pack1.addFuegosAlPack(pack2);
        pack2.addFuegosAlPack(individual1);
        DH DH1 = new DH();
        DH DH2 = new DH();
        Evento evento1 = new Evento();
        evento1.agregarFuego(individual1);
        evento1.agregarFuego(individual1);
        evento1.agregarInvitado(DH1);
        evento1.agregarFuego(pack1);

        evento1.encenderVelas();

    }
}
