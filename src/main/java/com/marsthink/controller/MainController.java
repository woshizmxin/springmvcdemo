package com.marsthink.controller;

import com.marsthink.bean.BookType;
import com.marsthink.dao.BookTypeDAO;
import com.marsthink.dao.BookTypeDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

    BookTypeDAO bookTypeDao=new BookTypeDAOImpl();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("title", "title");
        mv.addObject("content", "content");
        if(bookTypeDao == null){
            System.out.println("***null***");
        }else{
            List<BookType> booktypes = bookTypeDao.getAllBookTypes();
            for (BookType bookType : booktypes) {
                System.out.println(bookType.getTypeName());
            }
        }
        return mv;
    }

    @RequestMapping(value = "/msg", method = RequestMethod.GET)
    public ModelAndView msg() {
        String message = "消息1";
        User user = new User("张三", 12, new Date());
        List<User> us = new ArrayList<User>();
        us.add(new User("张三", 12, new Date()));
        us.add(new User("张四", 13, new Date()));
        us.add(new User("张五", 14, new Date()));
        ModelAndView mad = new ModelAndView("msg");
        //将数据存入modelMap
        mad.addObject("message", message);
        mad.addObject(user);//默认为类名的首字母小写
        mad.addObject("users", us);
        return mad;
    }


    @RequestMapping(value = "/mine", method = RequestMethod.GET)
    public ModelAndView mine() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("title", "Spring MVC And Freemarker");
        mv.addObject("content", " Hello world ， test my first spring mvc ! ");
        return mv;
    }
}
