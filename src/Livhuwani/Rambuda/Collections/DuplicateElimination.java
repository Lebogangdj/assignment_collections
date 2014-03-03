package Livhuwani.Rambuda.Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/* File: DuplicateElimination.java
 * This file will override the methods to be tested
 * Author: Livhuwani Lucky Rambuda (208224262)
 * Date created: 03 March 2014
 * Email : Rambudalucky.saho@gmail.com
 * Cell: 076 380 8106
 */

public class DuplicateElimination 
{
    public static void main(String[] args) 
    {
        String[] Fnames = new String[6]; //Where Fnames represents first names
       
        for(int i = 0; i < Fnames.length; i++)
        {
            //Recieve input from a GUI using JOptionPane
            Fnames[i] = JOptionPane.showInputDialog(null,"Please Enter 3 sets of repeating First Names");
        }
        
        //Put that array into a list
        List<String> list = Arrays.asList(Fnames);
        
         //Display Array Elements
        JOptionPane.showMessageDialog(null, "The names entered are:\n" + list);
        
        //Calling removeDuplicates
        omitDuplicates(list);
       
    }

    private static void omitDuplicates(List<String> list) 
    { 
        //Implement a HashSet in with this list.
        Set<String> set = new HashSet<>(list);
        
        //Print a non-duplicate values from the list
        for(String value : set)
        {
            JOptionPane.showMessageDialog(null, "The non-duplicate values are:\n" + value);
        }
    }
    
    //Search Method to check if a set has a first name recieved as input
    public static void searchForName(Collection<String> names)
    {
        
    }
    
}
