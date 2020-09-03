import java.util.Arrays;

public class MergeC {
    public static void main(String[] args){
        int[] entrada = {9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0};
        int[] auxiliar = new int[entrada.length];
        int i = 0;                   //início vetor
        int j = entrada.length-1;    // fim vetor

        System.out.println("Vetor de entrada: ");
        System.out.println(Arrays.toString(entrada));

        System.out.println(" ");

        mergeSort(entrada, auxiliar, i, j);
        System.out.println("Vetor de saída: ");
        System.out.println(Arrays.toString(entrada));

    }

    private static void mergeSort(int[] entrada, int[] auxiliar, int i, int j){

        if (i<j){
            int meio=(i+j)/2;                       //7 posição do meio do vetor
            //System.out.println(meio);
            mergeSort(entrada, auxiliar, i, meio);   //3 posição do meio do vetor
            mergeSort(entrada, auxiliar, meio+1, j);
            ordenar(entrada, auxiliar, i, meio, j);
        }
    }
    private static void ordenar(int[] entrada, int[] auxiliar, int i, int meio, int j) {
        for (int k = i; k <= j; k++) {
            auxiliar[k] = entrada[k];                           // copiando o vetor
        }

        int m = meio + 1;                                       // segunda metade do vetor

            for (int k = i; k <= j; k++){
                if (i > meio) entrada[k] = auxiliar[m++];
                else if (m > j) entrada[k] = auxiliar[i++];
                else if (auxiliar[i] < auxiliar[m]) entrada[k] = auxiliar[i++];
                else entrada[k] = auxiliar[m++];
                System.out.println(Arrays.toString(entrada));
        }

    }
}

