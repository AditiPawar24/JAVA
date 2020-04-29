import java.util.Random;
//import java.util.*;
/**
* Employee Wage Computation class.
* @author Aditi
*/
public class EmpWageComputation {
/**
* main method.
* @param args the args
*/
public static void main(String[] args) {
    System.out.println("Welcome to Employee Wage Computation Program");
    EmpUtil empUtil = new EmpUtil();
    // Check Employee is Present
    if(empUtil.isPresent()){
        System.out.println("Emp is present");
        //Calculate Employee daily wage
        empUtil.dailyEmpWage();
        //System.out.println("Emp DailyEmpWage is:" +wage);
        empUtil.display();
        empUtil.calculateDailyEmpWage();
        empUtil.empWage();
        empUtil.empWageForMonth();
    }else
    {
     System.out.println("Emp not present ");
    }
}
}

/**
* Employee util class.
* @author Aditi
*/
class EmpUtil {

    private static int WagePerHrs = 20;
    private static int FullDayHrs = 8;
    private static int wage = 0;
    private static int IS_FULL_TIME = 1;
    /**
    * Check emp is present
    * @return true if emp is present otherwise false.
    */
    public static boolean isPresent() {
    // random genrate
    //double ranValue = Math.floor(Math.random() * 10 ) % 3;
    //int ranValue = 0/1;
    return 1 == new Random().nextInt(1000)%2;
    }

    public static int dailyEmpWage()
    {
	 //int wage = 0;
	//check part/full time
	if(IS_FULL_TIME()){
		wage = WagePerHrs * FullDayHrs;
	}
        wage = WagePerHrs * FullDayHrs/2;
        return wage;
    }
    private static boolean IS_FULL_TIME() {
	    return 1 == new Random().nextInt(1000)%2;
    }
    public static void display()
    {
        System.out.println("Daily Empolyee Wage is:" +wage);
    }

    //Consider partTimeHRs to calculated Emp wage
    public static void calculateDailyEmpWage()
    {
		int salary = 0;
		if(isPresent()){
			int empRatePerHr = 20;
            int PartTimeHrs = 4;
            salary = PartTimeHrs * empRatePerHr;
			System.out.println("Daily Part time Wage:" +salary);
		}
		else{
			System.out.println("Daily Wage:" +salary);
		}
    }
    // calculate wage using case statement

    public static void empWage()
    {
       int WagePerHrs = 20;
       double DailyEmpWage = 0;
       int IsFullTime = 1;
       int IsPartTime = 2;
       int empHrs;
       final int ranValue = new Random().nextInt(1000)%2;
       switch (ranValue){
       case 1:
            empHrs = 8;
    //System.out.println("Full Time hrs:" +empHrs);
       break;
       case 2:
            empHrs = 4;
    //System.out.println("Part Time hrs:" +empHrs);
       break;
       default:
            empHrs = 0;
        }
    DailyEmpWage = WagePerHrs * empHrs;
    System.out.println("Daily Emp Wages is :" +DailyEmpWage);
    }

    // calculating wages for Month

    public static void empWageForMonth()
    {
        int WagePerHrs = 20;
        double totalSalary = 0;
        int IsFullTime = 1;
        int IsPartTime = 2;
        int empHr = 0;
        int numWorkingDays = 20;
        double salary = 0;
        for (int day=1; day<=numWorkingDays; day++)
        {  
            final int ranValue = new Random().nextInt(1000)%2;
            switch (ranValue){
        case 1:
               empHr = 8;
               //System.out.println("Full Time hrs:" +empHrs);
        break;

        case 2:
               empHr = 4;
               //System.out.println("Part Time hrs:" +empHrs);
        break;
        default:
               empHr = 0;

             }		 
    salary = (empHr * WagePerHrs);
    System.out.println("Daily Emp Wages is :" +salary);
    totalSalary = (totalSalary + salary);
    System.out.println("Monthly emp salary:" +totalSalary);
		}
}
}


