package com.cyq.springcloud.services.impl;

import com.cyq.springcloud.dao.PaymentDao;
import com.cyq.springcloud.entities.Payment;
import com.cyq.springcloud.services.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
