public class GTC {
    private int val1;
    private int val2;

    public GTC(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public void setValues(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public int getValues() {
        /*

        val1 = 20,
        val2 = 8,
        val3 = 20/8,

         */
        while (val2 != 0) {
            int temp = val1;
            val1 = val2;
            val2 = temp % val2;

        }

        return val1;

    }
}