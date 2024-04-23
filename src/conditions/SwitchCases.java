package conditions;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Admin: Gets full access");
        System.out.println("SubAdmin: Gets access to create or delete the course");
        System.out.println("testprep: Gets access to create or delete the test");
        System.out.println("user: Gets access to consume content");
        System.out.println("Enter your choice");
        String user = scanner.nextLine();

        switch (user) {
            case "admin":
                System.out.println("Gets full access");
                break;

            case "Subadmin":
                System.out.println("Gets access to create or delete the course");
                break;

            case "testprep":
                System.out.println("Gets access to create or delete the test");
                break;

            case "user":
                System.out.println("Gets access to consume content");
                break;

            default:
                System.out.println("Only paid members can access this feature!");
                break;

        }
    }
}
