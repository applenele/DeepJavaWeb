package com.smallcode.mybatisdemo;


import com.smallcode.mybatisdemo.dao.ContactMapper;
import com.smallcode.mybatisdemo.domain.Contact;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class ContactTest {

    @Autowired
    private ContactMapper contactMapper;

    @Test
    public void addContact() {

        Contact contact = new Contact();
        contact.setLink("www.baidu.com");
        contact.setAddress("sf");
        contact.setBirthday(new Date());
        contact.setName("dd");
        contact.setPhone("123455");
        contact.setSex(false);

        contactMapper.insert(contact);
    }
}
