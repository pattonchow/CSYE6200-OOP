package workspace_2021_9_yao_zhou_Factory1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	public void writeTextFile(String fileName, List<String>wData) {
		try(BufferedWriter out = new BufferedWriter(new FileWriter(fileName))){
			for(String line : wData) {
				out.write(line);
				out.newLine();
			}
			out.flush();
		}catch(IOException e) {
			System.err.println("ERROR: writong '" + fileName + "'");
			e.printStackTrace();
		}
		
	}
	
	public List<String>readTextFile(String fileName){
		List<String>rData = new ArrayList<>();
		
		try(BufferedReader in = new BufferedReader(new FileReader(fileName))){
			String data = null;
			while((data = in.readLine()) != null) {
				rData.add(data);
			}
		}catch(FileNotFoundException e) {
			System.err.println("ERROR: reading file '" + fileName + "'");
			e.printStackTrace();
		}catch(IOException e) {
			System.err.println("ERROR: reading file '" + fileName + "'");
			e.printStackTrace();
		}
		return rData;
	}

}
