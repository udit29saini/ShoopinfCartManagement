package com.sapient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    private Integer orderId ;
    private String orderStatus ;
    private Timestamp buyDate ;
    private Timestamp shippingDate ;

}
