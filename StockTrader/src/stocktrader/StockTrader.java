/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktrader;
import stocktrader.stockdatamodel.PhysicalStockItem;
import stocktrader.stockdatamodel.ServiceStockItem;

/**
 *
 * @author James
 */
public class StockTrader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhysicalStockItem physicalItem = 
                new PhysicalStockItem("Harry Potter", 100);
        
        ServiceStockItem virtualItem = 
                new ServiceStockItem("eBook: Harry Potter", 100);
        
        System.out.print(physicalItem.getName() + " is in stock? " 
                + physicalItem.isInStock() + "\nHow many in stock? " 
                + physicalItem.getQuantityInStock());
        
        System.out.print(virtualItem.getName() + " is in stock? "
                + virtualItem.isInStock() + "\nHow many in stock? "
                + virtualItem.getQuantityInStock());
    }
    
}
