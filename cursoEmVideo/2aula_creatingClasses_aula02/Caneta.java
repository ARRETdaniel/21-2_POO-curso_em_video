public class Caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status() {
    System.out.println(" modelo: " + this.modelo);
    System.out.println("\n Uma caneta: " + this.cor);
    System.out.println(" Esta tampada? \n" + this.tampada);
    System.out.println("\n Ponta: " + this.ponta);
    System.out.println("\n Carga:" + this.carga);

  }
  void rabiscar() { //metodo
    if (this.tampada == true) {
      System.out.println("\n ERRO! Nao posso rabiscar");
    } else {
      System.out.println("\n Estou rabiscando");
    }

  }

  void tampar() {
    this.tampada = true;
  }

  void destampar() {
    this.tampada = false;
  }
}
