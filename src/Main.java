import com.corenetwork.modelo.Empleado;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Probar la interface SET

        HashSet conjunto=new HashSet(); //Sin usar poliformismo
        Set conjunto1 =new HashSet();  //Recomendable usar polifirmismo
        System.out.println("Esta vacio?  "+conjunto1 .isEmpty());
        System.out.println(conjunto1 .add("casa"));
        System.out.println(conjunto1 .add("casa"));
        System.out.println(conjunto1 );
        conjunto1 .add("Jardin");
        System.out.println(conjunto1 );

        System.out.println("La coleccion contiene el elemento casa? "+conjunto1 .contains("Jardín"));
        System.out.println("Numero de lementos"+conjunto1 .size());
        conjunto1 .add("Silla");
        conjunto1 .add("Mesa");
        conjunto1 .add(5);
        System.out.println(conjunto1 );
        Empleado e1=new Empleado(1);
        conjunto1 .add(e1);
        System.out.println(conjunto1 );
        System.out.println("Recorer el conjunto....");
        for (Object elemento: conjunto1 ) {
            System.out.println(elemento.toString());
        }


    }

    }