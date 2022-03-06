package Clases;

public class Apuesta {

    private String nombre;
    private double monto;
    private int posiciones[] = new int[10];
    boolean rechazo = false;
    int punteo;

    public Apuesta(String nombre, String monto, String primero, String segundo, String tercero,
            String cuarto, String quinto, String sexto, String septimo,
            String octavo, String noveno, String decimo) {
        this.nombre = nombre;
        try {
            this.monto = Double.parseDouble(monto);
            this.posiciones[0] = Integer.parseInt(primero);
            this.posiciones[1] = Integer.parseInt(segundo);
            this.posiciones[2] = Integer.parseInt(tercero);
            this.posiciones[3] = Integer.parseInt(cuarto);
            this.posiciones[4] = Integer.parseInt(quinto);
            this.posiciones[5] = Integer.parseInt(sexto);
            this.posiciones[6] = Integer.parseInt(septimo);
            this.posiciones[7] = Integer.parseInt(octavo);
            this.posiciones[8] = Integer.parseInt(noveno);
            this.posiciones[9] = Integer.parseInt(decimo);
        } catch (NumberFormatException | NullPointerException | IndexOutOfBoundsException e) {
            rechazo = true;
        }
        this.punteo = 0;
    }

    public int[] getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(int[] posiciones) {
        this.posiciones = posiciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setRechazo(boolean rechazo) {
        this.rechazo = rechazo;
    }

    public boolean isRechazo() {
        return rechazo;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    @Override
    public String toString() {
        return "Apuesta{" + "nombre=" + nombre + ", monto=" + monto + ", posiciones=" + posiciones[0] + posiciones[1]
                + posiciones[2] + posiciones[3] + posiciones[4] + posiciones[5] + posiciones[6]
                + posiciones[7] + posiciones[8] + posiciones[9] + '}';
    }

}
