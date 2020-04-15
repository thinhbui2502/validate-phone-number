public class Main {
    private static final String[] validNumber = {"(84)-(0978489648)", "(64)-(0238488888)"};
    private static final String[] inValidNumber = {"(a8)-(22222222)", "(+84)-(0123456789"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String number : validNumber) {
            boolean isValid = phoneNumber.validate(number);
            System.out.println("Phone Number " + number + " is valid: " + isValid);
        }

        System.out.println("=======================================");
        for (String number: inValidNumber) {
            boolean isValid = phoneNumber.validate(number);
            System.out.println("Phone Number " + number + " is valid: " + isValid);

        }
    }
}
