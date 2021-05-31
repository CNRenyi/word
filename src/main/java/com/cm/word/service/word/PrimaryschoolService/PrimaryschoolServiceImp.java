package com.cm.word.service.word.PrimaryschoolService;

import com.cm.word.dao.PrimaryschoolMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:PrimaryschoolServiceImp
 * Package:com.cm.word.service.word
 * Description:
 *
 * @Date:2021/5/23 9:44
 * @com.chuangmei
 */
@Service
public class PrimaryschoolServiceImp implements PrimaryschoolService {

    @Resource
    private PrimaryschoolMapper primaryschoolMapper;

    @Override
    public List queryPrimarySchoolWordLimit(Integer start,Integer end) {


        return primaryschoolMapper.selectPrimarySchoolWordLimit(start,end);
    }

    @Override
    public int queryPrimarySchoolWordCount() {
        return primaryschoolMapper.selectPrimarySchoolWordCount();
    }
}
