package OOP.obj;

import java.util.Arrays;

public class Line {
    private Point begin;
    private Point end;

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int[] getBeginXY(){
        return begin.getXY();
    }

    public void setBeginXY(int x, int y){
        begin.setX(x);
        begin.setY(y);
    }

    public int getEndX(){
        return end.getX();
    }

    public void setEndX(int x){
        end.setX(x);
    }

    public int getEndY(){
        return end.getY();
    }

    public void setEndY(int y){
        end.setY(y);
    }

    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setX(x);
        end.setY(y);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public double getLength(){
        return begin.distance(end);
    }
}

class TestLine{
    public static void main(String[] args) {
        Line ln = new Line(1, 2, 3, 4);
        System.out.println("Отрезки x1 y1 " + Arrays.toString(ln.getBeginXY()));
        System.out.println("Отрезки x2 y2 " + Arrays.toString(ln.getEndXY()));
        System.out.println(ln.getLength());
    }
}
