package org.minby.crud;

public class Main {
    public static void main(String[] args) {

        int n = 100;
        double[] array = new double[n];

        int arraySize = array.length - 1;

        for (int i = 0; i <= arraySize; i++){
            array[i] = Math.random();
        }

        /*double max = array[0];
        double min = array[0];
        double avg = 0;*/

        //print unsorted array
        for(int i = 0; i <= arraySize; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean swapped;
        double temp;
        //sort (пузырёк)
        do{
            swapped = false;
            for (int i = 0; i < arraySize; i++){
                if(array[i] > array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            arraySize--;
        }while (swapped);
        //print sorted array
        for(int i = 0; i <= arraySize; i++){
            System.out.print(array[i] + " ");
        }
    }
}
