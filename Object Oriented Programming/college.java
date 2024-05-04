class Pen {
  String color;
  String type;
  public void write(){
    System.out.println("Writing something");
  }
  public void printColor(){
    System.out.println(this.color);
  }
}

 class Student{
  String name;
  int age;

  public void printName(){
    System.out.println(this.name);
    System.out.println(this.age);
  }
  //Non Parameterized Constructors
  // Student(){
  //   System.out.println("Constructor Called");
  // }
  //Parameterized Constructor
  // Student(String name, int rno,int age){
  //  this.name = name;
  //  this.rno = rno;
  //  this.age = age;
  //  System.out.println("This is a parameterized constructor");
  // }
  Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
  }
  Student(){

  }
}
public class college {
   public static void main(String[] args) {
   Student s1 = new Student();
   s1.name = "Owais";
   s1.age = 18;
   Student s2 = new Student(s1);
   s2.printName();

  

    
   } 
   
}
