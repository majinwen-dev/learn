package com.example.learn.learn.service;

import com.example.learn.learn.request.ImportBatchesParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 数据批量导入service
 *
 * @Author: 马金文
 * @Date: 2021/12/3 10:33
 * @Description:
 */
public interface BasicDataImportBatchesService {
    /**
     * 数据批量导入
     * @author 马金文
     * @date 2021/12/3 10:37
     * @param
     * @return
     * @throws
     */
    String importBatches(MultipartFile multipartFile, ImportBatchesParam importBatchesParam);

}
