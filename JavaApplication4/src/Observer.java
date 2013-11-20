

/**
 *
 * @author Максим
 */
public interface Observer { 
    public void update (float temp, float humidity, float pressure);
    /* Данные состояния, передаваемые наблюдателям
     при изменении состояния субъекта*/
    // float - вещественный тип. 
}
