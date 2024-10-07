package giocatori;

public class Giocatore {
        private String giocatore;
        private int gol;
        private boolean capitano;

        public void setgiocatore (String g1) {
            giocatore=g1;
        }

        public void setgol (int gol1) {
            gol=gol1;
        }
        public void setcapitano (boolean c1) {
            capitano=c1;
        }


        public String getgiocatore () {
            return giocatore;
        }

        public int getgol () {
            return gol;
        }

        public boolean getcapitano () {
            return capitano;
        }

        public Giocatore(){
            giocatore=null;
            gol=0;
            capitano=false;
        }
        public Giocatore(String g1){
            giocatore=g1;
            gol=0;
            capitano=false;
        }
        public Giocatore(int gol1){
            giocatore=null;
            gol=gol1;
            capitano=false;
        }
        public Giocatore(boolean cap1){
            giocatore=null;
            gol=0;
            capitano=cap1;
        }
        public Giocatore(String g1, int gol1){
            giocatore=g1;
            gol=gol1;
            capitano=false;
        }
        public Giocatore(int gol1, boolean cap1){
            giocatore=null;
            gol=gol1;
            capitano=cap1;
        }
        public Giocatore(String g1, boolean cap1){
            giocatore=g1;
            gol=0;
            capitano=cap1;
        }
        public Giocatore(String g1,int gol1, boolean cap1){
            giocatore=g1;
            gol=gol1;
            capitano=cap1;
        }


    }

}
