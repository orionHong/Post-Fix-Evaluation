/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PostFix;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author xiang-h
 */
public class Equation implements Serializable{
    private StringBuilder equation;
    private int result;
    private boolean isValid = true;
    private static int index = 0;
    private int id;
    private boolean isChar = false;
    
    public Equation(){
        id = index++;
        equation = new StringBuilder("");
        result = 0;
    }
    
    public Equation(String s, boolean state) {
        id = index++;
        equation = new StringBuilder(s);
        result = 0;
        
        isChar = state;
        
        if(!isChar)
            checkValidityInt();
        else
            checkValidityChar();
    }
    
    public void insertLoad(){
        equation.insert(0, "<Loaded>");
    }
    
    public boolean getIsValid(){
        return isValid;
    }
    
    public int getResult(){
        return result;
    }
    
    public String getEquation(){
        return equation.toString();
    }
    
    public int getIndex(){
        return index;
    }
    
    public int getId(){
        return id;
    }
    
    public boolean getIsChar(){
        return isChar;
    }
    
    /*** Check validity for Int ***/
    public void checkValidityInt(){
        isValid = true;
        
        int numberCounter = 0;
        int symbolCounter = 0;
        int count = 0;
        
        Scanner input = new Scanner(equation.toString());
        
        while(count < 2){
            String str = input.next();
            
            if(str.equals("+") || str.equals("-") || str.equals("/") 
                || str.equals("*")){
                isValid = false;
                return;
            }   
            
            numberCounter++;
            count++;
        } 
        
        System.out.println("Before while loop");
        
        while(input.hasNext()){
            String s = input.next();
            System.out.println("s is " + s);
            if(s.length() == 1){
                char ch = s.charAt(0);
                if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
                    if(++symbolCounter > numberCounter){
                        isValid = false;
                        return;
                    }    
                    continue;
                }
                numberCounter++;
                System.out.println(numberCounter);
                continue;
            }
            numberCounter++;
            
            
        }
        
        if(symbolCounter != numberCounter - 1 || numberCounter == 1)
            isValid = false;
    }
    
    /*** Check validity for Char ***/
    public void checkValidityChar(){
        isValid = true;
        int charCounter = 0;
        int symbolCounter = 0;
        
        Scanner input = new Scanner(equation.toString());
        
        String str = input.next();

        if(str.equals("+") || str.equals("-") || str.equals("/") 
                || str.equals("*")){
            isValid = false;
            return;
        }
        
        charCounter++;
        
        while(input.hasNext()){
            String s = input.next();
            if(s.length() == 1){
                char ch = s.charAt(0);
                if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
                    if(++symbolCounter > charCounter){
                        isValid = false;
                        return;
                    }    
                }
                else
                    charCounter++;
            }
            else{
                isValid = false;
                return;
            }
        }
        if(symbolCounter != charCounter - 1 || charCounter == 1)
            isValid = false;
    }
    
    public void setEquation(String newEquation, boolean state){
        equation.replace(0, equation.length(), newEquation);
        isChar = state;
        
        if(!isChar)
            checkValidityInt();
        else
            checkValidityChar();

    }
    
    public void setResult(int newResult){
        result = newResult;
    }
    
    public void setIndex(int n){
        index = n;
    }
    
    public void setIsChar(boolean state){
        isChar = state;
    }
    
    @Override
    public String toString(){
        if(isValid)
            return "ID " + id + ": " + equation.toString();
        else
            return "ID " + id + ":(Invalid) " + equation.toString();
    }
}
