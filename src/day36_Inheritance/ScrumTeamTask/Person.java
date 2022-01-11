package day36_Inheritance.ScrumTeamTask;

public class Person {

    public String name;
    public int age;
    public char gender;

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void eat(String food){
        System.out.println(" is eating" + food);
    }

    public static void drink(String drink){
        System.out.println(" is drinking" + drink);
    }
}

/*
1. Create a class named Person
			variables:
				name, age, gender

			methods:
				setInfo(): sets the name, age, gender of person
				eat(String food)
				drink(String drink)
				toString()

	2. Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class, you can call the inheritend setInfo() to set the name, age, and gender

				work()

				toString(): generate toString seperately in Employee class so that name, age, gender, id, jobTitle and salary of the emplyee can be displayed
 */
