
package explicacioncadenas;
import java.util.Arrays;
public class ExplicacionCadenas {
    
    public static void main(String[] args) {
        System.out.println("Metodos para operar con cadenas de caracteres");
        
        System.out.println("charAt");
        
        String cadena = "Esto es una cadena de Java";
        String cadena1 = "esto es una cadena de Java";
        String cadena3 = "   Esto   est   una   cadena  trim   ";
        
        
        System.out.println("\t");
        System.out.println("\t" + cadena);
        System.out.println("");
        //System.out.println("\tMuestra el caracter 5: " + cadena.charAt(4));
        ////////////////////////////////////////////////////////////////////////
        System.out.println("compareTo");
        System.out.println("\tEl valor es:" + cadena.compareTo(cadena1));
        System.out.println("\t\tNegativo significa cadena precede a cadena1");
        System.out.println("\t\tPositivo significa cadena posterior a cadena1");
        System.out.println("\t\tCero significa iguales\n");
        ////////////////////////////////////////////////////////////////////////
        System.out.println("comparteToIgnoreCase");
        System.out.println("\tEl valor es:" + cadena.compareToIgnoreCase(cadena1)
        + "\n");
        ////////////////////////////////////////////////////////////////////////
        System.out.println("concat");
        System.out.println("\tConcatenar las cadenas: " + cadena.concat(cadena1) + 
                "\n");
        ////////////////////////////////////////////////////////////////////////
        System.out.println("contains");
        System.out.println("\tLa cadena contiene: " + cadena.contains("Java"
        + "\n"));
        ////////////////////////////////////////////////////////////////////////
        System.out.println("endsWith");
        System.out.println("\t" + cadena.endsWith("Java") + "\t");
        ////////////////////////////////////////////////////////////////////////
        System.out.println("equals");
        System.out.println("\t" + cadena.equals(cadena1) + "\n");
        ////////////////////////////////////////////////////////////////////////
        System.out.println("equalsIgnoreCase");
        System.out.println("\t" + cadena.equals(cadena1) + "\n");
        ////////////////////////////////////////////////////////////////////////
        System.out.println("indexOf");
        System.out.println("\t" + cadena.indexOf("a", cadena.indexOf("a")+1) + "\n");
        ////////////////////////////////////////////////////////////////////////
        System.out.println("lastIndexOf");
        System.out.println("\t" + cadena.lastIndexOf("a", cadena.lastIndexOf("a")-1));
        ////////////////////////////////////////////////////////////////////////
        System.out.println("isEmpty");
        System.out.println("\t" + cadena.isEmpty());
        ////////////////////////////////////////////////////////////////////////
        System.out.println("length");
        System.out.println("\tLa longitud es: " + cadena.length());
        ////////////////////////////////////////////////////////////////////////
        System.out.println("replace");
        System.out.println("\t" + cadena.replace("Java", "Javaaaaa"));
        ////////////////////////////////////////////////////////////////////////
        System.out.println("startsWith");
        System.out.println("\t" + cadena.startsWith("Esto"));
        System.out.println("\t" + cadena.startsWith("esto"));
        ////////////////////////////////////////////////////////////////////////
        System.out.println("subString");
        System.out.println("\t" + cadena.substring(5));
        System.out.println("\t" + cadena.substring(5,6));
        ////////////////////////////////////////////////////////////////////////
        System.out.println("toCharArray");
        char cadenaChar [] = cadena.toCharArray();
        System.out.println("\t" + cadenaChar[5]);
        ////////////////////////////////////////////////////////////////////////
        System.out.println("toLowerCase");
        System.out.println("\t" + cadena.toLowerCase());
        ////////////////////////////////////////////////////////////////////////
        System.out.println("toUpperCase");
        System.out.println("\t" + cadena.toUpperCase());
        ////////////////////////////////////////////////////////////////////////
        System.out.println("trim");
        System.out.println("\t" + cadena3.trim());
        ////////////////////////////////////////////////////////////////////////
        System.out.println("split");
        String palabras [] = cadena.split(" ");
        System.out.println("\t" + Arrays.toString(palabras));
    }
    
}
