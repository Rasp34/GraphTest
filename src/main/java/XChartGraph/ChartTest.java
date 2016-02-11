package XChartGraph;

import com.xeiam.xchart.*;
import com.xeiam.xchart.internal.style.Theme;
import com.xeiam.xchart.internal.style.XChartTheme;

/**
 * Test chart
 */
public class ChartTest {

    public static void main(String[] args) {

        ChartBuilder chartBuilder = new ChartBuilder();
        Chart ch = new Chart(600, 400);
        ch.setChartTitle("MyTestChart");
        ch.setXAxisTitle("x title");
        ch.setYAxisTitle("y title");

        double[] xData = new double[] { 0.0, 2.0, 5.0, 7.0 };
        double[] yData = new double[] { 2.0, 1.6, 0.0, 2.0 };

        Series series = ch.addSeries("Series", xData, yData);
        series.setMarker(SeriesMarker.NONE);

        new SwingWrapper(ch).displayChart();

    }





}
