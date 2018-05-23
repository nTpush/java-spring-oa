package com.example.javabootoa.controller;


import com.example.javabootoa.dao.DemoDao;
import com.example.javabootoa.domain.DemoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableTransactionManagement   //需要事务的时候加上
@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    private DemoDao demoDao;

    @RequestMapping("/demo")
    private List<DemoDO> demo() {

        return demoDao.selectAll();
    }
}
