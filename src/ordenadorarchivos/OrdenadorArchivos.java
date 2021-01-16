package ordenadorarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 *
 * @author hervi
 */
public class OrdenadorArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Metodos m = new Metodos();
        
        // Extensiones
        String imagenes = "01-IMAGENES";
        String extImagenes[] = {".png",".jpg",".jpeg",".gif",".ico"};
        
        String videos = "02-VIDEOS";
        String extVideos[] = {".mp4",".avi",".flv",".mov",".mkv",".wmv"};
        
        String documentos = "03-DOCUMENTOS";
        String extDocumentos[] = {".pdf",".txt",".doc",".word",".docx",".xlsx"};
        
        String audios = "04-AUDIOS";
        String extAudio[] = {".mp3",".wav",".wma"};
        
        String otros = "05-OTROS";
        String extOtros[] = {".rar",".exe",".sql",".iso",".apk",".ova",".zip"};
        
        //Creamos directorios
        m.crearDirectorio(imagenes);
        m.crearDirectorio(videos);
        m.crearDirectorio(documentos);
        m.crearDirectorio(audios);
        m.crearDirectorio(otros);
        
        //Leimos los archivos y guardamos en una lista
        File ruta = new File("C:/Users/hervi/Desktop/pruebas");// directorio que ordenaremos
        String [] listaContenido = ruta.list();
        
        //Comparamos y guardamos
        m.listarContenido(extImagenes, listaContenido, imagenes);
        m.listarContenido(extVideos, listaContenido, videos);
        m.listarContenido(extDocumentos, listaContenido, documentos);
        m.listarContenido(extAudio, listaContenido, audios);
        m.listarContenido(extOtros, listaContenido, otros);
        
        
    }
    
}
