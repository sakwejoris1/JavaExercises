import java.io.IOException;

// ExceptionB is a subclass of ExceptionA
// ExceptionA is a subclass of Exception
class ExceptionA extends Exception
{
   public ExceptionA( String message )
   {
      super( message );
   }
}

class ExceptionB extends ExceptionA
{
   public ExceptionB( String message )
   {
      super( message );
   }
}

public class Exercise11_17
{
   public static void main( String[] args )
   {
      // throw ExceptionA and catch it as Exception
      try
      {
         throw new ExceptionA( "Exception of type ExceptionA" );
      }
      catch ( Exception exception )
      {
         System.err.println( "Caught: " + exception.getMessage() );
      }

      // throw ExceptionB and catch it as Exception
      try
      {
         throw new ExceptionB( "Exception of type ExceptionB" );
      }
      catch ( Exception exception )
      {
         System.err.println( "Caught: " + exception.getMessage() );
      }

      // throw NullPointerException and catch it as Exception
      try
      {
         throw new NullPointerException( "Exception of type NullPointerException" );
      }
      catch ( Exception exception )
      {
         System.err.println( "Caught: " + exception.getMessage() );
      }

      // throw IOException and catch it as Exception
      try
      {
         throw new IOException( "Exception of type IOException" );
      }
      catch ( Exception exception )
      {
         System.err.println( "Caught: " + exception.getMessage() );
      }
   } // end main
} // end class Exercise11_17
