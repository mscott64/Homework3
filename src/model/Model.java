package model;

/**
 * This class contains all of the data that tracks the game play.
 */
public class Model {

    private Food food;
    private Score score;
    private Snake snake;

    public Model() {
        food = new Food();
        score = new Score();
        snake = new Snake();
    }

    public Food getFood() {
        return food;
    }

    public Score getScore() {
        return score;
    }

    public Snake getSnake() {
        return snake;
    }

    // Returns true if the head of the snake has found the food.
    public boolean checkForFood() {
        /* TODO: Implement this */
        return false;
    }

    // Returns true if the snake has run into itself.
    public boolean checkForCollision() {
        /* TODO: Implement this */
        return false;
    }

    // Returns true if the snake is out of the bounds of the game screen.
    public boolean checkOutOfBounds() {
        /**
         *  TODO: Implement this
         *  Don't let the screen determine the bounds of your game.
         *  Create your own boundary that you draw onto the screen.
         *  Make sure that the food is never created outside of that boundary.
         */
        return false;
    }
}
