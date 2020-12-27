package br.com.java.maratona.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @autor Adriano Rabello
 */
public class Streams {

    public static void main(String[] args) {

        /** ordenando pelo nome */
        List<Pessoa> ordenado = Pessoa.PESSOAS().stream().sorted(Comparator.comparing(Pessoa::getNome)).collect(Collectors.toList());

        /** ordenando de forma inversa com reverse */
        Pessoa.PESSOAS().stream().sorted(Comparator.comparing(Pessoa::getNome).reversed()).collect(Collectors.toList());


        /** filtando pela idade */
        List<Pessoa> collect = Pessoa.PESSOAS().stream().filter(p -> p.getIdade() < 20).collect(Collectors.toList());

        List<List<String>> nomes = new ArrayList<>();

        nomes.add(Arrays.asList("adriano", "aline"));
        nomes.add(Arrays.asList("calra", "junior"));

        /** Utuliza-se flat map quando temos uma lista dentro e outra lista */
        List<String> collect1 = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());

        collect1.forEach(System.out::println);

        /** verifica se tem algum elemento co ma condição informada */
        System.out.println(Pessoa.PESSOAS().stream().anyMatch(p -> p.getIdade() < 10));

        /** Verifica se todos os elementos tem a condição informada */
        System.out.println(Pessoa.PESSOAS().stream().allMatch(p -> p.getIdade() < 10));

        /** varifica se nenhum dos elementos possui a condição informada */
        System.out.println(Pessoa.PESSOAS().stream().noneMatch(p -> p.getIdade() < 10));

        /** retorna qualquer elemento que tenha a valor do teste dentro do filter  */
        Optional<Pessoa> any = Pessoa.PESSOAS().stream().filter(p -> p.getIdade() < 10).findAny();
        System.out.println(any.get().getNome());

        /** já imprime o nome da pessoa se estive presente */
        Pessoa.PESSOAS().stream().filter(p -> p.getIdade() > 32).findAny().ifPresent(p -> System.out.println(p.getNome()));


        /** soamndo os valores
         * um strem não pode ser utilizado suas vezes
         * */
        Stream<Integer> stream = Arrays.asList(1,2,3).stream();
        Stream<Integer> stream2 = Arrays.asList(1,2,3).stream();

        /** reduce refuz o valor de uma strema para o faormato especificado. retorna um optional */
        System.out.println(Pessoa.INTEGER_STREAM().reduce((x,y) -> x + y ));
        /** Somando mas utilizando method reference */
        System.out.println(Pessoa.INTEGER_STREAM().reduce(Integer::sum));

        /** Pegando o maior valor */
        System.out.println(Pessoa.INTEGER_STREAM().reduce(Integer::max));

        /** Pegando o menor valor */
        System.out.println(Pessoa.INTEGER_STREAM().reduce(Integer::min));

        /** somando as idades das pessoas em uma lista de pessoas. retorn um optional  */
        System.out.println(Pessoa.PESSOAS().stream().map(p -> p.getIdade()).reduce(Integer::sum));

        /** somando idade de uma lista de pessoas com filter e method reference */
        int sum = Pessoa.PESSOAS().stream().filter(p -> p.getIdade() > 4).mapToInt(Pessoa::getIdade).sum();


        /** Criando streams */
        IntStream.range(1 , 50).filter(n -> n > 0).forEach(s -> System.out.print(s + " "));
        System.out.println(" ");
        IntStream.rangeClosed(1 , 50).filter(n -> n > 0).forEach(s -> System.out.print(s + " "));

        /** parei ba aula 190 */


    }

}
