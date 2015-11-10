/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nash_3_javafxintro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author TexasTiger32
 */
public class Nash_3_JavaFxIntro extends Application {
    
    primaryStage.setTitle("Drawing Operations Test");
    Group root = new Group();
    Canvas canvas = new Canvas(300, 250);
    GraphicsContex gc = canvas.getGraphicsContext2D();
    drawShapes(gc);
    root.getChildren().add(canvas);
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
    }

    private void drawShapes(GrapicsContext gc)  {
      gc.setFill(Color .GREEN);
      gc.setStroke(Color .BLUE);
      gc.setLineWidth(5);
      gc.strokeLine(40, 10, 10, 40);
      gc.fillOval(10, 60, 30, 30);
      gc.strokeOval(60, 60, 30, 30);
      gc.fillRoundRect(110, 60, 30, 30, 10, 10);

}
