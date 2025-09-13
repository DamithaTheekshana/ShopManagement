package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    @FXML
    private Button btnCustomerManagement;

    @FXML
    private Button btnItemManagement;

    @FXML
    private Button btnOrderDetailManagement;

    @FXML
    private Button btnOrderManagement;

    Stage customerManagementStage = new Stage();
    @FXML
    void CustomerManagementOnAction(ActionEvent event) {
        try {
            customerManagementStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/customer_management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        customerManagementStage.show();

    }

    Stage itemManagementStage = new Stage();
    @FXML
    void ItemManagementOnAction(ActionEvent event) {
        try {
            itemManagementStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/item_management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        itemManagementStage.show();

    }

    Stage orderDetailManagementStage = new Stage();
    @FXML
    void OrderDetailManagementOnAction(ActionEvent event) {
        try {
            orderDetailManagementStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/orderdetail_management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        orderDetailManagementStage.show();


    }

    Stage orderManagementStage = new Stage();
    @FXML
    void OrderManagementOnAction(ActionEvent event) {
        try {
            orderManagementStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/order_management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        orderManagementStage.show();

    }

}

