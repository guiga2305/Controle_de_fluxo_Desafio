import java.lang.reflect.Parameter;
import java.util.Scanner;



public class Contador {

    public static  void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("digite o primeiro valor: ");
        int parametroUm = terminal.nextInt();
        System.out.println("digite o segundo valor: ");
        int parametroDois = terminal.nextInt();

        try{
            contarValor(parametroUm,parametroDois);
        }catch (ParameterInvalidException e){
            System.out.println(e.getMessage());
        }
    }
    public static void contarValor(int vlrUm, int vlrDois) throws ParameterInvalidException {
        if(vlrUm > vlrDois){
            throw new ParameterInvalidException("Erro: O segundo parametro deve ser maior que o primeiro!");
        }
        int resultador = vlrDois - vlrUm;
        for (int i = 0; i < resultador; i++) {
            System.out.println(i);
        }
        System.out.println("total de interação = "+resultador);
    }
}