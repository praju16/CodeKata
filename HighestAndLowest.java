// In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
// HighAndLow("1 2 3 4 5") // return "5 1"
// HighAndLow("1 2 -3 4 5") // return "5 -3"
// HighAndLow("1 9 3 4 -5") // return "9 -5"

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
  public static String HighAndLow(String numbers) {
    // Code here or
    String[] array = numbers.split(" ");
    List<Integer> nums = new ArrayList<>();
    
    for(String i : array){
      nums.add(Integer.parseInt(i));
    }
    
    return Collections.max(nums) + " " + Collections.min(nums);
  }
  
}