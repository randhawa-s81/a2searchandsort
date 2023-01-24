/* **********************************************************
 * Programmer:    Samarjeet Randhawa
 * Class:        CS20S
 * 
 * Assignment:    A2 Sorting and Searching
 *
 * Description:    class to do some standard array work, load and print to name
two
 **************************************************************/

public class Sorter{
    
    //constructors 
    public Sorter(){

    }// default constructor 

    //bubble sort 
    public static void bubbleSort(int[] list, int len){
        for(int i = 0; i <len; i++){
            if(list[0] > list[i]){
                int temp = list[0];
                list[0] = list[i];
                list[i] = temp; 
            }// end for 
        }// end for 
    }// end method bubblesort 

}