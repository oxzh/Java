
// importando uma biblioteca para definir localização para US
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        // Declarando var's
        int idadex = 18;
        int caixaDeOvo = 30;
        int caixaDeLeite = 30;
        double pi = 3.14159265359;

        // print simples
        System.out.println("Hello World!");
        System.out.println("Bom Dia!");

        // print de uma var.
        System.out.print("A minha idade é: ");
        System.out.println(idadex);

        // Soma simples, como em qualquer outra linguagem com um print.
        System.out.print("A soma de uma caixa de ovo e uma caixa de leite é ");
        System.out.println(caixaDeOvo + caixaDeLeite);

        // Definindo como US a linguagem utilizada, para utilizar o . invés da ,
        Locale.setDefault(Locale.US);
        // System.out.print: Printa um texto no terminal/console do computador;
        // ...printf() formata a saída, delimitando a quantidade de números a serem
        // exibidos, no caso, dois
        System.out.println("Pi até sua segunda casa deciamal depois do ponto é: ");
        System.out.printf("%.2f%n", pi);

        System.out.println("Pi até sua quarta casa deciamal depois do ponto é: ");
        System.out.printf("%.4f%n", pi);

        // Declarando uma nova váriavel com base nas anteriores, apenas fazendo a soma
        // de cada uma.
        double num = caixaDeLeite + caixaDeLeite + pi;
        // print da nova váriavel; Concatenação em java é feito por + var + , ou seja,
        // dois sinais de + e no meio a váriavel.
        System.out.println("Soma das váriaveis é " + num + "!");

        // Foi utilizado o %f no meio da string, para que alterasse tal valor pela
        // variável que seria declarada em seguida.
        // E assim como em váriaveis, precisamos declarar seu tipo, neste exemplo foi
        // utilizada o valor %f, que é de float, existe o %s de texto(string), e o %d de
        // inteiro(int)

        // Aparentemente printf é apenas para strings, os outros tipos de print, não
        // permitem um %f ou algo do tipo dentro do texto, ao que eu percebi. Talvez
        // seja outra coisa
        System.out.printf("Nova váriavel com 3 casas decimais é: %.3f%n", num);

        String nome = "Gabriel";
        int idade = 18;
        double renda = 4000.0;

        System.out.printf("O %s tem %d anos e ganha %.2f", nome, idade, renda);

    }
}
