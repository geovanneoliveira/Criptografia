public class Main {

    public static void main(String[] args) {

        Criptografia c = new Criptografia();
        String chave = "UPECARUARU";
        String frase = "ORGULHO DE SER UPE";
        
        char[] crip = c.criptografar(frase.toCharArray(), chave.toCharArray());

        System.out.println("CRIPTOGRAFADO: " + String.copyValueOf(crip));
        
        char[] decrip = c.descriptografar(crip, chave.toCharArray());
         
        System.out.println("DESCRIPTOGRAFADO: " + String.copyValueOf(decrip));

    }
}
