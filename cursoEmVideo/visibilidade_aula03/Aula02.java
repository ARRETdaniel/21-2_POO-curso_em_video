public class Aula02 {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    Caneta c2 = new Caneta();
    c2 = c1;
    c1.modelo = "bic cristal";
    c1.cor = "azul";
    // c1.ponta = 0.5f;
    c1.carga = 80;

    c2.status();
    c1.status();
    c2.modelo = "CARRO";
    c2.status();
    c1.status();
  }
}
