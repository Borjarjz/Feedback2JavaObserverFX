package Aviones;

class AvionCaza implements Observer {
    private AvionPerseguido avionPerseguido;
    private int altitude;
    private int speed;
    private int direction;


    public AvionCaza(AvionPerseguido avionPerseguido) {
        this.avionPerseguido = avionPerseguido;
        avionPerseguido.registerObserver(this);
    }

    @Override
    public void update(int altitude, int speed, int direction) {
        this.altitude = altitude;
        this.speed = speed;
        this.direction = direction;
    }

    public void printParameters(){
        System.out.println("Altitud(pies): " + altitude + " Velocidad(knots): " + speed + " Direccion(grados): " + direction);
    }
}

