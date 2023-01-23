# Feedback2JavaObserverFX

Borja Rodriguez Jimenez-Programacion concurrente.- Patrón Observer

	1. Realiza una aplicación que simule la persecución de dos aviones. Considerando los parámetros altura, velocidad y dirección, el avión perseguido puede trazar la ruta que quiera y cambiar su velocidad y altura y el avión perseguidor deberá modificar esos parámetros en la misma medida en que lo haga el primero. Puedes solicitar por consola cambiar los parámetros del avión perseguido o bien preparar un recorrido ya definido y lanzar la aplicación para ver como lo recorren ambos objetos (mostrando en cada instante los parámetros de cada uno)
	      En el package aviones se encuentras los archivos:
            Observer-interfaz que pasa los datos del objeto observado al observador
            Subject-interfaz para el observado
            AvionCaza- clase que implementa de la interfaz Observer, avion perseguidor(caza) que persigue al observado modificando sus parametros altitud velocidad y direccion segun cambien los del avion observado
            AvionPerseguido- clase que implementa de Subjet
            Main- clase con metodo main que irá cambiando los parametros del avion perseguido e imprime los atributos del perseguidor para comproibar que se modifican si cambian
            
  2. Crea una aplicación en la que un ListView muestre el contenido de la lista, de forma que el ListView se actualice cada vez que se añadan elementos a la lista

      clase Lista. se crea en javaFX una ObservableList que meteremos String con nombres de colores y se pasará a una ListView
        Hay un boton borrar que eliminara el elemento seleccionado de la lista y se modificará en la Listview-.


