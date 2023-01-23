package Aviones;

class AvionCaza implements Observer {//avion perseguiidor (caza) que persigue al observado,
    private AvionPerseguido avionPerseguido;
    private int altitude;
    private int speed;
    private int direction;


    public AvionCaza(AvionPerseguido avionPerseguido) {//constructor que registra los cambios del avion perseguido
        this.avionPerseguido = avionPerseguido;
        avionPerseguido.registerObserver(this);
    }

    @Override
    public void update(int altitude, int speed, int direction) {//metodo update que modificará los datos del avion caza segun los cambio el avion perseguidop.
        this.altitude = altitude;
        this.speed = speed;
        this.direction = direction;
    }

    public void printParameters(){
        System.out.println("Altitud(pies): " + altitude + " Velocidad(knots): " + speed + " Direccion(grados): " + direction);
    }
}

