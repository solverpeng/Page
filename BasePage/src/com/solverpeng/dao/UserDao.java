package com.solverpeng.dao;

import com.solverpeng.bean.User;
import com.solverpeng.bean.UserQueryBean;
import com.solverpeng.dao.base.BaseDao;

import java.util.List;
import java.util.Objects;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/26 0026
 *      desc  : BasePage
 * </pre>
 */
public class UserDao extends BaseDao<User> {

    public List<User> getList() {
        String sql = "select id, user_name userName from user";
        return this.getBeanList(sql);
    }

    public int getTotalRecord() {
        String sql = "select count(*) from user";
        long record = this.getSingleValue(sql);
        return (int) record;
    }

    public List<User> getPageList(int pageNo, int pageSize) {
        String sql = "select id, user_name userName from user limit ?, ?";
        return this.getBeanList(sql, (pageNo - 1) * pageSize, pageSize);
    }

    public int getTotalRecord(UserQueryBean queryBean) {
        String sql = "select count(*) from user ";
        boolean flag = false;
        if (queryBean.getId() != null && !queryBean.getId().equals("")) {
            sql += "where id = " + queryBean.getId();
            flag = true;
        }
        if (queryBean.getUserName() != null && !Objects.equals("", queryBean.getUserName())) {
            if (flag) {
                sql += " and user_name = " + queryBean.getUserName();
            } else {
                sql += "where user_name like '%" + queryBean.getUserName() +"%'";
            }
        }
        return Integer.parseInt(this.getSingleValue(sql).toString());
    }

    public List<User> getPageList(UserQueryBean queryBean, int pageNo, int pageSize) {
        String sql = "select id, user_name userName from user ";
        boolean flag = false;
        if (queryBean.getId() != null && !queryBean.getId().equals("")) {
            sql += "where id = " + queryBean.getId();
            flag = true;
        }
        if (queryBean.getUserName() != null && !Objects.equals("", queryBean.getUserName())) {
            if (flag) {
                sql += " and user_name = " + queryBean.getUserName();
            } else {
                sql += "where user_name like '%" + queryBean.getUserName() +"%'";
            }
        }
        sql += " limit ?, ?";
        return this.getBeanList(sql, (pageNo - 1) * pageSize, pageSize);
    }
}
