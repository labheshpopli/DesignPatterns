package lambdaExpressions;

@FunctionalInterface
interface StringInterface{
	public String testing();
}

public class LinearSearch {

	public static void main(String[] args) {
		
		LinearSearch linearSearch = new LinearSearch();
		//System.out.println(linearSearch.search(6, new Integer[]{3, 1, 3, 2, 6, 9, 7, 6}));
		
		StringInterface sInterface = () -> {
			return "trying lambda expression";
		};
		System.out.println(sInterface.testing());
	}
	
	public int search(Integer n, Integer[] list) {
		
		for(int i = 0; i < list.length; i++) {
			if(n.intValue() == list[i].intValue()) {
				return i;
			}
		}
		return -1;
	}
}
