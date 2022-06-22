import java.util.LinkedList;
import java.util.List;

public class sort {
    public static int func(int number){


        char[] chars = String.valueOf(number).toCharArray();;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if(chars[i] < chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        number = Integer.parseInt(String.valueOf(chars));

        return number;
    }
}
