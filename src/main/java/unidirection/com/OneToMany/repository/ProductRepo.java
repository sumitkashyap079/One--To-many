package unidirection.com.OneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unidirection.com.OneToMany.entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
