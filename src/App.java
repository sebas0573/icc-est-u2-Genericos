import java.util.ArrayList;

import models.Persona;
import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(25);
         
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        cajaString.guardar("Guardo un String");
        cajaInteger.guardar(10);
        cajaPersona.guardar(persona);

        System.out.println(cajaString.getObjeto());
        System.out.println(cajaInteger.getObjeto());
        System.out.println(cajaPersona.obtener(persona)); 

        Par<Integer, String> par = new Par<>();
        Par<String, Integer> par2 = new Par<>();

        par.establecerClave(6778);
        par.establecerValor("10");

        par2.establecerClave("8969");
        par2.establecerValor(65);

        System.out.println(par.obtenerClave());
        System.out.println(par.obtenerValor());

        System.out.println(par2.obtenerClave());
        System.out.println(par2.obtenerValor());

        Persona[] personas = new Persona[10];
        for(int i=0; i<personas.length; i++) {
            personas[i] = new Persona();
            personas[i].setNombre("Persona " + i);
            personas[i].setEdad(i + 10);
        }
        personas[0].setDatos("Luis", 56);
        personas[1].setDatos("Luisa", 11);
        personas[2].setDatos("Manuel", 54);
        personas[3].setDatos("Andrea", 15);
        personas[4].setDatos("Diego", 33);
        personas[5].setDatos("Steven", 45);
        personas[6].setDatos("Alberto", 17);
        personas[7].setDatos("Maria", 27);
        personas[8].setDatos("Juan", 12);
        personas[9].setDatos("Pedro", 42);
        for(Persona person : personas){
            System.out.println(person);
        }
        int personasMayores = 0;
        int personasMenores = 0;

        for(int i=0; i<personas.length; i++){
            if(personas[i].getEdad() >= 18){
                personasMayores++;
            }else{
                personasMenores++;
            }
        }

        Par<String,Integer>[] mayores = new Par[personasMayores];
        Par<Integer, String>[] menores = new Par[personasMenores];

        int contadorMayores=0;
        int contadorMenores=0; 

        /*for(int i=0; i<personas.length; i++){
            if(personas[i].getEdad() >= 18){
                mayores[contadorMayores] = new Par<String, Integer>();
                mayores[contadorMayores].establecerClave(personas[i].getNombre());
                mayores[contadorMayores].establecerValor(personas[i].getEdad());
            }else{
                menores[contadorMenores] = new Par<Integer, String>();
                menores[contadorMenores].establecerValor(personas[i].getEdad());
                menores[contadorMenores].establecerClave(personas[i].getNombre());
            }
        }
        System.out.println("Mayores  de edad");
        for (Par<String,Integer> parr : mayores) {
            System.out.println(parr.obtenerClave()+" --- "+parr.obtenerValor());
        }
        System.out.println("Menores de edad");
        for (Par<Integer,String> par3 : menores) {
            System.out.println(par3.obtenerValor()+" --- "+par3.obtenerClave());
        }*/
        

        
        
        

        

        

        

    }
}
