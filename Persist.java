// Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.


// persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
//                       // and 4 has only one digit

// persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
//                        // 1*2*6 = 12, and finally 1*2 = 2

// persistence(4) == 0 // because 4 is already a one-digit number

//  comment  
class Persist {
  public static int persistence(long n) {
    // your code
    int count=0;
    
    while(n/10 > 0)
    {
       long num = n;
       long sum = 1;
       while(num > 0)
       {
         sum = sum *(num%10);
         num = num/10;
       }
       n = sum;
       count++;
    }
    return count;
  }
}