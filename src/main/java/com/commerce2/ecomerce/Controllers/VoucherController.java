package com.commerce2.ecomerce.Controllers;

import com.commerce2.ecomerce.Entities.Voucher;
import com.commerce2.ecomerce.Services.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/invoices")
public class VoucherController {
    @Autowired
    private VoucherService voucherService;

    @PostMapping
    public ResponseEntity<Voucher> generateVoucher(@RequestBody Voucher voucher){
        try {
            Voucher newVoucher = voucherService.save(voucher);
            return new ResponseEntity<>(newVoucher, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Voucher> readVoucher(@PathVariable Long id){
        try {
            return voucherService.findById(id)
                    .map(voucher -> new ResponseEntity<>(voucher, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
