package personnages;

public class Gaulois {
    private String nom;
    private int force;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String A) {
        System.out.println("Le gaulois " + getNom() + " : << " + A + " >>");
    }

    // Méthode frapper
    public void frapper(Romain romain) {
        System.out.println(getNom() + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup(force /3); // Le coup a une force de la force du Gaulois divisé par 3
    }

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Asterix", 8);
        System.out.println(asterix);
        System.out.println(asterix.getNom());
    }
}
