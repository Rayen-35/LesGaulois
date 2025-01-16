package personnages;

public class Romain {
    private String nom;
    private int force;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String A) {
        System.out.println("Le romain " + getNom() + " : << " + A + " >>");
    }

    // Méthode recevoirCoup
    public void recevoirCoup(int forceDuCoup) {
        force -= forceDuCoup;
        if (force < 0) {
            force = 0;
        }
        if (force > 0) {
            parler("Aïe !");
        } else {
            parler("J’abandonne...");
        }
    }
}
