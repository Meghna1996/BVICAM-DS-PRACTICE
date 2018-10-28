class CountingArray{
	static int[] coutingsort(int[] arr,int len,int exp){
		int[] couting=new int[10];
		for(int i=0;i<10;i++){
			counting[arr[i]%exp]++;			
		}
		cf[0]=counting[0];
		for(int i=1;i<10;i++)
			cf[i]=counting[i]+cf[i-1];
		for(int i=len;i>=0;i--){
			output[cf[i]-1]=arr[i];
			cf[i]--;
		}
		return output;
	}
	public static void main(String[] args) {
		int[] a={4,5,32,3,5,23};
		while(i<a.length){
			max=10;
			ele=a[i];
			
			
		}
		while(i<a.length){
			exp=10;
			a=coutingsort(a,a.length,exp);
			a[i]
			
		}
	}
}