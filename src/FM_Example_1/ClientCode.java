/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FM_Example_1;

/**
 *
 * @author malik
 */
public class ClientCode {
     private static Dialog dialog;
     
     public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
     
     
     static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
            dialog = new WindowsDialog();
        }
    }
     
     
      static void runBusinessLogic() {
        dialog.renderWindow();
    }
     
}
