/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author stud_6
 */
public class NoAttack implements Attack {
    @Override
        public void attack () {
            System.out.println ("Не атакую");
        }
}
