package com.cm.word.dao;

import com.cm.word.model.Seniorhighschool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeniorhighschoolMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Seniorhighschool record);

    int insertSelective(Seniorhighschool record);

    Seniorhighschool selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Seniorhighschool record);

    int updateByPrimaryKey(Seniorhighschool record);

    List querySeniorhighschoolWordLimit(@Param("start") Integer start, @Param("end") Integer end);

    int selectseniorSchoolWordCount();
}