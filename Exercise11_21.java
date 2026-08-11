public class Exercise11_21
{
   public static void main( String[] args )
   {
      // outer try block -- this is the "outer scope"
      try
      {
         method1();
      }
      catch ( Exception exception )
      {
         System.err.println( "Exception caught in main (outer scope)" );
         exception.printStackTrace();
      }
   } // end main

   // method1 has its own try block, but it only catches
   // ArithmeticException -- it does NOT catch every possible error
   public static void method1() throws Exception
   {
      try
      {
         throwException(); // this throws an Exception, not an ArithmeticException
      }
      catch ( ArithmeticException arithmeticException )
      {
         // this catch block will NOT catch the Exception thrown below,
         // so it slips through to main's catch block instead
         System.err.println( "Caught in method1 (this will not print)" );
      }
   } // end method method1

   public static void throwException() throws Exception
   {
      System.out.println( "Method throwException" );

      // throw an Exception; method1's catch block cannot catch this,
      // so it propagates up to main's catch block
      throw new Exception( "Exception thrown in method throwException" );
   } // end method throwException
} // end class Exercise11_21
