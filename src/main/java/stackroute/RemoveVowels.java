package stackroute;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels {
    public String[] vowelsremove(String str[])
    {


        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);
  for (int j=0;j<str.length;j++) {
      StringBuffer sb = new StringBuffer(str[j]);

      for (int i = 1; i < sb.length(); i++) {

          if (al.contains(sb.charAt(i))) {
              sb.replace(i, i + 1, "");
              i--;
          }
      }
      str[j] = sb.toString();
  }

        return  str;
    }
}
