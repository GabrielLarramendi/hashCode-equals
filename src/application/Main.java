package application;

import model.entities.Client;

public class Main {
    public static void main(String[] args) {


        Client c1 = new Client("Gabriel", "gabriel.mendiArrobaGmail.com");
        Client c3 = new Client("Gabriel", "gabriel.mendiArrobaGmail.com");

        int x = c1.hashCode();
        int y = c3.hashCode();

        System.out.println(x);
        System.out.println(y);
        System.out.println(c1.equals(c3));

//        String a = "Maria";
//        String b = "Maria";
//
//        /*
//        boolean result = a.equals(b); => Compara os dois objetos e retorna true or false;
//         */
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());




    }
}
