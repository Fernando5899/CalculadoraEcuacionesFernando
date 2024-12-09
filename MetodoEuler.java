package Calculadora.Ecuaciones;

import javax.swing.JOptionPane;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MetodoEuler {
	
	public static double[] resolver(double valordex, double valordey, float h, int n, String ecuacion2) {
		
		double[] resultado = new double[n];
		double x = valordex;
		double y = valordey;
		
		for(int i = 0; i < n; i++) {
			y += h * evaluarEcuacion(ecuacion2, x, y);
			x += h;
			resultado[i] = y;
		}
		return resultado;
	}

	//Metodo para evaluara la ecuación diferencial 
	private static double evaluarEcuacion(String ecuacion2, double x, double y) {
		try {
			
			Expression expresion = new ExpressionBuilder(ecuacion2)
					.variables("x", "y")
					.build()
					.setVariable("x", x)
					.setVariable("y", y);
			
			return expresion.evaluate();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al evaluar la ecuacion: " + e.getMessage());
		return 0;
		}
	}
}
