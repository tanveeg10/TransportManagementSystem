import java.lang.*;
import java.io.*;
import java.io.FileReader;
import java.io.File;
import t.*;

	class Vehicle {
	
		public double distance; //Distance will be in metres.
		public double speedInMetresPerSecond;
		
		Vehicle(Vehicle v){ //Passing an object to constructor.
			distance = v.distance;
			speedInMetresPerSecond = v.speedInMetresPerSecond;
		}
		
		Vehicle(double d, double simps){
			distance = d;       // Distance is taken in metres.
			speedInMetresPerSecond = simps;
		}
		
		double timeTaken(){
			System.out.println("To calculate the time taken the kind of vehicle isn't specified.");
			return 0;
		}
	}

	class Bus extends Vehicle {
		public int numberOfPassengers;
		public double sikmphr; // sikmphr = Speed in km per hour.
		public double dikm;    // dikm = distance in km.
	
		Bus(Bus v){
			super(v);
			numberOfPassengers = v.numberOfPassengers;	
		}
		
		Bus(double d, double simps, int nop){
			super(d, simps);
			numberOfPassengers = nop;
		}
		
		double timeTaken(){
			System.out.println("The speed in km per hour is : "+((speedInMetresPerSecond*5)/18));
			sikmphr = speedInMetresPerSecond*5/18;
			System.out.println("The distance in km is : "+(distance/1000));
			dikm = distance/1000;
			System.out.println(dikm/sikmphr);
			return dikm/sikmphr;
		}
	}

	class Train extends Vehicle {
		int numberOfPassengersInEachCompartment;
		int numberOfCompartments;
		double speedInKmPerHour;
		double distanceInKm;
	
		Train(Train v){
			super(v);
			numberOfPassengersInEachCompartment = v.numberOfPassengersInEachCompartment;
			numberOfCompartments = v.numberOfCompartments;
		}
		
		Train(double d, double simps, int nopiec, int noc){
			super(d, simps);
			numberOfPassengersInEachCompartment = nopiec;
			numberOfCompartments = noc;
		}
		
		double timeTaken(){
			System.out.println("The speed in km per hour is : "+((speedInMetresPerSecond*5)/18));
			speedInKmPerHour = speedInMetresPerSecond*5/18;
			System.out.println("The distance in km is : "+(distance/1000));
			distanceInKm = distance/1000;
			System.out.println(distanceInKm/speedInKmPerHour);
			return distanceInKm/speedInKmPerHour;
		}
	}

	class Flight extends Vehicle {
		double distanceInMiles; 
		double speedInMilesPerHour; 
		int numberOfPassengersInBusinessClass;
		int numberOfPassengersInCoachClass;   // Coach class and economy class are the same.
	
		Flight(Flight v){
			super(v);
			numberOfPassengersInBusinessClass = v.numberOfPassengersInBusinessClass;
			numberOfPassengersInCoachClass = v.numberOfPassengersInCoachClass;
		}
	
		Flight(double d, double simps, int nopibc, int nopicc){
			super(d, simps);
			numberOfPassengersInBusinessClass = nopibc;
			numberOfPassengersInCoachClass = nopicc;
		}
		
		double timeTaken(){
			System.out.println("The speed in miles per hour is : "+((speedInMetresPerSecond*7.5)/18));
			speedInMilesPerHour = speedInMetresPerSecond*7.5/18;		// simphr = Speed in miles per hour.
			System.out.println("The distance in miles is : "+(distance/1609.344));
			distanceInMiles = distance/1609.344;           // 1 mile = 1609.344 metres.
			System.out.println(distanceInMiles/speedInMilesPerHour);
			return distanceInMiles/speedInMilesPerHour;          // dim = Distance in miles.
		}
	}
	
    class Walk extends Vehicle{
		public int numberOfPassengers;
		public double sikmphr; // sikmphr = Speed in km per hour.
		public double dikm;    // dikm = distance in km.
	
		Walk(Walk v){
			super(v);
		}
		
		Walk(double d, double simps){
			super(d, simps);
		}
		
		double timeTaken(){
			System.out.println("The speed in km per hour is : "+((speedInMetresPerSecond*5)/18));
			sikmphr = speedInMetresPerSecond*5/18;
			System.out.println("The distance in km is : "+(distance/1000));
			dikm = distance/1000;
			System.out.println(dikm/sikmphr);
			return dikm/sikmphr;  
		}
	}   

	abstract class TS {
		public static void main(String []args) throws Exception {
			
		File f = new File("ab.txt");
		FileReader fr = new FileReader(f);
		char[] c = new char[(int)f.length()];
		fr.read(c);
		fr.close();
		Thread thread1 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a') {
				System.out.println("This is a Transport Management System Project. " 
				+"It is made using an object oriented programming language named Java.");

			}
		}
	}
};
		thread1.start();
		Thread thread2 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='b') {
				System.out.println("Time taken by bus, train and flight to travel the distance has been calculated. "
				+"The time taken to walk the distance has also been calculated. ");
			}
		}
	}
};
		thread2.start();
		Thread thread3 = new Thread(){
		public void run(){
		for(int i=0;i<c.length;i++) {
			if(c[i]=='c') {
				System.out.println("The concepts used in this Transport Management System Project are : "
				+"Overloading, overriding, package, interface, inheritance, file-handling, multithreading.  ");
				//System.out.println();
			}
		}
	}
};
		thread3.start();
			
			Vehicle transport;
			Bus b1 = new Bus(9779798.345, 81.78, 67);
			transport = b1;
			System.out.println();
			System.out.println("  By BUS");
			System.out.println("Time taken by bus b1 (in hours) is : "+transport.timeTaken());
			System.out.println();
		
			Train t1 = new Train(9779798.345, 100.78, 24, 12);
			transport = t1;
			System.out.println("  By TRAIN");
			System.out.println("Time taken by train t1 (in hours) is : "+transport.timeTaken());
			System.out.println();
		
			Flight f1 = new Flight(9779798.345, 1000.78, 20, 60);
			transport = f1;
			System.out.println("  By FLIGHT");
			System.out.println("Time taken by flight f1 (in hours) is : "+transport.timeTaken());
			System.out.println();

			Walk w = new Walk(9779798.345, 1.78);
			transport = w;
			System.out.println("  By WALKING");
			System.out.println("Time taken to walk (in hours) is : "+transport.timeTaken());
			System.out.println();
		}
	}
	
	