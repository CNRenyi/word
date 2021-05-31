package com.cm.word.dao;

import com.cm.word.model.Dailysentence;

import java.util.List;

public interface DailysentenceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dailysentence record);

    int insertSelective(Dailysentence record);

    Dailysentence selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dailysentence record);

    int updateByPrimaryKeyWithBLOBs(Dailysentence record);

    int updateByPrimaryKey(Dailysentence record);

    List selectDailySentence();
}