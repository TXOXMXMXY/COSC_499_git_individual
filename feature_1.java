import java.util.*;
public class feature_1 {


public static void main(String args[]) {
	
System.out.println(print());
}
	
public static Integer[] sortable(Integer[] a) {
	Arrays.sort(a,Collections.reverseOrder());
return a;
}

public static String print() {
	
	Integer[]array= {23,24,15,26,27,28,29};
	String output="";
	sortable(array);

	for(int i =0;i<array.length;i++) {
	 output+=array[i].toString();
	}
	return output;
}
}