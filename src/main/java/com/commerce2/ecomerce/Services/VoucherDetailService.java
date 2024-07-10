package com.commerce2.ecomerce.Services;

import com.commerce2.ecomerce.Entities.VoucherDetail;
import com.commerce2.ecomerce.Repositories.VoucherDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoucherDetailService {
    @Autowired
    private VoucherDetailRepository voucherDetailRepository;

    public List<VoucherDetail> readAll(){
        return voucherDetailRepository.findAll();
    }

    public Optional<VoucherDetail> findById(Long id){
        return voucherDetailRepository.findById(id);
    }

    public VoucherDetail save(VoucherDetail voucherDetail){
        return voucherDetailRepository.save(voucherDetail);
    }

    public void delete(Long id){
        voucherDetailRepository.deleteById(id);
    }

}
