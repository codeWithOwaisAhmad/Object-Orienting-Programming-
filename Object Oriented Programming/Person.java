// public class Person {
//   private String firstName; // store the first name
//   private String lastName; // store the last name
//   private String middleName; // store the middle name

//   // Default constructor;
//   // Initialize firstName, lastName, and middleName to empty strings.
//   // Postcondition: firstName = ""; lastName = ""; middleName = "";
//   public Person() {
//       firstName = "";
//       lastName = "";
//       middleName = "";
//   }


//   public Person(String first, String last, String middle) {
//       setName(first, last, middle);
//   }
//   public String toString() {
//       return (firstName + " " + middleName + " " + lastName);
//   }

//   // Method to set firstName, lastName, and middleName according to
//   // the parameters
//   // Postcondition: firstName = first; lastName = last; middleName = middle;
//   public void setName(String first, String last, String middle) {
//       firstName = first;
//       lastName = last;
//       middleName = middle;
//   }

//   // Method to set only the last name
//   public void setLastName(String last) {
//       lastName = last;
//   }

//   // Method to set only the first name
//   public void setFirstName(String first) {
//       firstName = first;
//   }

//   // Method to set the middle name
//   public void setMiddleName(String middle) {
//       middleName = middle;
//   }

//   // Method to check whether a given last name is the same as the last name of this person
//   public boolean checkLastName(String last) {
//       return lastName.equals(last);
//   }

//   // Method to check whether a given first name is the same as the first name of this person
//   public boolean checkFirstName(String first) {
//       return firstName.equals(first);
//   }

//   // Method to check whether a given middle name is the same as the middle name of this person
//   public boolean checkMiddleName(String middle) {
//       return middleName.equals(middle);
//   }

//   // Method to check whether two objects contain the same first, middle, and last name
//   public boolean equals(Person other) {
//       return firstName.equals(other.getFirstName()) && middleName.equals(other.getMiddleName())
//               && lastName.equals(other.getLastName());
//   }

//   // Method to make a copy of the current Person object into another Person object
//   public void makeCopy(Person other) {
//       other.setFirstName(firstName);
//       other.setMiddleName(middleName);
//       other.setLastName(lastName);
//   }

//   // Method to get a copy of the current Person object
//   public Person getCopy() {
//       return new Person(firstName, lastName, middleName);
//   }

//   // Copy constructor
//   public Person(Person other) {
//       this(other.getFirstName(), other.getLastName(), other.getMiddleName());
//   }

//   // Method to return the firstName
//   // Postcondition: the value of firstName is returned
//   public String getFirstName() {
//       return firstName;
//   }

//   // Method to return the lastName
//   // Postcondition: the value of lastName is returned
//   public String getLastName() {
//       return lastName;
//   }

//   // Method to return the middleName
//   // Postcondition: the value of middleName is returned
//   public String getMiddleName() {
//       return middleName;
  
// }public class Main {
//   public static void main(String[] args) {
//       // Creating a Person object using the default constructor
//       Person person1 = new Person();
      
//       // Setting the full name using the setName method
//       person1.setName("John", "Doe", "Smith");
      
//       // Displaying the full name using toString method
//       System.out.println("Full Name: " + person1.toString());
      
//       // Setting the last name only
//       person1.setLastName("Johnson");
      
//       // Displaying the modified full name
//       System.out.println("Modified Last Name: " + person1.toString());
      
//       // Checking if a given last name matches the last name of the person
//       System.out.println("Last name matches: " + person1.checkLastName("Doe"));
      
//       // Creating another Person object with a copy constructor
//       Person person2 = new Person(person1);
      
//       // Displaying the full name of the second person
//       System.out.println("Copy Constructor: " + person2.toString());
      
//       // Making a copy of the first person into the second person
//       person1.makeCopy(person2);
      
//       // Displaying the full name of the second person after making a copy
//       System.out.println("Make Copy: " + person2.toString());
      
//       // Getting a copy of the first person
//       Person person3 = person1.getCopy();
      
//       // Displaying the full name of the third person
//       System.out.println("Get Copy: " + person3.toString());
      
//       // Checking if two objects contain the same first, middle, and last name
//       System.out.println("Objects are equal: " + person1.equals(person2));
//   }
// }
// }

public class Person {
  private String firstName; // store the first name
  private String lastName; // store the last name
  private String middleName; // store the middle name

  // Default constructor;
  // Initialize firstName, lastName, and middleName to empty strings.
  // Postcondition: firstName = ""; lastName = ""; middleName = "";
  public Person() {
      setName("", "", "");
  }

  // Constructor with parameters
  // Set firstName, lastName, and middleName according to the parameters.
  // Postcondition: firstName = first; lastName = last; middleName = middle;
  public Person(String first, String last, String middle) {
      setName(first, last, middle);
  }

  // Method to output the first name, middle name, and last name
  // in the form firstName middleName lastName
  public void printName() {
      System.out.println(firstName + " " + middleName + " " + lastName);
  }

  // Method to set firstName, lastName, and middleName according to
  // the parameters
  // Postcondition: firstName = first; lastName = last; middleName = middle;
  public void setName(String first, String last, String middle) {
      firstName = first;
      lastName = last;
      middleName = middle;
  }

  // Method to compare two names
  // Postcondition: Returns true if this name is equal to otherPerson's name; otherwise returns false
  public boolean equals(Person otherPerson) {
      return (firstName.equals(otherPerson.firstName) && lastName.equals(otherPerson.lastName)
              && middleName.equals(otherPerson.middleName));
  }

  // Method to copy a person's information
  // Postcondition: Copies the instance variables of otherPerson into the corresponding data members of this person.
  public void makeCopy(Person otherPerson) {
      firstName = otherPerson.firstName;
      lastName = otherPerson.lastName;
      middleName = otherPerson.middleName;
  }

  // Method to return a copy of a person's information
  // Postcondition: A copy of the object is created and a reference of the copy is returned
  public Person getCopy() {
      return new Person(firstName, lastName, middleName);
  }
}
