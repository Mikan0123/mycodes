package mypractice;

public class array {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1 dem. array
		int[] a = {10,20,30};

		// 2 dem. array y , x
		int[][] b = {
				{10, 20},
				{30, 40},
				{50, 60}
		};
		// 3 dem. array z , y , x
		//int[][][] c = new int [2][2][3];

		for (int i = 0; i < a.length ; i++) {
			System.out.println("a["+ i+ "]= "+ a[i]);
		}

		for (int j = 0; j < 3 ; j++) {
			for (int k = 0; k < b[1].length ; k++) {
				System.out.println("b["+ j+ "][" + k +"]= "+ b[j][k]);
			}
		}

	}

}
