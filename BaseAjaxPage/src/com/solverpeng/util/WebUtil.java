package com.solverpeng.util;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/27 0027
 *      desc  : BaseAjaxPage
 * </pre>
 */
public class WebUtil {

    public static void sendData(String attributeKey, Object attributeValue, String url, HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute(attributeKey, attributeValue);
            request.getRequestDispatcher(url).forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T param2Bean(HttpServletRequest req, Class<T> clazz) {
        T t = null;

        try {
            t = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                String fieldValue = req.getParameter(fieldName);
                BeanUtils.copyProperty(t, fieldName, fieldValue);
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return t;
    }

}
