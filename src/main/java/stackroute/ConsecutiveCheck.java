package stackroute;

public class ConsecutiveCheck {

    public  String checkConsecutive(String str)
    {
     int flag=0;
        String [] arr=str.split(",");
        for(int i=0;i<arr.length-1;i++)
        {
          if(Integer.parseInt(arr[i])-Integer.parseInt(arr[i+1])==1)
              flag=1;
          else
              return  "Not Consecutive";
        }
        if (flag==1)
        return "Are consecutive numbers";
        else
            return "Not Consecutive";

    }

}
