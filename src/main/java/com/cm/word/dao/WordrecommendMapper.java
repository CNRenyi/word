package com.cm.word.dao;

import com.cm.word.model.Wordrecommend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WordrecommendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Wordrecommend record);

    int insertSelective(Wordrecommend record);

    Wordrecommend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wordrecommend record);

    int updateByPrimaryKey(Wordrecommend record);

    List selectRecommend(@Param("start") Integer start, @Param("end") Integer end);
}