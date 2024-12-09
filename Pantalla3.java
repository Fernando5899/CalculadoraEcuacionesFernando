package Calculadora.Ecuaciones;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Pantalla3 extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField ecuacion1;
    private JTextField valorinicialx;
    private JTextField valorinicialy;
    private JTextField valorh;
    private JTextField repeticiones;
    private JTextArea resultArea;
    private JTextArea logArea; // Nueva área de texto para los valores iterativos

    public Pantalla3(Principal principal) {
        setSize(1542, 824);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(-12, 10, 1602, 906);
        add(panel);
        panel.setLayout(null);

        JLabel logoutc = new JLabel(new ImageIcon("C:\\Users\\ferna\\OneDrive\\Pictures\\Calculadora\\images.jpeg"));
        logoutc.setBounds(26, -12, 265, 247);
        panel.add(logoutc);

        JLabel ingenieria = new JLabel(new ImageIcon("C:\\Users\\ferna\\OneDrive\\Pictures\\Calculadora\\inge.png"));
        ingenieria.setBounds(1254, 10, 278, 225);
        panel.add(ingenieria);

        JLabel titulo = new JLabel("¡CALCULADORA DE ECUACIONES DIFERENCIALES!");
        titulo.setBounds(394, 112, 753, 50);
        titulo.setOpaque(true);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Yu Gothic UI Semilight", Font.ITALIC, 32));
        titulo.setBackground(Color.WHITE);
        panel.add(titulo);

        JButton euler = new JButton("EULER");
        euler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarMetodo("EULER");
            }
        });
        euler.setBackground(Color.LIGHT_GRAY);
        euler.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 34));
        euler.setBounds(115, 722, 200, 50);
        panel.add(euler);

        JButton limpiar = new JButton("Limpiar");
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ecuacion1.setText("");
                valorinicialx.setText("");
                valorinicialy.setText("");
                repeticiones.setText("");
                valorh.setText("");
                resultArea.setText("");
                logArea.setText("");
            }
        });
        limpiar.setBackground(Color.LIGHT_GRAY);
        limpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 34));
        limpiar.setBounds(909, 722, 200, 50);
        panel.add(limpiar);

        JButton kutta = new JButton("Runge-Kutta");
        kutta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarMetodo("Runge-Kutta");
            }
        });
        kutta.setBackground(Color.LIGHT_GRAY);
        kutta.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
        kutta.setBounds(452, 722, 218, 50);
        panel.add(kutta);

        JButton FIN = new JButton("Fin");
        FIN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal.verPantalla("Pantalla1");
            }
        });
        FIN.setBackground(Color.LIGHT_GRAY);
        FIN.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
        FIN.setBounds(1279, 722, 200, 50);
        panel.add(FIN);

        JLabel lblNewLabel = new JLabel("Ingrese su Ecuación Diferencial.");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 32));
        lblNewLabel.setBounds(394, 215, 753, 50);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Ecuación Diferencial dx/dx:");
        lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        lblNewLabel_1.setBounds(65, 307, 350, 33);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Valor Inicial de x:");
        lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        lblNewLabel_2.setBounds(65, 397, 192, 33);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Valor Inicial de y:");
        lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        lblNewLabel_3.setBounds(65, 483, 192, 33);
        panel.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Valor de h:");
        lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        lblNewLabel_4.setBounds(65, 560, 133, 33);
        panel.add(lblNewLabel_4);

        JLabel numerorepeticiones = new JLabel("Número de Repeticiones:");
        numerorepeticiones.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        numerorepeticiones.setBounds(65, 628, 278, 33);
        panel.add(numerorepeticiones);

        resultArea = new JTextArea();
        resultArea.setLineWrap(true);
        resultArea.setEnabled(false);
        resultArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setEnabled(false);
        scrollPane.setPreferredSize(new Dimension(360, 150));
        scrollPane.setBounds(891, 390, 256, 271);

        ecuacion1 = new JTextField();
        ecuacion1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        ecuacion1.setBounds(370, 307, 350, 33);
        panel.add(ecuacion1);
        ecuacion1.setColumns(10);

        valorinicialx = new JTextField();
        valorinicialx.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        valorinicialx.setBounds(267, 397, 96, 33);
        panel.add(valorinicialx);
        valorinicialx.setColumns(10);

        valorinicialy = new JTextField();
        valorinicialy.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        valorinicialy.setBounds(267, 483, 96, 33);
        panel.add(valorinicialy);
        valorinicialy.setColumns(10);

        valorh = new JTextField();
        valorh.setText("0.1");
        valorh.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        valorh.setBounds(195, 560, 96, 33);
        panel.add(valorh);
        valorh.setColumns(10);

        repeticiones = new JTextField();
        repeticiones.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        repeticiones.setBounds(342, 628, 96, 33);
        panel.add(repeticiones);
        repeticiones.setColumns(10);

        // Nueva área para mostrar valores iterativos
        logArea = new JTextArea();
        logArea.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(logArea);
        logScrollPane.setBounds(1027, 386, 473, 275);
        panel.add(logScrollPane);

        JLabel logLabel = new JLabel("Valores de X, Y:");
        logLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        logLabel.setBounds(1171, 343, 169, 33);
        panel.add(logLabel);
    }

    private void ejecutarMetodo(String metodo) {
        if (!validarCampos()) {
            return;
        }

        String ecuacion2 = ecuacion1.getText();
        double valorInicialX = Double.parseDouble(valorinicialx.getText());
        double valorInicialY = Double.parseDouble(valorinicialy.getText());
        float h = Float.parseFloat(valorh.getText());
        int numRepeticiones = Integer.parseInt(repeticiones.getText());

        double[] resultado;
        try {
            if (metodo.equals("EULER")) {
                resultado = MetodoEuler.resolver(valorInicialX, valorInicialY, h, numRepeticiones, ecuacion2);
            } else {
                resultado = MetodoRungeKutta.resolver(valorInicialX, valorInicialY, h, numRepeticiones, ecuacion2);
            }

            mostrarResultados(resultado, valorInicialX, h);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error durante el cálculo: " + ex.getMessage());
        }
    }

    private void mostrarResultados(double[] resultado, double valorInicialX, float h) {
        StringBuilder textoResultado = new StringBuilder();
        StringBuilder textoLog = new StringBuilder(); // Para el área iterativa
        for (int i = 0; i < resultado.length; i++) {
            double x = valorInicialX + i * h;
            textoResultado.append("x: ").append(x).append(", y: ").append(resultado[i]).append("\n");
            textoLog.append(String.format("Repetición %d: x = %.4f, y = %.4f\n", i + 1, x, resultado[i]));
        }
        resultArea.setText(textoResultado.toString());
        logArea.setText(textoLog.toString()); // Actualiza el área de valores iterativos
        graficarResultado(resultado, valorInicialX, h);
    }

    private void graficarResultado(double[] resultado, double valordex, float h) {
        XYSeries series = new XYSeries("Solución");

        for (int i = 0; i < resultado.length; i++) {
            double x = valordex + i * h;
            series.add(x, resultado[i]);
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Solución de la Ecuación Diferencial.",
                "X",
                "Y",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        XYPlot plot = chart.getXYPlot();
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setRangeGridlinePaint(Color.BLACK);

        NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        double xMin = valordex;
        double xMax = valordex + (resultado.length - 1) * h;
        double yMax = 0;

        for (double resultado1 : resultado) {
            yMax = Math.max(yMax, Math.abs(resultado1));
        }

        double rangePadding = 1;
        domainAxis.setRange(Math.min(xMin, 0) - rangePadding, Math.max(xMax, 0) + rangePadding);
        rangeAxis.setRange(-yMax - rangePadding, yMax + rangePadding);

        domainAxis.setTickUnit(new NumberTickUnit(1));
        rangeAxis.setTickUnit(new NumberTickUnit(1));

        plot.setDomainZeroBaselineVisible(true);
        plot.setRangeZeroBaselineVisible(true);
        plot.setDomainZeroBaselinePaint(Color.BLACK);
        plot.setRangeZeroBaselinePaint(Color.BLACK);

        // Mostrar el gráfico en un nuevo JFrame
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame chartFrame = new JFrame("Gráfica");
        chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        chartFrame.getContentPane().add(chartPanel);
        chartFrame.pack();
        chartFrame.setVisible(true);
    }

    private boolean validarCampos() {
        String ecuacionText = ecuacion1.getText();
        String valorInicialXText = valorinicialx.getText();
        String valorInicialYText = valorinicialy.getText();
        String pasoText = valorh.getText();
        String repeticionesText = repeticiones.getText();

        if (ecuacionText.isEmpty() || valorInicialXText.isEmpty() || valorInicialYText.isEmpty() ||
                pasoText.isEmpty() || repeticionesText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return false;
        }

        try {
            Double.parseDouble(valorInicialXText);
            Double.parseDouble(valorInicialYText);
            Double.parseDouble(pasoText);
            Integer.parseInt(repeticionesText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.");
            return false;
        }

        return true;
    }
}

