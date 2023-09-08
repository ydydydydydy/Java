package ex02이차원배열;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1	6	11	16	21
//2	7	12	17	22
//3	8	13	18	23
//4	9	14	19	24
//5	10	15	20	25
//		int [][] num = new int[5][5];
//
//		int k=1;
//
//		for(int i=0; i<num.length; i++) {
//
//			for(int j=0; j<num[i].length; j++) {
//
//				num[j][i]=k;
//
//				k++;
//
//			}
//
//		}
//
//
//
//		//출력문구
//
//		for(int i=0; i<num.length; i++) {
//
//			for(int j=0; j<num[i].length; j++) {
//
//				System.out.print(num[i][j]+"\t");
//
//			}
//
//			System.out.println("");
//
//		}
//
//
//
//
//
//	}
//	}
//
//
////5	4	3	2	1
////10	9	8	7	6
////15	14	13	12	11
////20	19	18	17	16
////25	24	23	22	21
//int [][] num = new int[5][5];
//
//int k=1;
//
//for(int i=0; i<num.length; i++) {
//
//	for(int j=4; j>-1; j--) {
//
//		num[i][j]=k;
//
//		k++;
//
//	}
//
//}
//
//
//
////출력문구
//
//for(int i=0; i<num.length; i++) {
//
//	for(int j=0; j<num[i].length; j++) {
//
//		System.out.print(num[i][j]+"\t");
//
//	}
//
//	System.out.println("");
//
//}
//
//
//}
//
//


//1		2	3	4	5
//10	9	8	7	6
//11	12	13	14	15
//20	19	18	17	16
//21	22	23	24	25

int [][] num = new int[5][5];

int k=1;

int y=4;

for(int i=0; i<num.length; i++) {

	if(i%2==0) {

		for(int j=0; j<num.length; j++) {

			num[i][j]=k;

			k++;

		}

	}

	else {

		for(int j=num.length-1; j>=0; j--) {

			num[i][j]=k;

			k++;

		}

	}

}



//출력문구

for(int i=0; i<num.length; i++) {

	for(int j=0; j<num[i].length; j++) {

		System.out.print(num[i][j]+"\t");

	}

	System.out.println("");

}



}

}