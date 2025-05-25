class lab9task2{
	
static String isPalindrome(String str){
	String result="";
	String rev="";
	for(int i=str.length()-1;i>=0;i--){
		rev=rev+str.charAt(i);
	}
	if(str.equals(rev)){
		result="true";
	}
	else{
		result="false";
	}
	return result;
}

	public static void main(String[]args){


System.out.println(isPalindrome("hello"));





	}
}