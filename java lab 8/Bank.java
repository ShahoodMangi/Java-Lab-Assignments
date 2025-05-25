class Bank{
	

	double getInterest(){
	return 0;
	}
	public static void main(String[]args){

		Bank sbi=new SBI();
		Bank icici=new ICICI();
		Bank hdfc=new HDFC();
		System.out.println("SBI Interest : "+sbi.getInterest());
		System.out.println("ICICI Interest : "+icici.getInterest());
		System.out.println("HDFC Interest : "+hdfc.getInterest());
	}
}