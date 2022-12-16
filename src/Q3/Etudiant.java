package Q3;

public class Etudiant implements Member {

    private Groupe groupe;


    public Etudiant() {
        this.groupe = Groupe.getReference(this);
    }

    @Override
    public void Message(String string) {
        System.out.println(string);
    }
}
