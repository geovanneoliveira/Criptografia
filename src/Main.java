public class Main {

    public static void main(String[] args) {

        Transposicao t = new Transposicao();
        char[] res = t.criptografar("CLEBERSANTANA".toCharArray(), "LIMAO".toCharArray());

        System.out.println(res);

        Vigenere vigenere = new Vigenere();
        char [] chave = "LIMAOLIMAOLIMAOLIMAO".toCharArray();

        char[] res2 = vigenere.criptografar(res,chave);

        System.out.println(res2);

       char[] res3 = vigenere.descriptografar(res2 , chave);

        System.out.println(res3);

        char[] res4 = t.descriptografrar(res3,"LIMAO".toCharArray() );

        System.out.println(res4);

    }
}
