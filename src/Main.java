import adapter.adapters.SquarePegAdapter;
import adapter.round.RoundHole;
import adapter.round.RoundPeg;
import adapter.square.SquarePeg;
import editor.Editor;
import Q3.Etudiant;
import Q3.Groupe;

public class Main {
    public static void main(String[] args) {

        composite.Demo.main(args);
//        abstractFactory.Demo.main(args);
//        factory.Demo.main(args);
//        Q3Demo();
//        commandDemo();
//        singletonDemo();
//        adapterDemo();
    }


    public static void Q3Demo(){
        Etudiant etudiant = new Etudiant();
        Etudiant etudiant2 = new Etudiant();

        Groupe.broadcast("Hello World");
    }

    public static void commandDemo() {
        Editor editor = new Editor();
        editor.init();
    }

    public static void singletonDemo() {
        System.out.println("\n Singleton demo begin: \n");
        System.out.println("If you see the same value, then singleton was reused (yay!)" +
                "\n" + "If you see different values, then 2 singletons were created (booo!!)" +
                "\n\n" + "RESULT:" + "\n");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }

    public static void adapterDemo() {
        System.out.println("\n Adapter demo begin: \n");
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}