package com.zb;

import com.zb.bean.Person;
import com.zb.bean.PersonValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * SpringBoot单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigApplicationTests {

    @Autowired
    Person persons;
    @Autowired
    PersonValue personValue;
    @Test
    public void contextLoads() {
        System.out.println(persons);
    }

    @Test
    public void TestValue(){
        System.out.println(personValue);
    }

}
