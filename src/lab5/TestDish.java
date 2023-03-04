package lab5;

public class TestDish {
    public static void main(String[] args) {
        Cup cup1 = new Cup();
        cup1.setType("гранёный стакан");
        cup1.setSizeFunction("0,5 литра", "для апельсинового сока");

        Plate plate1 = new Plate();
        plate1.setType("фарфоровая тарелка");
        plate1.setSizeFunction("средняя", "для пасты");

        System.out.println(cup1);
        System.out.println(plate1);
    }
}
