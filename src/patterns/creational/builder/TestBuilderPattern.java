package patterns.creational.builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        User user = new User.Builder().firstName("Ivan").lastName("Ivanov").email("email@gmail.com").build();

        Account account = new Account.Builder().id(1L).password("12345").amountOfMoney(100).user(user).build();

        System.out.println("Account -  " + account + ", user - " + user);
    }
}
