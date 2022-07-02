package patterns.creational.builder;

public class Account {

    private final long id;
    private final User user;
    private final String password;
    private final double amountOfMoney;

    private Account(Builder builder) {
        this.id = builder.id;
        this.user = builder.user;
        this.password = builder.password;
        this.amountOfMoney = builder.amountOfMoney;
    }

    public static class Builder{
        private long id;
        private User user;
        private String password;
        private double amountOfMoney;


        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder amountOfMoney(double amountOfMoney) {
            this.amountOfMoney = amountOfMoney;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", user=" + user +
                ", password='" + password + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
