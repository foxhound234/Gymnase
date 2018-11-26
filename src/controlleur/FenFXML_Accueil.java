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
import javafx.stage.Stage;
        
/**
 * FXML Controller class
 *
 * @author Rabelais
 */
public class FenFXML_Accueil implements Initializable {

  
   
       Stage secondaryStage;
    /**
     * Initializes the controller class.
     */

    /**
     * Initializes the controller class.
     * @param url
     */

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
       @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   @FXML
   private void handleAjouteSport() throws IOException
   {
        try
        {
            secondaryStage = new Stage();
            secondaryStage.setTitle("Confirmation de l'inscription à la session de formation");
            FXMLLoader loader = new FXMLLoader(Mainapp.class.getResource("/vue/FenFXML_AjoutSport.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            Scene scene = new Scene(rootLayout);
            secondaryStage.setScene(scene);
            secondaryStage.show();
        }
        catch (IOException e)
        {
            System.out.println("Erreur chargement seconde fenetre : " + e.getMessage());
        }
}
}
