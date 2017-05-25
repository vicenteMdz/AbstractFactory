/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondiseñoabstractfactory;

/**
 *
 * @author VICENTE
 */
public class PatronDiseñoAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WidgetFactory factory = new WindowsWidgetFactory();
        Window w = factory.CreateWindow();
        ScrollBar sb = factory.CreateScrollbar();
        w.render();
        sb.render();
        
        
        factory = new MacWidgetFactory();
        w = factory.CreateWindow();
        sb = factory.CreateScrollbar();
        w.render();
        sb.render();
    }
    
}
