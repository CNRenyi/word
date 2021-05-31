package com.cm.word.service.Home.HomeDailySentence;

import com.cm.word.dao.DailysentenceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:HomeDailySentenceServiceImp
 * Package:com.cm.word.service.Home.HomeDailySentence
 * Description:
 *
 * @Date:2021/5/21 21:22
 * @com.chuangmei
 */
@Service
public class HomeDailySentenceServiceImp implements HomeDailySentenceService {

    // dao
    @Resource
    private DailysentenceMapper dailysentenceMapper;

    @Override
    public List queryDailySentence() {
        return dailysentenceMapper.selectDailySentence();
    }
}
