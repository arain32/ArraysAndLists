public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {

        return (int) aa.length;
    }

    public int sum(double[] aa) {
        int sum = 0;
        for (int i = 0; i < aa.length; i++) {
            sum += aa[i];
        }
        return (int) sum;
    }

    public int average(double[] aa) {
        if (this.count(aa) != 0) {
            return (int) this.sum(aa) / this.count(aa);
        }
        return 0;
    }

}
