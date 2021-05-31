package com.cm.word.service.word.SeniorhighschoolService;

import com.cm.word.dao.SeniorhighschoolMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:SeniorhighschoolServiceImp
 * Package:com.cm.word.service.word
 * Description:
 *
 * @Date:2021/5/23 9:45
 * @com.chuangmei
 */
@Service
public class SeniorhighschoolServiceImp implements SeniorhighschoolService {

    @Resource
    private SeniorhighschoolMapper seniorhighschoolMapper;

    @Override
    public List queryseniorSchoolWordLimit(Integer start,Integer end) {
        return seniorhighschoolMapper.querySeniorhighschoolWordLimit(start,end);
    }

    @Override
    public int queryseniorSchoolWordCount() {
        return seniorhighschoolMapper.selectseniorSchoolWordCount();
    }
}
