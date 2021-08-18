package unidirection.com.OneToMany.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unidirection.com.OneToMany.entity.Customer;
import unidirection.com.OneToMany.repository.CustomerRepo;
import unidirection.com.OneToMany.repository.ProductRepo;
import unidirection.com.OneToMany.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getdata")
    public List<Customer> list(){
        System.out.println("Get Method is Called");
        return customerService.listAll();
    }


    @PostMapping("/create")
    public String create (@RequestBody Customer customer){
        customerService.save(customer);
        return "New Customer Added";
    }


    }





