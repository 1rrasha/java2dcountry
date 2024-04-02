public class Japan extends Country {
    public Japan (String name, int citizens) {
        super (name, citizens);
    }
    @Override
    public void draw() {
        System.out.println( "Drawing the Japanese Flag");
    }
}