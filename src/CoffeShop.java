import java.util.Scanner;

public class CoffeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the coffe: ");
        char coffeName = scanner.next().charAt(0);
        String price;
        switch(coffeName){
            case 'A': price = "$3.00"; break;
            case 'C': price = "$3.75"; break;
            case 'L': price = "$4.00"; break;
            case 'E': price = "$2.50"; break;
            default: price = "Invalid choice!"; break;
        }
    System.out.println(price);
    }

}
