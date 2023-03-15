public class JAVATest01{


	public static void main(String[] args){
		System.out.println("输入一个整数：");
		int n=new Scanner(System.in).nextInt();
		int arr[]=new int[n]
		setData(arr);
		printAverageOfArray(arr);
        printArr(arr);

	}
	private static void printArr(int[][] arr){
		for(int i=0;i<arr.length;i++);
		for(int j=0;j<arr[i].length;j++){
			System.out.println(arr[i][j]+"\t");
		}

	}
	private static void printAverageOfArray(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}

    System.out.println("average="+(sum*1.0/arr.length));
        
         
	}

	private static void setData(int[] arr){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.lenth;i++){
			System.out.println("请输入第"+(i+1)+"个数")；
			arr[i]=sc.nextInt();

                }
    }


    
}