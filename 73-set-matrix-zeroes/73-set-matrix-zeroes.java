class Solution {
    public void setZeroes(int[][] arr) {
      	int mat1[]=new int[arr.length];
		int mat2[]=new int[arr[0].length];
		Arrays.fill(mat1,1);
		Arrays.fill(mat2,1);
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[0].length;j++){
		       if(arr[i][j]==0){
		           
		           mat1[i]=0;
		           mat2[j]=0;
		       }
		    }
		   
		}
		 //System.out.println(Arrays.toString(mat1));
		for(int i=0;i<mat1.length;i++){
		    if(mat1[i]==0){
		        for(int j=0;j<arr[0].length;j++){
		            arr[i][j]=0;
		        }
		    }
		}
		for(int i=0;i<mat2.length;i++){
		    if(mat2[i]==0){
		        for(int j=0;j<arr.length;j++){
		            arr[j][i]=0;
		        }
		    }
		}
	/*	for(int i=0;i<arr.length;i++){
		    
		    for(int j=0;j<arr[0].length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		   System.out.println();
		}
		*/
	}
}
  
        
        
