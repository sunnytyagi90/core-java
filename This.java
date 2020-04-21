 class P
 {
    String s="parent class";
 }
 class C extends  P
 {

	 String s="child class";
	 public void m1()
	 {
	  System.out.println(s);
	  System.out.println(this.s);
	 System.out.println(super.s);
 }
 }
  class This
  {
     public static void main(String arg[])
	 {
		 C c=new C();
		 c.m1();
	 }
  }

