package org.aplatanao.graph;

import javafx.scene.Group;
import javafx.scene.shape.Line;
import org.aplatanao.graph.cells.Cell;

public class Edge extends Group {

    protected Cell source;
    protected Cell target;

    Line line;

    public Edge(Cell source, Cell target) {

        this.source = source;
        this.target = target;

        source.addCellChild(target);
        target.addCellParent(source);

        line = new Line();

        System.out.println("edge for " + source + " > " + target);
        System.out.println("source W " + source.getBoundsInParent().getWidth());
        System.out.println("source H " + source.getBoundsInParent().getHeight());
        line.startXProperty().bind( source.layoutXProperty().add(source.getBoundsInParent().getWidth() / 2.0));
        line.startYProperty().bind( source.layoutYProperty().add(source.getBoundsInParent().getHeight() / 2.0));

        System.out.println("target W " + target.getBoundsInParent().getWidth());
        System.out.println("target H " + target.getBoundsInParent().getHeight());

        line.endXProperty().bind( target.layoutXProperty().add( target.getBoundsInParent().getWidth() / 2.0));
        line.endYProperty().bind( target.layoutYProperty().add( target.getBoundsInParent().getHeight() / 2.0));

        getChildren().add( line);

    }

    public Cell getSource() {
        return source;
    }

    public Cell getTarget() {
        return target;
    }

}