package application

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

/**
 * GUI全体に関するクラス
 */
class MainApplication: Application() {


    override fun start(primaryStage: Stage?) {
        //GUIのタイトルを設定
        primaryStage!!.title = "Hello World"

        //Scene(見えないコンテナ)にsample.fxmlの内容を当てはめる
        primaryStage.scene = Scene(
            FXMLLoader.load<Parent>(this.javaClass.getResource("sample.fxml")),
            300.0,
            275.0)

        //GUIを表示
        primaryStage.show()
    }
}