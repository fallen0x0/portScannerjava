package port;

import java.net.Socket;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.Scanner;
public class PortScan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o host");
		String host = sc.nextLine();
		int portas = 65535;
		int timeout = 200; //milisegundos
		
		for (int i=0; i <= portas; i++) {
			try{
				Socket socket = new Socket();
				socket.connect(new InetSocketAddress(host , i), timeout);
				System.out.println(host + "\tPorta: " + i + " Aberta");
			}catch(IOException e) 
			{
				
			}
		}
		sc.close();
	}
	
	
}
