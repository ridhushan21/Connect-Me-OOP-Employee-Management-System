package connectmesystem;

import java.util.ArrayList;

public interface IEmployee {
    
    
public abstract boolean add(Employee employee);
    public abstract boolean delete(int employeeID);
    public abstract boolean update(Employee employee);
    public abstract Employee find(int employeeID);
    public abstract  Employee find(String EmployeeUsername);
    public abstract ArrayList<Employee> getAll();
    public abstract boolean findcheck(int employeeID);

}
