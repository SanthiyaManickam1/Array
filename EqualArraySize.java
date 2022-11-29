import java.util.*;
public class EqualArraySize {
	 static class pair{
		 int one,two;
		 public pair(int one,int two)
		 {
			 this.one = one;
			 this.two=two;
		 }
		 
	 }
	 static void  findElement(int arr[],int n,int x)
	 {
		 HashMap<Integer,pair> map = new HashMap<Integer,pair>();
		 for(int i=0;i<n-1;i++)
		 {
			 for(int j =i+1;j<n;j++)
			 {
				 map.put(arr[i]+arr[j],new pair(i,j));
			 }
		 }
		 
		 
		 for(int i=0;i<n-1;i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 int sum = arr[i] + arr[j];
				 if(map.containsKey(x-sum))
				 {
					 pair p =map.get(x-sum);
				 
				 if(p.one != i&&p.one!=j)
				 {
					 System.out.println(arr[i] + ", "+ arr[j]+","+arr[p.one]+","+ arr[p.two]);
					 return;
				 }
				 }
			 }
		 }
	 }
		 
	 
	 

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n= sc.nextInt();
		int arr[] = {1,2,3,4,5,9,8};
		int n = arr.length;
		int x = 16;
		
		findElement(arr,n,x);
	
		

	}

}
