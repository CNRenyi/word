package com.cm.word.service.word.WordrecommendService;

import java.util.List;

/**
 * ClassName:WordRecommendService
 * Package:com.cm.word.service.word.WordrecommendService
 * Description:
 *
 * @Date:2021/5/24 15:58
 * @com.chuangmei
 */
public interface WordRecommendService {
    List queryRecommend(Integer start, Integer end);
}
