package unidirection.com.OneToMany.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unidirection.com.OneToMany.entity.Customer;
import unidirection.com.OneToMany.repository.CustomerRepo;
import unidirection.com.OneToMany.repository.ProductRepo;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ProductRepo productRepo;

    public List<Customer> listAll(){
        return customerRepo.findAll();
    }

    public Customer save(Customer customer) {
       return customerRepo.save((customer));
    }


}
