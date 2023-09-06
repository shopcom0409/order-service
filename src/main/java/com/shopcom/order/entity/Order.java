package com.shopcom.order.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "order_details")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(generator = "order_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "order_Seq", initialValue = 100, allocationSize = 2)
    private Integer orderId;
    private Double amount;
    private Date orderDate;

}
