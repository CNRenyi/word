package com.cm.word.service.word.PrimaryschoolService;

import java.util.List;

/**
 * ClassName:PrimaryschoolService
 * Package:com.cm.word.service
 * Description:
 *
 * @Date:2021/5/23 9:43
 * @com.chuangmei
 */
public interface PrimaryschoolService {
    List queryPrimarySchoolWordLimit(Integer start,Integer end);

    int queryPrimarySchoolWordCount();

}
