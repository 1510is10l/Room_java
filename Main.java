package myProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Home father  = new Home();
//		Home mather  = new Home();
//		Home sister  = new Home();
//		Home brother = new Home();
//		
//		father.name = "Faisal";
//		father.age  = 40;
//		father.tall = 170;
//		
//		mather.name = "Roaa";
//		mather.age  = 36;
//		mather.tall = 155;
//		
//		sister.name = "Fatma";
//		sister.age  = 20;
//		sister.tall = 150;
//		
//		brother.name = "Saud";
//		brother.age  = 25;
//		brother.tall = 166;
//		
//		father.printInfo();
//		mather.printInfo();
//		sister.printInfo();
//		brother.printInfo();
		
//        String time = "12:30";
//        boolean isMorning = false;
//        
//        //قم بإضافة النصوص في التعبير 
//        time = time + (isMorning? "am" : "pm" );
//
//        System.out.println(time);
		
//		  Scanner input = new Scanner(System.in);
//		  System.out.println("هل الآن صباح أم مساء؟");
//		  
//		  
//		  String time = input.nextLine();
//		  
//		  switch(time)
//		  {
//		  case "ص":
//			  System.out.println("صباح الخير");
//			  break;
//		  case "م":
//			  System.out.println("مساء الخير");
//			  break;
//		  default:
//			  System.out.println("أنتهى الزمن");
//		  }
		
//		int money = 100;
//		
//		do
//		{
//			if(money == 0)
//			{
//				System.out.println("طفرنا");
//				break;
//			}
//			else
//			{
//			money = money - 10;
//			System.out.printf("%d %s \n", 10, " أعطيت");
//			System.out.printf("%d %s \n", money, " تبقى");
//			}
//		}
//		while(money >= 0);
		
//		String[][] names =
//			{
//					{"عبدالله", "وضحى", "نورة"},
//					{"فيصل", "محمد", "خالد", "سعود", "عبدالعزيز"}
//			};
//		
//		String value = names[1][3];
//		System.out.println(value);
//
//				
//		String[] jobs =
//			{
//					"برمجة", "شبكات", "أتصالات"
//			};
//		
//		int id[][] =
//			{
//					{100, 101, 102},
//					{103, 104, 105, 106, 107}
//			};
//		
//		String job = jobs[1];
//		int ids = id[1][3];
//		System.out.println(value + " وظيفته " + job + " رقمه " + ids);
		
//		ArrayList<String> programmingLanguages = new ArrayList<String>();
//		
//		programmingLanguages.add("Java");
//		programmingLanguages.add("JavaScript");
//		programmingLanguages.add("Ruby");
//		
//		System.out.println(programmingLanguages.get(2));
		
//		Car c1 = new Car();
//		
//		c1.make = "Toyota";
//		c1.model = "Camry";
//		c1.year = 2001;
//		c1.color = "Red";
//		
//		c1.printCar();
//		
//		Car c2 = new Car();
//		
//		c2.make = "Ford";
//		c2.model = "Explorer";
//		c2.year = 2015;
//		c2.color = "Yellow";
//		
//		c2.printCar();
		
//		Mobile m1 = new Mobile();
//		
//		m1.make = "Apple";
//		m1.model = "iphone";
//		m1.version = "13";
//		m1.price = 4000;
//		m1.color = "Black";
//		
////		m1.printMob();
//		
//		
//		m1.printMob();
//		m1.oldAndNew(2500);
//		
//		Mobile m2 = new Mobile();
//		
//		m2.make = "Android";
//		m2.model = "Galaxy";
//		m2.version = "G4";
//		m2.price = 3500;
//		m2.color = "Blue";
//		
//		m2.printMob();
//		
//		m2.oldAndNew(2400.42);
		
//		Car c1 = new Car("ferrari", "Explorer", 2015, "Yellow");
//		
//		
//		c1.printCar();
//		
//		Car.store = "My Car";
//		Car.printStore();
//		
//		Book b1 = new Book("JavaScript", "Faisal", 700);
//		Book b2 = new Book("The Hope", "Mohammad", 1000);
//		Book b3 = new Book("PHP", "Nour", 900);
//		Book b4 = new Book("Python", "Musa", 2000);
//		
//		b1.printInfo();
//		b2.printInfo();
//		b3.printInfo();
//		b4.printInfo();
//		
//		System.out.println("==============================");
//		
//		Book.totalBookNumber();
		
//		Students s1 = new Students("Faisal", "Programmer");
//		Students s2 = new Students("Mohammed", "Network");
//		Students s3 = new Students("Khaild", "Doc");
//		Students s4 = new Students("Wadha", "Design");
//		
//		s1.printInfo();
//		s2.printInfo();
//		s3.printInfo();
//		s4.printInfo();
//		
//		Students.totalCounter();
		
		
//		Employee e = new Employee();
//		
//		e.setName("Fa");
//		e.setAge(21);
//		e.setSalary(20000);
//		
//		System.out.println( e.getName());
//		System.out.println("Age: " + e.getAge());
//		System.out.println("Salary: " + e.getSalary());
		
		Room r1 = new Room(101, 'L');
		Room r2 = new Room(102, 'S');
		
		r1.rentRoom("Faisal", 300);
		r2.rentRoom("Ali", 200);
		
		System.out.println("Number Room: " + r1.numberRoom);
		System.out.println("Type Room: " + r1.typeRoom);
		System.out.println("Guest Name: " + r1.getGuestName());
		System.out.println("Price Room: " + r1.getPrice() + " SAR");
		
		System.out.println("=================================");
		
		System.out.println("Number Room: " + r2.numberRoom);
		System.out.println("Type Room: " + r2.typeRoom);
		System.out.println("Guest Name: " + r2.getGuestName());
		System.out.println("Price Room: " + r2.getPrice() + " SAR");
		
}
		
		

}