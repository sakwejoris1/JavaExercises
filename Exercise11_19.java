// SomeClass throws an Exception right in its constructor
class SomeClass
{
   public SomeClass() throws Exception
   {
      throw new Exception( "Failure in SomeClass constructor" );
   }
}

public class Exercise11_19
{
   public static void main( String[] args )
   {
      try
      {
         SomeClass someObject = new SomeClass(); // constructor throws here
      }
      catch ( Exception exception )
      {
         System.err.println( "Caught: " + exception.getMessage() );
      }
   } // end main
} // end class Exercise11_19
