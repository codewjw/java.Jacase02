package Day06;
/**
 * 当自定义类型元素需要作为Map中的Key使用时，通常要注意
 * API文档上也有说说明：
 * 当一个类需要重写equals方法是就应该连同重写hasCode方法
 * 并且重写时要注意：
 * 
 * 
 * 当连个对象equals比较为true时，hasCode方法返回的数字
 * 必须相同。反之虽然不是必须的，但也尽量保证两个对象的
 * hasCode值若相同，equals比较应为true，否则会在HasMap
 * 中产生链表，影响查询功能
 * 
 * hasCode方法返回的数字应当时一个稳定的值，即：在参与
 * equals比较的属性值没有改变的前提下，多次调用
 * hasCode方法返回的数字应当是一样的
 * 
 * 
 * @author 逐忆成书丶
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}
