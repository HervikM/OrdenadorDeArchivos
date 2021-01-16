/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenadorarchivos;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author hervi
 */
public class Metodos {

    public void crearDirectorio(String nombre) {
        File directorio = new File("C:/Users/hervi/Desktop/pruebas/" + nombre);//direccion donde se ordenaran los archivos
        directorio.mkdir();
    }

    public void listarContenido(String extension[], String[] listaContenido, String tipoArchivo) {
        //LIsta el contenido
        for (int i = 0; i < extension.length; i++) {
            for (int j = 0; j < listaContenido.length; j++) {
                if (listaContenido[j].endsWith(extension[i])) {
                    System.out.println(extension[i] + " :" + listaContenido[j] + "");

                    Path rutaFuente = Paths.get("C:/Users/hervi/Desktop/pruebas/"+ listaContenido[j]); //directorio o carpeta  que ordenaremos
                    Path rutaDestino = Paths.get("C:/Users/hervi/Desktop/pruebas/" + tipoArchivo + "/"); // carpeta donde se guardaran

                    if (rutaFuente.toFile().exists()) {
                        try {

                            Files.move(rutaFuente, rutaDestino.resolve(rutaFuente.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                            System.out.println("Archivos movidos con exito");

                        } catch (Exception e) {
                            System.err.println("Error ->  " + e.getMessage());
                        }
                    } else {
                        System.out.println("El archivo no se a encontrado");
                    }
                }
            }
        }
    }

}
