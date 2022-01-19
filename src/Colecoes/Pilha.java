package Colecoes;

import java.util.Stack;
/*
 * Essa classe será responsável por criar uma estrutura de pilha de cores
 * Simulando uma aplicação que armazena em memoría cores que já foram utilizadas
*/
public class Pilha {
  private final Stack<Color> STACK_COLORS;

  public Pilha(){
   this.STACK_COLORS = new Stack<>();
  }

  public Pilha push( Color color ){
    this.STACK_COLORS.push(color);
    return this;
  }

  public Color pop(){
    return this.STACK_COLORS.pop();
  }

  public int getSize(){
    return this.STACK_COLORS.size();
  }

  public boolean esvaziarLista(){
    this.STACK_COLORS.empty();
    return this.STACK_COLORS.isEmpty();
  }
}
