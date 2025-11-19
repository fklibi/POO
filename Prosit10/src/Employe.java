import java.util.Objects;

public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;
    private String prenom;


    public Employe(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return id == employe.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employe [ID=" + id + ", Nom=" + nom + ", Prénom=" + prenom + "]";
    }

    @Override
    public int compareTo(Employe autre) {
        return Integer.compare(this.id, autre.id);
    }
}