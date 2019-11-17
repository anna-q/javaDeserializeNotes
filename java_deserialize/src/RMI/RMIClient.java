package RMI;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.*;

public class RMIClient {
	public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
		Registry registry = LocateRegistry.getRegistry("localhost",1099);
		IUser user = (IUser)registry.lookup("user");// ��Registry�м���Զ�̶���Ĵ��/����
		
		user.setName("leixiao");// ����Զ�̶���ķ���
		System.out.println(user.getName());
	}
}