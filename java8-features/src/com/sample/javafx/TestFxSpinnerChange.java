﻿package com.sample.javafx;

import java.util.ArrayList;
import java.util.List;

import com.sample.beans.Language;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TestFxSpinnerChange extends Application {

	@Override
	public void start(Stage stage) {

		Language hindi = new Language("hi", "Hindi", "Namaste");
		Language english = new Language("en", "English", "Hello");
		Language russian = new Language("ru", "Russian", "привет");

		List<Language> languages = new ArrayList<Language>();
		languages.add(hindi);
		languages.add(english);
		languages.add(russian);

		//

		Label label = new Label("Select Language:");
		final Spinner<Language> spinner = new Spinner<Language>();

		Label labelMessage = new Label("?");

		// Value factory.
		SpinnerValueFactory<Language> valueFactory = //
				new SpinnerValueFactory<Language>() {

					@Override
					public void decrement(int steps) {
						Language current = this.getValue();
						int idx = languages.indexOf(current);
						int newIdx = (languages.size() + idx - steps) % languages.size();
						Language newLang = languages.get(newIdx);
						this.setValue(newLang);
					}

					@Override
					public void increment(int steps) {
						Language current = this.getValue();
						int idx = languages.indexOf(current);
						int newIdx = (idx + steps) % languages.size();
						Language newLang = languages.get(newIdx);
						this.setValue(newLang);
					}

				};

		// Default value for Spinner
		valueFactory.setValue(hindi);

		spinner.setValueFactory(valueFactory);

		// When spinner change value.
		spinner.valueProperty().addListener(new ChangeListener<Language>() {

			@Override
			public void changed(ObservableValue<? extends Language> observable, //
					Language oldValue, Language newValue) {

				labelMessage.setText("Greeting: " + newValue.getGreeting());

			}
		});

		FlowPane root = new FlowPane();
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(10));

		root.getChildren().addAll(label, spinner, labelMessage);

		Scene scene = new Scene(root, 400, 200);

		stage.setTitle("JavaFX Spinner");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
