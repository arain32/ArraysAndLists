import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {
        return Double.valueOf(aa.size());
    }
    public Double sum(ArrayList<Double> aa) {
         Double sum = 0.0;
        for (int i = 0; i < aa.size(); i++) {
            sum += aa.get(i);
        }
        return sum;
    }
    public Double average(ArrayList<Double> aa) {
        if (this.count(aa) != 0) {
            return (Double) this.sum(aa) / (Double) this.count(aa);
        }
        return 0.0;
    }

}
