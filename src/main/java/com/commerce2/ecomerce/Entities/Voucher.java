package com.commerce2.ecomerce.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private Date date;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @Getter @Setter private Voucher client;

    @OneToMany(mappedBy = "voucher", cascade = CascadeType.ALL)
    @Getter @Setter private List<VoucherDetail> voucher;
}
