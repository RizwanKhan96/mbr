class Test {

public static void main(String[] args) {

GeometricObject gObjectArray[] = new GeometricObject[5];
gObjectArray[0] = new Circle(4,4,4);
gObjectArray[1] = new EquilateralTriangle(3);
gObjectArray[2] = new Triangle(3,3,3);
gObjectArray[3] = new Rectangle(2, 2);
gObjectArray[4] = new Square(10);

/** Array for printing statements, I tried so many different methods to put the names but I couldn't :( */
for (int i=0; i<gObjectArray.length;i++)
		{
	System.out.println(gObjectArray[i]);
	printAreaAndPerimeter(gObjectArray[i]);
		}
	}

private static void printAreaAndPerimeter(GeometricObject gObject) {
System.out.println("The area is: " + gObject.getArea());

System.out.println("The perimeter is: " + gObject.getPerimeter());

System.out.println();

	}
}
