package Array;

import java.util.Scanner;

public class Bai12 {
	public static int[][] A = new int[100][100];
	public static int[][] B = new int[100][100];
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhap ma tran vuong cap:");
		int n = sc.nextInt();
		nhap(A, n);
		
		System.out.println("Ma tran vua nhap: ");
		xuat(A, n);
		
		System.out.println("Ma tran xoay 90 do nguoc chieu kim dong ho");
xoay90(A, n);
	}

	public static void nhap(int A[][], int n) {
		System.out.println("nhap ma tran:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = sc.nextInt();
			}
		}
	}

	public static void xuat(int A[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void xoay90(int A[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				B[i][j] = A[j][n - 1 - i];
			}
		}
		xuat(B, n);
	}
}
