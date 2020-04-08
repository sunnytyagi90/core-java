class A
{
   public void Display()
   {
      System.out.println("no arg");
	  }
	  public void Display(int x,int y)
	  {
	   System.out.println("two arg");
	   }
	   public void Display(int x,float y,int z)
	   {
	     System.out.println("three arg");
	   }
	 public void Display(float x,int y)
	 {
		 System.out.println("two arg diff-2 data type");
	   }
}
    class MethodOverloding
	{
		public static void main(String arg[])
		{
			A  obj=new A();
		    obj.Display();
		    obj.Display(4,5);
		    obj.Display(1,3,3);
			obj.Display(2f,8);
		}
	}
