package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;


class son{
	public static double chen(double a,double b)
	{
		return a*b;
	}
	public static double chu(double a,double b)
	{
		return a/b;
	}
	public static int yu(int a,int b)
	{
		return a%b;
	}
}
public class cal {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		//测试包装类的自动装箱和拆箱
		Integer x=Integer.valueOf(200);//自动装箱
		int y=x.intValue();//自动拆箱
		Character c=Character.valueOf('w');
		/**
		 * IO流的步骤
		 * 1、源
		 * 2、流
		 * 3、操作
		 * 4、关闭资源
		 */
		//String path="D:\\myProgram\\Workspaces\\MyEclipse 2017 CI\\test\\dl.txt";
		//String path="D:/myProgram/Workspaces/MyEclipse 2017 CI/test/dl.txt";
		
		/*try {
			b = path.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		//System.out.println(b.toString());
		
		//String path="D:"+File.separator+"myPrograme"+File.separator+"Workspaces"+File.separator+"MyEclipse 2017 CI"+File.separator+"text"+File.separator+"dl.text";
		File file=new File("src/test/cal.java");
		File copyFile=new File("zd.txt");
		String msg="IO Output Test!!!";
		//System.out.println(file.getAbsolutePath());
		OutputStream out=new FileOutputStream(copyFile,true);
		InputStream in=new FileInputStream(file); 
		byte[] flash=new byte[1024];
		//byte[] flash=msg.getBytes();//字符串->字节码（编码）
		//byte[] b={"D:\myProgram\Workspaces\MyEclipse 2017 CI\test\dl.txt"};
		try {
			int len=-1;
			while((len=in.read(flash))!=-1){
				out.write(flash,0,flash.length);
			}					
			out.flush();//刷新缓冲器中的数据
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
			try {
				if(out!=null)//保证在出现异常是也能正常关闭资源
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(in!=null)//保证在出现异常是也能正常关闭资源
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//测试String类
		String s=null;
		String t="aaabbb";
		StringBuilder ss=new StringBuilder("abcdefg");
		
		Date time=new Date();
		
		s=t.substring(2,5);
		s=t.substring(2, 4);
		System.out.println(s);
		
		/*System.out.println(son.chen(6,7));
		System.out.println(son.chu(7,6));
		System.out.println(son.yu(6,7));*/
	}

}
