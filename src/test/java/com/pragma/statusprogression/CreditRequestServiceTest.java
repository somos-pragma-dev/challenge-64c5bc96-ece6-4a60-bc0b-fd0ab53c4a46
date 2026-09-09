package com.pragma.statusprogression;

import com.pragma.statusprogression.model.CreditRequest;
import com.pragma.statusprogression.service.CreditRequestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CreditRequestServiceTest {
    @Autowired
    private CreditRequestService service;

    @Test
    void registerRequest_shouldRegisterNewRequest() {
        CreditRequest request = new CreditRequest("123", "pending");
        service.registerRequest(request);
        assertEquals(request, service.getRequest("123"));
    }

    @Test
    void registerRequest_shouldNotDuplicateRequest() {
        CreditRequest request = new CreditRequest("123", "pending");
        service.registerRequest(request);
        service.registerRequest(request);
        assertEquals(1, service.getRequests().size());
    }

    @Test
    void getRequest_shouldReturnRegisteredRequest() {
        CreditRequest request = new CreditRequest("123", "pending");
        service.registerRequest(request);
        assertEquals(request, service.getRequest("123"));
    }
}