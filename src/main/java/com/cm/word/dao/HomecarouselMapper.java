package com.cm.word.dao;

import com.cm.word.model.Homecarousel;

import java.util.List;

public interface HomecarouselMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Homecarousel record);

    int insertSelective(Homecarousel record);

    Homecarousel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Homecarousel record);

    int updateByPrimaryKey(Homecarousel record);

    List selectCarousel();
}