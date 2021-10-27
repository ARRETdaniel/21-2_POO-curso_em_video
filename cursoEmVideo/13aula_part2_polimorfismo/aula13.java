public class aula13 {
  public static void main(String[] args) {

    Mamifero m = new Mamifero();
    Reptil r = new Reptil();
    Tartaruga t = new Tartaruga();
    Cachorro c = new Cachorro();
    m.setPeso(35.3f);
    m.locomover();
    r.locomover();
    t.locomover();
    c.rabo();
  }
}
