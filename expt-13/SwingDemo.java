import java.awt.*;
import javax.swing.*;

public class SwingDemo extends JFrame {
    Container frame;
    JTabbedPane tabPane;
    JPanel cityPanel, colorPanel, flavorPanel;
    JComboBox jcbFlavors;
    JButton jbLatur, jbMumbai, jbPune, jbDelhi;
    JCheckBox cbRed, cbGreen, cbBlue;

    SwingDemo(String title) {
        super(title);
        frame = this.getContentPane();
        frame.setFont(new Font("Roboto", Font.BOLD, 22));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tabPane = new JTabbedPane();

        cityPanel = new JPanel();
        jbLatur = new JButton("Latur");
        cityPanel.add(jbLatur);
        jbMumbai = new JButton("Mumbai");
        cityPanel.add(jbMumbai);
        jbPune = new JButton("Pune");
        cityPanel.add(jbPune);
        jbDelhi = new JButton("Delhi");
        cityPanel.add(jbDelhi);
        tabPane.addTab("Cities", cityPanel);

        colorPanel = new JPanel();
        cbRed = new JCheckBox("Red");
        colorPanel.add(cbRed);
        cbGreen = new JCheckBox("Green");
        colorPanel.add(cbGreen);
        cbBlue = new JCheckBox("Blue");
        colorPanel.add(cbBlue);
        tabPane.addTab("Colors", colorPanel);

        flavorPanel = new JPanel();
        jcbFlavors = new JComboBox();
        jcbFlavors.addItem("Vanilla");
        jcbFlavors.addItem("Strawberry");
        jcbFlavors.addItem("Chocolate");
        jcbFlavors.addItem("Butterscotch");
        flavorPanel.add(jcbFlavors);
        tabPane.addTab("Flavors", flavorPanel);

        frame.add(tabPane);
    }

    public static void main(String[] args) {
        JFrame jfr = new SwingDemo("Student Activity 3");
        jfr.setSize(800, 600);
        jfr.setVisible(true);
    }
}
