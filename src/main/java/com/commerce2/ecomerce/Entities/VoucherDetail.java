package com.commerce2.ecomerce.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class VoucherDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @Getter @Setter private Product product;

    @ManyToOne
    @JoinColumn(name = "voucher_id")
    @Getter @Setter private Voucher voucher;

    @Getter @Setter private Integer cuantity;
    @Getter @Setter private Double price;
}
