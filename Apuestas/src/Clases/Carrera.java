package Clases;

import java.util.concurrent.TimeUnit;

public class Carrera {

    Apuesta[] apuestas;
    int[] resultados; //estos son los resultados d la carrera que se ingresan ej: 7,4,1,2,3,5,6,8,10,9
    int[] punteos;
    int contador = 0;
    int cantidadApuestas;
    int pasosInsertarApuesta;
    int pasosVerificarApuesta;
    int pasosCalcularResultados;
    int pasosOrdenarResultados;
    Lista<Integer> tiempos;
    Lista<Integer> pasos;

    int cantidadApuestasAceptadas;

    public Carrera() {
    }

    public Carrera(int cantidadApuestas) {
        this.cantidadApuestas = cantidadApuestas;
        this.apuestas = new Apuesta[cantidadApuestas];
        cantidadApuestasAceptadas = 0;
        pasosInsertarApuesta = 0;
        pasosVerificarApuesta = 0;
        pasosCalcularResultados = 0;
        pasosOrdenarResultados++;
        tiempos = new Lista<>();
        pasos = new Lista<>();
    }

    public void verificarApuesta(Apuesta apuesta) {
        long primero = System.nanoTime();

        boolean[] verificador = new boolean[10];
        int[] numeros = apuesta.getPosiciones();
        for (int i = 0; i < 10; i++) {
            if (verificador[numeros[i] - 1]) {
                apuesta.setRechazo(true);
                pasosVerificarApuesta++;
                return;
            }

            verificador[numeros[i] - 1] = true;
        }
        cantidadApuestasAceptadas++;
        long ultimo = System.nanoTime();
        tiempos.add((int) TimeUnit.MICROSECONDS.convert((ultimo - primero), TimeUnit.NANOSECONDS));
    }

    public void insertarApuestas(Apuesta apuesta) {
        long primero = System.nanoTime();

        apuestas[contador] = apuesta;
        contador++;
        pasosInsertarApuesta++;

        long ultimo = System.nanoTime();
        tiempos.add((int) TimeUnit.MICROSECONDS.convert((ultimo - primero), TimeUnit.NANOSECONDS));

    }

    public void calcularResultado() {
        long primero = System.nanoTime();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < apuestas.length; j++) {
                if (!apuestas[j].isRechazo()) {
                    if (apuestas[j].getPosiciones()[i] == resultados[i]) {
                        int punteoActual = apuestas[j].getPunteo();
                        apuestas[j].setPunteo(punteoActual + 10 - i);
                        pasosCalcularResultados++;
                    }
                } else {
                    apuestas[j].setPunteo(-1);
                }
            }
        }

        long ultimo = System.nanoTime();
        tiempos.add((int) TimeUnit.MICROSECONDS.convert((ultimo - primero), TimeUnit.NANOSECONDS));
    }

    public Apuesta[] ordenarResultados() {
        Apuesta[] apuestasOrdenadas = quicksort(0, apuestas.length - 1);
        return apuestasOrdenadas;
    }

    //5 6 1 4 7 9 2 3
    public void ingresarResultados(String cadena) {
        String[] cadenaNumeros = Utils.Utils.split(cadena, ',', 10);
        resultados = new int[10];
        for (int i = 0; i < 10; i++) {
            resultados[i] = Integer.parseInt(cadenaNumeros[i]);
        }
    }

    public Apuesta[] quicksort(int izq, int der) {

        long primero = System.nanoTime();

        if (izq >= der) {
            pasosOrdenarResultados++;
            return apuestas;
        }
        int i = izq, d = der;
        if (izq != der) {
            int pivote;
            Apuesta aux;
            pivote = izq;
            pasosOrdenarResultados++;
            while (izq != der) {
                while (apuestas[der].getPunteo() >= apuestas[pivote].getPunteo() && izq < der) {
                    pasosOrdenarResultados++;
                    der--;
                }
                while (apuestas[izq].getPunteo() < apuestas[pivote].getPunteo() && izq < der) {
                    pasosOrdenarResultados++;
                    izq++;
                }
                if (der != izq) {
                    pasosOrdenarResultados++;
                    aux = apuestas[der];
                    apuestas[der] = apuestas[izq];
                    apuestas[izq] = aux;
                }
            }
            if (izq == der) {
                pasosOrdenarResultados++;
                quicksort(i, izq - 1);
                quicksort(izq + 1, d);
            }
        } else {
            pasosOrdenarResultados++;
            return apuestas;
        }

        long ultimo = System.nanoTime();
        tiempos.add((int) TimeUnit.MICROSECONDS.convert((ultimo - primero), TimeUnit.NANOSECONDS));
        return apuestas;
    }

    public String verApuestas() {
        String apuestasOrdenadas = "";

        for (Apuesta apuesta : apuestas) {
            if (!apuesta.isRechazo()) {
                apuestasOrdenadas += apuesta.getNombre() + " = " + apuesta.getPunteo() + " PUNTOS\n";
            }
        }
        return apuestasOrdenadas;
    }

    public String verApuestasRechazadas() {

        String reporte = "";

        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i].isRechazo()) {
                reporte += "Datos Apuesta Rechazada: " + apuestas[i].getNombre() + " " + apuestas[i].getPosiciones()[0]
                        + apuestas[i].getPosiciones()[1] + apuestas[i].getPosiciones()[2] + apuestas[i].getPosiciones()[3]
                        + apuestas[i].getPosiciones()[4] + apuestas[i].getPosiciones()[5] + apuestas[i].getPosiciones()[6]
                        + apuestas[i].getPosiciones()[7] + apuestas[i].getPosiciones()[8] + apuestas[i].getPosiciones()[9]
                        + " SE REPITE ALGÚN NÚMERO\n";

            }
        }

        return reporte;
    }

    public String verTiempos() {
        String reporte = "";
        int tiempoTotal = 0;
        for (int i = 0; i < tiempos.getSize(); i++) {
            tiempoTotal += tiempos.get(i);
        }

        reporte += "Promedio de tiempo = " + (tiempoTotal / tiempos.getSize())+" nano segundos";
        return reporte;
    }

    public String verPromedioPasos() {
        String reporte = "";
        int totalPasos = this.pasosCalcularResultados + this.pasosInsertarApuesta + this.pasosOrdenarResultados + this.pasosVerificarApuesta;
        reporte += "Promedio de pasos: " + (totalPasos / 4);
        return reporte;
    }

    public String calcularMayorPasos() {
        int mayor = 0;
        pasos.add(this.pasosCalcularResultados);
        pasos.add(this.pasosInsertarApuesta);
        pasos.add(this.pasosOrdenarResultados);
        pasos.add(this.pasosVerificarApuesta);
        //4 2 6 1
        mayor = pasos.get(0);
        for (int i = 0; i < pasos.getSize() - 1; i++) {

            if (mayor < pasos.get(i + 1)) {
                mayor = pasos.get(i + 1);
            }
        }
        return "Mayor cantidad de pasos: "+mayor;
    }
    
    public String calcularMenorPasos() {
        int menor = 0;
        pasos.add(this.pasosCalcularResultados);
        pasos.add(this.pasosInsertarApuesta);
        pasos.add(this.pasosOrdenarResultados);
        pasos.add(this.pasosVerificarApuesta);
        //4 2 6 1
        menor = pasos.get(0);
        for (int i = 0; i < pasos.getSize() - 1; i++) {

            if (menor > pasos.get(i + 1)) {
                menor = pasos.get(i + 1);
            }
        }
        return "Menor cantidad de pasos: "+menor;
    }

    public int getCantidadApuestasAceptadas() {
        return cantidadApuestasAceptadas;
    }

    public Apuesta[] getApuestas() {
        return apuestas;
    }

    public int[] getResultados() {
        return resultados;
    }

    public int getPasosInsertarApuesta() {
        return pasosInsertarApuesta;
    }

    public int getPasosVerificarApuesta() {
        return pasosVerificarApuesta;
    }

    public int getPasosCalcularResultados() {
        return pasosCalcularResultados;
    }

    public int getPasosOrdenarResultados() {
        return pasosOrdenarResultados;
    }

    public Lista<Integer> getTiempos() {
        return tiempos;
    }

}


/*
diego,200,3,2,1,4,6,5,7,10,9,8
irma,200,9,8,7,4,1,2,3,5,6,10
leticia,200,10,2,4,5,7,8,6,9,3,1
diego,200,3,2,1,4,6,5,7,10,9,8
irma,200,9,8,7,4,1,2,3,5,6,10
leticia,200,10,2,4,5,7,8,6,9,3,1

10,2,4,5,6,8,7,1,3,9
 */
