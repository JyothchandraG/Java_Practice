import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int role = scanner.nextInt();

        switch (role) {
            case 1:
                System.out.println("You are admin");
                break;

            case 2:
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest");
                break;
        }
    }
}
