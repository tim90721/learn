package first;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.hw1();
	}
	
	public void practice() {
		Scanner sc;   //sc�O�ܼơB���y
		sc = new Scanner(System.in);   	//�⥦new(��Ҥ�)�X��
										//(system.in)�O��L�W����J
		int a;   //a�O�ܼ�
		int b;   //b�O�ܼ�
		int c;   //c�O�ܼ�
		a = sc.nextInt();   //sc�O�ܼ�  //nextInt()�O�ʧ@�A�|�^��int
		b = sc.nextInt();   //sc�O�ܼ�  //nextInt()�O�ʧ@�A�|�^��int
		c = sc.nextInt();   //sc�O�ܼ�  //nextInt()�O�ʧ@�A�|�^��int
		String middle;   //�O(=�ŧi ���N��)�@�Ӧr��smiddle
		middle = "middle~~~~~~";   //���w��middle�@�Ӧr��
		String biggerA;   //�O(=�ŧi ���N��)�@�Ӧr��sbiggerA
		biggerA = "bigger~~~~~~";   //���w��biggerA�@�Ӧr��
		String smallerC;   //�O(=�ŧi ���N��)�@�Ӧr��ssmallerC
		smallerC = "smaller~~~~~~";   //���w��smallerC�@�Ӧr��
		if (a < c && c < b) {   //if�O���p�B�ΨӧP�_����  //�A����������
			System.out.print(middle);   //��ܥX"�ܼ�middle"�̪��r��
		}
		else if (c>a) {   //else if�O���p�B�ΨӧP�_����  //�A����������
			System.out.print(biggerA);   //��ܥX"�ܼ�biggerA"�̪��r��
		}
		else if (c<b) {   //else if�O���p�B�ΨӧP�_����  //�A����������
			System.out.print(smallerC);   ////��ܥX"�ܼ�"�̪��r��
		}
	}
	public void hw1() {
		 int n;   //�ŧi�@��int���ܼ�
		 String nod;   //�ŧi�@�Ӧr��
		 Scanner sc;   //���p�@��scanner���ܼ�
		 sc = new Scanner(System.in);   //�⥦new(��Ҥ�)�X��
			                         	//(system.in)�O��L�W����J
		 n = sc.nextInt();   //sc�O�ܼ�  //nextInt()�O�ʧ@�A�|�^��int(���ͤ@�ӼƦr�ᵹn)
		 nod = "nod! nod! nod!";   //�r��]�w
		 for(int a=0 ; a<n ; a++) {   //for�j��(��l�A�j�鵲�����������A�C���j�鵲���ɭn������)
			 System.out.println(nod);   //�j����ܥXnod�r��
		 }
	}
}
