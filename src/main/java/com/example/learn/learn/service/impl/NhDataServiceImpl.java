package com.example.learn.learn.service.impl;

import com.example.learn.learn.domain.Nh;
import com.example.learn.learn.domain.Zjdly;
import com.example.learn.learn.service.AbstractBasicDataImportService;
import com.example.learn.learn.service.NhDataService;
import com.example.learn.learn.utils.AcessFileUtils;
import org.springframework.stereotype.Service;
import sun.misc.UUDecoder;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author: 马金文
 * @Date: 2021/12/3 15:00
 * @Description:
 */
@Service("nhDataService")
public class NhDataServiceImpl extends AbstractBasicDataImportService<Nh> implements NhDataService {
    /**
     * 获取*.mdb文件中农户的数据
     * @author 马金文
     * @date 2021/12/3 16:24
     * @param
     * @return
     * @throws
     */
    @Override
    public List<Nh> getList(String fileFullPath, String sql){
//        ResultSet result = AcessFileUtils.read(fileFullPath, sql);
//        List<Nh> nhs = new ArrayList<>(16);
//        while (result.next()) {
//            Nh nh = new Nh();
//            nh.setBsm(UUID.randomUUID().toString());
//            if (result.getString("nhdm") instanceof String) {
//                nh.setNhdm(result.getString("nhdm"));
//            }
//            if (result.getString("hzxm") instanceof String) {
//                nh.setHzxm(result.getString("hzxm"));
//            }
//            if (result.getString("hzzjlx") instanceof String) {
//                nh.setHzzjlx(result.getString("hzzjlx"));
//            }
//            if (result.getString("hzzjhm") instanceof String) {
//                nh.setHzzjhm(result.getString("hzzjhm"));
//            }
//            nhs.add(nh);
//        }
        return null;
    }
}
