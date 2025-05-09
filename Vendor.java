/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
	// Instance Variables:
	private int stock;
	private int price;
	private int deposit;
	private int change;
	
	
  /*
   * Write a constructor for the Vendor class 
   * that takes price and stock as arguments:
   */public Vendor (int price, int initialStock){
	this.price = price;
	this.stock = initialStock;
	this.deposit = 0;
	this.change = 0;
   }	
	
	// Methods:
  /*
   * Sets the quantity of items in stock.
   * Takes one parameter for number of items 
   * to place in stock (int)
   */public void setStock(int newStock){
       this.stock = newStock;
   }
	
	
	
	
  /*
   * Returns the number of items currently in stock.
   * return number of items currently in stock (int)
   */
	public int getStock(){
	    return this.stock;
	}
	
	
  /*
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * takes one parameter:
   * number of cents to add to the deposit (int)
   */
	public void addMoney(int cents){
	    this.deposit += cents;
	}
	
	
  /*
   * Returns the currently deposited amount (in cents).
   * return number of cents in the current deposit (int)
   */
	public int getDeposit(){
	    return this.deposit;
	}
	   
	
	
	
  /*
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock and
   * calculates and sets change, sets deposit to 0 and
   * returns true; otherwise refunds the whole deposit
   * (moves it into change) and returns false.
   * return true for a successful sale, false otherwise (boolean)
   */
	public boolean makeSale(){
	    if(this.stock > 0 && this.deposit >= this.price){
	this.stock--;
	this.change = this.deposit - this.price;
	this.deposit = 0;
	return true;
	
	    } else {
	        
	        this.change = this.deposit;
	        this.deposit = 0;
	        return false;
	    }
	        
   }
	
	
  /*
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * return number of cents in the current change (int)
   */
	public int getChange(){
	    int tempChange = this.change;
	    this.change = 0;
	    return tempChange;
	
   }
	
}