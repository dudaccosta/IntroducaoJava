
public class Arrays {

    public static void main(String[] args) {

         int num1 = 1;
         int num2 = 2;
         int num3 = 3;
         int num4 = 4;
         int num5 = 5;

        //  [0] [1] [2] [3] [4] = 5 são 5 indices, pq é contado n - 1
         int[] numeros = new int[5];

         numeros [0] = 1;
         numeros [1] = 2;
         numeros [2] = 3;
         numeros [3] = 4;
         numeros [4] = 5;

         for(int i = 0; i < numeros.length; i++){ // .length vai indicar o tamanho (quanto) do meu array
             System.out.println(numeros[i]);
        }

        // Mesmo coisa, mas em string

         String[] letras = new String[5];

         letras [0] = "A";
         letras [1] = "M";
         letras [2] = "B";
         letras [3] = "N";
         letras [4] = "C";

         for(int i = 0; i < letras.length; i++){ // .length vai indicar o tamanho (quanto) do meu array
             System.out.println(letras[i]);
         }

        // Melhorando o código

         String[] letrinhas = { "K", "G", "F", "Y"};

         for(int i = 0; i < letrinhas.length; i++){ 
             System.out.println(letrinhas[i]);
         }

        // Outro exemplo

        int[] numbers = {9, 3, 5, 2, 6};
        int maior = numbers [0];
        int menor = numbers [0];
        int media = 0; // média aritmética = soma tudo e divide pela quantidade (no caso 5 arrays) 

            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] > maior){
                    maior = numbers[i];
                }
                if(numbers[i]< menor){
                    menor = numbers[i];
                }
                media += numbers [i]; // += porquê estou somando e atribuindo 
            }

            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Média: " + media/numbers.length);
    }
    
}
