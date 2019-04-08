package stackroute;

public class StudentGrade {

    public  String grade(int grades[])
    {
        int flag=0;
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]>0 && grades[i]<100)
            {
                flag=1;
            }
            else
                return "Not in the Range";
        }
        if(flag==1)
        return "It is in the Range between 0 to 100";
        else
            return "Not in the Range";
    }
}
