package Punto_2;

/**
 * Autor: Santiago Hurtado
 */

public class Formulas {
	private int x;
	private int y;
	private int z;

	public Formulas() {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String formulaA() {
		String R = "a = ";
		double result = Math.sqrt(Math.pow(this.x, 5)-6) / 4;
		return R + result;
	}

	public String formulaB() {
		String R = "b = ";
		double result = Math.pow(this.x, this.y) - Math.pow(6, this.x);
		return R + result;
	}

	public String formulaC() {
		String R = "c = ";
		double result = (4 * Math.cos(this.z / 5)) - Math.sin(Math.pow(this.x, 2));
		return R + result;
	}

	public String formulaD() {
		String R = "d = ";
		double result = Math.pow(this.x, 4) - Math.sqrt(6 * this.x - Math.pow(this.y, 3));
		return R + result;
	}

	public String formulaE() {
		String R = "e = ";
		double result = 1 / (this.y - (1 / (this.x - Math.pow(2, this.y))));
		return R + result;
	}

	public String formulaF() {
		String R = "f = ";
		double result = 7 * Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * this.x - 4))));
		return R + result;
	}
}
