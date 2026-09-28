public class Montre {

    private int heure;
    private int minute;

    public Montre(int heure, int minute) {
        this.heure = heure;
        this.minute = minute;
    }

    public Montre(Montre autre) {
        this.heure = autre.heure;
        this.minute = autre.minute;
    }

    public void avancerMinute() {
        minute++;

        if (minute == 60) {
            minute = 0;
            heure++;

            if (heure == 24) {
                heure = 0;
            }
        }
    }

    public static void main(String[] args) {

        Montre montre1 = new Montre(13, 45);

        Montre montre2 = new Montre(montre1);

        System.out.println("Montre 1 : " + montre1.heure + "h" + montre1.minute);
        System.out.println("Montre 2 : " + montre2.heure + "h" + montre2.minute);
    }
}