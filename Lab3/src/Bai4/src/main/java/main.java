
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<SinhVienPoly> list = new ArrayList<>();
        Scanner sb = new Scanner(System.in);
        SinhVienPoly sv = new SinhVienPoly();
        while (true) {
            String nhap;
            sv.nhap();
            list.add(sv);
            System.out.println("Nhap them Y/N?");
            nhap = sb.nextLine();
            if (nhap.equals("N")||nhap.equals("n")) {
                break;
            }
            
        }
        
        System.out.println("---------");
        int i = 0;
        for(SinhVienPoly sv1:list){
        i++;
         System.out.println("Sinh vien thu: " + i );
        sv.xuat();
        System.out.println(sv.Hocluc());
         System.out.println("danh sach sv loc luc gioi: ");
         
          System.out.println("-----------");
                    Collections.sort(list, new Comparator<SinhVienPoly>(){
            
                   @Override
                   public int compare(SinhVienPoly sv1, SinhVienPoly sv2){
                           return sv1.getDiem() > sv2.getDiem()?-1:1;
                       }
                });
                 System.out.println("Danh sach duoc sap xep giam dan theo diem la:");
                            
                            for(SinhVienPoly pr: list){
                                System.out.println(" sinh vien thu "+i);
                               pr.xuat();
                               i++;
                          }
           
        
        }
    }
}
