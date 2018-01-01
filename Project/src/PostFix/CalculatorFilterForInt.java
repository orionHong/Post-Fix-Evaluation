/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostFix;

import javax.swing.text.DocumentFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Hongru Xiang
 */
public class CalculatorFilterForInt extends DocumentFilter{
    @Override
    public void insertString(FilterBypass fb, int offset, 
            String string, AttributeSet attr) throws BadLocationException{
        StringBuilder s = new StringBuilder(string);
        System.out.println(s);
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(!Character.isDigit(ch) && ch != '+' && ch != '-' && ch != '*' 
                    && ch != '/' && !Character.isWhitespace(ch))
                s.deleteCharAt(i);          
            
        }
        super.insertString(fb, offset, s.toString(), attr);
    }
    
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text,
            AttributeSet attrs) throws BadLocationException{
        try{
            StringBuilder s = new StringBuilder(text);

            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);

                if(!Character.isDigit(ch) && ch != '+' && ch != '-' && ch != '*' 
                        && ch != '/' && !Character.isWhitespace(ch))
                    s.deleteCharAt(i);
                
                try{
                    if(ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                        if(s.charAt(i - 1) != ' ') {
                            s.insert(i, ' ');
                            s.insert(i + 2, ' ');
                            i = i + 2;
                        }
                    }
                } catch (Exception ex){
                    s.insert(i, ' ');
                    s.append(' ');
                }
            }

            super.replace(fb, offset, length, s.toString(), attrs);
        }
        catch(NullPointerException ex){
            super.replace(fb, offset, length, text, attrs);
        }
    }
}
