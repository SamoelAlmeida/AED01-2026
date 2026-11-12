
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
}  
 