package cn.la.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuang on 2016/2/17.
 */
@Controller
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index(){
        logger.debug("this is a debug msg");
        logger.info("this is a info msg");
        logger.error("this is an error msg");
        return "index";
    }
}
