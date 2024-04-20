/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FM_Example_1;

/**
 *
 * @author malik
 */
public class WindowsDialog extends Dialog {
     @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
