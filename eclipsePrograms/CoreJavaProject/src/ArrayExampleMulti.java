public class ArrayExampleMulti {

	public static void main(String[] args) {
			
		int marks[][]= {  
				{10,20,30 },
				{25,35,45}
		};
		
		/*
		 * System.out.println(marks[0][0]); System.out.println(marks[0][1]);
		 * System.out.println(marks[0][2]); System.out.println(marks[1][0]);
		 * System.out.println(marks[1][1]); System.out.println(marks[1][2]);
		 */
		
		
		
		
		  for(int i=0;i<marks.length;i++) {
			  for(int j=0;j<3;j++)
			  {
		  System.out.println(marks[i][j]+" ");
		  }
			  
			  
			  System.out.println();
			  
		  }
		
	}

}
