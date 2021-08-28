import java.util.Vector;
import java.util.Collections;
public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
        String str_numbers=Integer.toString(num);
        Vector<Integer> numbers=new Vector<Integer>();
        for (int i=0;i<str_numbers.length();i++)
        {
            String number="";
            number+=str_numbers.charAt(i);
            numbers.add(Integer.parseInt(number));
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);
        str_numbers="";
        for(int i=0;i<numbers.size();i++)
        {
            str_numbers+=Integer.toString(numbers.get(i));
        }
        return Integer.parseInt(str_numbers);
  }
}
