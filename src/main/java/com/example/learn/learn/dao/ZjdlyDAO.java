package com.example.learn.learn.dao;

import com.example.learn.learn.domain.Zjdly;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface ZjdlyDAO {
    int deleteByPrimaryKey(String bsm);

    int insert(Zjdly record);

    int insertSelective(Zjdly record);

    Zjdly selectByPrimaryKey(String bsm);

    int updateByPrimaryKeySelective(Zjdly record);

    int updateByPrimaryKey(Zjdly record);
}