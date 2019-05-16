
public class Vigenere {


    private char[][] matriz;
    private char[] letras;

    public Vigenere() {
        Matriz MatrizVigenere = new Matriz();
        this.matriz =  MatrizVigenere.getMatriz();
        this.letras =   MatrizVigenere.getLetras();

    }


    public char[] descriptografar(char[] palavra, char[] chave){
        int length = palavra.length;
        char[] descriptografado = new char[length];

        for (int caracter = 0; caracter < length; caracter++){
            if(palavra[caracter] == ' '){
            	descriptografado[caracter] = ' ';
                continue;
            }
            for (int i = 0; i < 26; i++){
                if(this.matriz[i][0] == chave[caracter]){
                    int indice = (palavra[caracter] - 65 - i);
                    if(indice < 0) indice += 26;
                    descriptografado[caracter] = (this.letras[indice]);

                }
            }
        }

        return descriptografado;
    }

    public char[] criptografar(char[] palavra, char[] chave){

        int length = palavra.length;
        char[] criptografado = new char[length];

        for (int caracter = 0; caracter < length; caracter++){
            for (int i = 0; i < 26; i ++){
                if(this.matriz[i][0] == chave[caracter]){
                    if(palavra[caracter] == ' ' ){
                    	criptografado[caracter] = ' ';
                    }else {
                    	criptografado[caracter] = this.matriz[i][palavra[caracter] - 65];
                    }
                }
            }
        }
        return criptografado;

    }





















    public static void main(String[] args){

        Matriz crip = new Matriz();

        char[][] matriz = crip.getMatriz();
        char[] letras = crip.getLetras();

        for (int i=0; i < 26; i ++ ){
            for (int j=0; j < 26; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }


        char [] chave = "ABB".toCharArray();
        char [] palavra = "AAA".toCharArray();
        char [] resultado = new char[3];



        for (int caracter = 0; caracter < 3; caracter++){
            for (int i = 0; i < 26; i++){
                if(matriz[i][0] == chave[caracter]){
                    int indice = (palavra[caracter] - 65 - i);
                    if(indice < 0) indice += 26;
                    resultado[caracter] = (letras[indice]);
                    
                }
            }
        }
        
        System.out.println(resultado);
        System.out.println("\nAgora volta : ");

        for (int caracter = 0; caracter < 3; caracter++){
            for (int i = 0; i < 26; i ++){
                if(matriz[i][0] == chave[caracter]){
                    System.out.print(matriz[i][resultado[caracter] - 65]);
                }
            }
        }



    }
}
