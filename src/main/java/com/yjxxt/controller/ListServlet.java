package com.yjxxt.controller;

import com.yjxxt.mapper.UserMapper;
import com.yjxxt.pojo.User;
import com.yjxxt.service.UserService;
import com.yjxxt.service.UserServiceImpl;
import com.yjxxt.utils.MybatisUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/list.do")
public class ListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //编码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //实例化service
        UserMapper userMapper = MybatisUtil.getMapper();
        UserService us = new UserServiceImpl(userMapper);
        //查询
        List<User> userList = us.findAll();
        req.setAttribute("userList",userList);
        //转发
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }
}
