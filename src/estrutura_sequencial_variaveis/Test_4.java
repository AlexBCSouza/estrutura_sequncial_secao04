package estrutura_sequencial_variaveis;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A, B, PROD;

        A = leitor.nextInt();
        B = leitor.nextInt();

        PROD =  A * B;  // Implemente o código que representa a multiplicação.

        System.out.println("PROD = " + PROD);
        leitor.close();
    }
}
