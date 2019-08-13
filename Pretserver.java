package Network1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Pretserver {
	public static void main(String[] args) throws IOException {
		
		ServerSocket socku=new ServerSocket(8898);
		
		Socket drive=socku.accept();
		
		DataInputStream dis=new DataInputStream(drive.getInputStream());
		
		DataOutputStream dos=new DataOutputStream(drive.getOutputStream());
		
		String send,receive;
		
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			receive=dis.readUTF();
			if(receive.equals("QUIT")) {
				dos.writeUTF("QUIT");
				System.out.println("Prethiv wants to quit");
				break;
			}
			System.out.println("Prethiv:   "+receive);
			send=scan.nextLine();
			dos.writeUTF(send);
			
		}
		socku.close();
		scan.close();
		
		System.out.println("*******THE END********");
		
	}
}
