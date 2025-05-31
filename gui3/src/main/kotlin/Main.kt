import javax.swing.*
import java.awt.FlowLayout

fun main() {
    // 正确设置系统原生外观
    try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
    } catch (e: Exception) {
        e.printStackTrace()
    }

    // 创建窗口
    val frame = JFrame("修正版 Swing 应用")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = java.awt.Dimension(400, 200)
    
    // 使用更现代的布局管理器
    val panel = JPanel(FlowLayout(FlowLayout.CENTER, 20, 20))
    
    panel.add(JLabel("修正后的 Swing 示例"))
    
    val button = JButton("点击我")
    button.addActionListener {
        JOptionPane.showMessageDialog(frame, "按钮被点击了!")
    }
    panel.add(button)
    
    frame.contentPane.add(panel)
    frame.pack()  // 自动调整窗口大小
    frame.isVisible = true
}
