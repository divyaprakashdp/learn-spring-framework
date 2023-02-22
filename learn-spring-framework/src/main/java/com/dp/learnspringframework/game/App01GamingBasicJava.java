package com.dp.learnspringframework.game;

import com.dp.learnspringframework.game.GameRunner;
import com.dp.learnspringframework.game.MarioGame;
import com.dp.learnspringframework.game.PacManGame;
import com.dp.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var contraGame = new SuperContraGame();
        var pacmanGame = new PacManGame();
        var gameRunner = new GameRunner(contraGame);
        gameRunner.run();
    }
}
