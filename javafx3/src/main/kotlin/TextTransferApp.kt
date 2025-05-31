import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.input.KeyCode
import javafx.scene.layout.VBox
import javafx.stage.Stage

class TextTransferApp : Application() {

    override fun start(primaryStage: Stage) {
        // 创建UI组件
        val inputLabel = Label("输入文本:")
        val inputField = TextField()
        inputField.promptText = "在这里输入文本..."
        
        val transferButton = Button("显示文本")
        transferButton.style = "-fx-background-color: #4CAF50; -fx-text-fill: white;"
        
        val outputLabel = Label("显示结果:")
        val outputField = TextField()
        outputField.isEditable = false

        // 添加退出按钮
        val exitButton = Button("退出应用")
        exitButton.style = "-fx-background-color: #f44336; -fx-text-fill: white;"
        exitButton.setOnAction {
            primaryStage.close()
        }
        
        // 设置按钮点击事件
        transferButton.setOnAction {
            outputField.text = "OK!"+inputField.text
        }
        
        // 添加按Enter键提交的功能
        inputField.setOnKeyPressed { event ->
            if (event.code == KeyCode.ENTER) {
                outputField.text = "收到"+inputField.text
            }
        }

        // 创建布局
        val layout = VBox(10.0).apply {
            padding = Insets(20.0)
            children.addAll(
                inputLabel, inputField, 
                transferButton, 
                outputLabel, outputField,
                exitButton
            )
        }

        // 设置场景和舞台
        primaryStage.scene = Scene(layout, 400.0, 250.0)
        primaryStage.title = "文本传输应用"
        primaryStage.show()
    }
}

fun main() {
    Application.launch(TextTransferApp::class.java)
}
