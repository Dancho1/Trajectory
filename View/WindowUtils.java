package javaFx.Trajectory.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import static javaFx.Trajectory.View.Constants.*;

public class WindowUtils {

    public static Text createText(String str, String font, FontWeight weight, double size, Color color) {
        Text text = new Text();
        text.setText(str);
        text.setFont(Font.font(font, weight, size));
        text.setFill(color);
        return text;
    }

    public static Text createText(String str, Color color) {
        return createText(str, DEFAULT_FONT, DEFAULT_WEIGHT, DEFAULT_SIZE, color);
    }

    public static Text createText(String str) {
        return createText(str, DEFAULT_FONT, DEFAULT_WEIGHT, DEFAULT_SIZE, DEFAULT_COLOR);
    }

    public static Label createLabel(String str, String font, FontWeight weight, double size, Color color) {
        Label label = new Label(str);
        label.setFont(Font.font(font, weight, size));
        label.setTextFill(color);
        return label;
    }

    public static Label createLabel(String str, Color color) {
        return createLabel(str, DEFAULT_FONT, DEFAULT_WEIGHT,DEFAULT_SIZE, color);
    }

    public static Label createLabel(String str){
        return createLabel(str, DEFAULT_FONT, DEFAULT_WEIGHT, DEFAULT_SIZE, DEFAULT_COLOR);
    }

    public static HBox createHBox(Button btn, double spacing, Pos pos) {
        HBox hBox = new HBox(spacing);
        hBox.setAlignment(pos);
        return hBox;
    }

    public static GridPane createGridPane(Pos pos, int hGap, int vGap, int topPad, int rightPad, int bottomPad, int leftPad) {
        GridPane gPane = new GridPane();
        gPane.setAlignment(pos);
        gPane.setHgap(hGap);
        gPane.setVgap(vGap);
        gPane.setPadding(new Insets(topPad, rightPad, bottomPad, leftPad));
        return gPane;
    }

    public static GridPane createGridPane() {
        return createGridPane(DEFAULT_POS, DEFAULT_HGAP, DEFAULT_VGAP,
                DEFAULT_TOPPAD, DEFAULT_RIGHTPAD, DEFAULT_BOTPAD, DEFAULT_LEFTPAD);
    }

    public static HBox createHBox(Button btn) {
        return createHBox(btn, DEFAULT_SPACING, DEFAULT_POS);
    }

}
