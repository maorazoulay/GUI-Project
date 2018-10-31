package gui_life;

import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JFrame;

public class SearchGUI extends JFrame {
	SortedBoxList sb;
	public SearchGUI(SortedBoxList sb) {
		setLayout(new GridLayout(1,1));
	    this.sb = sb;
	    getContentPane().add(new TextArea(sb.toString()));
	    setLocation(100,100);
	    setSize(400, 200);
	    setTitle("Search Results");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	}
}
