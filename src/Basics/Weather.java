package Basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestions of what to wear based on the weather temperature and sun condition
		
		int temperature = 45;
		String suncondition = "Bloody";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and a t-shirt");
		
		}
		else if (temperature > 60 && suncondition == "Sunny") {
			System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}
		else if (temperature > 50 || suncondition == "Overcast" || suncondition == "Bloody") {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
		
		System.out.println("The program is ending");
		
	}
	
}
