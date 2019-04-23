package Aula11_Exc2;
import java.util.ArrayList;
import java.util.List;

public class ListaNull {

    public static void main(String[] args) {

        List<String> nulo = new ArrayList<>();

        nulo.add("Pato");
        nulo.add("Cachorro");
        nulo.add("Gato");

        try{System.out.println(nulo.get(5));}
        catch(Exception e)
        {
            e.getCause();
            System.out.println(e);

        }
    }
}