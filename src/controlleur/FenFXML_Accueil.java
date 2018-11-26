/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rabelais
 */
public class FenFXML_Accueil implements Initializable {

  
   
   
    private  Gymnase gymnase;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   @FXML
   private void handleAjouteSport() throws IOException
   {
      boolean okclick=AjoutSport();
   }
   public boolean AjoutSport()
 {
    try
    {
     FXMLLoader loader=new
            FXMLLoader(Gymnase.class.getResource("/vue/FenFXML_AjoutSport.fxml"));
     AnchorPane page=(AnchorPane) loader.load();
     Stage dialogStage=new Stage();
     dialogStage.setTitle("Ajout sport");
     dialogStage.initModality(Modality.WINDOW_MODAL);
     //dialogStage.initOwner(primaryStage);
     Scene scene=new Scene(page);
     dialogStage.setScene(scene);
     FenFXML_AjoutSportController controleur=loader.getController();
     controleur.setDialogStage(dialogStage);
     //controleur.setGymnase(this);
     dialogStage.showAndWait();
     return  controleur.isOkclick();
    }
    catch(IOException ioe)
    {
        System.out.println("Erreur chargement boite dialogue"+ioe.getMessage());
        return false;
    }
 }
}
