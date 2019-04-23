package Aula11_Exc3;

public class Teste {
    public static void main(String[] args) {

        CalculoMatematico teste = new CalculoMatematico (4,0);

        teste.divisao();

        try{teste.divisao2();}catch(ArithmeticException e){
            System.out.println(e.getMessage());}
    }
}
