import java.awt.*;
import java.awt.event.*;  
 public class SimpleAWTApp {  
    SimpleAWTApp() {  
        Frame frame = new Frame("AWT Example");  
        Button button = new Button("Click Me!");  

        button.setBounds(50, 100, 80, 30);  
        frame.add(button);  

        frame.setSize(300, 200);  
        frame.setLayout(null);  
        frame.setVisible(true);  

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }  

    public static void main(String[] args) {  
        new SimpleAWTApp();  
    }  
}
