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
public interface WidgetFactory {
    public Window CreateWindow();
    public ScrollBar CreateScrollbar();
}
