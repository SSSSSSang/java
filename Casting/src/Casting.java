import java.util.Scanner;

public class Casting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.println("���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.println("���� ���� �Է� : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double ave = sum / 3;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + ave);
		
		sc.close();
	}
}