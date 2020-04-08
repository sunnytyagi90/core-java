 class A 
 {
  public A()
  {
  System.out.println("in A");
  }
 }
  class B extends A
  {
    B()
  {
     }
  }
  class C extends B
  {
  public C()
  {
  System.out.println("in c");
  }
  public static void main(String arg[])
  {
  A x=new A();
  B y=new B();
  C z=new C();
  }
  }
  