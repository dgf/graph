package org.aplatanao.graph.cells;

import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;

public class TitledCell extends Cell {

    public TitledCell(String cellId) {
        super(cellId);

        TitledPane pane = new TitledPane();
        pane.setContent(new Label("hola"));
        pane.setText(cellId);
        pane.setExpanded(false);
        pane.setPrefWidth(200.0);
        pane.setPrefHeight(200.0);

        setView(pane);
    }
}
