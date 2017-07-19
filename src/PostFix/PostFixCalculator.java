/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PostFix;

/**
 *
 * @author xiang-h
 */
public class PostFixCalculator {
    private Stack stack = new Stack();
    
    /*** Read data into the stack ***/
    public void readIn(int n){
        stack.add(n);
    }
    
    public void readIn(char n){
        stack.add(n);
    }
    
    public void readIn(int[] arr){
        stack.addArray(arr);
    }
    
    /*** o + z ***/
    public int add(){
        int n = stack.get() + stack.get();
        stack.add(n);
        return n;
    }
    
    /*** o - z ***/
    public int subtract(){
        int n1 = stack.get();
        int n2 = stack.get();
        int result = n2 - n1;
        stack.add(result);
        return result;
    }
    
    /*** o * z ***/
    public int multiply(){
        int n = stack.get() * stack.get();
        stack.add(n);
        return n;
    }
    
    /*** o / z (Do remember ArithmeticException, z should not be 0)***/
    public int divide(){
        int n1 = stack.get();
        int n2 = stack.get();
        int result = n2 / n1;
        stack.add(result);
        return result;
    }
    
    /*** get the last number in the stack ***/
    public int get(){
        return stack.get();
    }
    
}
