package patterns.structural.adapter;

import patterns.structural.adapter.model.SimpleAccount;
import patterns.structural.adapter.model.VipAccount;

public class TestAdapterPattern {
    public static void main(String[] args) {

        SimpleAccount simpleAccount = new SimpleAccount();

        VipAccount vipAccount = new VipAccount();

        VipAccountAdapter adapter = new VipAccountAdapter(vipAccount);

        System.out.println("Simple account:\n" + simpleAccount.checkMyAccount() + "\n" + simpleAccount.depositAccount() + "\n" + simpleAccount.getCredit());
        System.out.println("Vip account:\n" + adapter.checkMyAccount() + "\n" + adapter.depositAccount() + "\n" + adapter.getCredit());

    }
}
