package Test0228;


/*
470. 用 Rand7() 实现 Rand10()
已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。
不要使用系统的 Math.random() 方法。

示例 1:
输入: 1
输出: [7]
示例 2:
输入: 2
输出: [8,4]
示例 3:
输入: 3
输出: [8,1,10]
 
提示:
rand7 已定义。
传入参数: n 表示 rand10 的调用次数。
进阶:
rand7()调用次数的 期望值 是多少 ?
你能否尽量少调用 rand7() ?
 */
/*
 * 分析:
 * Rand7()生成的随机数1-7每个数字出现的概率相同，都为1/7， 用Rand7()实现 Rand10()，就要保证随机生成的1-10数字每个所占的概率相同。
 * 首先，我们当然是要将1/7这个概率降低，这样才有可能使概率分到其他数字上，这里想到的办法就是a = Rand7(), b =Rand7()，
 * sum = Rand7()+Rand7()所有结果的概率如下：
 * 且当我们指定a、b数字为几时，这种情况出现的概率为1/49，给定条件如a<=4时，b指定某个数字，这种情况出现的概率为4/49.
 * 由于我们要让1-10每个数字出现的概率相同，该方法下最小概率为1/49,最大概率为4/49,这里我们选用最大概率，这样可以减少循环次数，提高效率。
 * 确定概率为4/49，接下来就是如何分配概率的问题了。
 * Rand7()随机生成1-7每个数字的概率为1/7，要让sum为1-7每个数字出现的概率为4/49，只需要指定a或b<=4即可.
 * 要让sum为8-10同理。
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
478. 在圆内随机生成点
 给定圆的半径和圆心的 x、y 坐标，写一个在圆中产生均匀随机点的函数 randPoint 。

说明:
输入值和输出值都将是浮点数。
圆的半径和圆心的 x、y 坐标将作为参数传递给类的构造函数。
圆周上的点也认为是在圆中。
randPoint 返回一个包含随机点的x坐标和y坐标的大小为2的数组。
示例 1：
输入: 
["Solution","randPoint","randPoint","randPoint"]
[[1,0,0],[],[],[]]
输出: [null,[-0.72939,-0.65505],[-0.78502,-0.28626],[-0.83119,-0.19803]]
示例 2：
输入: 
["Solution","randPoint","randPoint","randPoint"]
[[10,5,-7.5],[],[],[]]
输出: [null,[11.52438,-8.33273],[2.46992,-16.21705],[11.13430,-12.42337]]
输入语法说明：
输入是两个列表：调用成员函数名和调用的参数。Solution 的构造函数有三个参数，圆的半径、圆心的 x 坐标、圆心的 y 坐标。
randPoint 没有参数。输入参数是一个列表，即使参数为空，也会输入一个 [] 空列表。
 */
/*
 * 分析：
 * x,y都在[0,radius]内随机，随机出的点在圆的外接正方形内，判断点是否在圆内，在的话返回，不在的话重新随机。
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