package Colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCores {
    private final List<Color> Colors = new ArrayList<>();// List of color

    public static void main(String[] args) {
        ListaDeCores list = new ListaDeCores();// instace of this class
        list.menuList();
    }

    public void menuList() {
        Scanner Scanner = new Scanner(System.in);
        String continueMenu = "sim";
        int opc;

        while (continueMenu.equalsIgnoreCase("sim")) {
            System.out.println("--------  Menu --------");
            System.out.println("1 - Adicionar elementos a Lista");
            System.out.println("2 - Remove Elemento da Lista");
            System.out.println("3 - Mostrar elementos");
            System.out.println("4 - Adicionar cores da Bandeira Brasileira");
            System.out.println("5 - Sair do Sistema");
            System.out.println("--------  ---- --------");
            opc = Scanner.nextInt();

            switch (opc) {
            case 1:
                System.out.print("Digite  o nome da " + (this.Colors.size() + 1) + " cor desejada: ");
                addColor(Scanner.next());

                break;
            case 2:
                System.out.println("Desseja apagar pelo o Id/Nome/Todos os itens: ");
                removeColor(Scanner.next());

                break;
            case 3:
                System.out.println(this.Colors);
                break;
            case 4:
                if (this.setBrazilFlagList())
                    System.out.println("Adicionado com Sucesso");
                break;
            case 5:
                continueMenu = "nao";
                break;
            default:
                System.out.println("Opção Inválida");
            }
        }
        Scanner.close();
    }

    public void addColor(String newColor) {
        this.Colors.add(new Color(newColor));
    }

    public boolean setBrazilFlagList() {
        List<Color> Color2 = new ArrayList<>();
        Color2.add(new Color("Azul"));
        Color2.add(new Color("Verde"));
        Color2.add(new Color("Amarelo"));
        Color2.add(new Color("Branco"));
        this.Colors.addAll(Color2);
        return true;
    }

    public void removeColor(String color) {
        // remove by id, object (String) or all items
        if (color.equalsIgnoreCase("todos"))
            this.Colors.clear();
        try {
            int colorId = Integer.parseInt(color);
            this.Colors.remove(colorId);

        } catch (NumberFormatException e) {
            Colors.remove(new Color(color));// NaN
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Não existe esse elemento");
        }
    }
}
