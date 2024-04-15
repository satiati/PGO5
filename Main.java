public class Main {
    public static void main(String[] args) {

        User guest1 = new User("s1111@pjwstk.edu.pl");
        User guest2 = new User("s22222@pjwstk.edu.pl");

        User user = new User("Andrew", "Doe", "s12345@pjwstk.edu.pl", "password12345");

        guest1.convertToNormalAccount("Alice", "Smith", "password11111");

        System.out.println("User 1:");
        displayUserInfo(guest1);
        System.out.println("\nUser 2:");
        displayUserInfo(guest2);
        System.out.println("\nUser 3:");
        displayUserInfo(user);
    }

    public static void displayUserInfo(User user) {
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Is Guest: " + user.isGuest());
    }
}
