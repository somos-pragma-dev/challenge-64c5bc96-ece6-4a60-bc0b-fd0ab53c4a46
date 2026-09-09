package com.pragma.statusprogression.service;

import com.pragma.statusprogression.model.CreditRequest;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CreditRequestService {
    private final Map<String, CreditRequest> requests = new HashMap<>();

    public void registerRequest(CreditRequest request) {
        if (!requests.containsKey(request.operationNumber())) {
            requests.put(request.operationNumber(), request);
        }
    }

    public CreditRequest getRequest(String operationNumber) {
        return requests.get(operationNumber);
    }
}