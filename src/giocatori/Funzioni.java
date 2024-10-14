package giocatori;

public class Funzioni {
    public static void visuaslizza(Giocatore []g, int indice) {
        for (int i = 0; i < indice; i++) {
            System.out.println("Giocatore" + i + ":" + g[i].getgiocatore() + ";" + g[i].getgol() + ";" + g[i].getcapitano());
        }
    }

    public static int cancella(Giocatore[] g, int indice, int j){
        for (int l=j;l<indice-1;l++){
            g[l]=g[l+1];
        }
        return indice-1;
    }

        public static String maggiore5(Giocatore []g, int indice){
            String maggiore="";
            for (int i = 0; i < indice; i++) {
                if (g[i].getgol() >= 5)
                    maggiore = maggiore + g[i].getgiocatore() + "\n";
            }
            return maggiore;
    }


}
