package gui_life;

public abstract class BoxList{
  public BoxNode head;
  public BoxNode first;
  public BoxNode last;
  public int length;
  
  public BoxList(){
    head = new BoxNode(null, null);
    first = head;
    last = head;
    length = 0;
  }
  
  public void append(Box b){
    BoxNode n = new BoxNode(b, null);
    last.next = n;
    last = n;
    length++;
  }
  
  @Override 
  public String toString(){
    String result = "";
    BoxNode i = head.next;
    while(i != null){
      result += i.data.toString() + "\n";
      i = i.next;
    }
    return result;
  }
} 
