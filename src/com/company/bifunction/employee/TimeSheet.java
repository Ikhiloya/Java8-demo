package com.company.bifunction.employee;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class TimeSheet {
    private int empNo;
    private int days;


    public TimeSheet(int empNo, int days) {
        this.empNo = empNo;
        this.days = days;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
