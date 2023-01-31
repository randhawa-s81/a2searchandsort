/* **********************************************************
 * Programmer:    Samarjeet Randhawa
 * Class:         CS40S
 * 
 * Assignment:    A2 Sorting and Searching
 *
 * Description:   sorter class 
 * 
 **************************************************************/

public class Sorter{

    //constructors 
    public Sorter(){

    }// default constructor 

    //bubble sort algorithim 
    public static void bubbleSort(int[] list, int len){
        for(int i = 0; i  <len; i++){
            for(int j = 0; j < len-i-1; j++){
                //System.out.println("j");
                if(list[j] > list[j+1]){
                    int temp = list[j]; //temp variable to hold the value of index j
                    list[j] = list[j+1]; //switching the values of index j 
                    list[j+1] = temp; //putting the temp value back into index j 
                }// end for

            }// end for j
        }// end for i

    }   // end bubblesort 

    //selection sort algorithim method 
    public static void selectionSort(int[] list, int len){
        for(int i = 0; i < list.length-1; i++){
            int minValue = i;
            for(int j = i +1; j < list.length; i++){
                if(list[minValue] > list[j]){
                    minValue = j;
                }
            }// end j 
            if(minValue != i){
            int temp = list[i]; //temp variable to hold the value of index i
                    list[i] = list[minValue]; //switching the values of index i
                    list[minValue] = temp;
                }
        }// end for i 
    }// end selection sort method 
    }// end sorter 