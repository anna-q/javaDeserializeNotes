package reflection;

import java.lang.reflect.*;

public class AccessAttribute {
	public static void main(String[] args) throws Exception {
		Class UserClass=Class.forName("reflection.User");
		
		Constructor constructor=UserClass.getConstructor(String.class);
		User user=(User) constructor.newInstance("leixiao");
		
		Field field= UserClass.getDeclaredField("name");
		field.setAccessible(true);// name��˽�����ԣ���Ҫ�����ÿɷ���
		field.set(user, "l3yx");
		
		System.out.println(user.getName());
	}
}