package giocatori;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);

        Giocatore [] g = new Giocatore[100];
        int scelta;



        g[0] =new Giocatore();
        System.out.println("Inserisci il nome del primo giocatore");
        g[0].setgiocatore(in.nextLine());
        System.out.println("Inserisci quanti gol ha segnato il primo giocatore");
        g[0].setgol(in.nextInt());
        System.out.println("Il giocatore inserito è capitano");
        g[0].setcapitano(in.nextBoolean());
        in.nextLine();

        g[1] =new Giocatore();
        System.out.println("Inserisci il nome del secondo giocatore");
        g[1].setgiocatore(in.nextLine());
        System.out.println("Inserisci quanti gol ha segnato il secondo giocatore");
        g[1].setgol(in.nextInt());
        System.out.println("Il giocatore inserito è capitano");
        g[1].setcapitano(in.nextBoolean());
        in.nextLine();

        g[2] =new Giocatore();
        System.out.println("Inserisci il nome del terzo giocatore");
        g[2].setgiocatore(in.nextLine());
        System.out.println("Inserisci quanti gol ha segnato il terzo giocatore");
        g[2].setgol(in.nextInt());
        System.out.println("Il giocatore inserito è capitano");
        g[2].setcapitano(in.nextBoolean());
        in.nextLine();


        System.out.println("Cosa vuoi fare?");
        scelta= in.nextInt();
        switch (scelta){
            case 1:
                for(int i=3;i<=g.length;i++){


                }
                for(int i=0;i<g.length;i++){

                }




        }



        System.out.println("Giocatore 1:" +g[0].getgiocatore() +";" +g[0].getgol()+";" +g[0].getcapitano());
        System.out.println("Giocatore 2:" +g[1].getgiocatore() +";" +g[1].getgol()+";" +g[1].getcapitano());
        System.out.println("Giocatore 3:" +g[2].getgiocatore() +";" +g[2].getgol()+";" +g[2].getcapitano());
    }

}

