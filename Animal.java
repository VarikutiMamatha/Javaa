package abc;
 class Animals {
	void sound() {
		System.out.println("animal amke sound");
	}
 }
 
 class dog extends Animals  {
	 void sound() {
		 System.out.println("Dogs barks");
	 }
}
 class cat extends Animals  {
	 void sound() {
		 System.out.println("cat meows");
	 }
}
 public class Animal{
	 public static void main(String[]args) {
		 Animals a1=new Animals();
	 	 Animals a2 = new dog();
	 	 Animals a3 = new cat();
	 		a1.sound();
	 		a2.sound();
	 		a3.sound();
		 
		
	}
	 
 }
