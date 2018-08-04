
import java.util.*;
import java.util.HashMap;
/*Map集合框架的功能
 * 1.增加
 * 返回值V- put(K key,V value),如果添加相同的键，后添加的值会覆盖原来的值，并返回原来的值
 * 2.删除
 * 返回值V-remove（object K);
 * void-clear();
 * 3.判断
 * boolean-containsKey(object key);
 * boolean-containsValue(object value);
 * boolean-isEmpty() 
 * 4.获取
 * 返回值V-get(object key);//获取某个键的值，也可以判断某个键是否存在
 * size();//获取长度
 * 返回值 Collection<V>-values();//获取所有的值
 * 返回值Set<Map.Entry<K,V>>-entrySet();返回此映射中包含的映射关系的 Set 视图。
 * 返回值 Set<K>-keySet();//返回此映射中包含的键的 Set 视图
 * 
 */
public class HM {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("01", "a");//无序
		map.put("02", "b");
		map.put("03", "c");
		map.put("04", "d");
		map.put(null, "e");//HashMap里面null是可以作为key存在的
System.out.println(map.containsKey("01"));
System.out.println(map.containsValue("b"));
System.out.println(map.isEmpty());

System.out.println(map);
//map.remove("03");
//map.clear();
System.out.println(map.size());

Collection<String> coll=map.values();//返回值是Collection<>
System.out.println(coll);
System.out.println(map.values());

System.out.println(map.get(null));//null不用加引号，但是不常用



	}

}
