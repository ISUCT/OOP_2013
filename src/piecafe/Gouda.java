
package piecafe;

/**
 * @author Бессонова Татьяна
 */
public class Gouda extends CondimentDecorator { 
    Pie pie; 
    public Gouda(Pie pie){
    this.pie = pie; 
} 
    public String getDescription() {
    return pie.getDescription() + " Gouda "; 
    }
    public double cost() { 
    return .67 + pie.cost ();


}}
