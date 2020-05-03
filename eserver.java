import java.io.*; 
import java.net.*; 
 
public class Echoserver 
{
 public static void main(String args[])throws Exception
 { 
try
 {
 int Port;
 BufferedReader Buf =new BufferedReader(new InputStreamReader(System.in)); 
System.out.print(" Enter the Port Address : " ); 
Port=Integer.parseInt(Buf.readLine()); 
ServerSocket sok =new ServerSocket(Port); 
System.out.println(" Server is Ready To Receive a Message. ");
 System.out.println(" Waiting ..... "); 
Socket so=sok.accept(); 
if(so.isConnected()==true)         
 System.out.println(" Client Socket is Connected Succecfully. "); 
InputStream in=so.getInputStream(); 
OutputStream ou=so.getOutputStream(); 
PrintWriter pr=new PrintWriter(ou); 
BufferedReader buf=new BufferedReader(new InputStreamReader(in));
 String str=buf.readLine(); 
System.out.println(" Message Received From Client : " + str);
 System.out.println(" This Message is Forwarded To Client. "); 
pr.println(str); 
pr.flush(); 
}  
catch(Exception e)  
 {
   System.out.println(" Error : " + e.getMessage());
 }
 }
 }
