/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nash_3_javafxintro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author TexasTiger32
 */
public class Nash_3_JavaFXIntro extends Application {
     
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
    Group root = new Group();
    Canvas canvas = new Canvas(300, 250);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    drawShapes(gc);
    drawSomeCircle(gc,25,66,43);
    drawLotsOfCircles(gc, 50);
    writeWordIsaiahNashIsTheBest(gc);
    drawRectangle(gc,225,166,423);
    drawPolygon(gc, 324,432,544);
    drawSquare(gc,1,123,145);
    drawLotsOfOvals(gc,45);
    root.getChildren().add(canvas);
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
    }

      private void drawHouse(GraphicsContext gc) {
          gc.fillText("My House", 42, 42);
      }
      private void drawSomeCircle(GraphicsContext gc,int x, int y, int d) {
          gc.setFill(Color.BLUE);
          gc.fillOval(x, y, d, d);
      }
      private void drawLotsOfCircles(GraphicsContext gc, int num) {
          for(int i = 0; i < num; i++) {
              drawSomeCircle(gc, 25*i, (25*i), 25);
          }
      }
       
          private void writeWordIsaiahNashIsTheBest(GraphicsContext gc) {
          gc.fillText("IsaiahNashIsTheBest", 150, 50); {
       }
          }
          private void drawRectangle(GraphicsContext gc, int x, int y, int d) {
            gc.setFill(Color.MAROON);
            gc.fillRect(x, y, d, d);
          }
        {
        }
            private void drawPolygon(GraphicsContext gc, int x, int y, int d) {
            gc.setFill(Color.DARKGREEN);
            gc.fillRect(x, y, d, d);
            
      }
            private void drawSquare(GraphicsContext gc, int x, int y, int d) {
                gc.setFill(Color.BROWN);
            gc.fillRect(x, y, d, d);
            }
            
                 private void drawLotsOfOvals(GraphicsContext gc, int num) {
          for(int i = 0; i < num; i++) {
              drawSomeCircle(gc, 50*i, (35*i), 25);
          }
                 } 

        
    

    /**
     * @param args the command line arguments
     */
    

       private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color .CHOCOLATE);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
    }
}