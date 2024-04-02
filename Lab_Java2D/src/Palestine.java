public class Palestine extends Country {
    public Palestine (String name, int citizens) {
        super (name, citizens);
    }

    @Override
    public void draw() {
        System.out.println( "Drawing the Palestinian Flag");
    }
}