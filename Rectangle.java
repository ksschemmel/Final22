package FinalExam;

public class Rectangle {
	
private int height;
private int width;

public int getheight() {
	return height;
}
public int getwidth() {
	return width; 
	}
public void setheight(int height) {
	this.height = height;}
public void setwidth(int width) {
	this.width = width;}
public int areaRec() {
	int area = height*width;
	return area;
}
public int periRec() {
	int peri = 2*(height+width);
	return peri;
}
public static void main(String[] args) {
	Rectangle obj = new Rectangle();
	obj.setheight(10);
	obj.setwidth(20);
	System.out.println("The area is " +  obj.areaRec());
	System.out.println("The perimeter is "+ obj.periRec());
	

	}
}



