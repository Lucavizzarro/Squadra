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

            case 2:
                for(int i=0;i<g.length;i++){
                    System.out.println("Giocatore" +i +":" +g[i].getgiocatore() +";" +g[i].getgol()+";" +g[i].getcapitano());
                }

            case 3:
                int i;
                System.out.println("Che giocatore vuoi cambiare?");
                i= in.nextInt();
                System.out.println("Inserisci il nome del  giocatore");
                g[i].setgiocatore(in.nextLine());
                System.out.println("Inserisci quanti gol ha segnato il giocatore");
                g[i].setgol(in.nextInt());
                System.out.println("Il giocatore inserito è capitano");
                g[i].setcapitano(in.nextBoolean());

            case 4:
                int j;
                System.out.println("Che giocatore vuoi eliminare?");
                j=in.nextInt();
                g[j].setgiocatore("");
                g[j].setgol(0);
                g[j].setcapitano(false);

            case 5:
              for(i=0;i<g.length;i++){
                if(g[i].getgol()<=5)
                    System.out.println(g[i].getgiocatore());
              }
            case 6:

        }

    }

}

