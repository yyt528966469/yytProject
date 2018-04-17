package yyt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		getData();
	}
	public static String getData(){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("resource/MessageMeta.json"));
			StringBuffer s=new StringBuffer("!");
			String str=null;
			while((str=br.readLine())!=null){
				s.append(str);
			}
			System.out.println(s.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
	}
}
