package com.company;
import com.company.Employee;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num_of_emps, choice;
        String name;
        double exp, sal;
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();
        Employee emp6 = new Employee();

        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Enter number of employees: ");
            num_of_emps = in.nextInt();
            if(num_of_emps <= 6 && num_of_emps%2 == 0)
                break;
            else
                System.out.println("Kindly enter the number of employees again. " +
                        "Note: number must be less than 6 and multiple of 2");
        }

        switch (num_of_emps){
            case 6:
                System.out.println("\nEmployee Name: ");
                name = in.next();
                emp1.setName(name);
                System.out.println("Experience: ");
                exp = in.nextDouble();
                emp1.setExp(exp);
                System.out.println("Salary: ");
                sal = in.nextDouble();
                emp1.setSal(sal);

                System.out.println("\nEmployee Name: ");
                name = in.next();
                emp2.setName(name);
                System.out.println("Experience: ");
                exp = in.nextDouble();
                emp2.setExp(exp);
                System.out.println("Salary: ");
                sal = in.nextDouble();
                emp2.setSal(sal);
            case 4:
                System.out.println("\nEmployee Name: ");
                name = in.next();
                emp3.setName(name);
                System.out.println("Experience: ");
                exp = in.nextDouble();
                emp3.setExp(exp);
                System.out.println("Salary: ");
                sal = in.nextDouble();
                emp3.setSal(sal);

                System.out.println("\nEmployee Name: ");
                name = in.next();
                emp4.setName(name);
                System.out.println("Experience: ");
                exp = in.nextDouble();
                emp4.setExp(exp);
                System.out.println("Salary: ");
                sal = in.nextDouble();
                emp4.setSal(sal);
            case 2:
                System.out.println("\nEmployee Name: ");
                name = in.next();
                emp5.setName(name);
                System.out.println("Experience: ");
                exp = in.nextDouble();
                emp5.setExp(exp);
                System.out.println("Salary: ");
                sal = in.nextDouble();
                emp5.setSal(sal);

                System.out.println("\nEmployee Name: ");
                name = in.next();
                emp6.setName(name);
                System.out.println("Experience: ");
                exp = in.nextDouble();
                emp6.setExp(exp);
                System.out.println("Salary: ");
                sal = in.nextDouble();
                emp6.setSal(sal);
                break;
            default: System.out.println("Sorry number not valid!");
        }

        while (true){
            System.out.println("Menu: \n");
            System.out.println("1. Highest Salary.\n");
            System.out.println("2. Alphabetically first name.\n");
            System.out.println("3. Exit.\n");
            System.out.println("Enter your choice: ");
            choice = in.nextInt();

            switch (choice){
                case 1: //Highest salary func
                    double max = emp5.getSal() > emp6.getSal()? emp5.getSal() : emp6.getSal();
                    if (num_of_emps >= 4){
                        if(emp4.getSal()>emp3.getSal() && emp4.getSal() > max)
                            max = emp4.getSal();
                        else if (emp3.getSal() >= emp4.getSal() && emp3.getSal() > max)
                            max = emp3.getSal();
                    }
                    if (num_of_emps == 6){
                        if(emp6.getSal()>emp5.getSal() && emp6.getSal() > max)
                            max = emp6.getSal();
                        else if (emp5.getSal() >= emp6.getSal() && emp5.getSal() > max)
                            max = emp5.getSal();
                    }
                    System.out.println(max+" is the highest salary.\n");
                    break;
                case 2: // First name
                    String smallest;
                    smallest = emp6.getName().compareTo(emp5.getName()) >= 0 ? emp5.getName() : emp6.getName();
                    if (num_of_emps >= 4){
                        if(emp4.getName().compareTo(emp3.getName()) < 0 && emp4.getName().compareTo(smallest) < 0)
                            smallest = emp4.getName();
                        else if (emp3.getName().compareTo(emp4.getName()) < 0 && emp3.getName().compareTo(smallest) < 0)
                            smallest = emp3.getName();
                    }
                    if (num_of_emps == 6){
                        if(emp6.getName().compareTo(emp5.getName()) < 0 && emp6.getName().compareTo(smallest) < 0)
                            smallest = emp6.getName();
                        else if (emp5.getName().compareTo(emp6.getName()) < 0 && emp5.getName().compareTo(smallest) < 0)
                            smallest = emp5.getName();
                    }
                    System.out.println(smallest+" is the alphabetically the first name.");
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE!");
            }
        }
        //System.out.println("Name: "+ emp5.getName() + "\tExperience: "+ emp5.getExp() + "\tSalary: "+ emp5.getSal());

    }
}
