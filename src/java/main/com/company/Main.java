package com.company;
// TODO Refactor the name of your package

import processing.core.PApplet;

/*
 * This template was put together by Alex Ordonez <me@ordonezalex.com>
 * And was inspired by the presentation by Andreas Köberle
 * Found at http://www.slideshare.net/eskimoblood/processing-in-intellij
 */

/**
 * TODO Put project description here
 */
public class Main extends PApplet {
    // TODO Run project by right-clicking in this window and selecting "Run Main"

    /*
     * Differences in Java vs Processing:
     *
     * color c1 = color(255, 0, 0);
     * becomes
     * int c1 = color(255, 0, 0);
     *
     * float f = 1.2;
     * becomes
     * float f = 1.2f;
     *
     * mouseMoved() { ... }
     * becomes
     * public void mouseMoved() { ... }
     *
     * draw() { ... }
     * becomes
     * public void draw() { ... }
     *
     * etc.
     *
     *
     */

    public static void main(String[] args) {
        PApplet.main(new String[]{"com.company.Main"});
    }

    // See https://processing.org/reference/settings_.html
    @Override
    public void settings() {
        // TODO Put settings method here

        // Toggle me for fullscreen
        boolean fullScreen = false;

        if (fullScreen) {
            fullScreen();
        } else {
            size(600, 400);
        }
    }

    // See https://processing.org/reference/setup_.html
    @Override
    public void setup() {
        // TODO Put setup method here
    }

    // See https://processing.org/reference/draw_.html
    @Override
    public void draw() {
        // TODO Put draw method here
    }
}
