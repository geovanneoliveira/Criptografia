public class Main {

    public static void main(String[] args) {

        Criptografia c = new Criptografia();
        char[] crip = c.criptografar("Paulo Emir".toCharArray(), "UPECARUARU".toCharArray());

        System.out.println("CRIPTOGRAFADO: " + String.copyValueOf(crip));
        
        char[] decrip = c.descriptografar(crip, "UPECARUARU".toCharArray());
         
        System.out.println("DESCRIPTOGRAFADO: " + String.copyValueOf(decrip));

    }
}
