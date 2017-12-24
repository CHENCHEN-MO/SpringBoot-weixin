package com.chenchen;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/12/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test(){
        String name = "chenchen";
        log.debug("debug:{}",name);
        log.warn("warn:{}",name);
        log.info("info:{}",name);
        log.error("error :{}",name);
    }

}
