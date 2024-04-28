package JavaExercise;

public class creatingVarAndMethodsBike {
	
	public static void main(String[] args) {
		Increaseacceleration(20);
		// creating a object
		// className variable/objectName = new Constructor;
		creatingVarAndMethodsBike bike = new creatingVarAndMethodsBike("Pink");
		System.out.println(bike.getColor());
	}
	
	int  noOfGears = 3;
	String color;
	
	public creatingVarAndMethodsBike() {        //explicit constructor parameterless
		color = "Red";
	}
	
    public creatingVarAndMethodsBike(String color) {  //explicit parameterized
		this.color = color;
	}
	public static void Increaseacceleration(int speed) {
		System.out.println("Speed increases by:" +speed);
		
	}
	
	public  String getColor() { 
		
		return color;
	}

}
