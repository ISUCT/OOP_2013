/**
 *
 * @author stud_6
 */
public class MuteQuack implements QuackBehavior{
    public void MuteQuack(){
        System.out.println("....");
    }

    @Override
    public void Quack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
