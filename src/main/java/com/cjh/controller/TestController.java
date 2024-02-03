package com.cjh.controller;

import com.cjh.entity.Test;
import com.cjh.mapper.TestMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {
    @Resource
    private TestMapper testMapper;

    @GetMapping("list")
    public void test (){
        List<Test> testList = testMapper.selectList(null);
        testList.forEach(System.out::println);
    }
}
