package com.commerce2.ecomerce.Controllers;

import com.commerce2.ecomerce.Entities.VoucherDetail;
import com.commerce2.ecomerce.Services.VoucherDetailService;
import com.commerce2.ecomerce.Services.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/carts")
public class CartController {
    @Autowired
    private VoucherService voucherService;
    @Autowired
    private VoucherDetailService voucherDetailService;

    @PostMapping
    public ResponseEntity<VoucherDetail> addProduct(@RequestBody VoucherDetail detail){
        try {
            VoucherDetail newDetail = voucherDetailService.save(detail);
            return new ResponseEntity<>(newDetail, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteProduct(@RequestBody VoucherDetail detail){
        try {
            voucherDetailService.delete(detail.getId());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
