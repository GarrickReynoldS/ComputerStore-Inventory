
package reynolds.computerstore;


public class Products {
    
    private String itemName, itemLocation, itemDepartment;
    private double itemPrice; 
    private int itemOnHand; 
    private int productCount;
    private Products[] productList = new Products[100];
    
    
    
    public Products (String itemName, String itemLocation, String itemDepartment, 
            double itemPrice)
    {
        this.itemName = itemName; 
        this.itemLocation = itemLocation; 
        this.itemDepartment = itemDepartment; 
        this.itemPrice = itemPrice; 
    }
    
    public void addNewProduct2(String newName, String newLoc, String newDep,
            double newPrice)
    {
        Products newProduct = new Products(newName,newLoc, newDep, newPrice);
        
        
        productCount++;
        System.out.println("Product successfully added");
        
                
    }
    
    public String text(String string)
    {
        return string; 
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemLocation
     */
    public String getItemLocation() {
        return itemLocation;
    }

    /**
     * @param itemLocation the itemLocation to set
     */
    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    /**
     * @return the itemDepartment
     */
    public String getItemDepartment() {
        return itemDepartment;
    }

    /**
     * @param itemDepartment the itemDepartment to set
     */
    public void setItemDepartment(String itemDepartment) {
        this.itemDepartment = itemDepartment;
    }

    /**
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return the itemOnHand
     */
    public int getItemOnHand() {
        return itemOnHand;
    }

    /**
     * @param itemOnHand the itemOnHand to set
     */
    public void setItemOnHand(int itemOnHand) {
        this.itemOnHand = itemOnHand;
    }

    /**
     * @return the productCount
     */
    public int getProductCount() {
        return productCount;
    }

    /**
     * @param productCount the productCount to set
     */
    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    /**
     * @return the productList
     */
    public Products[] getProductList() {
        return productList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(Products[] productList) {
        this.productList = productList;
    }
}
