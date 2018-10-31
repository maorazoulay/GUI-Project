package gui_life;

public class Box{
  public int length;
  public int width;
  public int height;
   
  public Box(){
    length = 1;
    width = 1;
    height = 1;
  }
   
  public Box(int initialLength, int initialWidth, int initialHeight){
    if(initialLength < 1 || initialWidth < 1 || initialHeight < 1)
      throw new IllegalBoxException("Length, Width or Height cannot be less than 1");
    length = initialLength;
    width = initialWidth;
    height = initialHeight;
  }
   
  public void setLength(int length){
    if(length < 1)
      throw new IllegalArgumentException("Length cannot be less than 1");
    this.length = length;
  }
   
  public int getLength(){
    return length;
  }
   
  public void setWidth(int width){
    if(width < 1)
      throw new IllegalArgumentException("Width cannot be less than 1");
    this.width = width;
  }
   
  public int getWidth(){
    return width;
  }
   
  public void setHeight(int height){
    if(height < 1)
      throw new IllegalArgumentException("Height cannot be less than 1");
    this.height = height;
  }
   
  public int getHeight(){
    return height;
  }
  public int getVolume(){
    return length * width * height;
  }
  public String toString(){
    String str = "L:"+length + " W:" + width + " H:" + height + " (V: " + getVolume() + ")";
    return str;
  }
  public boolean equals(Object o){
     Box b = (Box) o;
     if(length == b.length && width == b.width && height == b.height){
       return true;
     }
     return false;
  }
}