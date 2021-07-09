package com.sapient.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {

    @Id
    private Long productId ;
    private String productName ;
    private Long productPrice ;
    private String productDescription ;
    private String productType ;

    @ManyToOne
    @JoinColumn(name = "cart_id" , nullable = false)
    @JsonIgnore
    private Cart cart ;

}
