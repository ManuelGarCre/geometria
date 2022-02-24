/**
 * Clase para calcular el area y perimetro de un rectangulo
 * @author Manuel García Cremades
 * @version 1.2
 *
 */
public class Rectangulo_MGC extends FiguraGeometrica_MGC {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la calse Rectangulo
	 * @param tipoFigura tipo de figura geometrica
	 * @param lG longitud de un lado del rectangulo(base o ancho)
	 * @param lP longitud de un lado del rectangulo(altura)
	 */
	public Rectangulo_MGC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Calcula el area de un rectangulo
	 * @return area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el perimetro de uun rectangulo
	 * @return perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
