package com.example.learn.learn.dao;

import com.example.learn.learn.domain.Nh;
import org.springframework.stereotype.Repository;

@Repository
public interface NhDAO {
    int deleteByPrimaryKey(String bsm);

    int insert(Nh record);

    int insertSelective(Nh record);

    Nh selectByPrimaryKey(String bsm);

    int updateByPrimaryKeySelective(Nh record);

    int updateByPrimaryKey(Nh record);
}