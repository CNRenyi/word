package com.cm.word.service.Home.Homecarousel;

import com.cm.word.dao.HomecarouselMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:HomecarouselServiceImp
 * Package:com.cm.word.service
 * Description:
 *
 * @Date:2021/5/21 16:15
 * @com.chuangmei
 */
@Service
public class HomecarouselServiceImp implements HomecarouselService {

    @Resource
    private HomecarouselMapper homecarouselMapper;

    @Override
    public List queryCarousel() {
        return homecarouselMapper.selectCarousel();
    }
}
