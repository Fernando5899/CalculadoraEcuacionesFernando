package Calculadora.Ecuaciones;


import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MetodoRungeKutta {
    public static double[] resolver(double valordex, double valordey, float h, int n, String ecuacion2) {
        double[] resultado = new double[n];
        double x = valordex;
        double y = valordey;

        for (int i = 0; i < n; i++) {
            double k1 = h * evaluarEcuacion(ecuacion2, x, y);
            double k2 = h * evaluarEcuacion(ecuacion2, x + h / 2, y + k1 / 2);
            double k3 = h * evaluarEcuacion(ecuacion2, x + h / 2, y + k2 / 2);
            double k4 = h * evaluarEcuacion(ecuacion2, x + h, y + k3);
            y += (k1 + 2 * k2 + 2 * k3 + k4) / 6;
            x += h;
            resultado[i] = y;
        }

        return resultado;
    }

    private static double evaluarEcuacion(String ecuacion2, double x, double y) {
        try {
            Expression expr = new ExpressionBuilder(ecuacion2)
                    .variables("x", "y")
                    .build()
                    .setVariable("x", x)
                    .setVariable("y", y);
            return expr.evaluate();
        } catch (Exception e) {
            System.err.println("Error al evaluar la ecuación: " + e.getMessage());
            return 0; // Manejar de otra manera si es necesario
        }
    }
}
