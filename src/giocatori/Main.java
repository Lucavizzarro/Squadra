package giocatori;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        Giocatore[] g = new Giocatore[100];
        int scelta;
        int indice=3;

        g[0] = new Giocatore();
        System.out.println("Inserisci il nome del primo giocatore");
        g[0].setgiocatore(in.nextLine());
        System.out.println("Inserisci quanti gol ha segnato il primo giocatore");
        g[0].setgol(in.nextInt());
        System.out.println("Il giocatore inserito è capitano");
        g[0].setcapitano(in.nextBoolean());
        in.nextLine();

        g[1] = new Giocatore();
        System.out.println("Inserisci il nome del secondo giocatore");
        g[1].setgiocatore(in.nextLine());
        System.out.println("Inserisci quanti gol ha segnato il secondo giocatore");
        g[1].setgol(in.nextInt());
        System.out.println("Il giocatore inserito è capitano");
        g[1].setcapitano(in.nextBoolean());
        in.nextLine();

        g[2] = new Giocatore();
        System.out.println("Inserisci il nome del terzo giocatore");
        g[2].setgiocatore(in.nextLine());
        System.out.println("Inserisci quanti gol ha segnato il terzo giocatore");
        g[2].setgol(in.nextInt());
        System.out.println("Il giocatore inserito è capitano");
        g[2].setcapitano(in.nextBoolean());
        in.nextLine();

        do {
            System.out.println("Scegli una fra le sceguenti opzioni: " +
                    "\n 1) aggiungere un giocatore alla squadra;" +
                    "\n 2) visualizzare tutti i giocatori della squadra;" +
                    "\n 3) modificare i dati di un giocatore;" +
                    "\n 4) cancellare un giocatore dalla squadra;" +
                    "\n 5) visualizzare i giocatori che hanno realizzato più di 5 goal;" +
                    "\n 6) visualizzare il nome del capitano;" +
                    "\n 7) assegnare il ruolo di capitano in modo casuale se non ancora presente;" +
                    "\n 8) esci");
            scelta = in.nextInt();
            in.nextLine();
            switch (scelta) {
                case 1:

                case 2:
                    Funzioni.visuaslizza(g, indice);
                    indice--;
                    break;


                case 3:
                    int i;
                    System.out.println("Che giocatore vuoi cambiare?(inserisci il numero del giocatore)");
                    i = in.nextInt();
                    in.nextLine();
                    System.out.println("Inserisci il nome del  giocatore");
                    g[i].setgiocatore(in.nextLine());
                    System.out.println("Inserisci quanti gol ha segnato il giocatore");
                    g[i].setgol(in.nextInt());
                    System.out.println("Il giocatore inserito è capitano");
                    g[i].setcapitano(in.nextBoolean());
                    break;

                case 4:
                    int j;
                    System.out.println("Che giocatore vuoi eliminare?");
                    j = in.nextInt();
                    Funzioni.cancella(g,indice,j);

                    break;

                case 5:
                    System.out.println(Funzioni.maggiore5(g, indice));
                    break;
                case 6:

            }
        } while (scelta != 8) ;
    }
}

