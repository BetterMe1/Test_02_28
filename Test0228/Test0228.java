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
/*
 * ����:
 * Rand7()���ɵ������1-7ÿ�����ֳ��ֵĸ�����ͬ����Ϊ1/7�� ��Rand7()ʵ�� Rand10()����Ҫ��֤������ɵ�1-10����ÿ����ռ�ĸ�����ͬ��
 * ���ȣ����ǵ�Ȼ��Ҫ��1/7������ʽ��ͣ��������п���ʹ���ʷֵ����������ϣ������뵽�İ취����a = Rand7(), b =Rand7()��
 * sum = Rand7()+Rand7()���н���ĸ������£�
 * �ҵ�����ָ��a��b����Ϊ��ʱ������������ֵĸ���Ϊ1/49������������a<=4ʱ��bָ��ĳ�����֣�����������ֵĸ���Ϊ4/49.
 * ��������Ҫ��1-10ÿ�����ֳ��ֵĸ�����ͬ���÷�������С����Ϊ1/49,������Ϊ4/49,��������ѡ�������ʣ��������Լ���ѭ�����������Ч�ʡ�
 * ȷ������Ϊ4/49��������������η�����ʵ������ˡ�
 * Rand7()�������1-7ÿ�����ֵĸ���Ϊ1/7��Ҫ��sumΪ1-7ÿ�����ֳ��ֵĸ���Ϊ4/49��ֻ��Ҫָ��a��b<=4����.
 * Ҫ��sumΪ8-10ͬ��
 */
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
/*
478. ��Բ��������ɵ�
 ����Բ�İ뾶��Բ�ĵ� x��y ���꣬дһ����Բ�в������������ĺ��� randPoint ��

˵��:
����ֵ�����ֵ�����Ǹ�������
Բ�İ뾶��Բ�ĵ� x��y ���꽫��Ϊ�������ݸ���Ĺ��캯����
Բ���ϵĵ�Ҳ��Ϊ����Բ�С�
randPoint ����һ������������x�����y����Ĵ�СΪ2�����顣
ʾ�� 1��
����: 
["Solution","randPoint","randPoint","randPoint"]
[[1,0,0],[],[],[]]
���: [null,[-0.72939,-0.65505],[-0.78502,-0.28626],[-0.83119,-0.19803]]
ʾ�� 2��
����: 
["Solution","randPoint","randPoint","randPoint"]
[[10,5,-7.5],[],[],[]]
���: [null,[11.52438,-8.33273],[2.46992,-16.21705],[11.13430,-12.42337]]
�����﷨˵����
�����������б����ó�Ա�������͵��õĲ�����Solution �Ĺ��캯��������������Բ�İ뾶��Բ�ĵ� x ���ꡢԲ�ĵ� y ���ꡣ
randPoint û�в��������������һ���б���ʹ����Ϊ�գ�Ҳ������һ�� [] ���б�
 */
/*
 * ������
 * x,y����[0,radius]�������������ĵ���Բ������������ڣ��жϵ��Ƿ���Բ�ڣ��ڵĻ����أ����ڵĻ����������
 */
class Solution {
	double r;
	double x;
	double y;
    public Solution(double radius, double x_center, double y_center) {
        r = radius;
        x = x_center;
        y = y_center;
    }
    
    public double[] randPoint() {
    	while(true){
    		double dx = 2*r * Math.random() -r;
            double dy = 2*r * Math.random() -r;
            if(dx*dx + dy*dy <= r*r)
            	return new double[] {x+dx, y+dy};	
    	}
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */