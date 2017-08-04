package com.javarush.task.task23.task2312;
    /*    а) создать в классе Room переменные width и height типа int.
        б) создать в классе Room переменную snake типа Snake.
        в) создать в классе Room переменную mouse типа Snake. Шучу. Типа Mouse, конечно же :).
        г) создать для них всех геттеры и сеттеры.
        д) создать конструктор. Конструктор должен принимать три параметра: width, height и … snake!*/
public class Room {
    private int width,height;
    private Snake snake;
    private Mouse mouse;

        public Room(int width, int height, Snake snake) {
            this.width = width;
            this.height = height;
            this.snake = snake;
            this.mouse = mouse;
        }


        public void setHeight(int height) {
            this.height = height;
        }

        public void setSnake(Snake snake) {
            this.snake = snake;
        }

        public void setMouse(Mouse mouse) {
            this.mouse = mouse;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getWidth() {

            return width;
        }

        public int getHeight() {
            return height;
        }

        public Snake getSnake() {
            return snake;
        }

        public Mouse getMouse() {
            return mouse;
        }

        public static void main(String[] args){

    }
}
