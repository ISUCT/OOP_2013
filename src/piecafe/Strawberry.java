
package piecafe;

/**
 * @author Бессонова Татьяна
 */

public class Strawberry extends CondimentDecorator { 
    Pie pie; 
    public Strawberry(Pie pie){
    this.pie = pie; 
} 
    public String getDescription() {
    return pie.getDescription() + ", Strawberry = "; 
    }
    public double cost() { 
    return 2.1 + pie.cost ();

}}
