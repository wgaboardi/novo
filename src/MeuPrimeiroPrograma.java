import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class MeuPrimeiroPrograma {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.println("Informe a entrada:");
        int op1 = console.nextInt();
        System.out.println("Ola Mundo. Tem " + args.length + " argumento(s) e a entrada foi: " + op1);
    }

}
