public class exceptionHandlingA
{
    public void main(String[] args)
    {
        try {
            System.out.println("this is exception A");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        exceptionHandlingB exceptionB = new exceptionHandlingB();

        exceptionB.getHandlerA();
    }
}
