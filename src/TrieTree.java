import java.lang.*;
/*String类常见操作
 * 1.获取
 * 1.1获取长度int length();
 * 1.2获取某个位置上字符char charAt(i);
 * 1.3.1 int indexOf(int ch);//获取字符在字符串中第一次出现的位置.
 * 之所以参数类型是int 是因为强制类型转换字符为Unicode
 * 1.3.2 int indexOf(int ch,int fromindex)//从fromindex指定位置开始，获取字符在字符串中的位置
 * 1.3.3 int indexOf(String str);//获取子字符串在字符串中第一次出现的位置.
 * 
 * 1.3.4 int indexOf(String str,int fromindex)//从fromindex指定位置开始，获取子字符串在字符串中的位置
 * 2.判断
 * 2.1字符串是否以指定内容开头//boolean startsWith(str);
 * 2.2字符串是否以指定内容结尾//boolean endsWith(str);
 * 2.3字符串中是否为空//boolean isEmpty();//==length()返回0;
 * 2.4字符串是否有指定子字符串//boolean contains(str);//==indexOf(str)返回-1;
 * 2.5判断字符串内容是否相同//boolean equals(str);
 * 2.6判断字符串内容是否相同，并忽略大小写//boolean equalsIgnoreCase(str);
 * 3.转换
 * 3.1将字符数组转换成字符串
 *字符串是类，是不可以变它的内容的。字符数组是数组，是可以改变数组中包含的内容的。
 *3.1.1构造函数String (char[]);
 *String(char[],offset,count);//将字符数组的一部分转换为字符串，offset为起始点，count为个数;
 *3.1.2静态方法（没有访问到成员变量的方法，静态好处：不需要新建对象，用类就可以调用）
 *static String copyValueOf(char[]);
 *static String copyValueOf(char[],offset,count);
 *static String valueOf(char[]);//和copyValueOf的区别是valueOf还可以把基本数据类型转换成字符串
 * *static String valueOf(char[],offset,count);

 * 3.2将字符串转换成字符数组//**重点
 * char[]-toCharArray();
 * 4.替换
 * String replace(old char,new char);//如果要替换的字符不存在，返回的还是原串
 * String replace(CharSequence target, CharSequence replacement)//
 * 使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 * 5.切割
 * String[]-split(String regex)//根据给定正则表达式的匹配拆分此字符串。
 

 * 
 * 
 * 
 * 
 */
public class TrieTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String a="abc";
            System.out.println(a.indexOf("c"));//
            
  
	}

}
