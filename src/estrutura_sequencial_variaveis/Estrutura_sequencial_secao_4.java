package estrutura_sequencial_variaveis;

import java.util.Locale;

public class Estrutura_sequencial_secao_4 {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.357834;
        String nome = "Maria";
        int idade = 31;
        double renda = 400.00;


        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado igual a  %.2f metros  %n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda);

    }
}
