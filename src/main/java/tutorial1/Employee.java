package tutorial1;

public class Employee {
    int employeeID ;
    String firstName;
    String lastName;
    String dateOfHire;
    String jobDescription;
    String department;
    double salary;
    String company;


    // constructor
    public Employee(int employeeID, String firstname,String lastName, String dateOfHire,
                    String jobDescription, String department, double salary, String company){
        this.employeeID = employeeID;
        this.firstName = firstname;
        this.lastName = lastName;
        this.dateOfHire = dateOfHire;
        this.jobDescription = jobDescription;
        this.department = department;
        this.salary = salary;
        this.company = company;


    }

    // work, serve customer, talk, hold meeting,
    // access modifier injava / private , public and other

    // about link
    public void hourlyRateFees(double hours){
         System.out.print(hours);
         //here we click the elemet

    }

    //




}
