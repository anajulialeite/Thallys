public class Triangulo extends FormasGeometricas{
  private double base;
  private double altura;

  public Triangulo (double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  @Override //Ele troca o método abstrato da classe pai
  public double area() {
    return (base * altura) / 2;
  }
}