package XChartGraph;

import com.xeiam.xchart.*;
import com.xeiam.xchart.internal.chartpart.ChartPainter;
import com.xeiam.xchart.internal.markers.Marker;

import java.util.ArrayList;
import java.util.List;

/**
 * Matrix
 */
public class ChartMatrix {

    public static void main(String[] args) {

        List<Chart> chartMatrix = new ArrayList<Chart>();

//        Количество точек
        int quantity = 1000;

//        Массив пробежки по Х
        double[] xArray = new double[quantity];

        for (int i = 0; i < xArray.length; i++) {
            xArray[i] = (double) i;
        }

        for (int i = 0; i < 4; i++) {

            Chart chart = new Chart(500, 350);
            chart.setXAxisTitle("x title");
            chart.setYAxisTitle("y title");

            Series series = chart.addSeries("" + i, xArray, getRandomWalk(quantity));
            series.setMarker(SeriesMarker.TRIANGLE_DOWN);
            chartMatrix.add(chart);
        }

        new SwingWrapper(chartMatrix).displayChartMatrix("Chart Matrix");

    }

    private static double[] getRandomWalk(int numPoints) {

        double[] y = new double[numPoints];
        y[0] = 0;
        for (int i = 1; i < y.length; i++) {
            y[i] = y[i - 1] + Math.random() - .5;
        }
        return y;
    }

}
