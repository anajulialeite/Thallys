public class Main {
  public static void main(String[] args) {
    Triangulo triangulo = new Triangulo(10, 5);
    double areaTotal = triangulo.area();
    System.out.println(areaTotal);

    Circulo circulo = new Circulo(10);
    double areaCirculo = circulo.area();
    System.out.println(areaCirculo);

    Retangulo retangulo = new Retangulo(10, 5);
    double areaRetangulo = retangulo.area();
    System.out.println(areaRetangulo);
  }
}