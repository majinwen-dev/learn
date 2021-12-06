package com.example.learn.learn.service.impl;

import com.example.learn.learn.conf.entity.EntitisConfiguration;
import com.example.learn.learn.domain.*;
import com.example.learn.learn.request.ImportBatchesParam;
import com.example.learn.learn.service.AbstractBasicDataImportService;
import com.example.learn.learn.service.BasicDataImportBatchesService;
import com.example.learn.learn.utils.AcessFileUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.*;

/**
 * @Author: 马金文
 * @Date: 2021/12/3 10:39
 * @Description:
 */
@Service
public class BasicDataImportBatchesServiceImpl implements BasicDataImportBatchesService {

    @Autowired
    EntitisConfiguration entitisConfiguration;

    /**
     * 基础sql语句
     */
    private final String baseSql = "select *  from  ";

    @Override
    public String importBatches(MultipartFile multipartFile, ImportBatchesParam importBatchesParam) {
        if (!StringUtils.endsWith(multipartFile.getOriginalFilename(), "mdb")) {
            return "文件格式错误,请上传*.mdb格式文件";
        }
        String fileBasicPath = entitisConfiguration.getImportbatchesproperty().getAcessFileBasicPath();
        // 文件存在本地并且返回文件真实本地路径--读取完成删除本地文件
        String fileFullPath = AcessFileUtils.saveLocal(fileBasicPath, multipartFile);
        // 读取农户数据
        List<Nh> nhList = AcessFileUtils.readToBeans(fileFullPath, baseSql, Nh.class);
        // 读取农户户内成员数据
        List<Nhhncy> nhhncyList = AcessFileUtils.readToBeans(fileFullPath, baseSql, Nhhncy.class);
        // 读取农民房屋数据
        List<Nmfw> nmfwList = AcessFileUtils.readToBeans(fileFullPath, baseSql, Nmfw.class);
        // 读取农民房屋利用数据
        List<Nmfwly> nmfwlyList = AcessFileUtils.readToBeans(fileFullPath, baseSql, Nmfwly.class);
        // 读取使用权人数据
        List<Shyqr> shyqrlyList = AcessFileUtils.readToBeans(fileFullPath, baseSql, Shyqr.class);
        // 读取所有权人数据
        List<Suyqr> suyqrList = AcessFileUtils.readToBeans(fileFullPath, baseSql, Suyqr.class);
        // 读取宅基地利用数据
        List<Zjdly> zjdlyList = AcessFileUtils.readToBeans(fileFullPath, baseSql, Zjdly.class);
        // 读取宅基地宗地信息数据
        List<Zjdzdxx> zjdzdxxList = AcessFileUtils.readToBeans(fileFullPath, baseSql, Zjdzdxx.class);

        // 设置农户数据
        for (Nh nh : nhList) {
            nh.setSuyqrbsm(suyqrList.stream().filter(a->(nh.getSuyqrdm().equals(a.getSuyqrdm()))).findFirst().orElse(new Suyqr()).getBsm());
        }
        // 设置农户户内成员数据
        for (Nhhncy nhhncy : nhhncyList) {

        }
        // 设置农民房屋
        for (Nmfw nmfw : nmfwList) {

        }
        // 设置农民房屋利用
        for (Nmfwly nmfwly : nmfwlyList) {

        }

        //设置使用权人
        for (Shyqr shyqr : shyqrlyList) {

        }

        // 设置所有权人
        for (Suyqr suyqr : suyqrList) {

        }

        // 设置宅基地利用
        for (Zjdly zjdly : zjdlyList) {

        }

        // 设置在基地宗地信息
        for (Zjdzdxx zjdzdxx : zjdzdxxList) {

        }
        /**
         * 删除本地文件
         */
        AcessFileUtils.deleteFile(fileFullPath);
        return "success";
    }
}
