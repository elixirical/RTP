public class Factorial {
    public static long get ( long value ) {
        if (value >= 2) {
            return (value*Factorial.get(value-1));
        } else if (value == 1 || value == 0) {
            return (1);
        } else {
            return 0;
        }
    }
}
