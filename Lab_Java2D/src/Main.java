//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating instances object of Japan and Palestine
        Country japan = new Japan("Japan", 126800000);
        Country palestine = new Palestine("Palestine", 4976684);

        //we can do it like this as well :
//        Japan japan = new Japan("Japan", 126800000);
//        Palestine palestine = new Palestine("Palestine", 4976684);

        // calling the drawing flags method
        japan.draw();
        palestine.draw();
    }
}