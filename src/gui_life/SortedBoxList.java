package gui_life;

public class SortedBoxList extends BoxList{
	public int length;
	   
	  public SortedBoxList(){
	    head = new BoxNode(null, null);
	    first = head;
	    last = head;
	    length = 0;
	  }
	   
	  public void add(Box b){
	    BoxNode i = head;
	     
	    while(i.next != null && b.getVolume() > i.next.data.getVolume()){
	     i = i.next;
	    }
	     
	    BoxNode n = new BoxNode(b,i.next);
	    i.next = n;
	    length++;
	  }
}
