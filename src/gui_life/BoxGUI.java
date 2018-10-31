package gui_life;

import java.awt.*; 
import javax.swing.*;
 
public class BoxGUI extends JFrame {
  JMenuItem item;
  SortedBoxList sb;
  
     public BoxGUI(UnsortedBoxList ub, SortedBoxList sb){
         setLayout(new GridLayout(1,2));
         this.sb = sb;
         getContentPane().add(new TextArea(ub.toString()));
         getContentPane().add(new TextArea(sb.toString()));
         setLocation(100,100);
         setSize(400, 200);
         setTitle("My Box GUI");
         createMenu();
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
     }
     private void createMenu(){
    	    JMenuBar menuBar = new JMenuBar();
    	    JMenu ToolsMenu = new JMenu("Tools");
    	    FileMenuHandler fmh  = new FileMenuHandler(this);
    	    item = new JMenuItem("Search");
    	    item.addActionListener(fmh);
    	    ToolsMenu.add(item);

    	    setJMenuBar(menuBar);
    	    menuBar.add(ToolsMenu);
    	  }
}