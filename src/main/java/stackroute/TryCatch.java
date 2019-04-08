package stackroute;

public class TryCatch {


    public  static  String main(String input)
    {
        try
        {
            throw  new Exception(input);
        }
        catch (Exception e)
        {
            return  input;
        }
    }
}
