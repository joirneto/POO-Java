import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // // Exibindo informações na Tela
        // System.out.println("Com quebra de linha");
        // System.out.print("Sem quebra de linha");
        // System.out.print("Quebra de linha com caracter de escape\n");
        // System.out.printf("Formatando informaççoes - %s - %d%n", "String", 2021);
        // //--------------------------------------------------------------------------

        // // Condicionais
        // int nota1 = 10;
        // int nota2 = 5;
        
        // if(nota1 < nota2){
        //     System.out.println("TESTE IF");
        // } else if (nota1 == 10) {
        //     System.out.println("TESTE ELSE IF");
        // } else {
        //     System.out.println("TESTE ELSE");
        // }

        // String res = (nota1 > nota2 ? "Aprovado\n" : "Reprovado\n");
        // System.out.printf("Aluno %s", res);

        // int posicao = 5;
        // switch(posicao) {
        //     case 1:
        //         System.out.printf("Caso %d%n", posicao);
        //         break;
        //     case 2:
        //         System.out.printf("Caso %d%n", posicao);
        //         break;
        //     case 3:
        //         System.out.printf("Caso %d%n", posicao);
        //         break;
        //     case 4: case 5: case 6:
        //         System.out.printf("Caso %d%n", posicao);
        //         break;
        //     default:
        //         System.out.printf("Caso não encontrado\n", posicao);
        // }
        // //--------------------------------------------------------------------------

        // Recebendo entrada
        // Scanner entrada = new Scanner(System.in);
        // int n1;
        // int n2;
        // int res;

        // System.out.print("Digite num1: ");
        // n1 = entrada.nextInt();
        // System.out.print("Digite num2: ");
        // n2 = entrada.nextInt();
        // res = n1 + n2;
        // System.out.printf("Soma de %d + %d = %d", n1, n2, res);

        // System.out.print("Digite seu nome: ");
        // String nome = entrada.nextLine();
        // System.out.print("Digite seu sobrenome: ");
        // String sobrenome = entrada.nextLine();
        // System.out.print("Ola " + nome + " " + sobrenome);

        // Laços de repetição
        //for
        // for (int cont = 0; cont < 10; ++cont) {
        //     System.out.printf("Contado: %d%n", cont + 1);
        // }
        
        // //while
        // int cont1 = 0;
        // while (cont1 < 5) {
        //     System.out.printf("Cont1: %d%n", cont1);       
        //     ++cont1;
        // }
        
        // //do while
        // int cont2 = 0;
        // do {
        //     ++cont2;
        //     System.out.println("Cont2: " + cont2);
        // } while (cont2 < 10);

        //ARRAY

        // int[] num1 = new int[5];
        // num1[0] = 1;

        // System.out.println("Array: " + num1[0]);

        // int[] numbers = {1, 2, 3, 4, 5};

        // for (int num : numbers) {
        //     System.out.println("Array: "+ num);
        // }

        // for (int i = 0; i < numbers.length; ++i) {
        //     System.out.println("array: " + numberas[i]);
        // }

        // Scanner entrada = new Scanner(System.in);
        // char[] gabarito = {'a', 'a', 'b', 'c', 'c'};
        // char resposta;
        // int acertos = 0;

        // for (int i = 0; i < gabarito.length; ++i) {
        //     System.out.printf("Digite sua resposta %d: ", i+1);
        //     resposta = entrada.nextLine().charAt(0);
        //     if(resposta == gabarito[i]) {
        //         acertos++;
        //     }
        // }
        // System.out.println("NOTA: " + (acertos*2));

        //METODOS ARRAYS

        //int[] num = {9, 8, 7, 3, 2, 1, 4, 6, 5, 0};
        //int[] num1 = new int[10];


        //Arrays.sort(num); ordenação
        //Arrays.fill(num, 99); preenchimento
        //System.arraycopy(num, 0, num1, 0, 10); //Copia um array em outro
        //boolean equal = Arrays.equals(num, num1);

        // System.out.printf("Os Arrays %s iguais = ", (equal ? "são" : "não são"));

        // for (int i : num) {
        //     System.out.printf("%d ", i);
        // }

        //Arrays.sort(num); ordenação
        //int achou = Arrays.binarySearch(num, 5); // busca um elemtno no array. O array tem que está ordenado
        //System.out.println("ACHOU" + achou);

        //MATRIZES

        // final int linhas = 3;
        // final int colunas = 3;
        // int [][] matriz = new int [linhas][colunas];

        // for(int l = 0; l < linhas; ++l) {
        //     for(int c = 0; c < colunas; ++c) {
        //         matriz[l][c] = l + c;
        //     }
        // }

        // for(int l = 0; l < linhas; ++l) {
        //     for(int c = 0; c < colunas; ++c) {
        //         System.out.printf("[%d] ", matriz[l][c]);
        //     }
        //     System.out.println();
        // }


    }
}
