package gui_life;

public class UnsortedBoxList extends BoxList{
  public BoxNode head;
  public BoxNode first;
  public BoxNode last;
  public int length;
  
  public UnsortedBoxList(){
    head = new BoxNode(null, null);
    first = head;
    last = head;
    length = 0;
  }
  
  public void add(Box b){
    append(b);
  }
}
