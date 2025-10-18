import java.util.Scanner;

public class ConvertDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();
        String message;
        switch (number) {
            case 1: message = "Monday"; break;
            case 2: message = "Tuesday"; break;
            case 3: message = "Wednesday"; break;
            case 4: message = "Thursday"; break;
            case 5: message = "Friday"; break;
            case 6: message = "Saturday"; break;
            case 7: message = "Sunday"; break;
            default: message = "Invalid input"; break;
        }

        System.out.println(message);

    }
}
