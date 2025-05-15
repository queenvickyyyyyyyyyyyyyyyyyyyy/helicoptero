package Helicoptero;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Helicoptero h1 = new Helicoptero(4);
        Helicoptero h2 = new Helicoptero(3);

        System.out.println("\nInicio da viagem: ");
        System.out.println(h1.toSring());
        System.out.println(h2.toSring());

        h1.entrar();
        h1.entrar();
        h1.entrar();
        h2.entrar();
        h2.entrar();

        System.out.println("\nOs passageiros entraram: ");
        System.out.println(h1.toSring());
        System.out.println(h2.toSring());

        h1.ligar();
        h2.ligar();

        System.out.println("Para qual altitude o primeiro helicoptero vai? ");
        int altitude1 = in.nextInt();
        h1.decolar(altitude1);
        System.out.println();

        System.out.println("Para qual altitude o segundo helicoptero vai? ");
        int altitude2 = in.nextInt();
        h2.decolar(altitude2);

        System.out.println("\nO helicoptero 1 esta indo para: "+ altitude1 +", e o helicoptero 2 esta indo para "+ altitude2 +".");
        System.out.println(h1.toSring());
        System.out.println(h2.toSring());

        h1.aterrissar();
        h2.aterrissar();

        System.out.println("\nOs helicopteros aterrissaram.");
        System.out.println(h1.toSring());
        System.out.println(h2.toSring());

        h1.desligar();
        h2.desligar();

        System.out.println("\nOs helicopteros desligaram.");
        System.out.println(h1.toSring());
        System.out.println(h2.toSring());

        h1.sair();
        h1.sair();
        h1.sair();
        h2.sair();
        h2.sair();

        System.out.println("\nOs pasageiros sairam.");
        System.out.println(h1.toSring());
        System.out.println(h2.toSring());
    }
    
}
 
