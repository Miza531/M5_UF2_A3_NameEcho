package m5_uf2_a3_nameecho;

import java.util.Scanner;

public class M5_UF2_A3_NameEcho {
    
     public String CheckNameEcho(String nombreCompleto) {
        
        Scanner lector = new Scanner(System.in);
        String nombre1, nombre2, nombreRestante, apellido, nombres, nombreResultado;

        nombreCompleto = nombreCompleto.trim();
    
    
        // Buscamos si el usuario ha introducido los apellidos
        if (nombreCompleto.indexOf(" ") > - 1) {
    
            // Separamos el primer nombre y el resto (podría haber un segundo nombre y el apellido)
            nombre1 = nombreCompleto.substring(0, nombreCompleto.indexOf(" "));
            nombreRestante = nombreCompleto.substring(nombreCompleto.indexOf(" ") + 1);
    
            if (nombreRestante.indexOf(" ") > -1) {
    
                //Si ha introducido un segundo nombre, lo separamos de su apellido
                nombre2 = nombreRestante.substring(0, nombreRestante.indexOf(" "));
                apellido = nombreRestante.substring(nombreRestante.indexOf(" ") + 1);
                nombres = nombre1.concat(" " + nombre2);
                nombreResultado = nombres.concat(" " + apellido.toUpperCase());
                //retornamos el nombre resultante
                return nombreResultado;
    
            } else {
                nombreResultado = nombre1.concat(" " + nombreRestante.toUpperCase());
                //retornamos el nombre resultante
                return nombreResultado;
            }
    
        } else {
            //retornamos el nombre completo
            return nombreCompleto;
        }
    
    }
    
}
