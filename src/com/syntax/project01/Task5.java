package com.syntax.project01;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0; int odd=0;
int[] [] num= {{1,2,3,4},{5,6,7,8}};
for(int i=0; i<num.length; i++) {
	for(int j=0; j<num[i].length; j++) {
		if(num[i][j]%2==0) {
	even+=num[i][j];
			}else {
			odd+=num[i][j];	
			}
		
}
		
}
System.out.println("even sum= "+even);
System.out.println("odd sum= "+odd);

	}

}
