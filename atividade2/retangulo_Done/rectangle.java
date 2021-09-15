public class rectangle {
  // protected double side;
  protected double width;
  protected double height;
  protected double area;
  protected double perimeter;

  public void allValues() { // Retornar valor dos lados
    System.out.println("\n -----------");
    System.out.println("\n Width value:" + this.width);
    System.out.println("\n Height:" + this.height);
    System.out.println("\n Metros de roda pes = perimeter:" + this.perimeter);
    System.out.println("\n Quantidade de porcelanato = area:" + this.area); // Porcelanato 1m
    System.out.println("\n -----------");

  }

  public void changeSides(double newWidth, double newHeight) { // : Mudar valor dos lados
    width = newWidth;
    height = newHeight;
  }

  public void areaCal() { // calcular aea e calcular Perímetro;
    area = width * height;
  }

  public void perimeterCal() { // calcular area e calcular Perímetro;
    perimeter = ((2 * width) + (2 * height));

  }
}
