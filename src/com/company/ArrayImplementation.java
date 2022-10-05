package com.company;

import java.util.Arrays;

public class ArrayImplementation {

   int n = 10; //we only have hundred numbers
   int indexFirst = 0;
    int indexLast = 0;

   Integer[] array = new Integer[n];

   public void add(Integer n){
       array[indexLast++] = n;
       if(indexFirst >= n){
           indexFirst = 0;
       }
       if(indexFirst == indexLast && indexLast == array.length){
           array = Arrays.copyOf(array, 2*array.length);
       }
   }

    public Integer remove(){
        Integer temp = array[0];
        indexFirst++;
        if(indexLast >= n){
            indexLast = 0;
        }
        return temp;
    }




}
