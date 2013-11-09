
package piecafe;

/**
 * @author Бессонова Татьяна
 */
public class PieCafe {

      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
        Pie pie = new ApplePie(); 
        System.out.println(pie.getDescription() 
        + " €" + pie.cost () ) ; 
        
        Pie pie2 = new FruitPie ();
        pie2 = new Blueberry (pie2);
        pie2 = new Currant (pie2);
        pie2 = new Strawberry (pie2);
        System.out.println(pie2.getDescription() 
        + " €" + pie2.cost () ) ; 
        
        Pie pie3 = new CheesePie ();
        pie3 = new Gouda (pie3);
        pie3 = new Mascarpone (pie3);
        pie3 = new Cheddar (pie3);
        System.out.println(pie3.getDescription() 
        + " €" + pie3.cost () ) ; 
        
         Pie pie4 = new ChocolatePie ();
        pie4 = new BitterChocolate (pie4);
        pie4 = new MilkChocolate (pie4);
        System.out.println(pie4.getDescription() 
        + " €" + pie4.cost () ) ; 
    }
}
