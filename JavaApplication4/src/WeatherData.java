
import java.util.ArrayList;



/**
 *
 * @author Максим 
 */
public class WeatherData implements Subject {
    // Теперь WeatherData реализует интерфейс Subject
    // class - один из ссылочных типов 
    private ArrayList observers;
    private float temperature;      
    private float humidity;
    private float pressure;
    
    public WeatherData (){
        observers = new ArrayList();
        /*Добавляем контейнер ArrayList для хранения 
    наблюдателей и создаем его в конструкторе.*/
    }
    
    public void registerObsrver (Observer о) {
        observers.add(о);
        // Новые наблюдатели просто добавляются в конце списка.
    }
    
    public void removeObserver (Observer о){
        int i = observers.indexOf(о);// int- целый тип, которому выделяется 4 байта. 
        if (i >= 0){ // if - условный оператор. Предназначен для организации разветвлений.
            observers.remove (i);
        // если наблюдатель хочет отменить регистрацию, мы просто удаляем его из списка. 
        }
    }
    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++){
 // for - один из 3 опероторов цикла. 
        Observer observer = (Observer)observers.get(i);
        observer.update(temperature, humidity, pressure);
        /*оповещение наблюдателей об изменении состояния 
     * через метод update(), реализуемый всеми наблюдателями.*/
        }
    }
   
    public void measurementsChanged(){
        notifyObservers();
        //оповещение наблюдателей о появлении новых данных. 
    }
   public void setMeasurements (float temperature,float humidity,float pressure ){
       this.temperature = temperature;
       this.humidity = humidity; 
       this.pressure = pressure;
       measurementsChanged();
   } 
   //другие методы WeatherData

    @Override
    public void registerObserver(Observer о) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
