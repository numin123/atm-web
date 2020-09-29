package th.ac.ku.atm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.ku.atm.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

    private CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<th.ac.ku.atm.controller.Customer> getAll() {
        return customerService.getCustomers();
    }

    @GetMapping("/{id}")
    public th.ac.ku.atm.controller.Customer getOne(@PathVariable int id) {
        return customerService.findCustomer(id);
    }

}
