package XChartGraph;

import com.xeiam.xchart.Chart;
import com.xeiam.xchart.Histogram;
import com.xeiam.xchart.SwingWrapper;
import com.xeiam.xchart.internal.style.Theme;
import com.xeiam.xchart.internal.style.XChartTheme;

/**
 * Test chart
 */
public class ChartTest {

    public static void main(String[] args) {

        Chart ch = new Chart(100, 100);

        new SwingWrapper(ch).displayChart();

    }



}
