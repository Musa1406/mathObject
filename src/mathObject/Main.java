package mathObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math=new Math();
		System.out.println(math.sum(5,13));
		System.out.println(math.sub(13,5));
		System.out.println(math.mult(13,5));
		System.out.println("B�l�m :" + math.divide(13,5));
		System.out.println(math.getPi());
		System.out.println(math.areaOfCircle(5));
		System.out.println(math.volumeOfShpere(3));
        System.out.println(math.areaOfRectangularPrism(3, 4, 6));
        System.out.println("��genin Alan� :"+math.areaOfTriangle(5, 4, 2));
        System.out.println("��genin �evresi :"+math.perimeterOfTriangle(5, 4, 2));
        System.out.println(math.interiorAngleOfPolygon(3));
        System.out.println(math.factoriyel(5));
        System.out.println(math.sumOfSmallNumbers(5));
        System.out.println(math.theSumOfTheNumbersBetween(3, 6));
	}

}
