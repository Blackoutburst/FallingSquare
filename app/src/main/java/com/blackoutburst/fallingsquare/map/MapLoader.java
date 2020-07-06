package com.blackoutburst.fallingsquare.map;

import android.content.Context;

import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.core.GameCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class MapLoader {

    public static List<Tiles> loadTiles(Context context, int mapNumber) {
        int coin = 0;
        List<Tiles> tiles = new ArrayList<Tiles>();
        InputStream in = null;
        try {
            in = context.getAssets().open("map"+mapNumber+".dat");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            LineNumberReader lnr = new LineNumberReader(new InputStreamReader(in));
            int lines = 0;
            while (lnr.readLine() != null){
                lines++;
            }
            lnr.close();

            in = context.getAssets().open("map"+mapNumber+".dat");

            try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                br.readLine();
                for(int i = 0; i < lines; i ++){
                    String str = br.readLine();
                    String[] val = str.split(" ");
                    if(str.startsWith("B")) {
                        if (val[7].contains("begin")) {
                            GameCore.player.x = Integer.valueOf(val[1]) + 50 - 30;
                            GameCore.player.y = Integer.valueOf(val[2]) + 50 - 30;
                            GameCore.spawn.x = Integer.valueOf(val[1]) + 50 - 30;
                            GameCore.spawn.y = Integer.valueOf(val[2]) + 50 - 30;
                        }
                        Coin.alpha1 = 1;
                        Coin.alpha2 = 1;
                        Coin.alpha3 = 1;
                        if (val[7].contains("coin")) {
                            coin++;
                            switch (coin) {
                                case 1: Coin.coin1.x = Integer.valueOf(val[1]) + 50 - 30; Coin.coin1.y = Integer.valueOf(val[2]) + 50 - 30; break;
                                case 2: Coin.coin2.x = Integer.valueOf(val[1]) + 50 - 30; Coin.coin2.y = Integer.valueOf(val[2]) + 50 - 30; break;
                                case 3: Coin.coin3.x = Integer.valueOf(val[1]) + 50 - 30; Coin.coin3.y = Integer.valueOf(val[2]) + 50 - 30; break;
                            }
                        }
                        tiles.add(new Tile(val[7], Integer.valueOf(val[1]), Integer.valueOf(val[2]), Integer.valueOf(val[3]), Integer.valueOf(val[4]), Boolean.valueOf(val[5]), Colors.WHITE, Integer.valueOf(val[6])));
                    }
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return tiles;
    }

}
