package loops;

public class ForEachLoop {
    public static void main(String[] args) {
    // AKA Enhanced for Loop
        String names[] ={"Tobi", "Michael", "San", "Kamsey"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for ( String name: names) {
            System.out.println(name);
        }
    }
}
