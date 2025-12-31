package com.serene.hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/31
 */
public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("start");
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("标签");
        BorderPane pane = new BorderPane(label);
        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.setTitle("我的JavaFX窗体");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
        super.stop();
    }

    @Override
    public void init() throws Exception {
        System.out.println("init");
        super.init();
    }
}
