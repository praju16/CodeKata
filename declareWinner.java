public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    // Your code goes here. Have fun!
     int h1 = fighter1.health;
    int d1 = fighter1.damagePerAttack;
    
    int h2 = fighter2.health;
    int d2 = fighter2.damagePerAttack;
    
    while(h1 > 0 && h2 > 0) {
      h1 = h1 -d2;
      h2 = h2 - d1;
    }
    
    if(h1 <= 0 && h2 <= 0) {
      return firstAttacker;
    }
    else if(h1 <= 0) {
      return fighter2.name;
    }
    else {
     return fighter1.name;
    }
    
  }
}