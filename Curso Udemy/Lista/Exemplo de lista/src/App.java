/*************************************************************************************************************
 * 1 - Tamanho da lista: size()
 * 2 - Obter o elemento de uma posição: get(position)
 * 3 - Inserir elemento na lista: add(obj) e add(int, obj)
 * 4 - Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
 * 5 - Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
 * 6 - Filtrar lista com base em predicado: List result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
 * 7 - Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
 * 8 -  Assuntos pendentes: • interfaces • generics • predicados (lambda)
 **************************************************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        //Lista não aceita tipos primitivos (int) primitivo (Integer) wrapper 

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}