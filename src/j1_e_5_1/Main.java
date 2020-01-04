package j1_e_5_1;

public class Main {
    public static void main(String[] args) {
        String hello = new String("hello");
        String hallo = new String("hello");
        String ciao = "ciao";
        String hola = "hello";
        String allo = "hello";

        //snippet 1:
        System.out.println(hello == hallo); // false +

        //snippet 2:
        System.out.println(hola == hallo); // false +

        //snippet 3:
        System.out.println(allo == hola); // true +

        //snippet 4:
        System.out.println(allo == ciao); // false +
    }
}
