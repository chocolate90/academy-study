package basic;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 학생 정보를 저장하는 배열 3개
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];

		// 현재 사람수가 몇명이 저장되어 있는지 알기 위한 변수
		int count = 0;
		// index(위치)를 조정하기 위한 변수
		int index = -1;

		es:while(true) {
			System.out.println("[info] 고객수: " + count + ", 현재위치: " + index );
			System.out.println("[menu] (i). Insert, (p).Prev, (n)Next, (c)Current, (u)Update, (d)Delete, (q)Quit");
			String menu = scan.next();

			switch (menu) {
			case "i":
				System.out.println("============고객 정보 입력 ============");
				/*
				 * 이름, 성별, 나이를 입력받아서 배열에 순서대로 저장
				 * 사람수 증가
				 */
				System.out.print("이름>");
				String name = scan.next();
				System.out.print("성별>");
				String gender = scan.next();
				System.out.print("나이>");
				int age = scan.nextInt();

				nameList[count] = name; 
				genderList[count] = gender;
				ageList[count] = age;
				count++;
				index++;

//				System.out.println(Arrays.toString(nameList));
//				System.out.println(Arrays.toString(genderList));
//				System.out.println(Arrays.toString(ageList));

				System.out.println("==================================");
				break;
			case "p":
				System.out.println("============이전 고객 정보============");
				/*
				 * index번호가 0이하면 "이전 정보가 없습니다" 출력
				 * 그렇지 않으면 index를 이동해서 이전 고객정보를 보여준다.
				 */
				if(index > 0) {

					System.out.println(nameList[index-1]);
					System.out.println(genderList[index-1]);
					System.out.println(ageList[index-1]);
					index -= 1;
				} else {
					System.out.println("이전 정보가 없습니다.");
				}

				System.out.println("=================================");
				break;
			case "n":
				System.out.println("============다음 고객 정보============");
				/*
				 * 다음 고객정보를 출력할 수 없는 조건을 고려해서 "다음 정보가 없습니다" 출력(index, count와 연관이 있다.)
				 * 그렇지 않으면 index를 이동하고 다음 고객정보를 보여준다.
				 */

				
				if(count-1 > index) {
					System.out.println(nameList[index+1]);
					System.out.println(genderList[index+1]);
					System.out.println(ageList[index+1]);

					index ++;;
				} else {
					System.out.println("다음 정보가 없습니다.");
				}
				
				System.out.println("=================================");
				break;
			case "c":
				System.out.println("============현재 고객 정보============");
				/*
				 * 현재 고객정보를 출력할 수 있는 조건을 고려해서 현재 정보를 출력해준다.
				 * 힌트) index은 ??(위치) 보다 커야하고 ??(사람수) 보다 작아야한다.
				 */
				if(count > index) {
					System.out.println(nameList[index]);
					System.out.println(genderList[index]);
					System.out.println(ageList[index]);
				}
				

				System.out.println("=================================");
				break;
			case "u":
				System.out.println("============현재 정보 수정============");
				/*
				 * 현재 고객정보를 출력할 수 있는 조건을 고려해서 스캐너를 통해 이름, 성별, 나이를 수정한다.
				 */
				System.out.println("찾을 정보>");
				String info = scan.next();
				

				System.out.println("=================================");
				break;
			case "d":
				System.out.println("============현재 정보 삭제============");
				/*
				 * 현재 고객정보를 삭제할 수 있는 조건을 고려해서 현재 위치부터 뒤에 있는 배열요소를 당겨와서 덮어 씌운다.
				 * 고객수 감소.
				 */

				System.out.println("=================================");
				break;
			case "q":
				// while문을 탈출시키고 종료
					break es;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
				break;
			}
		}

	}
}
