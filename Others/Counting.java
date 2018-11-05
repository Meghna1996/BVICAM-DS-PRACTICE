import java.util.Scanner;

class CountingArray{
	static int[] coutingsort(int[] arr,int len,int exp){
		//int[] couting=new int[10];
		int[] counting = new int[10];
		for(int i=0;i<10;i++){
			counting[arr[i]%exp]++;			
		}
		int[] output = new int[len];
		int[] cf = new int[10];
		cf[0]=counting[0];
		for(int i=1;i<10;i++)
			cf[i]=counting[i]+cf[i-1];
		for(int i=len;i>=0;i--){
			output[cf[arr[i]%exp]-1]=arr[i];
			cf[arr[i]%exp]--;
		}
		arr=output;
	}
	public static void main(String[] args){
		int[] a={4,5,32,3,5,23};
		int max=a[0],i=1;
		while(i<a.length){
			if(max<a[i])
				max=a[i];			
		}

		int k=0;
		do{
			max=max/10;
			k++;
		}while(max>0);
		i=1;
		while(k>0){
			int exp = Math.pow(10,i);
			coutingsort(a,a.length,exp);
			k--;
			i++;
		}
	}
}