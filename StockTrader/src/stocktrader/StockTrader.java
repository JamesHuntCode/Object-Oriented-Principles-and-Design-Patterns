/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktrader;
import stocktrader.stockdatamodel.*;


/**
 *
 * @author James
 */
public class StockTrader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StockItem physicalItem = new PhysicalStockItem("Harry Potter", 100);
        
        StockItem virtualItem = new ServiceStockItem("eBook: Harry Potter", 100);
        
        /*System.out.print(physicalItem.getName() + " is in stock? " 
                + physicalItem.isInStock() + "\nHow many in stock? " 
                + physicalItem.getQuantityInStock());
        
        System.out.print(virtualItem.getName() + " is in stock? "
                + virtualItem.isInStock() + "\nHow many in stock? "
                + virtualItem.getQuantityInStock());*/
        
        if (physicalItem.getItemType() == StockType.PHYSICALITEM) {
            System.out.print("This item is a physical stock item.");
        }
        else {
            System.out.print("This item is NOT a physical stock item.");
        }
        
        if (virtualItem.getItemType() == StockType.SERVICEITEM) {
            System.out.print("This item is a service stock item.");
        }
        else {
            System.out.print("This item is NOT a service stock item.");
        }
        
        System.out.println("\n\n\n");
        
        AnObserver obs = new AnObserver();
        
        physicalItem.registerObserver(obs);
        virtualItem.registerObserver(obs);
        
        System.out.println("Changing the quantity of the physical stock item...\n");
        physicalItem.setQuantityInStock(10);
        System.out.println("\n\n");
        
        System.out.println("Changing the price of the service stock item...\n");
        virtualItem.setSellingPrice(20.00);
        System.out.println("\n\n");
        
    }
    
}
