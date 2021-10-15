# Ejercicios de programación de servicios y procesos

## Contenido de PSP

1. Procesos
2. Programación de hilos
3. Programación de comunicación en red
4. Creación de servicios en red
5. Empleo de técnicas de programación segura

## Apuntes de hilos

### Definición de hilo
En Java un hilo es un objeto con capacidad de correr en forma concurrente el método run(). En cierta manera es como tener dos "program counters" para un mismo código. Una diferencia con los procesos es que carece de sentido y no es posible en este enfoque hacer mutar un proceso con algo similar a exec().

### Metodos para usar con hilos
1. start()

Este método indica al intérprete de Java que cree un contexto del hilo del sistema y comience a ejecutarlo. A continuación, el método run() de este hilo será invocado en el nuevo contexto del hilo. Hay que tener precaución de no llamar al método start() más de una vez sobre un hilo determinado.

2. run()

El método run() constituye el cuerpo de un hilo en ejecución. Este es el único método del interfaz Runnable. Es llamado por el método start() después de que el hilo apropiado del sistema se haya inicializado. Siempre que el método run() devuelva el control, el hilo actual se detendrá.

3. stop()

Este método provoca que el hilo se detenga de manera inmediata. A menudo constituye una manera brusca de detener un hilo, especialmente si este método se ejecuta sobre el hilo en curso. En tal caso, la línea inmediatamente posterior a la llamada al método stop() no llega a ejecutarse jamás, pues el contexto del hilo muere antes de que stop() devuelva el control. Una forma más elegante de detener un hilo es utilizar alguna variable que ocasione que el método run() termine de manera ordenada. En realidad, nunca se debería recurrir al uso de este método.

4. suspend()

El método suspend() es distinto de stop(). suspend() toma el hilo y provoca que se detenga su ejecución sin destruir el hilo de sistema subyacente, ni el estado del hilo anteriormente en ejecución. Si la ejecución de un hilo se suspende, puede llamarse a resume() sobre el mismo hilo para lograr que vuelva a ejecutarse de nuevo.

5. resume()

El método resume() se utiliza para revivir un hilo suspendido. No hay garantías de que el hilo comience a ejecutarse inmediatamente, ya que puede haber un hilo de mayor prioridad en ejecución actualmente, pero resume() ocasiona que el hilo vuelva a ser un candidato a ser ejecutado.

6. setPriority( int )

El método setPriority() asigna al hilo la prioridad indicada por el valor pasado como parámetro. Hay bastantes constantes predefinidas para la prioridad, definidas en la clase Thread, tales como MIN_PRIORITY, NORM_PRIORITY y MAX_PRIORITY, que toman los valores 1, 5 y 10, respectivamente. Como guía aproximada de utilización, se puede establecer que la mayor parte de los procesos a nivel de usuario deberían tomar una prioridad en torno a NORM_PRIORITY. Las tareas en segundo plano, como una entrada/salida a red o el nuevo dibujo de la pantalla, deberían tener una prioridad cercana a MIN_PRIORITY. Con las tareas a las que se fije la máxima prioridad, en torno a MAX_PRIORITY, hay que ser especialmente cuidadosos, porque si no se hacen llamadas a sleep() o yield(), se puede provocar que el intérprete Java quede totalmente fuera de control.

7. getPriority()

Este método devuelve la prioridad del hilo de ejecución en curso, que es un valor comprendido entre uno y diez.

8. setName( String )

Este método permite identificar al hilo con un nombre menmónico. De esta manera se facilita la depuración de programas multihilo. El nombre mnemónico aparecerá en todas las líneas de trazado que se muestran cada vez que el intérprete Java imprime excepciones no capturadas.

9. getName()

Este método devuelve el valor actual, de tipo cadena, asignado como nombre al hilo en ejecución mediante setName().

10. wait()

El método wait () hace que el hilo actual espere indefinidamente hasta que otro hilo llame al método notify () o notifyAll () del objeto.

The wait() method causes the current thread to wait indefinitely until another thread either invokes notify() for this object or notifyAll().

11. notify()

Para todos los hilos que esperan el monitor del objeto actual (usando cualquiera de los métodos de espera), el método de notificación () despertará a cualquiera de ellos.

Decidir qué hilo despertarlos es incierto y depende de la implementación específica.

Debido a que el método notify () despierta un solo subproceso aleatorio, se puede usar para implementar bloqueos exclusivos mutuamente excluyentes (para múltiples subprocesos que realizan tareas similares). Implemente el método notifyAll () usando notify ()

Mas practico.