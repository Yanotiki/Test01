class Rowboat extends Boat {   //код 1
    public void rowTheBoat () {//код 1
    System.out.print("Давай, Наташа!");
    }
} //код
class Boat { //код 1
    private int length; //код 1
    public void setLength (int len) { //код 1
        length = len;
        }
        public int getLength() {
            return length ; //код 1
        }
        public void move () { //код 1
          System.out.print ("Дрейф "); //код 1
        }
}
public class TestBoats {
    public static void main (String [] args) {  //код 1
        Boat b1 = new Boat();  //код 1
        SailBoat b2 = new SailBoat ();  //код 1
        Rowboat b3 = new Rowboat();  //код 1
        b2.setLength(32);
        b1.move();  //код 1
        b3.move();  //код 1
        b2.move(); //код 1
    }
}//код
class SailBoat extends Boat {  //код 1
    public void move ()    //код 1
    {
        System.out.print("Поднять паруса!");     //код 1
    }
}