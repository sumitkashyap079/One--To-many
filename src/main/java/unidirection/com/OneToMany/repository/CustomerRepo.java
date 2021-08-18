package unidirection.com.OneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unidirection.com.OneToMany.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository <Customer,Integer> {
}
