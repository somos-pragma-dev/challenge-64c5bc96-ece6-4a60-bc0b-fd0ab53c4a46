package com.pragma.statusprogression.controller;

import com.pragma.statusprogression.model.CreditRequest;
import com.pragma.statusprogression.service.CreditRequestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit-requests")
public class CreditRequestController {
    private final CreditRequestService service;

    public CreditRequestController(CreditRequestService service) {
        this.service = service;
    }

    @PostMapping
    public void registerRequest(@RequestBody CreditRequest request) {
        service.registerRequest(request);
    }

    @GetMapping("/{operationNumber}")
    public CreditRequest getRequest(@PathVariable String operationNumber) {
        return service.getRequest(operationNumber);
    }
}