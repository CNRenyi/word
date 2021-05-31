package com.cm.word.dao;

import com.cm.word.model.Primaryschool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrimaryschoolMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Primaryschool record);

    int insertSelective(Primaryschool record);

    Primaryschool selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Primaryschool record);

    int updateByPrimaryKey(Primaryschool record);

    List selectPrimarySchoolWordLimit(@Param("start") Integer start , @Param("end") Integer end);

    int selectPrimarySchoolWordCount();
}