package java_Assignments;

public class GenericSwapCode {

	public static <T> void swap(T[] arr,int a, int b)
	{
		T temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer nums[]= {6,8,2,4};
		swap(nums,0,1);
		for(int i:nums)
		{
			System.out.println(i +",");
		}
		
	}

}
