package th.ac.ku.atm.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.BankAccount;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {

    private List<BankAccount> bankaccountList;

    @PostConstruct
    public void postConstruct() {
        this.bankaccountList = new ArrayList<>();
    }

    public void createCustomer(BankAccount bankaccount) {
        bankaccountList.add(bankaccount);
    }

    public List<BankAccount> getBankAccount() {
        return new ArrayList<>(this.bankaccountList);
    }

    public BankAccount findCustomer(int id) {
        for (BankAccount customer : bankaccountList) {
            if (customer.getId() == id)
                return customer;
        }
        return null;
    }

    public BankAccount checkPin(BankAccount inputCustomer) {

        BankAccount storedCustomer = findCustomer(inputCustomer.getId());
        return null;
    }


}
