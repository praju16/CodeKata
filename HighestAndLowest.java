// In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
// HighAndLow("1 2 3 4 5") // return "5 1"
// HighAndLow("1 2 -3 4 5") // return "5 -3"
// HighAndLow("1 9 3 4 -5") // return "9 -5"

public class Kata {
  public static String HighAndLow(String numbers) {
    // Code here or
    int min=32000,max=-32000,val;
    String[] elements = numbers.split(" ");
    String maximum = elements[0], minimum=elements[0];
    
    for(String num: elements)
    {
      val = Integer.parseInt(num);
      if(val < min) 
      {
         min = val;
         minimum = num;
      }
      if(val > max)
      {
        max = val;
        maximum = num;
      }
      
    }
    
    return maximum + " " + minimum;
  }
  
}