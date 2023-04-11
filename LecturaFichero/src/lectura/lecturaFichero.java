package lectura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class lecturaFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo;
		FileWriter fichero = null;
        //PrintWriter pw = null;
        FileWriter p2;
		try {
		archivo = new File ("C:/Users/Isidro Camacho/Desktop/ficheros/documentolectura.txt");
		FileReader fr = new FileReader (archivo);
		p2=new FileWriter(archivo,true);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(p2);
		PrintWriter out = new PrintWriter(bw);
		String linea = br.readLine();
		System.out.println(linea);
		
       // pw = new PrintWriter(archivo);
       // p2=new FileWriter(archivo,false);
        out.println("linea3 uirjghfujgurgtb");
        out.close();
        br.close();
        
		}catch(Exception e) {
			
		}
		finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           }catch (Exception e2){
	              e2.printStackTrace();
	           }
		}


	}
	
}
