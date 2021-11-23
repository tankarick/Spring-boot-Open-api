package com.momo.data.delegate;

import com.momo.data.api.V1ApiDelegate;
import com.momo.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class V1ApiDelegateImpl implements V1ApiDelegate {

    @Autowired
    private UserService userService;


    @Override
    public ResponseEntity<List<String>> getCustomers() {
        return null;
    }

    @Override
    public ResponseEntity<List<String>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }
}
