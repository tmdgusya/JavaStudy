
import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class LotteryMachine_ChanWookJeong {
    public static void main(String[] args) {
        //컴퓨터가 추첨한 6개의 랜덤한 숫자를 numbers라는 리스트에 저장//


        ArrayList com_numbers = new ArrayList ();
        while(7 > com_numbers.size()) {
            int i = (int) (Math.random() * 45) + 1;
            if (com_numbers.contains(i) == false){
                com_numbers.add(i);
            }
        }

        // 사용자가 직접 1 ~ 45의 숫자들 중 6개의 숫자를 뽑아서 새로운 리스트에 넣음//
        //중복이 되거나 범위를 초과할 경우 다시 입력하라는 메시지를 띄우게 함.//

        // 사용자가 입력한 숫자를 user_input에 저장함//
        ArrayList user_numbers = new ArrayList();

        //user_input의 크기가 6이 될때까지 입력문을 띄울거임//
        while (user_numbers.size()<7){
            System.out.println("숫자를 입력하세요");
            Scanner sc = new Scanner(System.in);
            int user_input = sc.nextInt();

            // 사용자가 입력한 숫자가 리스트에 존재하지 않는다면 입력한 숫자를 리스트에 넣을거임.//
            if(user_numbers.contains(user_input) == false) {

                //사용자가 입력한 숫자가 범위를 벗어나면 다시 입력하라는 메시지를 띄울거임//
                if (user_input < 1 || user_input > 45) {
                    System.out.println("범위를 벗어난 숫자입니다. 다시 입력해주세요.");
                    continue;
                }
                user_numbers.add(user_input);
            }else {//만약에 숫자가 리스트에 이미 있으면 되돌아가서 다시 입력하게 할거임//
                System.out.println("중복된 숫자입니다. 다시 입력해주세요.");
                continue;
            }

        }

/* 사용자가 뽑은 6개의 숫자가 컴퓨터가 뽑은 숫자들의 리스트 'com_numbers'내에 있다면 그 갯수에 따라서
등수를 정함. 6개 다 있으면 1등, 5개면 2등, 4개면 3등, 그 미만은 비 당첨자.
당첨번호, 사용자가 뽑은 번호 내역, 당첨여부를 출력한다.
 */
        // j는 맞춘 숫자의 갯수를 의미//
        int j = 0;
        for (int i = 0; i<user_numbers.size(); i++) {
            if (com_numbers.contains(user_numbers.indexOf(i)) == true) {
                j++;
            }
        } if (j == 6) {
            System.out.println("당첨번호 : " + com_numbers + " 뽑으신 번호 : " + user_numbers + ", 축하합니다 1등 당첨입니다.");
        }else if (j == 5) {
            System.out.println("당첨번호 : " + com_numbers + " 뽑은신 번호 : " + user_numbers + ", 축하합니다. 2등당첨입니다");
        }else if (j == 4) {
            System.out.println("당첨번호 : " + com_numbers + " 뽑으신 번호 : " + user_numbers + ", 축하합니다. 3등 당첨입니다.");
        }else {
            System.out.println("당첨번호 : " + com_numbers + " 뽑으신번호 : " + user_numbers + ", 아쉽지만 당첨내역이 없습니다");
        }

    }
}
