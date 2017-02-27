package com.solverpeng.bean;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/27 0027
 *      desc  : BasePage
 * </pre>
 */
public class UserQueryBean {
    private String id;
    private String userName;
    private String pageNoStr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPageNoStr() {
        return pageNoStr;
    }

    public void setPageNoStr(String pageNoStr) {
        this.pageNoStr = pageNoStr;
    }

    @Override
    public String toString() {
        return "UserQueryBean{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", pageNoStr='" + pageNoStr + '\'' +
                '}';
    }
}
