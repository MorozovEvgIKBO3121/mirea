package com.example.labshape;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Random;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Random rand = new Random();
        int r, g , b;//задаём случайные цвет
        int size;//задаём случайный размер

        Group root = new Group();
        int j = rand.nextInt(3);//задаём случайную фигуру

        switch (j) {
            case 0: Rectangle[] rectangles = new Rectangle[20];
            for (int i = 0; i < 20; i++) {
                int coordinates = rand.nextInt(700);
                size = rand.nextInt(200);
                r = rand.nextInt(255);//задаём случайные цвет
                g = rand.nextInt(255);
                b = rand.nextInt(255);
                Color randomColor = Color.rgb(r, g, b);
                rectangles[i] = new Rectangle(coordinates, coordinates, size, size);
                rectangles[i].setFill(randomColor);
            }
            root.getChildren().addAll(rectangles);
            break;
            case 1:
                Ellipse[] ellipses = new Ellipse[20];
                for (int i = 0; i < 20; i++) {
                    int coordinates1 = rand.nextInt(700);
                    size = rand.nextInt(200);
                    r = rand.nextInt(255);//задаём случайные цвет
                    g = rand.nextInt(255);
                    b = rand.nextInt(255);
                    Color randomColor = Color.rgb(r, g, b);
                    ellipses[i] = new Ellipse(coordinates1, coordinates1, size, 100);
                    ellipses[i].setFill(randomColor);
                }
                root.getChildren().addAll(ellipses);
                break;
            case 2:
                Circle[] circles = new Circle[20];
                for (int i = 0; i < 20; i++) {
                    int coordinates2 = rand.nextInt(700);
                    size = rand.nextInt(200);
                    r = rand.nextInt(255);//задаём случайные цвет
                    g = rand.nextInt(255);
                    b = rand.nextInt(255);
                    Color randomColor = Color.rgb(r, g, b);
                    circles[i] = new Circle(coordinates2, coordinates2, size);
                    circles[i].setFill(randomColor);
                }
                root.getChildren().addAll(circles);
                break;

        }

        Scene scene = new Scene(root, 1800, 900);



        stage.setTitle("lab8");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}