package com.file3;

import com.file3.BallClass.Ball;
import com.file3.BallClass.Container;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(10,10,1,5,30);
        Container container = new Container(-20,20,40,40);
        System.out.println(container.toString());
        System.out.println("Ball start point:\n"+ball.toString());
        System.out.print("Is in container? ");
        System.out.println(container.collides(ball));
        ball.move();
        System.out.println("The ball has moved. Current location: ");
        System.out.println(ball.toString());
        ball.move();
        ball.move();
        System.out.println("The ball has moved. Current location: ");
        System.out.println(ball.toString());
        System.out.print("Is in container? ");
        System.out.println(container.collides(ball));
        ball.reflectHorisontal();
        System.out.println("The ball bounced off a vertical wall");
        ball.move();
        ball.move();
        ball.move();
        ball.move();
        System.out.println("The ball has moved. Current location: ");
        System.out.println(ball.toString());
        System.out.print("Is in container? ");
        System.out.println(container.collides(ball));

    }
}
