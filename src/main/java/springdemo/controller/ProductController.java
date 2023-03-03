package springdemo.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springdemo.entity.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getProductList() {
        return Arrays.asList(new Product(1, "product 1"), new Product(2, "product 2"));
    }
    
    @GetMapping("/product1")
    public Product getProduc1() {
        return new Product(1, "product 1");
    }
    
    @GetMapping("/product2")
    public Product getProduc2() {
        return new Product(2, "product 2");
    }
    
    @GetMapping("/product3")
    public Product getProduc3() {
        return new Product(3, "product 3");
    }
    
    @GetMapping("/product4")
    public Product getProduc4() {
        return new Product(4, "product 4");
    }
}
