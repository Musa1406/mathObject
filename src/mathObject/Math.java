package mathObject;

public class Math {
	
    public int sum(int n1,int n2) {
	  int result;
	  result=n1+n2;
	  return result;	  
    }
    public int sub(int n1,int n2) {
  	  int result;
  	  result=n1-n2;
  	  return result;
    }
    public int mult(int n1,int n2) {
    	  int result;
    	  result=n1*n2;
    	  return result;
      }
    public double divide(double n1,double n2) {
  	  double result;
  	  result=n1/n2;
  	  return result;
    }
    public double pi;
	public Math() {
		this.pi =3.14785;
	}
	public double getPi() {
		return pi;
	}
	public double areaOfCircle(double r) {
		return this.getPi()*r*r;
	}
	public double volumeOfShpere(double r) {
		return this.getPi()*r*r*r*4/3;
	}
	public double areaOfRectangularPrism(double a,double b,double h) {
		double result;
		result=a*b*h;
		return result;		
    }
	public double areaOfTriangle(double a,double b,double n2) {
		double result;
		result=a*b/n2;
		return result;
	}
	public double perimeterOfTriangle(double a,double b,double c) {
		double result;
		result=a+b+c;
		return result;
	}
	public double interiorAngleOfPolygon(double n) {
		double result;
		result=(n-2)/n*180;
		return result;
	}
	public int factoriyel(int f) {
		int result=1;
		for(int i=1;i<=f;i++) {
			result=result*i;
		}
		return result;
   }
	public int sumOfSmallNumbers(int f) {
		int result=0;
		for(int i=1;i<f;i++) {
			result=result+i;
		}
		return result;
   }
	//theSumOfTheNumbersBetween
	public int theSumOfTheNumbersBetween(int a,int b) {
		int result=0;
	    for(int i=a+1;i<b;i++) {
	    	result+=i;
	    }
		return result;
	}
}