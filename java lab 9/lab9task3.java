class lab9task3{
	
	static int LongestUniqueSubString(String str){

String letter="";
for(int i=str.length()-1;i>=0;i--){
if(letter==str.charAt(i)){

}
else{
	letter=str.charAt(i);
}


}
int size=letter.length();
return size;

	}





	public static void main(String[]args){


System.out.println(LongestUniqueSubString("abcabcbb"));






	}
}