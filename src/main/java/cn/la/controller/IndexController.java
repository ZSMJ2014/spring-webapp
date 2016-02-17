package cn.la.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuang on 2016/2/17.
 */
@Controller
public class IndexController {
    @RequestMapping({"/","index"})
    public String index(){
        return "index";
    }
}
