package patterns.structural.adapter.model;

public class SimpleAccount implements Account{
    @Override
    public String depositAccount() {
        return "Send money from simple account";
    }

    @Override
    public String checkMyAccount() {
        return "Get money from simple account";
    }

    @Override
    public String getCredit() {
        return "Check account from simple account";
    }
}
