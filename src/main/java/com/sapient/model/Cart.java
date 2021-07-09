package com.sapient.model;

import com.sapient.model.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cart")
public class Cart {

    @Id
    private Long cartId ;


    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Product> products ;

    public void setProduct(Product product){
        this.products.add(product) ;
    }

}
