package models;

import java.util.ArrayList;

public class Salary {
    public double sumSalary(ArrayList<Employee> emplist){
        double res = 0;
        for(Employee emp: emplist){
            res+=emp.salary;
        }
        return res;
    }
}
