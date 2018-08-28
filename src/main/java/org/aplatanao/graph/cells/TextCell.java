package org.aplatanao.graph.cells;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class TextCell extends Cell {

    public TextCell(String cellId) {
        super(cellId);

        Pane pane = new Pane();
        pane.getChildren().add(new Label(cellId));
        setView(pane);
    }
}
