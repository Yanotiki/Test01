public class TestArrays {
    public static void main(String[] args) {

        String [] islands = new String[4];
        int [] index = new int[4];
        islands[0] = "Bermudy";
        islands[1] = "Fidgi";
        islands[2] = "Azorskie ostrova";
        islands[3] = "Kosumel";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;


        while (y < 4) {

            ref = index[y];
            {
                System.out.print("ostrova = ");
                System.out.println(islands[ref]);

                    y = y + 1;

            }


        }
    }
}
