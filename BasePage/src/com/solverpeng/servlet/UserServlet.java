package com.solverpeng.servlet;

import com.solverpeng.bean.User;
import com.solverpeng.bean.UserQueryBean;
import com.solverpeng.service.UserService;
import com.solverpeng.special.Page;
import com.solverpeng.util.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/26 0026
 *      desc  : BasePage
 * </pre>
 */
@WebServlet(name = "userServlet", urlPatterns = {"/userServlet"})
public class UserServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserQueryBean queryBean = WebUtil.param2Bean(req, UserQueryBean.class);
        Page<User> page = userService.getPage(queryBean);
        WebUtil.sendData(req, resp, "page", page, "/WEB-INF/views/user_list.jsp");
    }
}
