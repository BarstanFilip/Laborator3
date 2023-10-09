public class Semafor {
    public String culoare;
    public int durata;

    public Semafor(String culoare, int durata) {
        this.culoare = culoare;
        this.durata = durata;
    }

    public void schimbaCuloarea(String culoareNoua) {
        this.culoare = culoareNoua;
    }

    public void stareSemafor() {
        if (culoare.equals("rosu")) {
            System.out.println("Culoarea este " + culoare);
        } else if (culoare.equals("verde")) {
            System.out.println("Culoarea este " + culoare);
        } else {
            System.out.println("Semaforul este stins");
        }
    }

    public static void main(String[] args) {
        Semafor semafor = new Semafor("rosu", 50);
        semafor.stareSemafor();
        semafor.schimbaCuloarea("verde");
        semafor.stareSemafor();
    }
}