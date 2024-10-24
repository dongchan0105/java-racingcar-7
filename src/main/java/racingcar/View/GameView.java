package racingcar.View;

import racingcar.Model.Car;
import racingcar.Model.GameCars;

public class GameView {
    public GameCars gameCars;

    public GameView(GameCars gameCars) {
        this.gameCars = gameCars;
    }

    public void showGameProgress(){
        for(Car car : gameCars.getCars()){
            System.out.println(car.name+" : "+"-".repeat(car.ongoingCount));
        }
        System.out.println();
    }


}