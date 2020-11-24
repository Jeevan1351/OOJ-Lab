import java.util.Scanner;
class InvalidAge extends Exception{
    int a;
    InvalidAge(int x)
    {
        a=x;
    }
   public String toString()
    {
        return "The age of Son entered "+a+" is incorrect";
    }
}
class father
{
 int a;
 father(int x)
 {
a=x;
 }
}
class son extends father
{
    int age;
    son(int f,int s)
	{
        super(f);
        age=s;
    }

    void compute() throws InvalidAge{
        if(age>=a)
            throw new InvalidAge(age);
        else
		{
            System.out.println("The ages entered are correct!");
            System.out.println("Father's age="+a+"\t"+"Son's  age="+age);
        }
    }

}

class error
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age of the Father");
        int f=s.nextInt();
        System.out.println("Enter the age of the Son");
        int so=s.nextInt();
        son ss=new son(f,so);
        try{
            ss.compute();
        }catch(InvalidAge e)
        {
            System.out.println(e);
        }
    }
}
