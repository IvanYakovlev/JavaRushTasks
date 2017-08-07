package com.javarush.task.task23.task2312;


import java.util.ArrayList;
import java.util.List;
    /*а) Передать в конструктор координаты головы змеи (x и y)
        б) создать в нем первый «кусочек змеи» (голову) и добавить его в коллекцию sections.
        в) isAlive выставить в true
        г) не забудь в конструкторе инициализировать переменную sections. В null не много-то и добавишь!
        д) создать и реализовать метод int getX(). Метод должен вернуть координату Х головы змеи.
        е) создать и реализовать метод int getY(). Метод должен вернуть координату Y головы змеи.
        ж) еще добавить классу метод move()— он нам пригодится попозже.
        з) созданный конструктор должен быть публичным.*/
public class Snake {
    private int x,y;
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

        public Snake(int x, int y) {
            sections=new ArrayList<>();
            sections.add(new SnakeSection(x,y));
            this.isAlive=true;

        }
    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public List<SnakeSection> getSections() {

        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }
    public int getX(){
            return sections.get(0).getX();
    }
    public int getY(){
        return sections.get(0).getY();
        }
    public SnakeDirection getDirection() {
        return direction;
    }
        public void move(){
            if (isAlive){
                if (direction==SnakeDirection.UP){
                    move(0,-1);
                } else if (direction==SnakeDirection.RIGHT){
                    move(1,0);
                } else if (direction==SnakeDirection.DOWN){
                    move(0,1);
                } else if (direction==SnakeDirection.LEFT){
                    move(-1,0);
                }
            }
        }
      /*  В методе move без параметров необходимо:
        а) прекратить движение если змея умерла(isAlive == false)
        б) вызвать метод move(0, -1) если направление движения равно SnakeDirection.UP
        в) вызвать метод move(1, 0) если направление движения равно SnakeDirection.RIGHT
        г) вызвать метод move(0, 1) если направление движения равно SnakeDirection.DOWN
        д) вызвать метод move(-1, 0) если направление движения равно SnakeDirection.LEFT*/
    public void move(int a, int b){

    }




}
