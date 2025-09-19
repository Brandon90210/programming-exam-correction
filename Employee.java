/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
    private double getHoursWorked;
    private int setHoursWorked;

    public Employee(String fullname, int yearOfBirth, double hourlyWage, int setHoursWorked, getHoursWorked){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        this.setHoursWorked = setHoursWorked;
        this.getHoursWorked = getHoursWorked;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if EmployeeAge≥ 16;
            then system.print "can drive";
        else system.print "must wait 16-EmployeeAge years"
        
        // to be completed
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        totalSalary = hourlyWage + unpaidHours;
        taxes = 30% of totalSalary;
        calculatePay = totalSalary - taxes;
        // to be completed
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        calculatePay of Employee;
        system.print "Employee has received a wire transfer of (calculatePay) CAD"
        return value unpaidHours = 0
        // to be completed
    }
}