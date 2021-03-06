/**
 * Mustafa Al Khalidi, 306, assignment 2.
 * Document your program using the following guidelines. 
 * This program will be a calculator that will perform simple arithmetics.
 * These arithmetics are add, subtract, multiply and divide. 
 */

package cse360assign2;

public class Calculator 
{
    // a private integer that will store the total
    private int total;
    
    // String that will store the operators and numbers in an equation form
    private String history;
    
    /**
     * default constructor that will set total and history default values
     * total to zero 
     * and history to "0 "
     */
    public Calculator () 
    {
        total = 0;  // not needed - included for clarity
        history = "0 ";
    }
    /**
     * This method will return the total as an integer.
     * @return 
     */
    public int getTotal () 
    {
        return total;
    }
    
    /**
     * This method will take an integer and add it to the total.
     * The method does not return anything.
     * @param value 
     */
    public void add (int value) 
    {
        history += ("+ " + value + " ");
        total = total + value;
    }
    
    /**
     * This method will take an integer and subtract it from the total.
     * The method does not return anything.
     * @param value 
     */
    public void subtract (int value) 
    {
        history += ("- " + value + " ");
        total = total - value;
    }
    
    /**
     * This method will take an integer and multiply it to the total.
     * The method does not return anything.
     * @param value 
     */
    public void multiply (int value) 
    {
        history += ("* " + value + " ");
        total = total * value;
    }
    
    /**
     * This method will take an integer and divide it from the total.
     * The method does not return anything.
     * @param value 
    */
    public void divide (int value) 
    {
        history += ("/ " + value + " ");
        // if value is 0 then return 0 since we can't divide by 0
        if (value == 0)
            total = 0;
        else
            total = total / value;
    }
    
    /**
     * This method will return a string that contain the history of the
     * calculator.
     * @return 
     */
    public String getHistory () 
    {
        return history;
    }
}
