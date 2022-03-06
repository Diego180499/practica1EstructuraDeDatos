package Utils;

public class Utils {

    /**
     * para convertir la linea en datos
     * @param cadena
     * @return 
     */
    public static String[] miSplit(String cadena) {
        String[] datos = new String[12];
        String dato = "";
        int posicion = 0;
        for (int i = 0; i < cadena.length(); i++) {
            
            if (Character.toString(cadena.charAt(i)).equals(",")) {
                datos[posicion] = dato;
                dato = "";
                posicion++;
                continue;
            }
            dato += cadena.charAt(i);
            if (i == cadena.length() - 1) {
                datos[posicion] = dato;
                dato = "";
            }
        }
        
        return datos;
    }
    
    public static String[] toTextLine(String cadena, int tamanio) {
        String[] lineas = new String[tamanio];
        String linea = "";
        int posicion = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.toString(cadena.charAt(i)).equals("\n")) {
                lineas[posicion] = linea;
                linea = "";
                posicion++;
                continue;
            }
            linea += cadena.charAt(i);
            if (i == cadena.length() - 1) {
                lineas[posicion] = linea;
                linea = "";
            }
        }
        
        return lineas;
    }
    
    /**
     * para leer nuestra area de texto
     * @param texto
     * @param caracter
     * @param tamaño
     * @return 
     */
    public static String[] split(String texto, char caracter, int tamaño) {
        String[] datos = new String[tamaño];
        StringBuilder palabra = new StringBuilder("");
        int posicion = 0;
        for (int i = 0; i < texto.length(); i++) {
            char temp = texto.charAt(i);
            if (posicion >= tamaño) {
                return datos;
            }
            if (temp == caracter){
                datos[posicion] = palabra.toString();
                palabra.setLength(0);
                posicion++;
                continue;
            }
            palabra.append(texto.charAt(i));
            if (i == texto.length() - 1 ) {
                datos[posicion] = palabra.toString();
                palabra.setLength(0);
            }
        }
        return datos;
    }
    
    

}
