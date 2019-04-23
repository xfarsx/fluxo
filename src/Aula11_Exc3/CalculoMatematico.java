package Aula11_Exc3;

public class CalculoMatematico {

int a,b,resultado;

    public CalculoMatematico() {

    }

    public CalculoMatematico(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Integer divisao  ()
    {
        try{resultado = this.a/this.b;}
        catch (ArithmeticException e){
            System.out.println("Operação não pode ser realizada!");
            return 0;
        }
        return resultado;
    }
    public Integer divisao2  () throws ArithmeticException
    {
        if(this.b == 0)
        {
            throw new ArithmeticException("Não pode dividir por 0");
        }
        resultado = a /b;
        return resultado;
    }
}
