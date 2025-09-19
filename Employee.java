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
    private int getHoursWorked;

    public Employee(String fullname, int yearOfBirth, double hourlyWage, int setHoursWorked, double getHoursWorked){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
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
        if (age >= 16) {
            System.out.print("can drive");
            return true;
        }
        else {
            System.out.print("must wait 16-EmployeeAge years");
            return false;
        }
    
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
       // totalSalary = hourlyWage + unpaidHours;
    //    taxes = 30% of; totalSalary;
       // calculatePay = totalSalary - taxes;
        // to be completed
        return calculatePay();
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        //calculatePay of Employee;
        System.out.print("Employee has received a wire transfer of (calculatePay) CAD");
        return; //unpaidHours = 0;
        // to be completed
    }
    
    public int getHoursWorked(){
    return getHoursWorked;
    }
    
    public void setHoursWorked(int amount);
    setHoursWorked = amount;
    }
}