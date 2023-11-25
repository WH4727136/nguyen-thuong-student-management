
package BLL;

import DAL.LopHocBean;
import GUI.ThongKeJFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author Thái Dương
 */
public class QuanLyThongKe {
    private ThongKeService thongKeService = null;
    
    public QuanLyThongKe(){
        thongKeService = new ThongKeServiceImpl();
    }
    
    public void setDateChart1(JPanel jpnItem){
        List<LopHocBean> listItem = thongKeService.getListBangDiem();
        if(listItem != null){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(LopHocBean item :listItem){
            dataset.addValue(item.getDiemtrungbinh(), "Điểm", item.getLop());
        }
            JFreeChart chart = ChartFactory.createBarChart("BẢNG ĐIỂM TRUNG BÌNH THEO LỚP",
                    "Lớp", "Điểm trung bình", dataset);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(),300));
            
            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
            
        }
    }
}
