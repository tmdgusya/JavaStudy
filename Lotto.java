package jump2java;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		int[] Autonum = new int[6];
		int[] Lottonum = new int[6];
		String yn;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("로또 기계를 돌리시겠습니까?(y/n)");
		yn = sc.next();
		
		for(int i = 0; i < Lottonum.length; i++) {
			Lottonum[i] = (int)(Math.random()*45);
		}
		
		if(yn.equals("y")) {
			for(int i = 0; i < Autonum.length; i++) {
				Autonum[i] = (int)(Math.random()*45);	
				for(int k = 0; k <6; k++) {
					for(int j = 0; j <6; j++) {
						if(Lottonum[k] == Autonum[j]) {
							count++;
							}
						}
					}

		}	System.out.print("[로또결과] 이채원님, 오늘은 ");
			if(count==6) {
				System.out.print("1등입니다!, ");
			}else if(count==5) {
				System.out.print("2등입니다!, ");
			}else if(count==4) {
				System.out.print("3등입니다!, ");
			}else System.out.print("꽝입니다, ");
			
			System.out.print("뽑으신 번호 :");
			for(int i = 0; i < Autonum.length; i++) {
				System.out.print(" " + Autonum[i]);
			}
			
		}else if(yn.equals("n")){
			System.out.println("다음에 만나요.");
			System.exit(0);
		}
}
}