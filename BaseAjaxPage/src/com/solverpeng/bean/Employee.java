package com.solverpeng.bean;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/27 0027
 *      desc  : BaseAjaxPage
 * </pre>
 */
public class Employee {
    private String name;
    private String position;
    private String Office;
    private String extn;
    private String startDate;
    private String salary;

    public Employee(String name, String position, String office, String extn, String startDate, String salary) {
        this.name = name;
        this.position = position;
        Office = office;
        this.extn = extn;
        this.startDate = startDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String office) {
        Office = office;
    }

    public String getExtn() {
        return extn;
    }

    public void setExtn(String extn) {
        this.extn = extn;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", Office='" + Office + '\'' +
                ", extn='" + extn + '\'' +
                ", startDate='" + startDate + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
