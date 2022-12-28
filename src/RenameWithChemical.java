import java.util.Scanner;

public class RenameWithChemical {
    public static void main(String[] args) {
        viewApp();
    }

    public static void viewApp(){
        while (true) {
            System.out.println("\n  APP RENAME CHARACTER OF NAME TO CHEMICAL");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("1. Rename Your Character of The Name");
            System.out.println("2. Exit Application");
            String yourChoose = outputScan("Input Your Choose");
            if (yourChoose.equals("1")){
                renameView();
            } else if (yourChoose.equals("2")) {
                break;
            } else {
                System.out.println("Your Choose Invalid..............");
            }
        }
    }

    public static void renameView(){
        String name = outputScan("\nWhat is Your Name");
        String firstChar = name.substring(0, 1);
        String upperFirstChar = firstChar.toUpperCase();
        String restOfName = name.substring(1);
        String finalRestOfName = restOfName.toLowerCase();
        final String myName = upperFirstChar + finalRestOfName;
        System.out.println("Hello " + myName);
    }

    public static String outputScan(String index){
        System.out.print(index + " : ");
        return scanner.nextLine();
    }

    public static Scanner scanner = new Scanner(System.in);
}
