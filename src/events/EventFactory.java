package events;

import java.awt.event.ActionListener;

import gui.Window;

/**
 * EventFactory
 */
public class EventFactory {
    public static ActionListener getInstance(String event, Window w) {
        event = event.toLowerCase();

        switch (event) {
            case "deform":
                return new Deform(w);
            case "mirrorx":
                return new Mirror(w, Mirror.X);
            case "mirrory":
                return new Mirror(w, Mirror.Y);
            case "mirrorxy":
                return new Mirror(w, Mirror.XY);
            case "move":
                return new Move(w);
            case "rotateleft":
                return new Rotate(w, false);
            case "rotateright":
                return new Rotate(w, true);
            case "scale":
                return new Scale(w);
            case "exit":
                return new Exit();
            case "restore":
                return new Restore(w);
            default:
                return null;
        }
    }

    public static ActionListener getDefaultInstance(String event, Window w) {
        event = event.toLowerCase();
        int step = 5;

        switch (event) {
            case "deform":
                return new Deform(w, 1.0 / step, 1.0 / step);
            case "mirrorx":
                return new Mirror(w, Mirror.X);
            case "mirrory":
                return new Mirror(w, Mirror.Y);
            case "mirrorxy":
                return new Mirror(w, Mirror.XY);
            case "moveup":
                return new Move(w, 0, -step);
            case "movedown":
                return new Move(w, 0, step);
            case "moveleft":
                return new Move(w, -step, 0);
            case "moveright":
                return new Move(w, step, 0);
            case "rotateleft":
                return new Rotate(w, false, step);
            case "rotateright":
                return new Rotate(w, true, step);
            case "scalein":
                return new Scale(w, 1 + 1.0 / step, 1 + 1.0 / step);
            case "scaleout":
                return new Scale(w, 1 - 1.0 / step, 1 - 1.0 / step);
            case "exit":
                return new Exit();
            case "restore":
                return new Restore(w);
            default:
                return null;
        }
    }
}
