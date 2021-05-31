package com.cm.word.service.word.SeniorhighschoolService;

import java.util.List;

/**
 * ClassName:SeniorhighschoolService
 * Package:com.cm.word.service.word
 * Description:
 *
 * @Date:2021/5/23 9:45
 * @com.chuangmei
 */
public interface SeniorhighschoolService {
    List queryseniorSchoolWordLimit(Integer start,Integer end);

    int queryseniorSchoolWordCount();
}
