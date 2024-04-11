package conditions;

public class ConditionsWithOperators {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isEmailVerified = false;
        boolean isCardInfoValid = true;

        if (isCardInfoValid && isEmailVerified && isLoggedIn )
            System.out.println("Proceed To Make a Payment");
            else System.out.println("you are not allowed to make a Payment");
    }
}
