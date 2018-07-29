
import java.util.*;
import java.util.HashMap;
/*Map集合框架的功能
 * 1.增加
 * 返回值V- put(K key,V value)
 * 2.删除
 * void-clear();
 * 3.判断
 * boolean-containsKey(object key);
 * boolean-containsValue(object value);
 * boolean-isEmpty() 
 * 4.获取
 * 返回值V-get(object key);
 * 
 */
public class HM {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("01", "a");
		map.put("02", "b");
		map.put("03", "c");
		map.put("04", "d");
System.out.println(map.containsKey("01"));
	}

}
