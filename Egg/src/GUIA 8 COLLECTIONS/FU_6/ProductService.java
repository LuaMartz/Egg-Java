/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FU_6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author juans
 */
class ProductService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public Product crearProducto() {
        System.out.print("» Nombre del producto: "); String name = read.next();
        System.out.print("» Precio del producto: $"); Integer price = read.nextInt();
        System.out.println();
        return new Product(name, price);
    }
    public void añadirProducto(HashMap<String, Integer> products) {
        System.out.println("1) AÑADIR NUEVO PRODUCTO.");
        System.out.println();
        Product p = crearProducto();
        products.put(p.getName(), p.getPrice());
    }
    public void modificarPrecio(HashMap<String, Integer> products) {
        System.out.println("3) MODIFICAR PRECIO DE UN PRODUCTO.");
        System.out.println();
        System.out.print("» Nombre de producto: "); String nameProd = read.next(); boolean find = false;
        for(String name: products.keySet()) {
            if(name.equals(nameProd)) {
                find = true;
                System.out.print("» Precio nuevo: $"); Integer price = read.nextInt();
                products.remove(name);
                products.put(nameProd, price);
            }
        }
        System.out.println();
        if(!find) {
            System.out.println("No existe el producto ingresado.");
            System.out.print("Presione intro para seguir...");
            try{System.in.read();}
            catch(IOException e){}
        }
    }
    public void eliminarProducto(HashMap<String, Integer> products) {
        System.out.println("2) ELIMINAR PRODUCTO.");
        System.out.println();
        System.out.print("» Nombre de producto: "); String nameProd = read.next(); boolean find = false;
        for(String name: products.keySet()) {
            if(name.equals(nameProd)) {
                find = true;
                products.remove(name);
            }
        }
        System.out.println();
        if(!find) {
            System.out.println("No existe el producto ingresado.");
            System.out.print("Presione intro para seguir...");
            try{System.in.read();}
            catch(IOException e){}
        }
    }
    public void mostrarProductos(HashMap<String, Integer> products) {
        System.out.println("4) MOSTRAR PRODUCTOS. ");
        System.out.println();
        if(!products.isEmpty()) {
            for(Map.Entry<String, Integer> prod: products.entrySet()) {
                System.out.println("{Nombre: " + prod.getKey() + "; Precio: $"+prod.getValue()+"}");
            }
        } else {
            System.out.println("No hay productos por mostrar.");
        }
        System.out.println();
        System.out.print("Presione intro para seguir...");
        try{System.in.read();}
        catch(IOException e){}
    }
}
