/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostFix;

/**
 *
 * @author Hongru Xiang
 */
public class Stack {
    private int[] list;
    int pointer = -1;
    
    /*** Construct with assign list with an int list ***/
    public Stack(int[] array){
        addArray(array);
        pointer = array.length - 1;
    }
    
    /*** Construct with assign list with an char list ***/
    public Stack(char[] array) {
        addArray(array);
        pointer = array.length - 1;
    }
    
    /*** Construct the list with a certain length ***/
    public Stack(int length){
        list = new int[length];
    }
    
    /*** Default constructor. Create an list with size of 10000,
     * and pointer of -1 ***/
    public Stack(){
        list = new int[10000];
    }
    
    /*** It will clone an int array to list in the data field ***/
    public void addArray(int[] array){
        list = new int[array.length];
        
        for(int i = 0; i < list.length; i++){
            list[i] = array[i];
        }
    }
    
    /*** It will clone a char array to list in the data field ***/
    public void addArray(char[] array){
        list = new int[array.length];
        
        for(int i = 0; i < list.length; i++){
            list[i] = array[i];
        }
    }
    
    /*** Add an element into the stack ***/
    public void add(int n){
        if(pointer >= list.length - 1){
            System.out.println("The stack is full");
            return;
        }
        
        list[++pointer] = n;
    }
    
    /*** Add an element into the stack ***/
    public void add(char n){
        if(pointer >= list.length - 1){
            System.out.println("The stack is full");
            return;
        }
        
        list[++pointer] = (int)n;
    }
    
    /*** Read an element from the stack ***/
    public int get(){
        try{
            return list[pointer--];
        } 
        catch(ArrayIndexOutOfBoundsException ex){
            pointer++;
            System.out.println("Empty stack found");
            return 0;
        }
    }
    
    /*** Get stack as int[] ***/
    public int[] getStack(){
        int[] arr = new int[list.length];
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = list[i];
        }
        
        return arr;
    }
}
