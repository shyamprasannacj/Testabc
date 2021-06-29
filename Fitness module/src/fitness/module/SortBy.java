/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.module;

import java.util.Comparator;
import fitness.module.Test;
/**
 *
 * @author hp
 */
public class SortBy implements Comparator<Test> {

    @Override
    public int compare(Test o1, Test o2) {
       if (o1.a<o1.b) return 1;
       return -1;
    }
    
}
