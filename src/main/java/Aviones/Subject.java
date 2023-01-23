package Aviones;

interface Subject {//interfaz para el observado
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
