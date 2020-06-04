import java.util.Scanner;//import required packages

class Faculty
{
  public void salary(int salary)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+salary);
  }
}
class CSE 
{
  public void salary(int salary)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(salary+3000));
  }
}
class IT
{
  public void salary(int salary)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(salary+5000));
  }
}
class ECE
{
  public void salary(int salary)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(salary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int sal=in.nextInt();
    if(sal>0)
    {
      Faculty obj=new Faculty();
      obj.salary(sal);
      CSE obj1=new CSE();
      obj1.salary(sal);
      IT obj2=new IT();
      obj2.salary(sal);
      ECE obj3=new ECE();
    obj3.salary(sal);
    }
    else
    {
      System.out.println("null");
    }
    //implement your required concept here
  }
}