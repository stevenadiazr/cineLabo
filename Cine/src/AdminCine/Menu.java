package AdminCine;

import java.util.Scanner;

public class Menu {
    static Scanner in = new Scanner(System.in);
    
    public static void menu() {
        Cine cine = new Cine();
        boolean flag = true;
        int continuar;
      
        while(flag){
            System.out.println("----------MENU----------");
            System.out.println("1. Para Ingresar cine");
            System.out.println("2. Para ver información del cine");
            System.out.println("3. Para actualizar información del cine");
            System.out.println("4. Para agregar una nueva función");
            switch(in.nextInt()){
            case 1:
                in.nextLine();
                crearCine(cine); break;
            case 2:
                mostrarCine(cine);
            case 3:
                modificarCine(cine);
            case 4:
                //agregarFuncion(cine);
            default:
                System.out.println("Error, ingrese un valor correcto");
                menu();
            } 
            System.out.println("Presione 1 para continuar");
            continuar = in.nextInt();
            if (continuar == 1){                
            } else{
                System.out.println("Programa finalizado");
                flag = false;
            }
        }
        
    }
    
    public static Cine crearCine(Cine cine){
        System.out.println("Ingrese nombre del cine:");
        cine.setNombreCine(in.nextLine());
        System.out.println("Presione 1 para ingresar lema, otra tecla para no hacerlo");
        if(in.nextInt() == 1){
            in.nextLine();
            System.out.println("Ingrese lema:");
            cine.setLemaCine(in.nextLine());
        }else{
            in.nextLine();
        }
        return cine;
    }
    
    public static Cine modificarCine(Cine cine){
        System.out.println("1. Para modificar nombre");
        System.out.println("2. Para modificar lema");
        System.out.println("3. Para modificar ambos");
        switch(in.nextInt()){
            case 1:
                in.nextLine();
                System.out.println("Ingrese nombre del cine:");
                cine.setNombreCine(in.nextLine());
                break;
            case 2:
                System.out.println("Ingrese lema del cine:");
                cine.setLemaCine(in.nextLine());
                break;
            case 3:
                System.out.println("Ingrese nombre del cine:");
                cine.setNombreCine(in.nextLine());
                System.out.println("Ingrese lema del cine:");
                cine.setLemaCine(in.nextLine());
                break;
            default:
                System.out.println("Error, ingrese un valor correcto");
                menu();
            } 
        return cine;
    }
    
    public static void mostrarCine(Cine cine){
        //aqui va el toString de cine
        if (cine.getNombreCine() == null && cine.getLemaCine() == null){
            System.out.println("No se ha ingresado ningún cine aún");
        }
        else if(cine.getLemaCine() == null){
            cine.setLemaCine("No tiene");
        }
        else{
            System.out.println(cine.toString());            
        }
    }
    
}
