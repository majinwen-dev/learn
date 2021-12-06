package com.example.learn.learn.bean;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 马金文
 * @Date: 2021/11/10 15:35
 * @Description:
 */
@Service
public class ListableBeanFactoryImpl  {

    @Autowired
    ListableBeanFactory listableBeanFactory;


    public void test(){
        String[] beanDefinitionNames = listableBeanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
        }
        System.out.println(listableBeanFactory.getBeanDefinitionCount());
    }
}
