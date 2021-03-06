package com.example.learn.learn.java8;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * @Author: majinwen
 * @Date: 2021/7/20-13:46
 * @Description:
 */
@Component
public class Java8Test {

    public static void main(String[] args) {
        List list=new ArrayList();
        List list2=new ArrayList();
        Map map1=new HashMap();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        List list3= (List) list.stream().filter(a->!a.equals("a")).collect(Collectors.toList());
//        list3.forEach(System.out::println);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        Map<String, String> collect = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toMap(String::valueOf, String::valueOf));
        collect.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
//                System.out.println(collect.get(s));
            }
        });

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).collect(Collectors.toList());
//        squaresList.forEach(System.out::println);

        List collect1 = (List) list.stream().limit(4).filter(a->!a.equals("a")).collect(Collectors.toList());
        collect1.forEach(System.out::println);



        //使用Lambda表达式提供Supplier接口实现，返回OK字符串
        Supplier<String> stringSupplier = ()->"OK";
//使用方法引用提供Supplier接口实现，返回空字符串
        Supplier<String> supplier = String::new;

//Predicate接口是输入一个参数，返回布尔值。我们通过and方法组合两个Predicate条件，判断是否值大于0并且是偶数
        Predicate<Integer> positiveNumber = i -> i > 0;
        Predicate<Integer> evenNumber = i -> i % 2 == 0;
//        assertTrue(positiveNumber.and(evenNumber).test(2));

//Consumer接口是消费一个数据。我们通过andThen方法组合调用两个Consumer，输出两行abcdefg
        Consumer<String> println = System.out::println;
        println.andThen(println).accept("abcdefg");

//Function接口是输入一个数据，计算后输出一个数据。我们先把字符串转换为大写，然后通过andThen组合另一个Function实现字符串拼接
        Function<String, String> upperCase = String::toUpperCase;
        Function<String, String> duplicate = s -> s.concat(s);
//        assertThat(upperCase.andThen(duplicate).apply("test"), is("TESTTEST"));

//Supplier是提供一个数据的接口。这里我们实现获取一个随机数
        Supplier<Integer> random = ()-> ThreadLocalRandom.current().nextInt();
        System.out.println(random.get());

//BinaryOperator是输入两个同类型参数，输出一个同类型参数的接口。这里我们通过方法引用获得一个整数加法操作，通过Lambda表达式定义一个减法操作，然后依次调用
        BinaryOperator<Integer> add = Integer::sum;
        BinaryOperator<Integer> subtraction = (a, b) -> a - b;
//        assertThat(subtraction.apply(add.apply(1, 2), 3), is(0));

        Optional< String > fullName = Optional.ofNullable( "" );
        Optional<Object> empty = Optional.empty();

        System.out.println("**"+empty.isPresent());

        System.out.println( "Full Name is set? " + fullName.isPresent() );
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );

        Set set1=new HashSet();
        set1.add("123");
        set1.add("123");
        set1.add("123");
        for (Object o : set1) {
            System.out.println(o);
        }
        Set set2=new TreeSet();
        set2.add("123");
        set2.add("123");
        set2.add("123");
        for (Object o : set2) {
            System.out.println(o);
        }
    }

}
