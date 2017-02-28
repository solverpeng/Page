package com.solverpeng.servlet;

import com.solverpeng.bean.Employee;
import com.solverpeng.util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/27
 *      desc  : BaseAjaxPage
 * </pre>
 */
@WebServlet(urlPatterns = "/AjaxServlet")
public class AjaxServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String dateString = simpleDateFormat.format(new Date());
        Employee edinburgh = new Employee("Tiger Nixon", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh1 = new Employee("Garrett Winters", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh2 = new Employee("Tiger Nixon2", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh3 = new Employee("Tiger Nixon3", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh4 = new Employee("Tiger Nixon4", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh5 = new Employee("Tiger Nixon5", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh6 = new Employee("Tiger Nixon6", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh7 = new Employee("Tiger Nixon7", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh8 = new Employee("Tiger Nixon8", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh9 = new Employee("Tiger Nixon9", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh10 = new Employee("Tiger Nixon10", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh11 = new Employee("Tiger Nixon11", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh12 = new Employee("Tiger Nixon12", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh13 = new Employee("Tiger Nixon13", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh14 = new Employee("Tiger Nixon14", "System Architect", "Edinburgh", "5421", dateString, "$320,800");
        Employee edinburgh15 = new Employee("Tiger Nixon15", "System Architect", "Edinburgh", "5421", dateString, "$320,800");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(edinburgh);
        employees.add(edinburgh1);
        employees.add(edinburgh2);
        employees.add(edinburgh3);
        employees.add(edinburgh4);
        employees.add(edinburgh5);
        employees.add(edinburgh6);
        employees.add(edinburgh7);
        employees.add(edinburgh8);
        employees.add(edinburgh9);
        employees.add(edinburgh10);
        employees.add(edinburgh11);
        employees.add(edinburgh12);
        employees.add(edinburgh13);
        employees.add(edinburgh14);
        employees.add(edinburgh15);
        String jsonString = JsonUtil.toJson(employees);
        System.out.println(jsonString);

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.write(jsonString);
        writer.close();
    }
}
