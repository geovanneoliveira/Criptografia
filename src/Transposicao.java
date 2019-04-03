public class Transposicao {

    public char[] criptografar(char[] palavra, char[] chave){

        int tamanhoPalavra = palavra.length;
        int coluna = chave.length;
        int linha = (int)Math.ceil((double)tamanhoPalavra/coluna) + 1;
        char[] criptografado = new char[linha*coluna];

        char matriz[][] = new char[linha][coluna];

        for (int i = 0; i < coluna; i++){
            matriz[0][i] = chave[i];
        }

        int indice = 0;
        for(int i = 1; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                if(tamanhoPalavra <= indice){
                    matriz[i][j] = ' ';
                }else{
                    matriz[i][j] = palavra[indice++];
                }
            }
        }

        //TODO ordenacao


        indice = 0;
        for (int i = 0; i < coluna;i++){
            for (int j = 0; j < linha; j++){
                criptografado[indice++] = matriz[j][i];

            }
        }

        return criptografado;
    }

    public char[] descriptografar(char[] palavra, char[] chave){

        int tamanhoPalavra = palavra.length;
        int coluna = chave.length;
        int linha = (int)Math.ceil((double)tamanhoPalavra/coluna);
        char[] descriptografrar = new char[linha*coluna];
        char matriz[][] = new char[linha][coluna];

        //TODO ordenacao

        int indice  = 0;
        for(int i = 0; i < coluna; i++){
            for(int j = 0; j < linha; j++){
                matriz[j][i] = palavra[indice++];
            }
        }

        indice = 0;
        for (int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                descriptografrar[indice++] = matriz[i][j];
            }
        }

        return descriptografrar;
    }

}
