package Test0228;

/*
470. �� Rand7() ʵ�� Rand10()
���з��� rand7 ������ 1 �� 7 ��Χ�ڵľ��������������дһ������ rand10 ���� 1 �� 10 ��Χ�ڵľ������������
��Ҫʹ��ϵͳ�� Math.random() ������

ʾ�� 1:
����: 1
���: [7]
ʾ�� 2:
����: 2
���: [8,4]
ʾ�� 3:
����: 3
���: [8,1,10]
 
��ʾ:
rand7 �Ѷ��塣
�������: n ��ʾ rand10 �ĵ��ô�����
����:
rand7()���ô����� ����ֵ �Ƕ��� ?
���ܷ����ٵ��� rand7() ?
 */
public class Test0228 {
	public static void main(String[] args) {
		System.out.println(1);
		
	}
}
/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
//class Solution extends SolBase {
//    public int rand10() {
//        int a = rand7();
//        int b = rand7();
//        while(true){
//        	if(a<=4)
//        		return b;
//        	else if(b<=4)
//        		return a+3;
//        	else{
//        		a = rand7();
//        		b = rand7();
//        	}
//        }
//    }
//}
//public class Test0228 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		
//	}
//}