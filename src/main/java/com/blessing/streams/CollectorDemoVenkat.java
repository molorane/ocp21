package com.blessing.streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorDemoVenkat {

    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

    static List<String> strings = Arrays.asList("OCA", "OCP", "OCM", "OCE");

    public static List<Person> getPeople() {
        return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
                new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
                new Person("Paul", Gender.MALE, 32), new Person("Lerato", Gender.MALE, 72),
                new Person("Jack", Gender.MALE, 72), new Person("Jack", Gender.MALE, 3),
                new Person("Jill", Gender.FEMALE, 11));
    }

    public static void main(String[] args) {
        toUnmodifiableList();
    }

    public static void toMap() {
        List<Person> people = getPeople();

        Map<Boolean, Map<String, Map<Integer, Map<Gender, Person>>>> list = people.stream()
                .collect(
                        Collectors.partitioningBy(Person::isAfrican,
                                Collectors.groupingBy(Person::getName,
                                        Collectors.filtering(Predicate.not(Person::bornBeforeEpoc),
                                                Collectors.groupingBy(Person::getAge,
                                                        Collectors.toMap(Person::getGender, Function.identity()))))));
        System.out.println(list);
    }

    public static void ocp8() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]
    }

    public static void filtering() {

        List<Person> people = getPeople();

        System.out.println(people
                .stream()
                .collect(
                        Collectors.groupingBy(Person::getAge,
                                Collectors
                                        .mapping(Person::getName, Collectors.filtering(name -> name.length() > 4, Collectors.toList())))));
    }

    public static void maxByAndTransoform() {

        List<Person> people = getPeople();

		/*System.out.println(people.stream().collect(
				Collectors.collectingAndThen(
				Collectors.maxBy(Comparator.comparing(Person::getAge)),
				p -> p.map(Person::getName).orElse(""))));*/
        // .collect(Collectors.maxBy(Comparator.comparingInt(Person::getAge))));
        // //ToIntFunction
        // .collect(Collectors.maxBy(Comparator.comparingLong(Person::getAge))));
        // ToLongFunction
        // .collect(Collectors.maxBy(Comparator.comparingDouble(Person::getAge))));
        // ToDoubleFunction
    }

    /*
     * Use cases (maxBy, minBy) work same way
     *
     * 1. Person who is oldest 2. Person with highest salary 3. Person who worked
     * longest in a particular department 4.
     */

    public static void maxBy() {

        List<Person> people = getPeople();

        System.out.println(people.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getAge))));
        // .collect(Collectors.maxBy(Comparator.comparingInt(Person::getAge))));
        // //ToIntFunction
        // .collect(Collectors.maxBy(Comparator.comparingLong(Person::getAge))));
        // ToLongFunction
        // .collect(Collectors.maxBy(Comparator.comparingDouble(Person::getAge))));
        // ToDoubleFunction
    }

    public static void counting3() {

        List<Person> people = getPeople();

        System.out.println(people.stream().map(Person::getAge).reduce(0, (total, e) -> total + e));

        // OR we can
        System.out.println(people.stream().mapToInt(Person::getAge).max());
    }

    public static void counting() {
        List<Person> people = getPeople();

        Map<String, Long> list = people.stream().collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
        System.out.println(list);
    }

    public static void counting2() {
        List<Person> people = getPeople();

        Map<String, Integer> list = people.stream().collect(Collectors.groupingBy(Person::getName,
                Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));

        System.out.println(list);
    }

    public static void partitioningBy() {
        System.out.println(getPeople().stream().collect(Collectors.partitioningBy(p -> p.getAge() % 2 == 0,
                Collectors.groupingBy(Person::getName, Collectors.counting()))));
    }

    public static void accumulateStrings() {
        List<String> list = strings.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(list);
    }

    public static void joining() {

        String str = getPeople().stream().filter(p -> p.getAge() > 30).map(Person::getName).map(String::toUpperCase)
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println(str);
    }

    public static void groupingBy3() {
        List<Person> people = getPeople();

        Map<String, Map<Integer, Map<Gender, List<Person>>>> list = people.stream().filter(p -> p.getAge() > 30)
                .collect(Collectors.groupingBy(Person::getName,
                        Collectors.groupingBy(Person::getAge, Collectors.groupingBy(Person::getGender))));
        System.out.println(list);
    }

    public static void groupingBy2() {
        List<Person> people = getPeople();

        Comparator<Person> comparator = (p1, p2) -> {
            return (p1.getAge() > p2.getAge()) ? 1 : (p1.getAge() < p2.getAge()) ? -1 : 0;
        };

        Map<String, List<Integer>> list = people.stream().sorted(comparator).collect(
                Collectors.groupingBy(Person::getName, Collectors.mapping(Person::getAge, Collectors.toList())))
                // or Collectors.mapping(Person::getAge, Collectors.toSet())
                ;
        System.out.println(list);
    }

    public static void groupingBy1() {
        List<Person> people = getPeople();

        Map<String, List<Person>> list = people.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println(list);
    }

    public static void toSet() {
        Predicate<Integer> p = x -> {
            System.out.println(x);
            return x % 2 == 0;
        };

        System.out.println(numbers.stream().filter(p).map(e -> e * 2).collect(Collectors.toSet()));
    }

    public static void toUnmodifiableList() {

        List<Person> list = getPeople().stream().collect(Collectors.toUnmodifiableList());
        System.out.println(list);
        list.add(null); // throws exception
    }

    public static void toList() {
        List<String> list = getPeople().stream().filter(e -> e.getAge() > 30).map(Person::getName)
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);
    }

    public static void reduce() {
        List<String> list = getPeople().stream().filter(e -> e.getAge() > 30).map(Person::getName)
                .map(String::toUpperCase).reduce(new ArrayList<String>(), (names, name) -> {
                    names.add(name);
                    return names;
                }, (l1, l2) -> {
                    l1.addAll(l2);
                    return l1;
                });
        System.out.println(list);
    }

}
