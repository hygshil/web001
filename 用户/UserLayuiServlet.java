package com.hp.controller;

import com.alibaba.fastjson.JSON;
import com.hp.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "UserLayuiServlet",urlPatterns = "/UserLayuiServlet")
public class UserLayuiServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  super.service(req, resp);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        //创建一个layui后台的json格式
        ArrayList<User> users = new ArrayList<>();

        //创建15个用户
        User u1 = new User();
        u1.setName("张三");
        u1.setAge(15);
        u1.setClassuser("15网络");
        users.add(u1);

        User u2 = new User();
        u2.setName("李四");
        u2.setAge(22);
    u2.setClassuser("17软件");
        users.add(u2);

        User u3 = new User();
        u3.setName("王五");
        u3.setAge(33);
        u3.setClassuser("16信息");
        users.add(u3);

        User u4 = new User();
        u4.setName("教授");
        u4.setAge(21);
        u4.setClassuser("15网络");
        users.add(u4);

        User u5 = new User();
        u5.setName("貂蝉");
        u5.setAge(18);
        u5.setClassuser("15信息");
        users.add(u5);

        User u6 = new User();
        u6.setName("王二");
        u6.setAge(17);
        u6.setClassuser("19网络");
        users.add(u6);

        User u7 = new User();
        u7.setName("麻子");
        u7.setAge(20);
        u7.setClassuser("18软件");
        users.add(u7);

        User u8 = new User();
        u8.setName("小乔");
        u8.setAge(16);
        u8.setClassuser("15信息");
        users.add(u8);

        User u9 = new User();
        u9.setName("大乔");
        u9.setAge(22);
        u9.setClassuser("15网络");
        users.add(u9);

        User u10 = new User();
        u10.setName("张飞");
        u10.setAge(25);
        u10.setClassuser("19软件");
        users.add(u10);

        User u11 = new User();
        u11.setName("孙尚香");
        u11.setAge(29);
        u11.setClassuser("17信息");
        users.add(u11);

        User u12 = new User();
        u12.setName("诸葛亮");
        u12.setAge(23);
        u12.setClassuser("17网络");
        users.add(u12);

        User u13 = new User();
        u13.setName("甄姬");
        u13.setAge(18);
        u13.setClassuser("19软件");
        users.add(u13);

        User u14 = new User();
        u14.setName("鲁班");
        u14.setAge(12);
        u14.setClassuser("13网络");
        users.add(u14);

        User u15 = new User();
        u15.setName("虞姬");
        u15.setAge(15);
        u15.setClassuser("15软件");
        users.add(u15);


        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","写啥都行");
        map.put("count",15);
        map.put("data",users);
        String s = JSON.toJSONString(map);
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
