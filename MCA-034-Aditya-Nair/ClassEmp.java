class Employee {
    private String name;
    private double basicSalary;
    private int noOfLeave;

    public Employee(String name, double basicSalary, int noOfLeave) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.noOfLeave = noOfLeave;
    }

    public void calBudget() {
        double salary = (30 - noOfLeave) * basicSalary;
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}

class TeamLead {
    private String projectName;
    private int noOfEmployee;
    private int noOfProjectDays;
    private double ratePerDay;

    public TeamLead(String projectName, int noOfEmployee, int noOfProjectDays, double ratePerDay) {
        this.projectName = projectName;
        this.noOfEmployee = noOfEmployee;
        this.noOfProjectDays = noOfProjectDays;
        this.ratePerDay = ratePerDay;
    }

    public void calBudget() {
        double budget = noOfEmployee * noOfProjectDays * ratePerDay;
        System.out.println("Project: " + projectName + ", Budget: " + budget);
    }
}

public class ClassEmp {
    public static void main(String[] args) {
        // Create an Employee object and display salary
        Employee emp = new Employee("vivek", 2000, 5);
        emp.calBudget();

        // Create a TeamLead object and display project budget
        TeamLead lead = new TeamLead("Employee Management System", 10, 30, 1000);
        lead.calBudget();
    }
}

