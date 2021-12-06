package com.example.learn.learn.client;

import com.alibaba.fastjson.JSON;
import com.example.learn.learn.bean.ListableBeanFactoryImpl;
import com.example.learn.learn.domain.User;
import com.example.learn.learn.service.BasicDataImportBatchesService;
import com.example.learn.learn.test.AcessTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: majinwen
 * @Date: 2021/7/27-9:31
 * @Description:
 */
@RestController
@RequestMapping("/test")
@Api(value = "测试", tags = "测试")
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ListableBeanFactoryImpl listableBeanFactory;

    @Autowired
    ObjectFactory<User> objectFactory;

    @Autowired
    BasicDataImportBatchesService basicDataImportBatchesService;

    @RequestMapping(value = "/test1", method = RequestMethod.POST)
    @ApiOperation(value = "测试1")
    public String test1(@RequestBody String param) {
        System.out.println(param);
        return param;
    }


    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    @ApiOperation(value = "测试2")
    public void test2(String param) {
        Map map = new HashMap(16);
        map.put("key1", "123");
        map.put("key2", "456");
        map.put("key3", "789");
        String jsonString = JSON.toJSONString(map);
        String url = "http://localhost:9001/test/test1";
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(url, jsonString, String.class);
    }


    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    @ApiOperation(value = "测试3")
    public void test3() {
        listableBeanFactory.test();
    }

    @RequestMapping(value = "/test4", method = RequestMethod.GET)
    @ApiOperation(value = "测试4")
    public void test4() {
        User object1 = objectFactory.getObject();
        System.out.println(object1);
        User object2 = objectFactory.getObject();
        System.out.println(object2);

    }

    @RequestMapping(value = "/test5", method = RequestMethod.POST)
    @ApiOperation(value = "测试5")
    public void insert(MultipartFile multipartFile,User user) {
        try {
            basicDataImportBatchesService.importBatches(multipartFile,null);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
