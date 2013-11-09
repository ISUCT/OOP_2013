
package piecafe;

/**
 * @author Бессонова Татьяна
 */
public class MilkChocolate extends CondimentDecorator { 
    Pie pie; 
    public  MilkChocolate(Pie pie){
    this.pie = pie; 
} 
    public String getDescription() {
    return pie.getDescription() + ", MilkChocolate = "; 
    }
    public double cost() { 
    return .87 + pie.cost ();


}}
