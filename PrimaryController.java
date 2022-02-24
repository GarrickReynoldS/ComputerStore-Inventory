package reynolds.computerstore;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PrimaryController {
 @FXML   
Products[] productList = new Products[100];
 
 @FXML 
 private ComboBox<Products> productCombo = new ComboBox<Products>();
 
 @FXML 
int productCount = 0;

@FXML 
private Label readLbl, nameLbl, priceLbl, depLbl, locLbl, testLabel;


@FXML
private TextField newName, newPrice, newLoc, newDep;
 


    @FXML
    public void addNewProduct()
    {
        
        Products newProduct = new Products(newName.getText(),newLoc.getText(), newDep.getText(),
        Double.parseDouble(newPrice.getText()));
        productList[productCount] = newProduct; 
        if (productList[productCount] != null)
        {
            testText();
            productCombo.getItems().addAll(productList);
        }
        productCount++;
       
                
    }
    
    @FXML 
   private void productSelected()
   {
       nameLbl.setText(productCombo.getValue().getItemName());
       priceLbl.setText(String.valueOf(productCombo.getValue().getItemPrice()));
       locLbl.setText(productCombo.getValue().getItemLocation());
       depLbl.setText(productCombo.getValue().getItemDepartment());
   }
    
    
    
    @FXML 
    private void testText()
    {
        testLabel.setText("Product successfully added!");
    }
    
}
