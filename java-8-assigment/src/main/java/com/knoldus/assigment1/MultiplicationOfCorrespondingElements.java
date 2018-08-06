/*
package com.knoldus.assigment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplicationOfCorrespondingElements {

   */
/* public static List<Integer> multiply( List<Integer> list1, List<Integer> list2 ) {


        *//*
*/
/*return list1.stream()
                .map( s1 -> {
                    return list2.stream()
                            .map( s2 -> s1 * s2 )
                            .collect( Collectors.toList() );
                })
                .flatMap(integers -> integers.stream())
                .collect( Collectors.toList() );*//*
*/
/*
        return  list1.stream().map(
                elementInList1 -> {

                    return  list2.stream().flatMap(
                            elementInList2-> elementInList2
                    )
                }
        )
    }
*//*

    public static void main(String[] args) {
       */
/* List<Integer> list1 = new ArrayList();

        list1.add(4);
        list1.add(5);




        List<Integer> list2 = new ArrayList();

        list2.add(4);
        list2.add(5);

        System.out.println(multiply(list1,list2));*//*


       List<Integer> list1= Arrays.asList(1,2,3);
       List<Integer> list2= Arrays.asList(1,2,3);
       Integer a = list1.get(2);
        System.out.println(a);
       multiplyCorrespondinElement(list1,list2);

    }

    private static List<Integer> multiplyCorrespondinElement(int  arr1[], int arr2[]) {
        lengthOfFirstArray
        return

    }
}
*/
