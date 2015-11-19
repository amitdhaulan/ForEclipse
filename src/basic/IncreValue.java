package basic;

import java.util.ArrayList;
import java.util.Collections;

import myclasses.Employee;

public class IncreValue {
	public static void main(String[] args) {
		Employee employee = new Employee();
		ArrayList<Employee> arrayList = new ArrayList<>();

		employee.setAddress("AmitGurgaon");
		employee.setCompany("AmiteCIFM");
		employee.setDesignation("Amit Java Developer");
		employee.setEmailid("amitkumar@gmail.com");
		employee.setName("Amit");
		employee.setPhonenumber(45698);
		employee.setSalary(95000);
		arrayList.add(employee);

		employee = new Employee();
		employee.setAddress("HarshGurgaon");
		employee.setCompany("HarsheCIFM");
		employee.setDesignation("Harsh Java Developer");
		employee.setEmailid("harshkumar@gmail.com");
		employee.setName("Harsh");
		employee.setPhonenumber(45698);
		employee.setSalary(95000);
		arrayList.add(employee);

		employee = new Employee();
		employee.setAddress("SulabhGurgaon");
		employee.setCompany("SulabheCIFM");
		employee.setDesignation("Sulabh Java Developer");
		employee.setEmailid("sulabhkumar@gmail.com");
		employee.setName("Sulabh");
		employee.setPhonenumber(45698);
		employee.setSalary(95000);
		arrayList.add(employee);

		employee = new Employee();
		employee.setAddress("AchinGurgaon");
		employee.setCompany("AchineCIFM");
		employee.setDesignation("Achin Java Developer");
		employee.setEmailid("achinkumar@gmail.com");
		employee.setName("Achin");
		employee.setPhonenumber(45698);
		employee.setSalary(95000);
		arrayList.add(employee);

		employee = new Employee();
		employee.setAddress("HimanshuGurgaon");
		employee.setCompany("HimanshueCIFM");
		employee.setDesignation("Himanshu Java Developer");
		employee.setEmailid("himanshukumar@gmail.com");
		employee.setName("Himanshu");
		employee.setPhonenumber(45698);
		employee.setSalary(95000);
		arrayList.add(employee);

		employee = new Employee();
		employee.setAddress("ShubhamGurgaon");
		employee.setCompany("ShubhameCIFM");
		employee.setDesignation("Shubham Java Developer");
		employee.setEmailid("shubhamkumar@gmail.com");
		employee.setName("Shubham");
		employee.setPhonenumber(45698);
		employee.setSalary(95000);
		arrayList.add(employee);

		employee = new Employee();
		employee.setAddress("VipinGurgaon");
		employee.setCompany("Vipin \\t eCIFM");
		employee.setDesignation("Vipin Java Developer");
		employee.setEmailid("vipinkumar@gmail.com");
		employee.setName("Vipin");
		employee.setPhonenumber(45698);
		employee.setSalary(95000);
		arrayList.add(employee);

		Collections.sort(arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i).getAddress() + "\t");
			System.out.print(arrayList.get(i).getCompany() + "\t");
			System.out.print(arrayList.get(i).getDesignation() + "\t");
			System.out.print(arrayList.get(i).getEmailid() + "\t");
			System.out.print(arrayList.get(i).getPhonenumber() + "\t\t");
			System.out.print(arrayList.get(i).getSalary() + "\t");
			System.out.print(arrayList.get(i).getName());
			System.out.println();
		}
	}
}
