package pe.edu.ltmj.util;

import pe.edu.ltmj.exception.CustomException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileUtils {


    private String path = "C:\\images";

    public InputStream getFileData(String fileName) throws FileNotFoundException, CustomException {

        InputStream in = null;
        File file = new File(path+"\\"+fileName);

        if (file.exists()){
            in = new FileInputStream(file);
            return in;
        }

        else
            throw new CustomException("Archivo no encontrado en la ruta del servidor");


    }
}
