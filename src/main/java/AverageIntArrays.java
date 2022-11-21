public class AverageIntArrays {
    private int sum;

// Complete these methods

    public int count(int[] aa) {

        return aa.length;
    }


    public int sum(int[] aa) {
        int sum = 0;
        for (int i =0;  i < aa.length; i++) {
            sum += aa[i];
        }
        return sum;
    }

    public int average(int[] aa) {
        if (this.count(aa) != 0) {
        return this.sum(aa)/this.count(aa);
        }
        return 0;
    }

}
