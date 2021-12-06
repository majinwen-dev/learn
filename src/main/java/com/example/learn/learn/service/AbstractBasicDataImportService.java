package com.example.learn.learn.service;

import java.util.List;

/**
 * @Author: 马金文
 * @Date: 2021/12/3 14:57
 * @Description:
 */
public abstract class AbstractBasicDataImportService<T> {
    /**
     * 获取*.mdb文件中的数据转化成对应的具体对象
     * @author 马金文
     * @date 2021/12/3 14:59
     * @param
     * @return
     * @throws
     */
   public abstract List<T> getList(String fileFullPath, String sql);
}
