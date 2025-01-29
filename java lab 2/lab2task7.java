class lab2task7{
public static void main(String[]args)
{

int[] array={34,6,76,56,6,9,86,34,65,23};
int max=array[0];
int min=array[0];
for(int i=0;i<array.length;i++)
{

System.out.println(array[i]);

}

	for(int i=0;i<array.length;i++)
	{
		if(array[i]>max)
		{
		max=array[i];
		}
		
		if(array[i]<max)
		{
		min=array[i];
		}

	}
System.out.println("Maximum : "+max);
System.out.println("Minimum : "+min);

if(max%2==0)
{
System.out.println("The maximum number is divisible by 2 :) ");
}
else
{
System.out.println("The maximum number is not divisible by 2 :(");
}





}
}