
package piecafe;

/**
 * @author Бессонова Татьяна
 */
public class BitterChocolate extends CondimentDecorator { 
    Pie pie; 
    public BitterChocolate(Pie pie){
    this.pie = pie; 
} 
    public String getDescription() {
    return pie.getDescription() + " BitterChocolate "; 
    }
    public double cost() { 
    return 1.67 + pie.cost ();


}}
