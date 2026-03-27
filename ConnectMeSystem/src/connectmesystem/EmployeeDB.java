package connectmesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public class EmployeeDB implements IEmployee {
    
    private File file;
    private List<Employee> employeeList = new ArrayList<>();


    public EmployeeDB() {
        file = new File("EmployeeDetails.txt");
    }

    @Override
    public boolean add(Employee employee) {
        try {
            FileWriter fw = new FileWriter(file, true);
            String line = employee.getEmployeeID() + ":";
            line = line + employee.getEmployeeUsername() + ":";
            fw.write(line);
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int employeeID) {
        ArrayList<Employee> employeeList = getAll();
        boolean check = false;
        for (Employee employee : employeeList) {
            check = employee.getEmployeeID() == employeeID;
            if (check) {
                employeeList.remove(employee);
                break;
            }
        }
        if (!check) {
            return false;
        }
        try {
            FileWriter fw = new FileWriter(file);
            for (Employee employee : employeeList) {
                add(employee);
            }
            return true;
        } catch (Exception e) {
            System.out.println("An error occurred in writing to the file" + e.getMessage());
            return false;
        }
    }
    
    public boolean update(Employee employee) {
        ArrayList<Employee> employeeList = getAll();
        for (Employee emp : employeeList) {
            if (emp.getEmployeeID() == employee.getEmployeeID()) {
                employeeList.remove(emp);
                employeeList.add(employee);
                break;
            }
        }
        try {
            FileWriter fw = new FileWriter(file);
            for (Employee emp : employeeList) {
                add(emp);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Employee find(int employeeID) {
        ArrayList<Employee> employeeList = getAll();
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public Employee find(String employeeName) {
        ArrayList<Employee> employeeList = getAll();
        for (Employee employee : employeeList) {
            if (employee.getEmployeeUsername().equals(employeeName)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public boolean findcheck(int employeeID) {
        ArrayList<Employee> employeeList = getAll();
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Employee> getAll() {
        try {
            Scanner sc = new Scanner(file);
            ArrayList<Employee> EmployeeList = new ArrayList<>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] arr = line.split(":");
                int EmployeeID = Integer.valueOf(arr[0]);
                String EmployeeName = arr[1];
                String Department = arr[2];
                String Designation = arr[3];
                Employee Employee = new Employee(EmployeeID, EmployeeName, Department, Designation );
                EmployeeList.add(Employee);
            }
            return EmployeeList;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmployeeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}