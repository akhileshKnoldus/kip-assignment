package com.knoldus.assigment1;

import java.util.ArrayList;

public class MultiplicationOfList {


    private static ArrayList<Integer> multiplication(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // TODO Auto-generated method stub
        ArrayList<Integer> list=new ArrayList<>();

        if(list1==null && list2==null)
            return null;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;

        int min=Math.min(list1.size(), list2.size());
        for(int i=0;i<min;i++) {
            list.add(list1.get(i)*list2.get(i));
        }

        list1= list1.size()<list2.size()? list2:list1;

        for(int i=min;i<list1.size();i++) {
            list.add(list1.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(1);
        list2.add(2);
        list2.add(50);

        ArrayList<Integer> list=multiplication(list1,list2);

        list.forEach(s->System.out.println(s));

    }

}
