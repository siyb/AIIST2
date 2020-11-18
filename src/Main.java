public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Illegal argument count!");
            return;
        }
        int firstParameter = Integer.parseInt(args[0]);
        int secondParameter = Integer.parseInt(args[1]);
        int result = firstParameter + secondParameter;
        System.out.println("Result: " + result);
    }
}
