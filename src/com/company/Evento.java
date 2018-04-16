package com.company;

import com.company.Fuegos.Fuegos;
import com.company.Invitado.Invitado;

import java.util.ArrayList;
import java.util.List;

public class Evento {

//ESTA Y MAIN SON  LAS ULTIMAS CLASE QUE PROGRAMO PORQUE VOY A NECESITAR USAR LOS METODOS QUE CREE EN LAS DEMAS
//CLASES. TIENE 2 ATRIBUTOS, 1 LISTA DE INVITADOS Y 1 LISTA DE FUEGOS
    private List<Invitado> listaDeInvitados;
    private List<Fuegos> fuegosLista;
//ACA CREO UN CONSTRUCTOR QUE INICIALIZA LAS LISTAS PARA QUE QUEDEN VACIAS PERO EN VEZ DE QUEDAR NULL Y EVITAR Q ME TIRE
// ERROR DESPUES, MAS VALE PREVENIR.. Cuando asigno el valor a cada lista,despues del  = estoy poniendo 'new' para decir que creo una lista
// y aclaro que tipo de lista, es decir ArrayList<>aca eno es necesario aclarar entre flechas que tipo de tato llevara,
// ya lo aclare en el atributo. Para inicializar atributos de otros tipos no siempre hay que poner new.., pero para listas si
// para qu eno queden null. Entonces cada objeto de evento que yo cree va a tener sus listas ArrayList<Invitado> y
// ArrayList<Fuego>
    public Evento(){
        listaDeInvitados = new ArrayList<>();
        fuegosLista = new ArrayList<>();
    }
//CREO METODO encenderVelas que tiene un Foreach que recorre la lista fuegos y las manda a explotar, y un
// foreach que recorre la lista listaDeInvitados y los manda a comerTorta

    public void encenderVelas(){
        for(Fuegos fuego : fuegosLista){
            fuego.explotar();
        }
        for(Invitado cadaInvitado : listaDeInvitados){
            cadaInvitado.comerTorta();
        }

    }
//creo metodo agregarInvitado que add un invitado a la lista listaDeInvitados que es un array
    public void agregarInvitado(Invitado unInvitado){
        listaDeInvitados.add(unInvitado);

    }
//creo metodo agregarFuego que add un fuego (que indistintamente puede ser o un individual o un pack ya que ambos
// son hijos de Fuego y x lo tanto son Fuego) a la lista fuegosLista de cada objeto Evento  que ya cree desde el MAIN.
    public void agregarFuego(Fuegos unFuego){
        fuegosLista.add(unFuego);

    }

}
