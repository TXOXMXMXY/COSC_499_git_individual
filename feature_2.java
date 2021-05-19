import java.util.Arrays;
public class feature_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(display());
	
	}
		public static String[] sort(String input[]){
		Arrays.sort(input);
		
		return input;
	}
	
	public static String display() {
		
		String []array= {"ABCDE","DEF","GHIH","DEFGHFFG"};
		sort(array);
		
		String output="";
		for(int i =0;i<array.length;i++) {
			output+=array[i];
		}
	
		
		return output;
	}
}
