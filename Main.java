import javax.swing.*;

//compile - javac --module-path="C:\Program Files\Java\javafx-sdk-17.0.8\lib" --add-modules=ALL-MODULE-PATH *.java

//run - java --module-path="C:\Program Files\Java\javafx-sdk-17.0.8\lib" --add-modules=ALL-MODULE-PATH Main


public class Main{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Viewer viewer = new Viewer(); 
            }
        });

    }
}