package com.marsthink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhoumao on 2016/12/9.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("title","title");
        mv.addObject("content","content");
        return mv;
    }

    @RequestMapping(value = "/msg", method = RequestMethod.GET)
    public ModelAndView msg() {
        String message = "��Ϣ1";
        User user = new User("����", 12, new Date());
        List<User> us= new ArrayList<User>();
        us.add(new User("����", 12, new Date()));
        us.add(new User("����", 13, new Date()));
        us.add(new User("����", 14, new Date()));
        ModelAndView mad = new ModelAndView("msg");
        //�����ݴ���modelMap
        mad.addObject("message", message);
        mad.addObject(user);//Ĭ��Ϊ����������ĸСд
        mad.addObject("users", us);
        return mad;
    }


    @RequestMapping(value = "/mine", method = RequestMethod.GET)
    public ModelAndView mine() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("title", "Spring MVC And Freemarker");
        mv.addObject("content", " Hello world �� test my first spring mvc ! ");
        return mv;
    }
}
