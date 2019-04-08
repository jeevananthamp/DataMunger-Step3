package stackroute;

public class ExceptionCaught {

    public   static  String NegativeIndexSize(int indexsize)
    {
        try
        {
            int a[]=new  int[indexsize];
        }
        catch (Exception e)
        {
            return  e.toString();
        }
        return null;
    }
    public   static  String IndexOutBoundException(int indexsize)
    {
        try
        {
          int [] a=new  int[indexsize];
          int n=a[8];
        }
        catch (Exception e)
        {
            return  e.toString();
        }
        return null;
    }
    public   static  String NullPointerException(int arr[])
    {
        try
        {

            int n=arr[8];
        }
        catch (Exception e)
        {
            return  e.toString();
        }
        return null;
    }
}
