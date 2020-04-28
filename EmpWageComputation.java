//import goes here
import java.util.Random;
import java.util.*;
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
//empUtil.DailyEmpWage();
//System.out.println("Emp DailyEmpWage is:" +DailyEmpWage);
}else
{
System.out.println("Emp not present ");
}
//check Employee daily wage
empUtil.DailyEmpWage();
//System.out.println("Emp DailyEmpWage is:" +DailyEmpWage);
empUtil.display();
empUtil.CalculateDailyEmpWage();
empUtil.EmpWage();
empUtil.EmpWageForMonth();
}
}

/**
* Employee util class.
* @author Aditi
*/
 class EmpUtil {

int WagePerHrs = 20;
int FullDayHrs = 8;
int DailyEmpWage = 0;
int IsFullTime = 1;
/**
* Check emp is present
* @return true if emp is present otherwise false.
*/
public static boolean isPresent() {
// random genrate
double ranValue = Math.floor(Math.random() * 10 ) % 3;
//int ranValue = 0/1;
return ranValue == 1;
}

public void DailyEmpWage()
{
 DailyEmpWage = WagePerHrs * FullDayHrs;
//return DailyEmpWage == 1;

}
public void display()
{
System.out.println("Daily Empolyee Wage is:" +DailyEmpWage);
}

//Consider partTimeHRs to calculated Emp wage
public void CalculateDailyEmpWage()
{
		int salary = 0;
		if(isPresent()){
			int empRatePerHr = 20;
            int PartTimeHrs = 4;
            salary = PartTimeHrs * empRatePerHr;
			System.out.println("Daily Wage:" +salary);
		}
		else{
			System.out.println("Daily Wage:" +salary);
		}
}
// calculate wage using case statement

public void EmpWage()
{
int WagePerHrs = 20;
double DailyEmpWage = 0;
int IsFullTime = 1;
int IsPartTime = 2;
int empHrs;
int ranValue = (int) (Math.floor(Math.random() * 10 ) % 3);
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

public void EmpWageForMonth()
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
int ranValue = (int) (Math.floor(Math.random() * 10 ) % 3);
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
