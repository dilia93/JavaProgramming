package day36_Inheritance.ScrumTeamTask;

public class Employee extends Person{

    public int ID;
    public String jobTitle;
    public int salary;

    public void setInfo(String name, int age, int ID, int salary){
        this.name = name;
        this.age=age;
        this.ID= ID;
        this.salary= salary;

        System.out.println();
    }
}

/*
2. Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class, you can call the inheritend setInfo() to set the name, age, and gender

				work()

				toString(): generate toString seperately in Employee class so that name, age, gender, id, jobTitle and salary of the emplyee can be displayed
 */