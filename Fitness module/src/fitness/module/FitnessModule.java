/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fitness.module;

import java.util.*;

import fitness.module.Test;
import fitness.module.SortBy;
/**
 *
 * @author hp
 */
public class FitnessModule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Test> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        for (int i =0;i<10;i++){
            list.add(new Test(i,i));
            hmap.put(i,i+5);
        }
        System.out.print("Enter a number");
        int x=sc.nextInt();
        Collections.sort(list,new SortBy());
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i).a+" "+list.get(i).b);
            if (hmap.containsKey(i)==true){
                System.out.println(hmap.get(i)+"Value");
            }
            System.out.print(x);
        }
        
    }
    
}
