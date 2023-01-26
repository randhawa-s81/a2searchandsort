/* **********************************************************
 * Programmer:    Samarjeet Randhawa
 * Class:        CS40S
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

    //bubble sort 
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

    public static void selectionSort(int[] list, int len){
        for(int i = 0; i < len; i++){
            
        }// end for i 
    }// end selection sort method 
    }// end sorter 