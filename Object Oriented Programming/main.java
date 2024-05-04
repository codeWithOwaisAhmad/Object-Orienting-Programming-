class A{
  private int i,j;
  void showij(){
    System.out.println("i: " + i + " j: " + j);
  }
}
class B extends A{
  private  int k;
  void showk(){
    System.out.println("k: " + k);
  }
  void sum(){
    System.out.println(i + j + k);
  }
}
public class main {
public static void main(String[] args) {
  A superOb = new A();
  superOb.i = 10;
  superOb.j = 20;
  superOb.showij();
  B subOb = new B();
  subOb.i = 5;
  subOb.j = 7;
  subOb.k = 8;
  subOb.showij();
  subOb.showk();
  subOb.sum();
   }
}