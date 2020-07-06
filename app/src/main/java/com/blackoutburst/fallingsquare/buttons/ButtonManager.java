package com.blackoutburst.fallingsquare.buttons;


import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.core.GameCore;

import java.util.ArrayList;
import java.util.List;

import javax.microedition.khronos.opengles.GL10;

public class ButtonManager {
    public static List<Button> buttons = new ArrayList<Button>();


    public static void page1() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l1, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, false,1));
        buttons.add(new LevelButton(GameCore.textureLoader.l2, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,2));
        buttons.add(new LevelButton(GameCore.textureLoader.l3, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,3));
        buttons.add(new LevelButton(GameCore.textureLoader.l4, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,4));
        buttons.add(new LevelButton(GameCore.textureLoader.l5, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,5));

        buttons.add(new LevelButton(GameCore.textureLoader.l6, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,6));
        buttons.add(new LevelButton(GameCore.textureLoader.l7, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,7));
        buttons.add(new LevelButton(GameCore.textureLoader.l8, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,8));
        buttons.add(new LevelButton(GameCore.textureLoader.l9, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,9));
        buttons.add(new LevelButton(GameCore.textureLoader.l10, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,10));

        buttons.add(new RightArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,GameCore.screen.x - (GameCore.screen.y / 5),(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void page2() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l11, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, true,11));
        buttons.add(new LevelButton(GameCore.textureLoader.l12, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,12));
        buttons.add(new LevelButton(GameCore.textureLoader.l13, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,13));
        buttons.add(new LevelButton(GameCore.textureLoader.l14, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,14));
        buttons.add(new LevelButton(GameCore.textureLoader.l15, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,15));

        buttons.add(new LevelButton(GameCore.textureLoader.l16, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,16));
        buttons.add(new LevelButton(GameCore.textureLoader.l17, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,17));
        buttons.add(new LevelButton(GameCore.textureLoader.l18, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,18));
        buttons.add(new LevelButton(GameCore.textureLoader.l19, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,19));
        buttons.add(new LevelButton(GameCore.textureLoader.l20, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,20));

        buttons.add(new LeftArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,0,(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 180, false, 0));
        buttons.add(new RightArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,GameCore.screen.x - (GameCore.screen.y / 5),(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void page3() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l21, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, true,21));
        buttons.add(new LevelButton(GameCore.textureLoader.l22, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,22));
        buttons.add(new LevelButton(GameCore.textureLoader.l23, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,23));
        buttons.add(new LevelButton(GameCore.textureLoader.l24, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,24));
        buttons.add(new LevelButton(GameCore.textureLoader.l25, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,25));

        buttons.add(new LevelButton(GameCore.textureLoader.l26, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,26));
        buttons.add(new LevelButton(GameCore.textureLoader.l27, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,27));
        buttons.add(new LevelButton(GameCore.textureLoader.l28, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,28));
        buttons.add(new LevelButton(GameCore.textureLoader.l29, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,29));
        buttons.add(new LevelButton(GameCore.textureLoader.l30, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,30));

        buttons.add(new LeftArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,0,(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 180, false, 0));
        buttons.add(new RightArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,GameCore.screen.x - (GameCore.screen.y / 5),(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void page4() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l31, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, true,31));
        buttons.add(new LevelButton(GameCore.textureLoader.l32, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,32));
        buttons.add(new LevelButton(GameCore.textureLoader.l33, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,33));
        buttons.add(new LevelButton(GameCore.textureLoader.l34, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,34));
        buttons.add(new LevelButton(GameCore.textureLoader.l35, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,35));

        buttons.add(new LevelButton(GameCore.textureLoader.l36, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,36));
        buttons.add(new LevelButton(GameCore.textureLoader.l37, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,37));
        buttons.add(new LevelButton(GameCore.textureLoader.l38, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,38));
        buttons.add(new LevelButton(GameCore.textureLoader.l39, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,39));
        buttons.add(new LevelButton(GameCore.textureLoader.l40, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,40));

        buttons.add(new LeftArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,0,(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 180, false, 0));
        buttons.add(new RightArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,GameCore.screen.x - (GameCore.screen.y / 5),(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void page5() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l41, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, true,41));
        buttons.add(new LevelButton(GameCore.textureLoader.l42, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,42));
        buttons.add(new LevelButton(GameCore.textureLoader.l43, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,43));
        buttons.add(new LevelButton(GameCore.textureLoader.l44, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,44));
        buttons.add(new LevelButton(GameCore.textureLoader.l45, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,45));

        buttons.add(new LevelButton(GameCore.textureLoader.l46, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,46));
        buttons.add(new LevelButton(GameCore.textureLoader.l47, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,47));
        buttons.add(new LevelButton(GameCore.textureLoader.l48, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,48));
        buttons.add(new LevelButton(GameCore.textureLoader.l49, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,49));
        buttons.add(new LevelButton(GameCore.textureLoader.l50, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,50));

        buttons.add(new LeftArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,0,(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 180, false, 0));
        buttons.add(new RightArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,GameCore.screen.x - (GameCore.screen.y / 5),(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void page6() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l51, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, true,51));
        buttons.add(new LevelButton(GameCore.textureLoader.l52, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,52));
        buttons.add(new LevelButton(GameCore.textureLoader.l53, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,53));
        buttons.add(new LevelButton(GameCore.textureLoader.l54, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,54));
        buttons.add(new LevelButton(GameCore.textureLoader.l55, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,55));

        buttons.add(new LevelButton(GameCore.textureLoader.l56, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,56));
        buttons.add(new LevelButton(GameCore.textureLoader.l57, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,57));
        buttons.add(new LevelButton(GameCore.textureLoader.l58, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,58));
        buttons.add(new LevelButton(GameCore.textureLoader.l59, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,59));
        buttons.add(new LevelButton(GameCore.textureLoader.l60, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,60));

        buttons.add(new LeftArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,0,(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 180, false, 0));
        buttons.add(new RightArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,GameCore.screen.x - (GameCore.screen.y / 5),(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void page7() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l61, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, true,61));
        buttons.add(new LevelButton(GameCore.textureLoader.l62, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,62));
        buttons.add(new LevelButton(GameCore.textureLoader.l63, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,63));
        buttons.add(new LevelButton(GameCore.textureLoader.l64, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,64));
        buttons.add(new LevelButton(GameCore.textureLoader.l65, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,65));

        buttons.add(new LevelButton(GameCore.textureLoader.l66, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,66));
        buttons.add(new LevelButton(GameCore.textureLoader.l67, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,67));
        buttons.add(new LevelButton(GameCore.textureLoader.l68, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,68));
        buttons.add(new LevelButton(GameCore.textureLoader.l69, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,69));
        buttons.add(new LevelButton(GameCore.textureLoader.l70, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,70));

        buttons.add(new LeftArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,0,(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 180, false, 0));
        buttons.add(new RightArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,GameCore.screen.x - (GameCore.screen.y / 5),(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void page8() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l71, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, true,71));
        buttons.add(new LevelButton(GameCore.textureLoader.l72, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,72));
        buttons.add(new LevelButton(GameCore.textureLoader.l73, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,73));
        buttons.add(new LevelButton(GameCore.textureLoader.l74, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,74));
        buttons.add(new LevelButton(GameCore.textureLoader.l75, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,75));

        buttons.add(new LevelButton(GameCore.textureLoader.l76, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,76));
        buttons.add(new LevelButton(GameCore.textureLoader.l77, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,77));
        buttons.add(new LevelButton(GameCore.textureLoader.l78, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,78));
        buttons.add(new LevelButton(GameCore.textureLoader.l79, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,79));
        buttons.add(new LevelButton(GameCore.textureLoader.l80, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,80));

        buttons.add(new LeftArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,0,(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 180, false, 0));
        buttons.add(new RightArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,GameCore.screen.x - (GameCore.screen.y / 5),(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void page9() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l81, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, true,81));
        buttons.add(new LevelButton(GameCore.textureLoader.l82, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,82));
        buttons.add(new LevelButton(GameCore.textureLoader.l83, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,83));
        buttons.add(new LevelButton(GameCore.textureLoader.l84, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,84));
        buttons.add(new LevelButton(GameCore.textureLoader.l85, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,85));

        buttons.add(new LevelButton(GameCore.textureLoader.l86, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,86));
        buttons.add(new LevelButton(GameCore.textureLoader.l87, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,87));
        buttons.add(new LevelButton(GameCore.textureLoader.l88, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,88));
        buttons.add(new LevelButton(GameCore.textureLoader.l89, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,89));
        buttons.add(new LevelButton(GameCore.textureLoader.l90, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,90));

        buttons.add(new LeftArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,0,(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 180, false, 0));
        buttons.add(new RightArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,GameCore.screen.x - (GameCore.screen.y / 5),(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void page10() {
        buttons.clear();
        GameCore.main = false;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new PageExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,0,0, GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));

        buttons.add(new LevelButton(GameCore.textureLoader.l91, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0, true, 91));
        buttons.add(new LevelButton(GameCore.textureLoader.l92, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -0.5f), 0, false, 0, true,92));
        buttons.add(new LevelButton(GameCore.textureLoader.l93, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.0f), 0, false, 0, true,93));
        buttons.add(new LevelButton(GameCore.textureLoader.l94, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -1.5f), 0, false, 0, true,94));
        buttons.add(new LevelButton(GameCore.textureLoader.l95, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) - (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.0f), 0, false, 0, true,95));

        buttons.add(new LevelButton(GameCore.textureLoader.l96, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -2.5f), 0, false, 0, true,96));
        buttons.add(new LevelButton(GameCore.textureLoader.l97, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) - (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.0f), 0, false, 0, true,97));
        buttons.add(new LevelButton(GameCore.textureLoader.l98, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)), (GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -3.5f), 0, false, 0, true,98));
        buttons.add(new LevelButton(GameCore.textureLoader.l99, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 1,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.0f), 0, false, 0, true,99));
        buttons.add(new LevelButton(GameCore.textureLoader.l100, GameCore.textureLoader.locked,((GameCore.screen.x / 2) - (GameCore.screen.y / 10)) + (GameCore.screen.y / 4) * 2,(GameCore.screen.y / 2) - (GameCore.screen.y / 10) + (GameCore.screen.y / 8), GameCore.screen.y / 5, GameCore.screen.y / 5, new Colors(1.0f, 1.0f, 1.0f, -4.5f), 0, false, 0, true,100));

        buttons.add(new LeftArrowButton(GameCore.textureLoader.arrow, GameCore.textureLoader.arrow,0,(GameCore.screen.y / 2) - (GameCore.screen.y / 10), GameCore.screen.y / 5, GameCore.screen.y / 5, Colors.WHITE, 180, false, 0));
    }

    public static void death() {
        buttons.clear();
        GameCore.inPause = false;
        buttons.add(new RestartButton(GameCore.textureLoader.restart, GameCore.textureLoader.restart,(GameCore.screen.x / 2)  - (GameCore.screen.y / 8) + (GameCore.screen.y / 3), (GameCore.screen.y / 2) - (GameCore.screen.y / 8) + (GameCore.screen.y / 8), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
        buttons.add(new PauseExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,(GameCore.screen.x / 2) - (GameCore.screen.y / 8) - (GameCore.screen.y / 3),(GameCore.screen.y / 2) - (GameCore.screen.y / 8) + (GameCore.screen.y / 8), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void mainMenu() {
        buttons.clear();
        GameCore.main = true;
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = true;
        GameCore.inPause = false;
        buttons.add(new SoundButton(GameCore.textureLoader.sound1, GameCore.textureLoader.sound0,(GameCore.screen.x / 2)  - (GameCore.screen.y / 8) + (GameCore.screen.y / 3), (GameCore.screen.y / 2) - (GameCore.screen.y / 8) + (GameCore.screen.y / 8), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
        buttons.add(new PlayButton(GameCore.textureLoader.play, GameCore.textureLoader.play,(GameCore.screen.x / 2) - (GameCore.screen.y / 8), (GameCore.screen.y / 2) - (GameCore.screen.y / 8) - (GameCore.screen.y / 16) + (GameCore.screen.y / 16), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
        buttons.add(new ExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,(GameCore.screen.x / 2) - (GameCore.screen.y / 8) - (GameCore.screen.y / 3),(GameCore.screen.y / 2) - (GameCore.screen.y / 8) + (GameCore.screen.y / 8), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void game() {
        buttons.clear();
        GameCore.dead = false;
        GameCore.win = false;
        GameCore.inMenu = false;
        GameCore.inPause = false;
        buttons.add(new PauseButton(GameCore.textureLoader.pause, GameCore.textureLoader.pause,(GameCore.screen.x) - (GameCore.screen.y / 6) - 10, 10, (GameCore.screen.y / 6), (GameCore.screen.y / 6),  Colors.WHITE, 0, false, 0));
    }

    public static void win() {
        buttons.clear();
        GameCore.dead = false;
        GameCore.inMenu = false;
        GameCore.inPause = false;
        buttons.add(new RestartButton(GameCore.textureLoader.restart, GameCore.textureLoader.restart,(GameCore.screen.x / 2)  - (GameCore.screen.y / 8) + (GameCore.screen.y / 3), (GameCore.screen.y / 2) - (GameCore.screen.y / 8) + (GameCore.screen.y / 8), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
        if (GameCore.level != 100)
            buttons.add(new NextButton(GameCore.textureLoader.play, GameCore.textureLoader.play,(GameCore.screen.x / 2) - (GameCore.screen.y / 8), (GameCore.screen.y / 2) - (GameCore.screen.y / 8) - (GameCore.screen.y / 16) + (GameCore.screen.y / 16), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
        buttons.add(new PauseExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,(GameCore.screen.x / 2) - (GameCore.screen.y / 8) - (GameCore.screen.y / 3),(GameCore.screen.y / 2) - (GameCore.screen.y / 8) + (GameCore.screen.y / 8), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void pause() {
        buttons.clear();
        GameCore.inPause = true;
        buttons.add(new SoundButton(GameCore.textureLoader.sound1, GameCore.textureLoader.sound0,(GameCore.screen.x / 2)  - (GameCore.screen.y / 8) + (GameCore.screen.y / 3), (GameCore.screen.y / 2) - (GameCore.screen.y / 8) + (GameCore.screen.y / 8), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
        buttons.add(new ContinueButton(GameCore.textureLoader.play, GameCore.textureLoader.play,(GameCore.screen.x / 2) - (GameCore.screen.y / 8), (GameCore.screen.y / 2) - (GameCore.screen.y / 8) - (GameCore.screen.y / 16) + (GameCore.screen.y / 16), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
        buttons.add(new PauseExitButton(GameCore.textureLoader.exit, GameCore.textureLoader.exit,(GameCore.screen.x / 2) - (GameCore.screen.y / 8) - (GameCore.screen.y / 3),(GameCore.screen.y / 2) - (GameCore.screen.y / 8) + (GameCore.screen.y / 8), GameCore.screen.y / 4, GameCore.screen.y / 4, new Colors(1.0f, 1.0f, 1.0f, 0.0f), 0, false, 0));
    }

    public static void update(GL10 gl) {
        try {
            for (Button b : buttons) {
                b.render(gl);
            }
        } catch (Exception e) {

        }
    }
}