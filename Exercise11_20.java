public class Exercise11_20
{
   public static void main( String[] args )
   {
      try
      {
         someMethod();
      }
      catch ( Exception exception )
      {
         System.err.println( "Exception caught in main" );
         exception.printStackTrace();
      }
   } // end main

   // calls someMethod2, catches the exception, then rethrows it
   public static void someMethod() throws Exception
   {
      try
      {
         someMethod2();
      }
      catch ( Exception exception )
      {
         System.err.println( "Exception caught in someMethod, now rethrowing it" );
         throw exception; // rethrow to the caller (main)
      }
   } // end method someMethod

   // this method always throws an exception
   public static void someMethod2() throws Exception
   {
      throw new Exception( "Exception thrown in someMethod2" );
   } // end method someMethod2
} // end class Exercise11_20
