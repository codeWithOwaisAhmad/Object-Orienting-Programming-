/**
 * end
 */
public class rectangle{
  int length;
  int width;
  public  int area(){
   return length*width;
  }
 public int parameter(){
   return 2 * (length + width);
  }
}
// public class dummy {
//   int x;
//   String y;
//   dummy(int X,String Y){
//     this.x = X;
//     this.y = Y;
//     System.out.println("Parameterized");
//   }
//   dummy(){
   
//     this(33,"user1");
//     System.out.println("default");
   
//   }
  public static void main(String[] args) {
    // dummy d = new dummy();
    // System.out.println(d.x + d.y);
  
  rectangle rng = new rectangle();
  rectangle.length = 4;
  rectangle.width = 5;
  System.out.println(rng.area());
  System.out.println(rng.parameter());
  } 

// class Person {
// int age;
// String name;
// Person(int a,String n){
//   age = a;
//   name = n;
// }  
// void celebrateBirthday(){
//   age++;
//   System.out.println(this.name + " is celebrating his " + age + " the birthday");
//   System.out.println("Happy Birthday " + name);

// }
// void celebrateTogether(Person other){
//   System.out.println(this.name + " and " + other.name + " are celebrating");

// this.celebrateBirthday();
// other.celebrateBirthday();
// }
// public static void main(String[] args) {
//   Person p1 = new Person(29, "Rawah");
//   Person p2 = new Person(25, "Alice");
//   p1.celebrateTogether(p2);
//   p2.celebrateTogether(p2);
// }
// }