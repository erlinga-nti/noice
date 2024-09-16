import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hej från Abbe!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad heter du? ");
        String namn = scanner.nextLine();
        System.out.println("Hej " + namn + "!");
        scanner.close();
    }
}
