package com.masai.otms.controller;

import com.masai.otms.models.Customer;
import com.masai.otms.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    private Customer customer;

    @PostMapping("/register")
    public ResponseEntity<Customer> addCustomer(@RequestBody @Valid Customer customer) {
        return ResponseEntity.ok(customerService.addCustomer(customer));
    }

    @PostMapping("/update/{cId}")
    public ResponseEntity<String> updateDetails(@PathVariable @Valid Integer cId, @Valid @RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.updateCustomer(cId, customer));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteCustomer(@Valid @RequestParam("cId") Integer id) {
        return ResponseEntity.ok(customerService.deleteCustomer(id));
    }

    @GetMapping("/id")
    public ResponseEntity<Customer> getById(@Valid @RequestParam("cId") Integer id) {
        return ResponseEntity.ok(customerService.viewCustomer(id));
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> allCustomers() {
        return ResponseEntity.ok(customerService.viewAllCustomer());
    }
}
