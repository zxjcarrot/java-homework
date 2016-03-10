package exe9;

interface Inter
{   void  method();  }

class Test
{
	public static Inter function() {
		return new Inter( ) {
			
			@Override
			public void method() {
				System.out.println("This is inner class method.");
			}
		};
	}
}

class InnerClassTest
{
      public static  void main(String[]  args)
      {    
           Test.function().method();
      }
}
