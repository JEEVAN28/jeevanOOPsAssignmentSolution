package main;
import departments.*;

public class Main {
	public static void main(String[] args) {
		// AdminDepartment
        AdminDepartment adminDept = new AdminDepartment();
        System.out.println(" Welcome to " + adminDept.departmentName());
        System.out.println(adminDept.getTodaysWork());
        System.out.println(adminDept.getWorkDeadline());
        System.out.println(adminDept.isTodayAHoliday());        
		// HrDepartment 
        System.out.println();
        HrDepartment hrDept = new HrDepartment();
        System.out.println(" Welcome to " + hrDept.departmentName());
        System.out.println(hrDept.doActivity());
        System.out.println(hrDept.getTodaysWork());
        System.out.println(hrDept.getWorkDeadline());
        System.out.println(hrDept.isTodayAHoliday());
		// TechDepartment 
        System.out.println();
        System.out.println();
        TechDepartment techDept = new TechDepartment();
        System.out.println(" Welcome to " + techDept.departmentName());
        System.out.println(techDept.getTodaysWork());
        System.out.println(techDept.getWorkDeadline());
        System.out.println(techDept.getTechStackInformation());
        System.out.println(techDept.isTodayAHoliday());
		
	}
}
