package com.example.test.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EsCotroller {

    @Autowired
    ProjDocRepository projDocRepository;

    @RequestMapping("test")
    public Object get(){
        Pageable page = PageRequest.of(0, 10);
        return projDocRepository.findAll(page);
    }
}
