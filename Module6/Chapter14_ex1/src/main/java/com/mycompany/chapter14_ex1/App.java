package com.mycompany.chapter14_ex1;

/**
 * JavaFX App
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class App extends Application  {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the images views
		GridPane pane = new GridPane();

		// Place nodes in the pane
		pane.add(new ImageView(new Image("file:/Users/jswai/Downloads/image/image/uk.gif")), 0, 0);
		pane.add(new ImageView(new Image("file:/Users/jswai/Downloads/image/image/ca.gif") {}), 1, 0);
		pane.add(new ImageView(new Image("file:/Users/jswai/Downloads/image/image/china.gif")), 0, 1);
		pane.add(new ImageView(new Image("file:/Users/jswai/Downloads/image/image/us.gif")), 1, 1);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_01"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage.
	}
}