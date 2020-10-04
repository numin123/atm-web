package th.ac.ku.atm.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class BankAccount {

    private int id;
    private int customerId;
    private String type;
    private double balance;


    public BankAccount(int id, String name, String pin) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
