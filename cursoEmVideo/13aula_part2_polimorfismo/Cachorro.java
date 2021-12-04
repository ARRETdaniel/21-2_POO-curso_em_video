public class Cachorro extends Mamifero {
  @Override
  public void emitirsom() {
    System.out.println("som au aua au");

  }

  public void reagir(String frase) {
    if (frase.equals("toma comida") || frase.equals("ola")) {
      System.out.println("abanar e latir");
    } else {
      System.out.println("Rosnar");
    }
  }

  public void reagir(int hora, int min) {
    if (hora < 12) {
      System.out.println("abanar");
    } else if (hora >= 18) {
      System.out.println("ignorar");
    } else {
      System.out.println("abanar e latir");
    }
  }

  public void reagir(boolean dono) {
    if (dono == true) {
      System.out.println("abanar e latir");
    } else {
      System.out.println("Rosnar e latir");
    }
  }

  public void reagir(int idade, float peso) {
    if (idade < 5) {
      if (peso < 10) {
        System.out.println("abanar");

      } else {
        System.out.println(" latir");

      }
    } else {
      if (peso < 10) {
        System.out.println("Rosnar");

      } else {
        System.out.println("ignorar");

      }
    }
  }

}
