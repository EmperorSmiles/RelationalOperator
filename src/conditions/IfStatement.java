package conditions;

public class IfStatement {
    public static void main(String[] args) {
        boolean isAuthenticated = true;
        if (isAuthenticated) {
            System.out.println("You are logged In");
        } if (!isAuthenticated) {
            System.out.println("Please Log In");
        }
    }
}
