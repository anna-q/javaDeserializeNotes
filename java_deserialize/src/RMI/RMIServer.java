package RMI;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.*;

public class RMIServer {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
		User user=new User();//����һ��Զ�̶���
		
		Registry registry = LocateRegistry.createRegistry(1099);//���������ϵ�Զ�̶���ע���Registry��ʵ��,Ĭ�϶˿�1099
		registry.bind("user", user);//��Զ�̶���ע�ᵽRMIע���������,������Ϊuser
		
		System.out.println("server ready...");
	}
}