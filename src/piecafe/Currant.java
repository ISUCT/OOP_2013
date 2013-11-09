
package piecafe;

/**
 * @author Бессонова Татьяна
 */
public class Currant extends CondimentDecorator { 
    Pie pie; 
    public Currant(Pie pie){
    this.pie = pie; 
} 
    public String getDescription() {
    return pie.getDescription() + ", Currant "; 
    }
    public double cost() { 
    return 2 + pie.cost ();


}}
