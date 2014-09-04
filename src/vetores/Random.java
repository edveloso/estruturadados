package vetores;

public class Random {

	
	
	public static void main(String[] args) {
		
//		for (int i = 0; i < 1000; i++) {
//			System.out.print(new java.util.Random().nextInt(1000000)+",");
//		}
//		
		
		ArrayAltonivel altonivel = new ArrayAltonivel(1000000);
		altonivel.display();
		System.out.println(altonivel.pesquisar(854177));
	}
	
}
