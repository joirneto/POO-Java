public class Funcoes {
    public static void main(String[] args) throws Exception {
        show();
        Ola("Joir", "Neto");
        System.out.printf("Resultado da soma = %d%n", soma(5, 5, 200));
        System.out.printf("Resultado da soma = %.2f%n", soma(5.5, 5.6, 200.25));
    }

    //Função sem retorno e sem parametros
    public static void show() {
        System.out.println("HELLO WORLD");
    }

    //Função sem retorno e com parametros
    public static void Ola(String nome, String sobrenome) {
        System.out.println("Ola, "+ nome + " " + sobrenome);
    }

    //Função com retorno e com parametros
    public static int soma (int... numeros) {
        int res = 0;
        for (int n : numeros) {
            res += n;
        }
        return res;
    }

    //Sobrecarga: Função com mesmo nome mas com parametros diferentes
    //Função com retorno e com parametros
    public static Double soma (Double... numeros) {
        Double res = 0.0;
        for (Double n : numeros) {
            res += n;
        }
        return res;
    }
}
