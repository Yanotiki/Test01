public class MultiFors {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            int y = 4;
            while (y > 2) {
                System.out.println(x+ " " + y);
                y--;
            }
           if (x == 1) {
                x++;
            }
            x++;
        }
        }
}
