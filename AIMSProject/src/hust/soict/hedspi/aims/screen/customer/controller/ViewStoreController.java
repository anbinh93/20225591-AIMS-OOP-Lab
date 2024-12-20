package hust.soict.hedspi.aims.screen.customer.controller;

import java.io.IOException;
import hust.soict.hedspi.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class ViewStoreController {

    private static final String ITEM_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Item.fxml";
    private static final int MAX_COLUMNS = 3;
    private final Store store;

    @FXML
    private GridPane gridPane;

    public ViewStoreController(Store store) {
        this.store = store;
    }

    @FXML
    public void initialize() {
        final int[] column = {0};
        final int[] row = {1};

        store.getItemsInStore().forEach(item -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(ITEM_FXML_FILE_PATH));
                ItemController itemController = new ItemController();
                fxmlLoader.setController(itemController);

                AnchorPane anchorPane = fxmlLoader.load();
                itemController.setData(item);

                if (column[0] == MAX_COLUMNS) {
                    column[0] = 0;
                    row[0]++;
                }

                gridPane.add(anchorPane, column[0]++, row[0]);
                GridPane.setMargin(anchorPane, new Insets(20, 10, 10, 10));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    void btnViewCartPressed(ActionEvent event) {
        // Logic to view cart goes here
    }
}
