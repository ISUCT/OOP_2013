


/**
 *
 * @author Максим
 */
public interface Subject { 
    // interface - ссылочный тип. 
    public void registerObserver (Observer о);// public означает что метод доступен отовсюду
    // void ставиться для того,чтобы метод ничего не возвращял,а играл метод процедуры
    public void removeObserver (Observer о);
    /* Оба метода получают в аргументе реализацию 
     * Observer(регистрирумый или исключаемый наблюдатель)*/
    public void notifyObservers();
     /* Этот метод вызывается для оповещения наблюдателей 
     * об изменении состоянии субъекта*/
}

