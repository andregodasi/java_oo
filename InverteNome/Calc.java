public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double intA, intB;
        intA = Integer.parseInt(args[0]);
        intB = Integer.parseInt(args[1]);
        switch (args[2]) {
            case "+":
                System.out.println(intA + intB);
                break;
            case "-":
                System.out.println(intA - intB);
                break;
            case "*":
                System.out.println(intA * intB);
                break;
            case "/":
                System.out.println(intA / intB);
                break;
            default:
        }
    }

}
