public class Main {

    public static void main(String[] args) {

        if (args.length > 0) {
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No argument given.");
        }
    }
}g