package Q3;

import java.util.ArrayList;

public final class Groupe {
    private static Groupe instance;
    private static ArrayList<Member> members = null;

    private Groupe() {
       members = new ArrayList<>();
    }


    public static Groupe getReference(Member member) {
        if (instance == null) {
            instance = new Groupe();
        }

        members.add(member);

        return instance;
    }

    public static void broadcast(String message) {
        for (Member member : members) {
            member.Message(message);
        }
    }
}
