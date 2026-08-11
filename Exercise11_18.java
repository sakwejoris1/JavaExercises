// This program shows the CORRECT order of catch blocks:
// the subclass exception (ExceptionB) must be caught BEFORE
// the superclass exception (ExceptionA). This version compiles fine.

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

public class Exercise11_18
{
   public static void main( String[] args )
   {
      try
      {
         throw new ExceptionB( "Exception of type ExceptionB" );
      }
      // correct order: subclass first, then superclass
      catch ( ExceptionB exceptionB )
      {
         System.err.println( "Caught ExceptionB: " + exceptionB.getMessage() );
      }
      catch ( ExceptionA exceptionA )
      {
         System.err.println( "Caught ExceptionA: " + exceptionA.getMessage() );
      }

      /*
       * If we reversed the order, like this:
       *
       * try
       * {
       *    throw new ExceptionB( "Exception of type ExceptionB" );
       * }
       * catch ( ExceptionA exceptionA )        // superclass caught FIRST
       * {
       *    System.err.println( "Caught ExceptionA: " + exceptionA.getMessage() );
       * }
       * catch ( ExceptionB exceptionB )        // subclass caught SECOND -- unreachable!
       * {
       *    System.err.println( "Caught ExceptionB: " + exceptionB.getMessage() );
       * }
       *
       * ...the compiler generates an error, something like:
       * "error: exception ExceptionB has already been caught"
       * because ExceptionB IS-A ExceptionA, so the first catch block
       * would already handle it, making the second catch block unreachable.
       */
   } // end main
} // end class Exercise11_18
