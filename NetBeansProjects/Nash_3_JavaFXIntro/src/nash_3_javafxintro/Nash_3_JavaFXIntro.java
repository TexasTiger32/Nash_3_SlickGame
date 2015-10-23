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
    Canvas canvas = new Canvas(1000, 1000);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    //drawShapes(gc);
    drawSomeCircle(gc,25,66,43);
    drawLotsOfCircles(gc, 50);
    //writeWordIsaiahNashIsTheBest(gc);
    drawRectangle(gc,225,166,423);
    drawPolygon(gc, 324,432,544);
    drawLotsOfOvals(gc,45);
    drawTriangleLeftandRight(gc);
    drawTriangleBottom(gc);
    drawTriangle(gc);
    drawTriangleUp(gc);
    drawTriangleTop(gc);
    drawTriangleLeft(gc);
    drawTriangleLe(gc);
    drawTriangleRe(gc);
    //writeMethodMadness(gc);
    //drawSquareThugga(gc, 110, 60, 92);
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
          gc.fillText("IsaiahNashIsTheBest", 150, 1150); {
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
        private void drawTriangleLeftandRight(GraphicsContext gc)  {
                     gc.strokeRect(0,750,1000,100);
                     gc.setStroke(Color.DARKSLATEGREY);
                     gc.setFill(Color.HONEYDEW);
                 }
        private void drawTriangleBottom(GraphicsContext gc)   {
                      gc.setFill(Color.BLACK);
                      gc.fillPolygon(new double[]{0,500,1000},new double[]{1000,650,1000}, 3);
                 }
        private void drawTriangle(GraphicsContext gc)     {
                      gc.setFill(Color.DARKBLUE);
                      gc.fillPolygon(new double[]{150,500,1000},new double[]{1000,650,1000}, 3);
                  }
        private void drawTriangleUp(GraphicsContext gc)    {
            gc.setFill(Color.BLACK);
            gc.fillPolygon(new double[]{0,500,1000},new double[]{300,650,300}, 3);
        }
        private void drawTriangleTop(GraphicsContext gc) {
            gc.setFill(Color.AQUA);
            gc.fillPolygon(new double[]{110,500,1000},new double[]{300,650,300}, 3);
        
        }
          
             private void drawTriangleLeft(GraphicsContext gc) {
              gc.setFill(Color.BLACK);
              gc.fillPolygon(new double[]{500,1000,1000},new double[]{650,1000,300}, 3);  
            }
             private void drawTriangleLe(GraphicsContext gc)   {
                 gc.setFill(Color.BLUEVIOLET);
              gc.fillPolygon(new double[]{500,1000,1000},new double[]{650,1000,350}, 3);
                 
             }
             private void drawTriangleRe(GraphicsContext gc)   {
                 gc.setFill(Color.PALEGREEN);
              gc.fillPolygon(new double[]{0,500,0},new double[]{1000,650,300}, 3);
                 
             }
             private void writeMethodMadness(GraphicsContext gc)  {
                 gc.fillText("MethodMadness", 150, 150);
                 
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