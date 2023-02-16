package Hw_10_02_2023;

public class Department {
    private String nameDepartment;
    private int numberOfEmployees;
    private Firm firm;

    public Department(String nameDepartment, int numberOfEmployees, Firm firm) {
        this.nameDepartment = nameDepartment;
        this.numberOfEmployees = numberOfEmployees;
        this.firm = firm;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }
    public String toString() {
        return this.nameDepartment;
    }
}
