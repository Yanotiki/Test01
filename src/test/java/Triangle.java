public class Triangle {
    double area;
    int height;
    int lenght;
    public static void main(String[] args) {
        int x = 0;
        Triangle [] ta = new Triangle[4]; // код
        // код
        while (x < 4) { // код// код
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2; // код
            ta[x].lenght = x + 4; // код
            ta[x].setArea();// код
                System.out.print("треугольник "+x+", зона");
                System.out.println(" = " + ta[x].area); // код
                x = x + 1;// код
        }
        int y = x; // код
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", зона t5 = " + t5.area);
    }
        void setArea () {
            area = (height * lenght) / 2;
    }
}
