package com.betop.gmall.logger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author long
 * @description:
 * @date 2021/12/4 20:57
 */
@RestController //表示返回普通对象而不是页面
@Slf4j
public class LoggerController {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("test1")
    public String test1() {
        System.out.println("11111111");
        return "success";
    }

    @RequestMapping("test2")
    public String test2(@RequestParam("name") String name,
                        @RequestParam("age") int age) {
        System.out.println(name + ":" + age);
        return "success";
    }

    @RequestMapping("applog")
    public String getLogger(@RequestParam("param") String jsonStr) {
        //落盘
        log.info(jsonStr);
        //写入 Kafka
        kafkaTemplate.send("ods_base_log", jsonStr);
        return "success";
    }
}