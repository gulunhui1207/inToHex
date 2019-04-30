package intToHex;
/**
 * 输入一个十进制的数，转换成十六进制输出
 * 
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>succez</p>
 * @author 刘永卓
 * @createdate 2019年4月30日
 */
import java.util.Scanner;
public class ToHex {
	/**
	 * 将这个数不断与16相除取余，将余数变成字符存在字符数组中，然后生成字符串
	 *
	 * @param number
	 * @return 
	 */
	public static StringBuilder intToHex(int number){
		int i=0;
		StringBuilder str= new StringBuilder();
	    char  hex[]=new char[100];
		if(number==0){
			str.append('0');
			return str;
		}
	    while(number!=0){
			int t=number%16;
			if(t>=0 && t<10){
				hex[i]=(char)(t+'0');
				i++;
			}else{
				hex[i]=(char)(t+'A'-10);
				i++;
			}
			number=number/16;
		}
		for (int j=i-1;j>=0;j--)
        {  
            str.append(hex[j]);        
        }
		return str;
	}
	/**
	 * 判断输入的数字是不是整数，如果不是则用Exception来捕获这个异常，然后返回-1
	 *
	 * @param sc
	 * @return 
	 */
	public static int input(Scanner sc){
		int number;
		while(true) {							
			try {
				number = sc.nextInt();			
				break;							
			}catch(Exception e) {				
				System.out.println("您输入的不是整数");
				return -1;			
				}
			}
		return number;
	}
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int num=0;
		num=input(sc);
		if(num>=0){
			str=intToHex(num);
			System.out.println(str);
		}else{
			System.out.println("输入失败请重新输入");
		}
	}
}
