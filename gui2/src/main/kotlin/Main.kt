import javafx.application.Application
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloWorldApp : Application() {
    override fun start(primaryStage: Stage) {
        val label = Label("Hello, Kotlin + JavaFX!").apply {
            style = "-fx-font-size: 16px;"
        }
        
        var count = 0
        val countLabel = Label("Count: $count")
        
        val button = Button("Click me").apply {
            setOnAction { 
                count++
                label.text = "Button clicked $count times!"
                countLabel.text = "Count: $count"
            }
        }
        
        val resetButton = Button("Reset").apply {
            setOnAction {
                count = 0
                label.text = "Hello, Kotlin + JavaFX!"
                countLabel.text = "Count: $count"
            }
        }
        
        val root = VBox(10.0).apply {
            children.addAll(label, countLabel, button, resetButton)
            alignment = Pos.CENTER
            padding = Insets(20.0)
        }
        
        primaryStage.apply {
            title = "Kotlin GUI App"
            scene = Scene(root, 400.0, 300.0)
            show()
        }
    }
}

fun main() {
    Application.launch(HelloWorldApp::class.java)
}

