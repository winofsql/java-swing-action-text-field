import javax.swing.*;
import action.*;

public class Main extends AppWindow {

    // *****************************************************
    // エントリポイント
    // *****************************************************
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Main thisClass = new Main();
                thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thisClass.setVisible(true);
            }
        });
    }

}
