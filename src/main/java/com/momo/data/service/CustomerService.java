package com.momo.data.service;

import com.momo.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Service
public class CustomerService {

    @Autowired
    private UserRepository repository;

    public List<String> getCustomers() {
        return Arrays.asList(countDown());
    }

    private String countDown() {
        try {
            long start = System.currentTimeMillis();
            CountDownLatch countDownLatch = new CountDownLatch(15);
            countDownLatch.await(10L, TimeUnit.SECONDS);
            return String.valueOf(System.currentTimeMillis() - start);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
