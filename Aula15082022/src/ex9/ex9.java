package ex9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ex9 {

    public static <Obj> Obj getUltimoElementoUsandoLinkedList(ArrayList <Obj> aList) {
        LinkedList<Obj> linkedList = new LinkedList<Obj>(aList);
        return linkedList.getLast();
    }
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            lista.add(s.nextLine());

        }

       

        System.out.println(lista);
        if (lista.isEmpty()) {
            System.out.println("Lista vazia");

        }
        else{
            System.out.println("Lista Não vazia");
        }
        
        System.out.println(lista.size());
        System.out.println("ultimo elemento da lista: "+getUltimoElementoUsandoLinkedList(lista));


    }
}
