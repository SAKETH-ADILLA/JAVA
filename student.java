class Person {  
    String firstname;
    String lastname;
    int regdid;
    int score;
    int age; 


    public Person(String firstname, String lastname, int regdid, int score, int age) { 	    // Constructor with parameters
        this.firstname = firstname;
        this.lastname = lastname;
        this.regdid = regdid;
        this.score = score;
        this.age = age;
    }

    
    void displayinfo() {	// Method to display information
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Regdid: " + regdid);
        System.out.println("Score: " + score);
        System.out.println("Age: " + age);
    }

    
    void havebirthday() {		// Method to increase age
        age++;
        System.out.println("Happy Birthday " + firstname + " " + lastname + "! You are now " + age + " years old.");
    }
    
    void setfirstname() {
	System.out.println("First Name: "+ firstname);
    }

    void setlastname() {
	System.out.println("Last Name:" + lastname);
    }


}
public class student {  
    public static void main(String[] args) {
        
        Person person1 = new Person("Sai", "Raju", 1, 98, 17);		// Create a new Person object with the constructor
        
        
        person1.displayinfo();		// Display information
        
        
        person1.havebirthday();  	// Celebrate birthday
        
        
        person1.displayinfo();		// Display information again


	person1.setlastname();


	person1.setfirstname();
    }
}

