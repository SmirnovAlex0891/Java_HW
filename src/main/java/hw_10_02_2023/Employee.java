package hw_10_02_2023;

public class Employee {
    private String fullName;
    private String jobTitle;
    private double salary;
    private Department department;

    public Employee(String fullName, String jobTitle, double salary, Department department) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String fullName, double salary, Department department) {
        this.fullName = fullName;
        this.jobTitle = "Freelance";
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String toString() {
        return "Name: " + this.fullName +
                "\n" + "Job Title: " + this.jobTitle +
                "\n" + "Salary: " + this.salary +
                "\n" + "Department: " + this.department +
                "\n";
    }
}
