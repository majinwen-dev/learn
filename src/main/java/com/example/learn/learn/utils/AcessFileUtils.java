package com.example.learn.learn.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * mdb格式文件读取工具类
 *
 * @Author: 马金文
 * @Date: 2021/12/3 10:17
 * @Description:
 */
@Slf4j
public class AcessFileUtils {
    /**
     * 驱动类名
     */
    private final static String CLASSNAME = "net.ucanaccess.jdbc.UcanaccessDriver";
    /**
     * 数据连接地址前缀
     * 数据连接完整地址为  固定前缀+服务器上数据文件的物理地址
     */
    private final static String BACEDBURL = "jdbc:ucanaccess://";

    /**
     * mdb格式文件读取并在转换成java的对象集合
     * 另外这里单独增加了一些公用字段的赋值
     * @param
     * @return
     * @throws
     * @author 马金文
     * @date 2021/12/3 10:19
     */
    public static <T> List<T> readToBeans(String mdbPath, String baseSql, Class<T> tClass) {
        /**
         * 实体类名
         */
        String simpleName = tClass.getSimpleName().toLowerCase();
        /**
         * 实体名称和表名映射
         */
        String tableName = TableEntityMappingEnum.change(simpleName);
        Properties prop = new Properties();
        //设置编码
        prop.put("charSet", "UTF-8");
        //数据地址
        String dbUrl = BACEDBURL + mdbPath;
        //返回数据
        List<T> list = new ArrayList<>();
        try {
            //引入驱动
            Class.forName(CLASSNAME).newInstance();
            //连接数据库资源
            Connection conn = DriverManager.getConnection(dbUrl, prop);
            //建立查询事务
            Statement statement = conn.createStatement();
            log.info("sql语句"+baseSql + tableName);
            //执行查询
            ResultSet result = statement.executeQuery(baseSql + tableName);
            while (result.next()) {
                // 创建实例
                T t = tClass.newInstance();
                // 拿到属性数组
                Field[] declaredFields = tClass.getDeclaredFields();
                for (Field declaredField : declaredFields) {
                    // 设置属性可访问权限
                    declaredField.setAccessible(true);
                    //给属性赋值
                    try {
                        declaredField.set(t, result.getObject(declaredField.getName().toLowerCase()));
                    } catch (Exception e) {
                    }
                }

                Field bsm = tClass.getDeclaredField("bsm");
                bsm.setAccessible(true);
                bsm.set(t, UUID.randomUUID().toString());

                Field createBy = tClass.getDeclaredField("createBy");
                createBy.setAccessible(true);
                createBy.set(t, "张三");

                Field createTime = tClass.getDeclaredField("createTime");
                createTime.setAccessible(true);
                createTime.set(t, new Date());

                Field editBy = tClass.getDeclaredField("editBy");
                editBy.setAccessible(true);
                editBy.set(t, "张三");

                Field editTime = tClass.getDeclaredField("editTime");
                editTime.setAccessible(true);
                editTime.set(t, new Date());

                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 将*.mdb文件存储在本地
     *
     * @param
     * @return 存储在本地的文件路径
     * @throws
     * @author 马金文
     * @date 2021/12/3 13:27
     */
    public static String saveLocal(String fileBasicPath, MultipartFile multipartFile) {
        //本地存储文件的基础路径
        String acessFileBasicPath = fileBasicPath;
        // 文件后缀
        String fileSuffix = multipartFile.getOriginalFilename().split("\\.")[1];
        //将文件存储在本地
        String fullFilePath = acessFileBasicPath + UUID.randomUUID().toString() + fileSuffix;
        try {
            FileUtils.writeByteArrayToFile(new File(fullFilePath), multipartFile.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fullFilePath;
    }

    /**
     * 删除文件本地存储的*.mdb文件
     *
     * @param
     * @return
     * @throws
     * @author 马金文
     * @date 2021/12/3 13:27
     */
    public static void deleteFile(String filepath) {
        File file = new File(filepath);
        if (file.exists()) {
            file.delete();
        }
    }

    /**
     * 设置主键bsm
     * 设置录入时间 录入人  更新时间  更新人等
     *
     * @param
     * @return
     * @throws
     * @author 马金文
     * @date 2021/12/3 16:10
     */
    public static <T> void setCommonParam(T o) {
        if (o != null) {
            Class<?> aClass = o.getClass();
            try {
                Field bsm = aClass.getDeclaredField("bsm");
                bsm.setAccessible(true);
                bsm.set(o, UUID.randomUUID().toString());

                Field createBy = aClass.getDeclaredField("createBy");
                createBy.setAccessible(true);
                createBy.set(o, "张三");

                Field createTime = aClass.getDeclaredField("createTime");
                createTime.setAccessible(true);
                createTime.set(o, new Date());

                Field editBy = aClass.getDeclaredField("editBy");
                editBy.setAccessible(true);
                editBy.set(o, "张三");

                Field editTime = aClass.getDeclaredField("editTime");
                editTime.setAccessible(true);
                editTime.set(o, new Date());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 利用反射将map集合封装成bean对象
     *
     * @param map   clazz
     * @param clazz
     * @return
     */
    public static <T> T mapToBean(Map<String, Object> map, Class<?> clazz) throws Exception {
        Object obj = clazz.newInstance();
        if (map != null && !map.isEmpty() && map.size() > 0) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                // 属性名
                String propertyName = entry.getKey();
                // 属性值
                Object value = entry.getValue();
                String setMethodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
                //获取和map的key匹配的属性名称
                Field field = getClassField(clazz, propertyName);
                if (field == null) {
                    continue;
                }
                Class<?> fieldTypeClass = field.getType();
                value = convertValType(value, fieldTypeClass);
                try {
                    clazz.getMethod(setMethodName, field.getType()).invoke(obj, value);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
        return (T) obj;
    }


    /**
     * 根据给定对象类匹配对象中的特定字段
     *
     * @param clazz
     * @param fieldName
     * @return
     */
    private static Field getClassField(Class<?> clazz, String fieldName) {
        if (Object.class.getName().equals(clazz.getName())) {
            return null;
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }
        //如果该类还有父类，将父类对象中的字段也取出
        Class<?> superClass = clazz.getSuperclass();
        //递归获取
        if (superClass != null) {
            return getClassField(superClass, fieldName);
        }
        return null;
    }

    /**
     * 将map的value值转为实体类中字段类型匹配的方法
     *
     * @param value
     * @param fieldTypeClass
     * @return
     */
    private static Object convertValType(Object value, Class<?> fieldTypeClass) {
        Object retVal = null;

        if (Long.class.getName().equals(fieldTypeClass.getName())
                || long.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Long.parseLong(value.toString());
        } else if (Integer.class.getName().equals(fieldTypeClass.getName())
                || int.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Integer.parseInt(value.toString());
        } else if (Float.class.getName().equals(fieldTypeClass.getName())
                || float.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Float.parseFloat(value.toString());
        } else if (Double.class.getName().equals(fieldTypeClass.getName())
                || double.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Double.parseDouble(value.toString());
        } else {
            retVal = value;
        }
        return retVal;
    }
}
