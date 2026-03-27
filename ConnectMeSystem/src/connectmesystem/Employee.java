package connectmesystem;

public class Employee {
  
    private int EmployeeID;
    private String EmployeeName;
    private String Department;
    private String Designation;

    public Employee(int EmployeeID, String EmployeeName, String Department, String Designation) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.Department = Department;
        this.Designation = Designation;
    }
    
    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeUsername() {
        return EmployeeName;
    }

    public void setEmployeeUsername(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeDepartment() {
        return Department;
    }

    public void setEmployeeDepartment(String Department) {
        this.Department = Department;
    }

    public String getEmployeeDesignation() {
        return Designation;
    }

    public void setEmployeeDesignation(String Designation) {
        this.Designation = Designation;
    }
}
