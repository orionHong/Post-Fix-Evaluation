/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostFix;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hongru Xiang
 */
public class PostFixController {
    private PostFixCalculatorGUI ui;
    private PostFixCalculator cal;
    
    
    PostFixController (PostFixCalculatorGUI ui, PostFixCalculator cal){
        this.ui = ui;
        this.cal = cal;
    }
    
    PostFixController(){
        
    }
    
    public void addGUI(PostFixCalculatorGUI ui){
        this.ui = ui;
    }
    
    public void addCalculator(PostFixCalculator cal){
        this.cal = cal;
    }
    
    public void doCalculation(){
        boolean isChar = ui.getIsChar();
        if(isChar)
            doCalculationChar();
        else
            doCalculationInt();
    }
    
    public void doCalculationInt(){
        try{
            Equation e = ui.getSelectedEquation();
            if(e.getIsValid()){
                String s = e.getEquation();
                
                Scanner input = new Scanner(s);
                
                while(input.hasNext()){
                    String str = input.next();
                    if(str.equals("+")){
                        cal.add();
                        continue;
                    }
                    if(str.equals("-")){
                        cal.subtract();
                        continue;
                    }
                    if(str.equals("/")){
                        cal.divide();
                        continue;
                    }
                    if(str.equals("*")){
                        cal.multiply();
                        continue;
                    }
                    
                    int n = Integer.parseInt(str);
                    System.out.println("n is " + n);
                    
                    cal.readIn(n);
                }
                
                e.setResult(cal.get());
            }
            else{
                e.setResult(0);
            }
        } catch(NullPointerException ex){
            
        }
    }
    
    public void doCalculationChar(){
        try{
            Equation e = ui.getSelectedEquation();
            if(e.getIsValid()){
                String s = e.getEquation();
                
                Scanner input = new Scanner(s);
                
                while(input.hasNext()){
                    String str = input.next();
                    
                    if(str.equals("+")){
                        cal.add();
                        continue;
                    }
                    if(str.equals("-")){
                        cal.subtract();
                        continue;
                    }
                    if(str.equals("/")){
                        cal.divide();
                        continue;
                    }
                    if(str.equals("*")){
                        cal.multiply();
                        continue;
                    }
                    
                    int n = (int)str.charAt(0);
                    
                    cal.readIn(n);
                }
                
                e.setResult(cal.get());
            }
        } catch(NullPointerException ex){
            
        }
    }
    
    public void resetId(Equation e){
        int idx = e.getId();
        e.setIndex(idx + 1);
    }
    
    
    /*** Display Error Message Window ***/
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(ui, errorMessage);
    }
}
