package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.atm.service.BankAccountService;
import th.ac.ku.atm.model.BankAccount;

@Controller
@RequestMapping("/bankaccount")
public class BankAccountController {

    private BankAccountService bankaccountService;

    public BankAccountController(BankAccountService bankaccountService) {
        this.bankaccountService = bankaccountService;
    }



    @GetMapping
    public String getBankAccount(Model model) {
        model.addAttribute("allBankAccounts", bankaccountService.getBankAccount());
        return "bankaccount";

    }
    @PostMapping
    public String registerBankAccount(@ModelAttribute BankAccount bankaccount, Model model) {
        bankaccountService.createCustomer(bankaccount);
        model.addAttribute("allBankAccounts", bankaccountService.getBankAccount());
        return "redirect:bankaccount";

    }

}
