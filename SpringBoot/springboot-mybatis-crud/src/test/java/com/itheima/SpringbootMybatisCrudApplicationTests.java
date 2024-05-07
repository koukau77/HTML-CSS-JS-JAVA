package com.itheima;

import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.itheima.mapper.EmpMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
class SpringbootMybatisCrudApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void selectTest() {
        List<Emp> empList = empMapper.list(null, null, null, null);
        System.out.println(empList);
    }

    @Test
    public void updateTest() {
        Emp emp = new Emp();

        emp.setId(20);
        emp.setPassword("5418800");
        emp.setUsername("koukau77");
        emp.setName("koukau");
        emp.setUpdateTime(LocalDate.now());
        emp.setGender((short) 1);

        empMapper.update(emp);
    }

    @Test
    public void deleteTest() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        empMapper.deleteByIds(list);
    }



}
