package Teorioa.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        /*
       //ARRAYLIST
        ArrayList a = new ArrayList();  //borra y añade datos constantemente
        //Nº elementos
        System.out.println(a.size());   //0
        //Añadir
        a.add("A");
        a.add("B");
        a.add("C");
        //Mostrar
        System.out.println(a);
        //Leer
        System.out.println(a.get(1)); //a[1]   Debe devolver "B"
        //Insertar (y desplazar)
        a.add(1, "D");
        System.out.println(a);
        //Sustituir
        a.set(2, "W");
        System.out.println(a);
        //Eliminar por posición
        a.remove(2);
        System.out.println(a);
        //Eliminar por objeto
        a.remove("D");
        System.out.println(a);
        //Contiene
        System.out.println(a.contains("A"));
        */

        /*
        //ITERADORES
        ArrayList a = new ArrayList();
        Iterator it = a.iterator();  //Un iterador no se puede instanciar, se obitene a partir de un ArrayList existente. Y se configura de la cantidad de elementos que tenga
        a.add("A");
        a.add("B");
        a.add("C");

        it = a.iterator(); //Si modifico la cantidad de elementos del ArrayList, tengo que volver a obtener su iterador

        System.out.println(a);   //[A, B, C]
        System.out.println(it.hasNext()); //Me devuelve verdadero si el elemnto al cual apunto el iterador existe, por eso devuelve true, sino devuelve false
        System.out.println(it.next());  //Me devuelve el elemnto al cual apubto y avanza al siguiente
        System.out.println(it.next());
        it.remove(); //Borra el elemnto de la posición anterior
        System.out.println(a);
        */

        /*
        //RECORRER ARRAYLIST
        ArrayList a = new ArrayList();
        a.add("A");
        a.add("B");
        a.add("C");
        //For
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));  //a[i]
        }
        //Iterador
        Iterator it = a.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            //it.remove()  //OPCIONAL
        }
        //For each
        for(Object x : a){  //Para cada elemento x del ArrayList a, lo muestro
            System.out.println(x);
        }

         */
         /*
        //ARRAYLIST GENERAL (OBJECT)
        ArrayList a = new ArrayList();
        //ArrayList<Object> a = .....
        a.add("A");
        a.add(new Alumno("Pepe"));
        a.add(true);
        a.add(new Persona("Luis"));

        if(a.get(3) instanceof Persona){
            Persona p = (Persona) a.get(3);
        }

        Iterator it= a.iterator();
        //Iterator<Object> it.....
        Object x = it.next();
        if(x instanceof Persona){
            //Casting
        }
        ejemploGeneral(a);

          */

        /*
        //ARRAYLIST GENERICOS (género)
        ArrayList<Persona> a = new ArrayList<>();
                             //=  new ArrayList();
                             //=  new ArrayList<Persona>();
        //a.add("A") //NO es persona
        a.add(new Alumno("Pepe"));
        a.add(new Persona("Luis"));

        Persona p = a.get(1);
        if(a.get(0) instanceof Alumno){
            //casting
        }

        Iterator<Persona> it = a.iterator();
        Persona x = it.next();
        ejemploGenerico(a);


         */

        /*
        //CASTING ENTRE ARRAYLIST
        Persona p = new Alumno("Pepe");
        //ArrayList<Persona> a = new ArrayList<Alumno>(); //En memoria solamente se pueden almacenar alumnos y.....

         */


        //Ordenar
        //Collections.sort(a); //compareTo

        //Al --> Vector
        //Object[] v = a.toArray();

        //Vector-->Al
        //ArrayList a = new ArrayList(Arrays.asList(v));







    } //FIN MAIN
    /*
    //Hacer un método que reciba un ArrayList general y muestre los nombres de todad las personas. USando for, iterador y for each
    public static void ejemploGeneral(ArrayList a){
        //For
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) instanceof Persona){
                System.out.println(((Persona)a.get(i)).nombre);
            }
        }
        //Iterador
        Iterator it = a.iterator();
        while(it.hasNext()){
            Object x = it.next();
            if(x instanceof Persona){
                System.out.println(((Persona)x).nombre);
            }
        }

        //For each
        for(Object x : a){
            if(x instanceof Persona){
                System.out.println(((Persona)x).nombre);
            }
        }

    }

     */
/*
    public static void ejemploGenerico(ArrayList<Persona> a){
        //For
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) instanceof Persona){
                System.out.println(a.get(i).nombre);
            }
        }
        //Iterador
        Iterator<Persona> it = a.iterator();
        while(it.hasNext()){
            Persona x = it.next();
            if(x instanceof Persona){
                System.out.println(((Persona)x).nombre);
            }
        }

        //For each
        for(Persona x : a){
            if(x instanceof Persona){
                System.out.println(x.nombre);
            }
        }

    }

 */
/*
    public static void metodo(ArrayList<? extends Object> a){
        //Sirve para trabajar con cualquier ArrayList general de tipo object, sin tener que crear un método distinto para cada uno

    }
    public static void metodo2(ArrayList<? extends Persona> a){
    }

    public static <E extends Persona> void metodo3(ArrayList<E> a){

    }
    */





}