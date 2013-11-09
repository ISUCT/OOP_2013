
package piecafe;

/**
 * @author Бессонова Татьяна
 */
public abstract class Pie {
    String description = "Unknown Pie"; 
    public String getDescription() { 
    return description; 
    } 
    public abstract double cost(); 

}
