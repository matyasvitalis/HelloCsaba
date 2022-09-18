public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        String nolang = "";
        String name = args[0];

        for(int i = 0; i < args.length; ++i) {
            String lang;
            if (args.length == 1) {
                lang = nolang;
            } else {
                lang = args[1];
                ++i;
            }

            String lang1 = "hun";
            String lang2 = "eng";
            String lang3 = "haw";
            if (lang.equals(lang1)) {
                System.out.println("Szia, " + name + "!");
            } else if (lang.equals(lang2)) {
                System.out.println("Hello, " + name + "!");
            } else if (lang.equals(lang3)) {
                System.out.println("Aloha, " + name + "!");
            } else if (lang.equals(nolang)) {
                System.out.println("Szia, " + name + "!");
            } else {
                System.out.println("Unknown language.");
            }
        }

    }
}