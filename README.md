# Ejercicios de programaci�n de servicios y procesos

## Contenido de PSP

1. Procesos
2. Programaci�n de hilos
3. Programaci�n de comunicaci�n en red
4. Creaci�n de servicios en red
5. Empleo de t�cnicas de programaci�n segura

## Apuntes de hilos

### Definici�n de hilo
En Java un hilo es un objeto con capacidad de correr en forma concurrente el m�todo run(). En cierta manera es como tener dos "program counters" para un mismo c�digo. Una diferencia con los procesos es que carece de sentido y no es posible en este enfoque hacer mutar un proceso con algo similar a exec().

### Metodos para usar con hilos
1. start()

Este m�todo indica al int�rprete de Java que cree un contexto del hilo del sistema y comience a ejecutarlo. A continuaci�n, el m�todo run() de este hilo ser� invocado en el nuevo contexto del hilo. Hay que tener precauci�n de no llamar al m�todo start() m�s de una vez sobre un hilo determinado.

2. run()

El m�todo run() constituye el cuerpo de un hilo en ejecuci�n. Este es el �nico m�todo del interfaz Runnable. Es llamado por el m�todo start() despu�s de que el hilo apropiado del sistema se haya inicializado. Siempre que el m�todo run() devuelva el control, el hilo actual se detendr�.

3. stop()

Este m�todo provoca que el hilo se detenga de manera inmediata. A menudo constituye una manera brusca de detener un hilo, especialmente si este m�todo se ejecuta sobre el hilo en curso. En tal caso, la l�nea inmediatamente posterior a la llamada al m�todo stop() no llega a ejecutarse jam�s, pues el contexto del hilo muere antes de que stop() devuelva el control. Una forma m�s elegante de detener un hilo es utilizar alguna variable que ocasione que el m�todo run() termine de manera ordenada. En realidad, nunca se deber�a recurrir al uso de este m�todo.

4. suspend()

El m�todo suspend() es distinto de stop(). suspend() toma el hilo y provoca que se detenga su ejecuci�n sin destruir el hilo de sistema subyacente, ni el estado del hilo anteriormente en ejecuci�n. Si la ejecuci�n de un hilo se suspende, puede llamarse a resume() sobre el mismo hilo para lograr que vuelva a ejecutarse de nuevo.

5. resume()

El m�todo resume() se utiliza para revivir un hilo suspendido. No hay garant�as de que el hilo comience a ejecutarse inmediatamente, ya que puede haber un hilo de mayor prioridad en ejecuci�n actualmente, pero resume() ocasiona que el hilo vuelva a ser un candidato a ser ejecutado.

6. setPriority( int )

El m�todo setPriority() asigna al hilo la prioridad indicada por el valor pasado como par�metro. Hay bastantes constantes predefinidas para la prioridad, definidas en la clase Thread, tales como MIN_PRIORITY, NORM_PRIORITY y MAX_PRIORITY, que toman los valores 1, 5 y 10, respectivamente. Como gu�a aproximada de utilizaci�n, se puede establecer que la mayor parte de los procesos a nivel de usuario deber�an tomar una prioridad en torno a NORM_PRIORITY. Las tareas en segundo plano, como una entrada/salida a red o el nuevo dibujo de la pantalla, deber�an tener una prioridad cercana a MIN_PRIORITY. Con las tareas a las que se fije la m�xima prioridad, en torno a MAX_PRIORITY, hay que ser especialmente cuidadosos, porque si no se hacen llamadas a sleep() o yield(), se puede provocar que el int�rprete Java quede totalmente fuera de control.

7. getPriority()

Este m�todo devuelve la prioridad del hilo de ejecuci�n en curso, que es un valor comprendido entre uno y diez.

8. setName( String )

Este m�todo permite identificar al hilo con un nombre menm�nico. De esta manera se facilita la depuraci�n de programas multihilo. El nombre mnem�nico aparecer� en todas las l�neas de trazado que se muestran cada vez que el int�rprete Java imprime excepciones no capturadas.

9. getName()

Este m�todo devuelve el valor actual, de tipo cadena, asignado como nombre al hilo en ejecuci�n mediante setName().

10. wait()

El m�todo wait () hace que el hilo actual espere indefinidamente hasta que otro hilo llame al m�todo notify () o notifyAll () del objeto.

The wait() method causes the current thread to wait indefinitely until another thread either invokes notify() for this object or notifyAll().

11. notify()

Para todos los hilos que esperan el monitor del objeto actual (usando cualquiera de los m�todos de espera), el m�todo de notificaci�n () despertar� a cualquiera de ellos.

Decidir qu� hilo despertarlos es incierto y depende de la implementaci�n espec�fica.

Debido a que el m�todo notify () despierta un solo subproceso aleatorio, se puede usar para implementar bloqueos exclusivos mutuamente excluyentes (para m�ltiples subprocesos que realizan tareas similares). Implemente el m�todo notifyAll () usando notify ()

Mas practico.