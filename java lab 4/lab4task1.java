
class lab4task1{
public static void main(String[]args){


int[] numb={3,65,7,99,87,5,32,34};
int largest =0;
int secondlargest=-1;
for(int i=0;i<numb.length;i++)
{
	if(numb[i]>largest)
	{
		largest=numb[i];
		
		
	}
}
System.out.println("Largest : "+largest);


for(int i=0;i<numb.length;i++)
{
	if(numb[i]>secondlargest&&numb[i]<largest)
	{
		secondlargest=numb[i];
		
		
	}
}

System.out.println("Second Largest : "+secondlargest);













}


}








