public class Matriz {

    private char matriz[][];
    private char letras[];

    public Matriz() {
        this.matriz = new char[26][26];
        this.letras = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z' };
        preencher();
    }

    private void preencher(){
        int k = 0;
        for (int i=0; i < 26; i ++ ){
            for (int j=0; j < 26; j++) {
                matriz[i][j] = letras[k++];
                if (k > 25) k = 0;
            }
            k++;
        }

    }

    public void print(){
        for (int i=0; i < 26; i ++ ){
            for (int j=0; j < 26; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public char[][] getMatriz() {
        return matriz;
    }


    public char[] getLetras() {
        return letras;
    }

}
