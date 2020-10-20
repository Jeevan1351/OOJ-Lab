import java.util.Scanner;
class circleDemo{
  int r;
  double pi=3.14;
  void accept(){
    Scanner xx=new Scanner(System.in);
    System.out.println("Enter the radius of circle:");
    r=xx.nextInt();
    }
    void areacalc(){
    System.out.println("Area of circle is:"+(pi*r*r));
    }
    void peri(){
    System.out.println("Perimeter of circle is:"+(2*pi*r));
    }
    void display(){
      System.out.println("Circle of radius  :"+ r +"has area :"+ (pi*r*r) +  "with perimeter  :"+  (2*pi*r));
    }
  public static void main(String ss[]){
    Scanner xx=new Scanner(System.in);
    circleDemo cle=new circleDemo();
    cle.accept();
    cle.areacalc();
    cle.peri();
    System.out.println("Details of circle are:");
    cle.display();
    
  }
}
