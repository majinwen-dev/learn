package com.example.learn.learn.test;

import com.example.learn.learn.dao.ZjdlyDAO;
import com.example.learn.learn.domain.Zjdly;
import com.example.learn.learn.utils.AcessFileUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.sql.*;
import java.util.*;
import java.util.Date;

/**
 * @Author: 马金文
 * @Date: 2021/12/2 13:37
 * @Description:
 */
@Component
public class AcessTest {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    ZjdlyDAO zjdlyDAO;


    public void insert(MultipartFile multipartFile) throws Exception {
        String sql = "select *  from zjdly";
        String path = "D:\\zs\\file\\" + UUID.randomUUID().toString() + ".mdb";
        byte[] bytes = multipartFile.getBytes();
        FileUtils.writeByteArrayToFile(new File(path), bytes);
        String filename = multipartFile.getOriginalFilename();
        String[] split = filename.split("\\.");
        System.out.println(split[1]);
        System.out.println(filename);
//        ResultSet result = AcessFileUtils.read(path, sql);
//
//        while (result.next()) {
//            Zjdly zjdly = new Zjdly();
//            zjdly.setBsm(UUID.randomUUID().toString());
//            if (result.getDate("dcsj") instanceof Date) {
//                zjdly.setDcsj(result.getDate("dcsj"));
//            }
//            if (result.getString("zjddm") instanceof String) {
//                zjdly.setZjddm(result.getString("zjddm"));
//            }
//            if (result.getString("zjdlyzk") instanceof String) {
//                zjdly.setZjdlyzk(result.getString("zjdlyzk"));
//            }
//            if (result.getDate("zjdxzqssj") instanceof Date) {
//                zjdly.setZjdxzqssj(result.getDate("zjdxzqssj"));
//            }
////            zjdlyDAO.insert(zjdly);
//        }
        new File(path).delete();
    }




}
