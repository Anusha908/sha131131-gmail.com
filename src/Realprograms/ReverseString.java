package Realprograms;

public class ReverseString {


	public static void main(String[] args) {
		
		//Using StringBuffer
		StringBuffer ref = new StringBuffer ("Google");
		System.out.println(ref.reverse());
		
		//String rev="";
		String S="Yahoo";
		for(int i =S.length()-1; i>=0; i--) {
			char rev =S.charAt(i);
			System.out.println(rev);
		}
		
		
		String rev1="";
		String S1="Bing";
		for(int i =S1.length()-1; i>=0; i--) {
			 rev1 =rev1+S1.charAt(i);
			
		}
		System.out.println(rev1);
	}

}
