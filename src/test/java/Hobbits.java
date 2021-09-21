public class Hobbits {
    String name;
}
class HobbitsTestDrive {
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        h[0] = new Hobbits();
        h[1] = new Hobbits();
        h[2] = new Hobbits();
        int z = -1;

        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Bilbo";
            if (z == 1) {
                h[z].name = "Frodo";
            }
            if (z == 2) {
                h[z].name = "Sam";
            }
            System.out.print(h[z].name + " - ");
            System.out.println("имя хорошего хоббита");
        }
    }
}
