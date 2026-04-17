package java8Features;

import java.util.function.Consumer;

public class Q01_VehicleMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q01_Vehicle vehicle = new Q01_Vehicle();
		
		Runnable drumBrake = vehicle::applyBrake;
		drumBrake.run();
		
		Consumer<String> diskBrake = vehicle::applyBrake;
		diskBrake.accept("Disk");
		

	}

}
