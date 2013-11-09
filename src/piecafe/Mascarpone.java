
package piecafe;

/**
 * @author Бессонова Татьяна
 */
public class Mascarpone extends CondimentDecorator { 
    Pie pie; 
    public Mascarpone(Pie pie){
    this.pie = pie; 
} 
    public String getDescription() {
    return pie.getDescription() + ", Mascarpone "; 
    }
    public double cost() { 
    return 1.25 + pie.cost ();


}}
