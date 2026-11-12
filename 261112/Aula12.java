//aula 
public class Aula12 {
    public static int buscaBinaria(int[] vetor, int valor_buscar){

        int ini, fim, meio;

        ini = 0;
        fim = vetor.length;

        while(ini <= fim){
            meio = (int) (ini + fim) / 2;
            if( vetor[meio] == valor_buscar ){
                return meio;
            }else{
                if( valor_buscar < vetor[meio] ){
                    fim = meio -1;
                }else{
                    ini = meio +1;
                }
            }
        }

        return -1;
    }

    public static void bubbleSort(int[] v){
    int i, j, n;
    n = v.length;
    for(i=0;i<n;i++){ //percorre de 0 até n-1 (n-1 vezes)
        for(j=1;j<n-i;j++){ //percorre de 1 até n-i
            if(v[j]<v[j-1]){ //verifica se o elem. em j é menor que o elem. em j-1
                troca(v, j, j-1); //caso seja menor, troca os elementos
            }
        }
    }
}
    public static void troca(int[] v, int i, int j){
        int aux;
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}  
 