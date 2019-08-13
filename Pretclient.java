import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Pretclient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		
		java.util.Scanner scan=new java.util.Scanner(System.in);
		String send="",receive;
		String ipaddr;
		System.out.println("Enter your partners ip address to continue");
		ipaddr=scan.next();
		Socket drive=new Socket(ipaddr,8898);
		DataInputStream dis=new DataInputStream(drive.getInputStream());
		DataOutputStream dos=new DataOutputStream(drive.getOutputStream());
		while(true) {
			send=scan.nextLine();
			dos.writeUTF(send);
			receive=dis.readUTF();
			if(receive.equals("QUIT")) {
				System.out.println("Ashok Wants to quit now");
				dos.writeUTF("QUIT");
				break;
			}
			System.out.println("AShok:  "+receive);
		}
		drive.close();
		scan.close();
		System.out.println("*******THE END*********");
	}
}
