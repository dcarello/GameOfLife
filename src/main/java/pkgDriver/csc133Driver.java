package pkgDriver;

import pkgPingPong.DCPingPong;
import pkgSlRenderer.DCPolygonRenderer;
import pkgSlRenderer.slRenderEngine;
import static pkgDriver.slSpot.*;
import pkgSlUtils.slWindowManager;


public class csc133Driver {
    public static void main(String[] my_args) {
        slRenderEngine my_re = new DCPolygonRenderer();
        slWindowManager.get().initGLFWWindow(WIN_WIDTH, WIN_HEIGHT, "CSUS CSC133");
        my_re.initOpenGL(slWindowManager.get());

        final int FRAME_DELAY = 700, NUM_ROWS = 16, NUM_COLS = 16, NUM_SIDES = 4;
        final float RADIUS = 0.5f;

        DCPingPong myPingPong = new DCPingPong(NUM_ROWS, NUM_COLS);
        myPingPong.printLiveArray();

        my_re.render(FRAME_DELAY, NUM_ROWS, NUM_COLS, NUM_SIDES, myPingPong);
//        my_re.render(RADIUS);
//        my_re.render();
    } // public static void main(String[] my_args)
} // public class csc133Driver(...)