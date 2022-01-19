import Colecoes.Color;
import Colecoes.Pilha;

public class App {
  
  public static void main(String[] args) {
    final Pilha stack = new Pilha();
    stack
      .push(new Color("Blue"))
      .push(new Color("Red"))
      .push(new Color("Yellow"));

    System.out.println("Desempilhando a pilha de cores:");
    System.out.println("A última cor a entrar na pilha foi: " + stack.pop().getColor());
    System.out.println("A penultima cor a entrar na pilha foi: " + stack.pop().getColor());
    System.out.println("A primeira cor a entrar na pilha foi: " + stack.pop().getColor());

  }
}
