package at.fhhagenberg.sqe.javafxapp;

import java.util.Locale;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class MyApplication extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();

		Node content = createContent();
		pane.setCenter(content);
		BorderPane.setAlignment(content, Pos.CENTER);

		Scene scene = new Scene(pane, 800, 600);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("styles.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.setTitle("Sum");
		primaryStage.show();
	}

	private Node createContent() {
		HBox line = new HBox(5.0);
		line.setAlignment(Pos.CENTER_LEFT);

		line.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);

		TextField a = new TextField();
		a.setId("a");
		a.getStyleClass().addAll("summand");

		TextField b = new TextField();
		b.setId("b");
		b.getStyleClass().addAll("summand");

		Label result = new Label();
		result.setId("result");
		result.getStyleClass().addAll("sum");

		Button compute = new Button("=");
		compute.setId("compute");
		compute.setOnAction(evt -> result.setText(computeSum(a.getText(), b.getText())));

		line.getChildren().addAll(a, new Label("+"), b, compute, result);

		return line;
	}

	private String computeSum(String a, String b) {
		return String.format(Locale.ROOT, "%.2f", Double.parseDouble(a) + Double.parseDouble(b));
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
