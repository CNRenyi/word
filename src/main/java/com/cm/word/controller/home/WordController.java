package com.cm.word.controller.home;

import com.cm.word.service.word.PrimaryschoolService.PrimaryschoolService;
import com.cm.word.service.word.SeniorhighschoolService.SeniorhighschoolService;
import com.cm.word.service.word.WordrecommendService.WordRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:WordController
 * Package:com.cm.word.controller.home
 * Description:
 *
 * @Date:2021/5/22 21:20
 * @com.chuangmei
 */
@Controller
@RequestMapping("word")
public class WordController {

    @Autowired
    private PrimaryschoolService primaryschoolService;

    @Autowired
    private SeniorhighschoolService seniorhighschoolService;

    @Autowired
    private WordRecommendService wordRecommendService;

    @RequestMapping("worddata")
    @ResponseBody
    public Map getWordData
            (String category, @RequestParam(required = false,defaultValue = "0") Integer start,
             @RequestParam(required = false,defaultValue = "100") Integer end){

        // list
        List words = new ArrayList();

        int wordCount = 0;

        if (category.equals("初中")){
            words = primaryschoolService.queryPrimarySchoolWordLimit(start,end);
            wordCount = primaryschoolService.queryPrimarySchoolWordCount();
        }else if(category.equals("高中")){
            words = seniorhighschoolService.queryseniorSchoolWordLimit(start,end);
            wordCount = seniorhighschoolService.queryseniorSchoolWordCount();
        }
        // map
        Map datas = new HashMap();
        datas.put("words",words);

        if(end> wordCount) datas.put("Toload",true);

        return datas;
    }

    @RequestMapping("recommendData")
    @ResponseBody
    public Map getRcommendData
            (@RequestParam(required = false,defaultValue = "0") Integer start,
             @RequestParam(required = false, defaultValue = "3") Integer end){

        // 查询推荐
        List recommends = wordRecommendService.queryRecommend(start,end);

        // map
        Map datas = new HashMap<>();

        datas.put("recommends",recommends);

        return datas;
    }


}
