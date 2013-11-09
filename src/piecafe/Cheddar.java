
package piecafe;

/**
 * @author Бессонова Татьяна
 */
public class Cheddar extends CondimentDecorator { 
    Pie pie; 
    public Cheddar(Pie pie){
    this.pie = pie; 
} 
    public String getDescription() {
    return pie.getDescription() + ", Cheddar = "; 
    }
    public double cost() { 
    return 1.98 + pie.cost ();


}}
