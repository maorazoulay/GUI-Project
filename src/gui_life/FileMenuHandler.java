package gui_life;

import gui_life.BoxGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FileMenuHandler implements ActionListener {
   BoxGUI jframe;
   private int usersVolume;
   private SortedBoxList boxesThatCanFitIntoTheUser;
   private SortedBoxList fromOurBoxesTxtFile;
   public FileMenuHandler (BoxGUI jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) {
      String  menuName;
      menuName = event.getActionCommand();
      if (menuName.equals("Search"))
         search(); 
   }
   private void search( ) {
       String line = JOptionPane.showInputDialog("Enter the length, width and height");
       String[] s = line.split(",");
       int length = Integer.parseInt(s[0]); 
       int width =  Integer.parseInt(s[1]);
       int height = Integer.parseInt(s[2]);
       usersVolume = length*width*height;
       fromOurBoxesTxtFile = jframe.sb;
        filter();
       SearchGUI sg = new SearchGUI(boxesThatCanFitIntoTheUser);
       
    } //search
   private void filter() {
	   
	   BoxNode obj = fromOurBoxesTxtFile.head.next;
	   while(obj != null) {
		   if(obj.data.getVolume() >= usersVolume) {
			   boxesThatCanFitIntoTheUser.add(obj.data);
		   }
		   obj = obj.next;
	   }
	   
   }
   
}
