package reflection;

public class Exec {
	public static void main(String[] args) throws Exception {
		//java.lang.Runtime.getRuntime().exec("calc.exe");
		
		Class runtimeClass=Class.forName("java.lang.Runtime");
		
		Object runtime=runtimeClass.getMethod("getRuntime").invoke(null);// getRuntime�Ǿ�̬������invokeʱ����Ҫ�������
		runtimeClass.getMethod("exec", String.class).invoke(runtime,"calc.exe");
	}
}