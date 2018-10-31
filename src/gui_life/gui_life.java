package gui_life;
import gui_life.BoxGUI;

class gui_life {
	public static void main(String[] args) {
	     SortedBoxList sb = new SortedBoxList();
	     UnsortedBoxList ub = new UnsortedBoxList();
	      
	        Box[] boxes = new Box[1000]; 
	        int counter = 0;
	        TextFileInput file = new TextFileInput("boxes.txt");
	        String line = file.readLine();
	        while(line != null){
	          String[] s = line.split(",");
	          int length = Integer.parseInt(s[0]); 
	          int width =  Integer.parseInt(s[1]);
	          int height = Integer.parseInt(s[2]);
	          try
	          {
	        	  Box obj = new Box(length,width,height);
	        	  boxes[counter] = obj;
	        	  counter++;
	          }
	          catch(IllegalBoxException ibe)
	          {
	        	  System.out.println(ibe.getMessage());
	          }
	          line = file.readLine();
	        }
	        Box[] temp = new Box[counter];
	        for(int i = 0; i < counter; i++)
	        {
	        	temp[i] = boxes[i];
	        }
	        boxes = temp;
	        for(int i = 0; i < boxes.length; i++) {
	            ub.add(boxes[i]); //adding the boxes to the unsorted array
	            sb.add(boxes[i]); //adding the boxes to the sorted array
	        }
	        BoxGUI myBoxGUI = new BoxGUI(ub, sb); 
	 }
}