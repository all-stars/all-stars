package com.allstars.server.repository;

import com.allstars.server.AllStarsServerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AllStarsServerApplication.class)
@Transactional
public class AuthorityRepositoryTest {

    @Autowired
    private AuthorityRepository authorityRepository;

    @Test
    public void doTest() {
        System.out.println(">>>> " + authorityRepository.count() );
    }
}
