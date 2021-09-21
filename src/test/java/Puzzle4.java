public class Puzzle4 {
    public static void main (String [] args){
        Puzzle4b [] obs = new Puzzle4b[7]; //КОД
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 7) {
            obs[x] = new Puzzle4b(); //код
            obs[x].ivar = y;  // ; //код
            y = y * 10;
            x = x + 1; //код
        }
        x = 7;
        while (x > 0) {
            x = x - 1; //код
                result = result + obs[x].doStuff(x); //код
        }
        System.out.println("Результат " + result);
    }
}
class Puzzle4b {
    int ivar;
      public int doStuff (int factor) {  //код
              if (ivar > 100) {
                  return ivar * factor;  //код
              }
              else {
                  return ivar * (5 - factor); //код
              }
          }
}
