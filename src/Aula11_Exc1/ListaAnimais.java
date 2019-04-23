package Aula11_Exc1;

import java.util.ArrayList;
import java.util.List;

public class ListaAnimais {

    public static void main(String[] args) {


     List<String> listaDeAnimais = new ArrayList<>();

    listaDeAnimais.add("Pato");
    listaDeAnimais.add("Cachorro");
    listaDeAnimais.add("Gato");

    try {
        System.out.println(listaDeAnimais.get(3));}
        catch (Exception e){
            System.out.println("Posição errada!");
        }
    }
}
