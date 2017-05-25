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
public class WindowsWidgetFactory implements WidgetFactory{

    @Override
    public Window CreateWindow() {
        return new WindowsWindow();
    }

    @Override
    public ScrollBar CreateScrollbar() {
        return new WindowsScrollBar();
    }
    
}
