package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Parent;
import com.example.demo.repository.ParentRepository;

@RestController
@RequestMapping("/parent")
public class ParentRestController {

    @Autowired
    private ParentRepository parentRepository;

    //    @Autowired
    //    private ParentRepositoryCustomImpl parentRepository;

    /**
     * 全件表示。
     *
     * @return 顧客情報
     */
    @GetMapping
    public ResponseEntity<List<Parent>> get() {
        List<Parent> parents = parentRepository.findAll();
        return ResponseEntity.ok(parents);
    }
}
