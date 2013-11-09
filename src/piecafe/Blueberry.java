
package piecafe;

/**
 * @author Бессонова Татьяна
 */
public class Blueberry extends CondimentDecorator { 
    Pie pie; 
    public Blueberry(Pie pie){
    this.pie = pie; 
} 
    public String getDescription() {
    return pie.getDescription() + " Blueberry "; 
    }
    public double cost() { 
    return .74 + pie.cost ();


}}

