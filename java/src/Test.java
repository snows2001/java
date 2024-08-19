public class Test {

	public static void main(String[] args) {

		try {
			
			int[] intArray = new int[3];
			System.out.println(intArray[3]);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
