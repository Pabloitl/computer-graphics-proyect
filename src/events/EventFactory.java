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
            default:
                return null;
        }
    }
}
