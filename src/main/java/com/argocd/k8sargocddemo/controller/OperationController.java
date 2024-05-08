package com.argocd.k8sargocddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OperationController {


    @GetMapping("/")
    public String hello() {
        return "demo application for argoCD";
    }

}
