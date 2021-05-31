package com.cm.word.controller.home;

import com.cm.word.service.Home.HomeDailySentence.HomeDailySentenceService;
import com.cm.word.service.Home.Homecarousel.HomecarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:HomeController
 * Package:com.cm.word.controller
 * Description:
 *
 * @Date:2021/5/21 16:06
 * @com.chuangmei
 */
@Controller
@RequestMapping("home")
public class HomeController {


    /**
     * 轮播图
     */
    @Autowired
    private HomecarouselService homecarouselService;

    /**
     * 每日一句
     */
    @Autowired
    private HomeDailySentenceService homeDailySentenceService;

    @RequestMapping("homedataSimple")
    @ResponseBody
    public List getHomeData(){
        return homecarouselService.queryCarousel();
    }

    @RequestMapping("homedata")
    @ResponseBody
    public Map getHomeDataByMap(){

        // map
        Map datas = new HashMap();

        // 轮播图
        datas.put("carousels",homecarouselService.queryCarousel());

        //每日一句
        datas.put("dailySentence",homeDailySentenceService.queryDailySentence());

        return datas;
    }

}
