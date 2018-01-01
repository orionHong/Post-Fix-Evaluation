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
public class RunPostFixCalculator {
    public static void main(String[] args){
        PostFixCalculatorGUI ui = new PostFixCalculatorGUI();
        PostFixController c = new PostFixController();
        ui.addController(c);
        ui.setVisible(true);
        PostFixCalculator cal = new PostFixCalculator();
        
        c.addGUI(ui);
        c.addCalculator(cal);
    }
}
