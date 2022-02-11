import java.util.*;
class Complex
{
  double real,img;
  Complex(double r,double i)
  {
    this.real=r;
    this.img=i;
  }
  void sum(Complex c1,Complex c2)
  {
    this.real=c1.real+c2.real;
    this.img=c1.img+c2.img;
  }
}
class ComplexAddition
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	double rp,ip;
	System.out.println("Enter ral and imaginary parts of first complex number: ");
	rp=sc.nextDouble();
	ip=sc.nextDouble();
	Complex c1=new Complex(rp,ip);
	System.out.println("Enter real and imaginary parts of second complex number: ");
	rp=sc.nextDouble();
	ip=sc.nextDouble();
	Complex c2=new Complex(rp,ip);
	System.out.println("Resultant complex addition is: ");
	Complex c3=new Complex(rp,ip);
	c3.sum(c1,c2); 
	System.out.println(c3.real+" + "+c3.img+"i");
  }
}
