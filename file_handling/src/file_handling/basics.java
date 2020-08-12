package file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class basics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File set=new File("D:\\omegaa.txt");
		set.createNewFile();
		
		
		
		
		
		
BufferedWriter bff=new BufferedWriter(new FileWriter("D:\\omegaa.txt"));
bff.write("jai ho");
		bff.close();
		FileInputStream FT=new FileInputStream(set);
		int i2;
		while((i2=FT.read())!=-1)
				{
			System.out.print((char)i2);
				}
		}}

	


	


