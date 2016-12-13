package ds_array;

import org.testng.annotations.Test;

public class Arrfun {

	int arr[] = {11,20,33,14,7,24,12,27,3,9};
	int sum=27,n1,n2=0;
	int len = arr.length;
	
	//@Test
	public void findOnePair(){
		for(n1=0;n1<len;n1++){
			if(arr[n1]<sum){
				for(n2=n1+1;n2<len;n2++){
					if((arr[n1]+arr[n2])==sum)
						break;
				}
			if(n2!=len)
				break;
			}
		}
		if(n2==len||n2==0)
			System.out.println("No pair found in array whose sum is " + sum);
		else{
			System.out.println(sum + " is pa gya " + arr[n1] + " " + arr[n2]);
		}
	}
	
	@Test
	public void findAllPairs(){
		boolean isfound = false;
		for(n1=0;n1<len;n1++){
			if(arr[n1]<sum){
				for(n2=n1+1;n2<len;n2++){
					if((arr[n1]+arr[n2])==sum){
						System.out.println(sum + " is found in array with pair " + arr[n1] + " " + arr[n2]);;
						isfound=true;
					}
				}
			}
		}
		if(!isfound)
			System.out.println("No pair found in array whose sum is " + sum);
	}
	
}
