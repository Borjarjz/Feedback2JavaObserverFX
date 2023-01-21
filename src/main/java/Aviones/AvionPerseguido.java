package Aviones;



import java.util.ArrayList;
import java.util.List;

class AvionPerseguido implements Subject {
    private List<Observer> observers;
    private int altitude;
    private int speed;
    private int direction;

    public AvionPerseguido() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(altitude, speed, direction);
        }
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
        notifyObservers();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        notifyObservers();
    }

    public void setDirection(int direction) {
        this.direction = direction;
        notifyObservers();
    }
    public void printParameters(){
        System.out.println("Altitud(pies): " + altitude + " Velocidad(knots): " + speed + " Direccion(grados): " + direction);
    }
}