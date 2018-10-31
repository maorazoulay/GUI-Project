package gui_life;

public class BoxNode{
  protected Box data;
  protected BoxNode next;
  
  public BoxNode(Box data, BoxNode next){
    this.data = data;
    this.next = next;
  }
}