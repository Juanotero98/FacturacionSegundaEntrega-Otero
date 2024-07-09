package com.commerce2.ecomerce.Services;

import com.commerce2.ecomerce.Entities.Voucher;
import com.commerce2.ecomerce.Repositories.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoucherService {
    @Autowired
    private VoucherRepository voucherRepository;

    public List<Voucher> readAll(){
        return voucherRepository.findAll();
    }

    public Optional<Voucher> findById(Long id){
        return voucherRepository.findById(id);
    }

    public Voucher save(Voucher voucher){
        return voucherRepository.save(voucher);
    }

    public void delete(Long id){
        voucherRepository.deleteById(id);
    }
}
