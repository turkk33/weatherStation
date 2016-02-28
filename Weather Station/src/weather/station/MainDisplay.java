package weather.station;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.*;
import java.awt.*;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1640636
 */
public class MainDisplay extends javax.swing.JFrame {    
    private String chartTitle = "";
    private String xLabel = "";
    private String yLabel = "";
    private XYDataset dataSet = null;
    private int tabFlag = 1;
    private int radioFlag = 0;

    /**
     * Creates new form MainDisplay
     */
    public MainDisplay() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dailyTab = new javax.swing.JPanel();
        weeklyTab = new javax.swing.JPanel();
        monthlyTab = new javax.swing.JPanel();
        yearlyTab = new javax.swing.JPanel();
        temperatureRadioButton = new javax.swing.JRadioButton();
        windsRadioButton = new javax.swing.JRadioButton();
        barometricRadioButton = new javax.swing.JRadioButton();
        heatUVindex = new javax.swing.JRadioButton();
        dataSelector = new javax.swing.JSlider();
        maindisplayMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        chooseFilesItem = new javax.swing.JMenuItem();
        specifyDirectoryItem = new javax.swing.JMenuItem();
        quitItem = new javax.swing.JMenuItem();
        statsMenu = new javax.swing.JMenu();
        averageTempItem = new javax.swing.JMenuItem();
        averageWindItem = new javax.swing.JMenuItem();
        averagePrecipItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        dailyTab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                dailyTabComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                dailyTabComponentShown(evt);
            }
        });

        javax.swing.GroupLayout dailyTabLayout = new javax.swing.GroupLayout(dailyTab);
        dailyTab.setLayout(dailyTabLayout);
        dailyTabLayout.setHorizontalGroup(
            dailyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        dailyTabLayout.setVerticalGroup(
            dailyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Daily", dailyTab);

        weeklyTab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                weeklyTabComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                weeklyTabComponentShown(evt);
            }
        });

        javax.swing.GroupLayout weeklyTabLayout = new javax.swing.GroupLayout(weeklyTab);
        weeklyTab.setLayout(weeklyTabLayout);
        weeklyTabLayout.setHorizontalGroup(
            weeklyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        weeklyTabLayout.setVerticalGroup(
            weeklyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Weekly", weeklyTab);

        monthlyTab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                monthlyTabComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                monthlyTabComponentShown(evt);
            }
        });

        javax.swing.GroupLayout monthlyTabLayout = new javax.swing.GroupLayout(monthlyTab);
        monthlyTab.setLayout(monthlyTabLayout);
        monthlyTabLayout.setHorizontalGroup(
            monthlyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        monthlyTabLayout.setVerticalGroup(
            monthlyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Monthly", monthlyTab);

        yearlyTab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                yearlyTabComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                yearlyTabComponentShown(evt);
            }
        });

        javax.swing.GroupLayout yearlyTabLayout = new javax.swing.GroupLayout(yearlyTab);
        yearlyTab.setLayout(yearlyTabLayout);
        yearlyTabLayout.setHorizontalGroup(
            yearlyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        yearlyTabLayout.setVerticalGroup(
            yearlyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Yearly", yearlyTab);

        radioButtonGroup.add(temperatureRadioButton);
        temperatureRadioButton.setText("Temperature");
        temperatureRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temperatureRadioButtonMouseClicked(evt);
            }
        });

        radioButtonGroup.add(windsRadioButton);
        windsRadioButton.setText("Winds");
        windsRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                windsRadioButtonMouseClicked(evt);
            }
        });

        radioButtonGroup.add(barometricRadioButton);
        barometricRadioButton.setText("Barometrics");
        barometricRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barometricRadioButtonMouseClicked(evt);
            }
        });

        radioButtonGroup.add(heatUVindex);
        heatUVindex.setText("Heat/UV index");
        heatUVindex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heatUVindexMouseClicked(evt);
            }
        });

        fileMenu.setText("File");

        chooseFilesItem.setText("Choose .xml file(s)");
        chooseFilesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFilesItemActionPerformed(evt);
            }
        });
        fileMenu.add(chooseFilesItem);

        specifyDirectoryItem.setText("Specify directory...");
        specifyDirectoryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specifyDirectoryItemActionPerformed(evt);
            }
        });
        fileMenu.add(specifyDirectoryItem);

        quitItem.setText("Quit");
        quitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitItem);

        maindisplayMenuBar.add(fileMenu);

        statsMenu.setText("Statistics");

        averageTempItem.setText("Temperature");
        averageTempItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageTempItemActionPerformed(evt);
            }
        });
        statsMenu.add(averageTempItem);

        averageWindItem.setText("Wind");
        averageWindItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageWindItemActionPerformed(evt);
            }
        });
        statsMenu.add(averageWindItem);

        averagePrecipItem.setText("Precipitation");
        averagePrecipItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averagePrecipItemActionPerformed(evt);
            }
        });
        statsMenu.add(averagePrecipItem);

        maindisplayMenuBar.add(statsMenu);

        setJMenuBar(maindisplayMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heatUVindex)
                    .addComponent(barometricRadioButton)
                    .addComponent(windsRadioButton)
                    .addComponent(temperatureRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataSelector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(dataSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(temperatureRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(windsRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(barometricRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(heatUVindex))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitItemActionPerformed

    private void chooseFilesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFilesItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseFilesItemActionPerformed

    private void specifyDirectoryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specifyDirectoryItemActionPerformed
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.

        //System.out.println("Specify directory was clicked");
        SwingUtilities.invokeLater(new Runnable() {
            DirectoryChooser dir = new DirectoryChooser();

            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                dir.createAndShowGUI();
            }
        });
    }//GEN-LAST:event_specifyDirectoryItemActionPerformed

    private void dailyTabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dailyTabComponentShown
        // TODO add your handling code here:
        tabFlag = 1;
        setChartTitle(radioFlag);
        generateGraph(dailyTab);
    }//GEN-LAST:event_dailyTabComponentShown

    private void dailyTabComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dailyTabComponentResized
        // TODO add your handling code here:
        generateGraph(dailyTab);
    }//GEN-LAST:event_dailyTabComponentResized

    private void weeklyTabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_weeklyTabComponentShown
        // TODO add your handling code here:
        tabFlag = 2;
        setChartTitle(radioFlag);
        generateGraph(weeklyTab);
    }//GEN-LAST:event_weeklyTabComponentShown

    private void weeklyTabComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_weeklyTabComponentResized
        // TODO add your handling code here:
        generateGraph(weeklyTab);
    }//GEN-LAST:event_weeklyTabComponentResized

    private void monthlyTabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_monthlyTabComponentShown
        // TODO add your handling code here:
        tabFlag = 3;
        setChartTitle(radioFlag);
        generateGraph(monthlyTab);
    }//GEN-LAST:event_monthlyTabComponentShown

    private void monthlyTabComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_monthlyTabComponentResized
        // TODO add your handling code here:
        generateGraph(monthlyTab);
    }//GEN-LAST:event_monthlyTabComponentResized

    private void yearlyTabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_yearlyTabComponentShown
        // TODO add your handling code here:
        tabFlag = 4;
        setChartTitle(radioFlag);
        generateGraph(yearlyTab);
    }//GEN-LAST:event_yearlyTabComponentShown

    private void yearlyTabComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_yearlyTabComponentResized
        // TODO add your handling code here:
        generateGraph(yearlyTab);
    }//GEN-LAST:event_yearlyTabComponentResized

    private void temperatureRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperatureRadioButtonMouseClicked
        // TODO add your handling code here:
        radioFlag = 1;
        setChartTitle(radioFlag);
        callTabs();
    }//GEN-LAST:event_temperatureRadioButtonMouseClicked

    private void windsRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windsRadioButtonMouseClicked
        // TODO add your handling code here:
        radioFlag = 2;
        setChartTitle(radioFlag);
        callTabs();
    }//GEN-LAST:event_windsRadioButtonMouseClicked

    private void barometricRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barometricRadioButtonMouseClicked
        // TODO add your handling code here:
        radioFlag = 3;
        setChartTitle(radioFlag);
        callTabs();
    }//GEN-LAST:event_barometricRadioButtonMouseClicked

    private void heatUVindexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heatUVindexMouseClicked
        // TODO add your handling code here:
        radioFlag = 4;
        setChartTitle(radioFlag);
        callTabs();
    }//GEN-LAST:event_heatUVindexMouseClicked

    private void averageTempItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageTempItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Average: ##F\nHigh:       ##F  (#/##/## @#:##)\nLow:        ##F  (#/##/## @#:##)","Temperature Stats", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_averageTempItemActionPerformed

    private void averageWindItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageWindItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Average:   ## mph\nHigh:         ## mph  (#/##/## @#:##)\nDirection:  E","Wind Stats", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_averageWindItemActionPerformed

    private void averagePrecipItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averagePrecipItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Rainfall: ## in","Rain Stats", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_averagePrecipItemActionPerformed

    public JFreeChart makeChart() {
        JFreeChart chart = ChartFactory.createXYLineChart(
            chartTitle,      // chart title
            xLabel,                      // x axis label
            yLabel,                      // y axis label
            dataSet,                  // data
            PlotOrientation.VERTICAL,
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );
        
        return chart;
    }
    public void generateGraph(JPanel tab) {
        tab.removeAll();
        
        ChartPanel graph = new ChartPanel(makeChart());

        graph.setSize(tab.getWidth(), tab.getHeight());
        graph.setVisible(true);
        tab.add(graph);
        tab.repaint();
    }
    public void callTabs() {
        switch(tabFlag)
        {
            case 1:
                generateGraph(dailyTab);
                break;
            case 2:
                generateGraph(weeklyTab);
                break;
            case 3:
                generateGraph(monthlyTab);
                break;
            case 4:
                generateGraph(yearlyTab);
                break;
        }
        
    }
    public void setChartTitle(int radioFlag) {
        String name = jTabbedPane1.getTitleAt(tabFlag-1);
        
        switch(radioFlag)
        {
            case 1:
                this.chartTitle = name + " Temperature";
                break;
            case 2:
                this.chartTitle = name + " Wind Speed";
                break;
            case 3:
                this.chartTitle = name + " Barometric Pressure";
                break;
            case 4:
                this.chartTitle = name + " Heat/UV Index";
                break;
            default:
                this.chartTitle = "Please Select Data Types on Left";
                break;
        }
        
    }
    public String getChartTitle() {
        return chartTitle;
    }
    public void setXlabel(String xLabel) {
        this.xLabel = xLabel;
    }
    public String getXlabel() {
        return xLabel;
    }
    public void setYlabel(String yLabel) {
        this.yLabel = yLabel;
    }
    public String getYlabel() {
        return yLabel;
    }
    public void setDataSet(XYDataset dataSet) {
        this.dataSet = dataSet;
    }
    public XYDataset getDataSet() {
        return dataSet;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem averagePrecipItem;
    private javax.swing.JMenuItem averageTempItem;
    private javax.swing.JMenuItem averageWindItem;
    private javax.swing.JRadioButton barometricRadioButton;
    private javax.swing.JMenuItem chooseFilesItem;
    private javax.swing.JPanel dailyTab;
    private javax.swing.JSlider dataSelector;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JRadioButton heatUVindex;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuBar maindisplayMenuBar;
    private javax.swing.JPanel monthlyTab;
    private javax.swing.JMenuItem quitItem;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JMenuItem specifyDirectoryItem;
    private javax.swing.JMenu statsMenu;
    private javax.swing.JRadioButton temperatureRadioButton;
    private javax.swing.JPanel weeklyTab;
    private javax.swing.JRadioButton windsRadioButton;
    private javax.swing.JPanel yearlyTab;
    // End of variables declaration//GEN-END:variables
}
