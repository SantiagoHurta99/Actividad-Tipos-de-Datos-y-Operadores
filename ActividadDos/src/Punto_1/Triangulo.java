package Punto_1;

/**
 * Autor: Santiago Hurtado
 */

public class Triangulo {
	private int base;
	private int altura;

	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float calcularArea() {
		float area = 0;
		area = this.base * this.altura / 2;
		return area;
	}
}
