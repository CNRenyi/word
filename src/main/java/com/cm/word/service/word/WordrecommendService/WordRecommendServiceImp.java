package com.cm.word.service.word.WordrecommendService;

import com.cm.word.dao.WordrecommendMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:WordRecommendServiceImp
 * Package:com.cm.word.service.word.WordrecommendService
 * Description:
 *
 * @Date:2021/5/24 15:58
 * @com.chuangmei
 */
@Service
public class WordRecommendServiceImp implements WordRecommendService {

    @Resource
    private WordrecommendMapper wordrecommendMapper;

    @Override
    public List queryRecommend(Integer start, Integer end) {
        return wordrecommendMapper.selectRecommend(start,end);
    }
}
