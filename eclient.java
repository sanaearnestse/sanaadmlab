import java.io.*; 
import java.net.*; 
 public class Echoclient 
{ 
public static void main(String args[]) throws Exception
 { 
try {
int Port; 
BufferedReader Buf =new BufferedReader(new InputStreamReader(System.in)); 
System.out.print(" Enter the Port Address : " );
 Port=Integer.parseInt(Buf.readLine()); 
Socket sok=new Socket("localhost",Port); 
if(sok.isConnected()==true)      
 System.out.println(" Server Socket is Connected Succecfully. ");
 InputStream in=sok.getInputStream(); 
OutputStream ou=sok.getOutputStream(); 
PrintWriter  pr=new PrintWriter(ou); 
BufferedReader buf1=new BufferedReader(new InputStreamReader(System.in));
 BufferedReader buf2=new BufferedReader(new InputStreamReader(in));
 String str1,str2; 
System.out.print(" Enter the Message : "); 
str1=buf1.readLine(); 
pr.println(str1); 
pr.flush(); 
System.out.println(" Message Send Successfully. "); 
str2=buf2.readLine();
 System.out.println(" Message From Server : " + str2);   
   }   
catch(Exception e)
   {
    System.out.println(" Error : " + e.getMessage());
  }
 }
 }   
