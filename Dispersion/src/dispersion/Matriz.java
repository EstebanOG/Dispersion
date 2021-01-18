/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersion;

/**
 *
 * @author Usuario
 */
public class Matriz {

    private int indicesCabezas[],
            numCabezas[],
            indicesDatos[],
            llaves[],
            disponibles[],
            tamArreglo,
            cantidadDatos,
            proximoDisponible=1;
    
    private String nombres[];

    public Matriz(int tamArreglo, int cantidadDatos) {
        this.cantidadDatos = cantidadDatos;
        this.tamArreglo = tamArreglo;
        this.indicesCabezas = new int[tamArreglo];
        this.numCabezas = new int[tamArreglo];
        this.indicesDatos = new int [cantidadDatos];
        this.llaves = new int[cantidadDatos];
        this.disponibles = new int[cantidadDatos];
        this.nombres = new String[cantidadDatos];
        crearMatriz();
    }

    private void crearMatriz() {
        int i;
        for (i = 0; i < tamArreglo; i++) {
            indicesCabezas[i] = i;
            numCabezas[i] = -1;
        }
        
        for (i = 0; i < cantidadDatos; i++){
            indicesDatos[i] = i+1;
            llaves[i] = 0;
            nombres[i] = "\"\"";
            disponibles[i] = i+2;
        }
        disponibles[cantidadDatos-1] = 0;
    }

    public int getProximoDisponible() {
        return proximoDisponible;
    }

    public int[] getIndicesCabezas() {
        return indicesCabezas;
    }

    public int[] getNumCabezas() {
        return numCabezas;
    }

    public int[] getIndicesDatos() {
        return indicesDatos;
    }

    public int[] getLlaves() {
        return llaves;
    }

    public int[] getDisponibles() {
        return disponibles;
    }

    public String[] getNombres() {
        return nombres;
    }
    
}
