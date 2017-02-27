package com.solverpeng.service;

import com.solverpeng.bean.User;
import com.solverpeng.bean.UserQueryBean;
import com.solverpeng.dao.UserDao;
import com.solverpeng.special.Page;

import java.util.List;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/26 0026
 *      desc  : BasePage
 * </pre>
 */
public class UserService {
    private UserDao userDao = new UserDao();

    public Page<User> getPage(String pageNoStr) {
        int totalRecord = userDao.getTotalRecord();
        Page<User> page = new Page<>(pageNoStr, totalRecord);
        List<User> pageList = userDao.getPageList(page.getPageNo(), Page.PAGE_SIZE);
        page.setList(pageList);
        return page;
    }

    public Page<User> getPage(UserQueryBean queryBean) {
        int totalRecord = userDao.getTotalRecord(queryBean);
        Page<User> page = new Page<>(queryBean.getPageNoStr(), totalRecord);
        List<User> users = userDao.getPageList(queryBean, page.getPageNo(), Page.PAGE_SIZE);
        page.setList(users);
        return page;
    }
}
