interface Nose {  //код
    public int iMethod ();//код
}
abstract class Picasso implements Nose {
    public int iMethod() {
        return 7;
    }
}//код
class Clowns extends Picasso {}  //код
class Acts extends Picasso { //код
    public int iMethod() { //код
        return 5;
    }
}
public class Of76 extends Clowns {  //код
public static void main (String [] args) {
    Nose [] i = new Nose [3]; //код
i[0] = new Acts();
i[1] = new Clowns();
i[2] = new Of76();
for (int x = 0; x < 3; x++) {
    System.out.println (i[x].iMethod() + " " + i[x].getClass() );
        }
}
}





