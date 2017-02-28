package com.solverpeng.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/27 0027
 *      desc  : BaseAjaxPage
 * </pre>
 */
@WebServlet(name = "userServlet", urlPatterns = "/servlet/userServlet")
public class UserServlet extends BaseServlet {

    public void toUserList(HttpServletRequest request, HttpServletResponse response) {

    }

}
