/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author CoDeR MiND
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public int Interest(){
        return 0;
    }
        }
    class HBL extends Bank{
        public int Interest(){
        return 8; }
    }
        class ABL extends HBL{
           public int Interest(){
            return 9;}
        }
        class islamic extends ABL{
            public int Interest(){
            return 7;}
    public static void main(String[] args) {
        // TODO code application logic here
        HBL obj1 = new HBL();
        System.out.println("The HBL Bank interest "+obj1.Interest());
        obj1.Interest();
        ABL obj2 = new ABL();
        System.out.println("The interest of Allied Bank "+obj2.Interest());
        obj2.Interest();
        islamic obj3 = new islamic ();
      System.out.println("The Interest Of Bank Islamic "+obj3.Interest());
        obj3.Interest();
        
    }
    
}
