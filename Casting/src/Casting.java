import java.util.Scanner;

public class Casting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double ave = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + ave);
		
		sc.close();
	}
}
