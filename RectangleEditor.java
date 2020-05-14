import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RectangleEditor{
  public static void main(String[] args) {
      MyWindow mw = new MyWindow();
        
          System.out.println("wwwww");
          
     // Board b = new Board();
  }
}
  class MyWindow extends Frame{
      MyWindow(){
          setTitle("情報実験");
          setSize(600, 400);
          setVisible(true);
          addWindowListener(new WinListener());
      }
  }

  class WinListener extends WindowAdapter{
      public void windowClosing(WindowEvent e){System.exit(0);}
  }
