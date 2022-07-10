package patterns.structural.adapter;

import patterns.structural.adapter.model.Account;
import patterns.structural.adapter.model.VipAccount;

public class VipAccountAdapter implements Account {

    private final VipAccount vipAccount;

    public VipAccountAdapter(VipAccount vipAccount) {
        this.vipAccount = vipAccount;
    }

    @Override
    public String depositAccount() {
        return vipAccount.setPreciousMetal();
    }

    @Override
    public String checkMyAccount() {
        return vipAccount.getPreciousMetal();
    }

    @Override
    public String getCredit() {
        return vipAccount.getSpecialCredit();
    }
}
