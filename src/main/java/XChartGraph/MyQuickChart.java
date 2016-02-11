package XChartGraph;

import com.xeiam.xchart.Chart;
import com.xeiam.xchart.QuickChart;
import com.xeiam.xchart.SwingWrapper;

/**
 * QuickChart
 */
public class MyQuickChart {

    public static void main(String[] args) throws Exception {

//        координаты графика
        double[] xData = new double[] { 0.0, 2.0, 5.0 };
        double[] yData = new double[] { 2.0, 1.6, 0.0 };

//         Create Chart
        Chart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);

//         Show it
        new SwingWrapper(chart).displayChart();

    }
}
