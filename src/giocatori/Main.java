package giocatori;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);

        Giocatore g1=new Giocatore();
        System.out.println("Inserisci il nome del primo giocatore");
        g1.setgiocatore(in.nextLine());
        System.out.println("Inserisci quanti gol ha segnato il primo giocatore");
        g1.setgol(in.nextInt());
        in.nextLine();

        Giocatore g2=new Giocatore();
        System.out.println("Inserisci il nome del secondo giocatore");
        g2.setgiocatore(in.nextLine());
        System.out.println("Inserisci quanti gol ha segnato il secondo giocatore");
        g2.setgol(in.nextInt());
        in.nextLine();

        Giocatore g3=new Giocatore();
        System.out.println("Inserisci il nome del terzo giocatore");
        g3.setgiocatore(in.nextLine());
        System.out.println("Inserisci quanti gol ha segnato il terzo giocatore");
        g3.setgol(in.nextInt());
        in.nextLine();


        System.out.println("Giocatore 1:" +g1.getgiocatore() +";" +g1.getgol());
        System.out.println("Giocatore 2:" +g2.getgiocatore() +";" +g2.getgol());
        System.out.println("Giocatore 3:" +g3.getgiocatore() +";" +g3.getgol());
    }

}

