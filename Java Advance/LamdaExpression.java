interface Drawable{
	public void draw(int width);
}
interface Addable{
	int add(int a, int b);
}

public class LamdaExpression {

	public static void main(String[] args) {
	 
        //with lambda  
      Drawable d2=(width)->{
            System.out.println("Drawing "+width);  
      };
      Drawable d3 = width->{
    	  System.out.println("Drawing " + width);
      };
      
      Addable add = (int a, int b)->(a+b);
      
        d2.draw(60);
        d3.draw(100);
        System.out.println(add.add(10, 20));

	}

}
