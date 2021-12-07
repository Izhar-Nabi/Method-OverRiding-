/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collegesdata;

public class Province {
    String SchoolName;
   static String SchoolMedium="English";
    String Category;
    int NumberOfSchool;
    void District(){
        System.out.println("Data of a School");
    }
     public void show(){
        System.out.println("Good in Position");
    }
}
    class District extends Province
    {
    @Override
    public void show(){
        System.out.println("School is Running");
    }
    public static void main(String []args){
        District data = new District();
        data.SchoolName="Govt Boys Higher Secondary School";
        data.Category="Secondary School";
        data.NumberOfSchool=20;
        System.out.println(data.SchoolName);
        System.out.println(data.Category);
        System.out.println(data.NumberOfSchool);
        data.show();
    }
    }
