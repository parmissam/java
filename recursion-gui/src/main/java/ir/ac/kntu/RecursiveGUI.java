package ir.ac.kntu;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import java.util.ArrayList;

public class RecursiveGUI {

    public RecursiveGUI() {
    }

    public void shape(Pane pane,double width,double height){
        width=width/2;
        height=height/2;
//        if(width==1000) {
//            drawDiamond(pane, width / 2.0, (height / 2.0) - (height / 20.0), (width / 2.0) - (width / 50.0), height / 2.0,
//                    (width / 2.0) + (width / 50.0), height / 2.0, (width / 2.0), (height / 2.0) + (height / 20.0));
//        }
//        drawDiamond(pane, (width / 2.0) - (width / 16.7)/*440.0*/, (height / 2.0) - (height / 20.0)/*360.0*/,
//                (width / 2.0) - (width / 28.6)/*465.0*/, (height / 2.0) - (height / 26.6)/*370.0*/, (width / 2.0) - (width / 20.0)/*450.0*/,
//                (height / 2.0) - (height / 53.3)/*385.0*/, (width / 2.0) - (width / 50.0), height / 2.0);
//        if(width>140){
//            shape(pane,width,height);
//        }
        //drawDiamond2(pane,(width / 2.0), (height / 2.0) + (height / 20.0),40,60);
        double length = 80;
        double rotation = 1.04;
        int count=0;
        ArrayList<Double> nextPoints = new ArrayList<>();
        //ArrayList<Double> futurePoints = new ArrayList<>();
        ArrayList<Double> tempPoints;
        tempPoints=drawDiamond2(pane,700,700,length,rotation,count);
        for(int i=0;i<tempPoints.size();i++){
            nextPoints.add(tempPoints.get(i));
        }
        //System.out.println("aa"+nextPoints);
        int iterations = 5;
        //while (nextPoints.size() > 0){
        for(int i=0;i<iterations;i++){
            length = length/ 1.8;
            System.out.println("i"+i);
            System.out.println("length   "+length);
            double sag = Math.pow(3,i);
            System.out.println("sag   "+sag);
            for(int k=0;k<sag;k++) {
                int n = k % 3 - 1;
                System.out.println("k"+k);
                double rot = rotation*(i+1);
                //*(i+1) + (n+1) * 0.57
                tempPoints = drawDiamond2(pane, nextPoints.get(0), nextPoints.get(1), length, nextPoints.get(6) -0.52,count);
                for (int j = 0; j < tempPoints.size(); j++) {
                    nextPoints.add(tempPoints.get(j));
                }
                tempPoints = drawDiamond2(pane, nextPoints.get(2), nextPoints.get(3), length, nextPoints.get(6) + 0.52,count);
                for (int j = 0; j < tempPoints.size(); j++) {
                    nextPoints.add(tempPoints.get(j));
                }
                tempPoints = drawDiamond2(pane, nextPoints.get(4), nextPoints.get(5), length, nextPoints.get(6),count);
                for (int j = 0; j < tempPoints.size(); j++) {
                    nextPoints.add(tempPoints.get(j));
                }
                /*tempPoints = drawDiamond2(pane, nextPoints.get(0), nextPoints.get(1), length, rotation - 0.57*(i+1));
                for (int j = 0; j < tempPoints.size(); j++) {
                    nextPoints.add(tempPoints.get(j));
                }
                tempPoints = drawDiamond2(pane, nextPoints.get(2), nextPoints.get(3), length, rotation + 0.57);
                for (int j = 0; j < tempPoints.size(); j++) {
                    nextPoints.add(tempPoints.get(j));
                }
                tempPoints = drawDiamond2(pane, nextPoints.get(4), nextPoints.get(5), length, rotation);
                for (int j = 0; j < tempPoints.size(); j++) {
                    nextPoints.add(tempPoints.get(j));
                }*/
                nextPoints.remove(0);
                nextPoints.remove(0);
                nextPoints.remove(0);
                nextPoints.remove(0);
                nextPoints.remove(0);
                nextPoints.remove(0);
                nextPoints.remove(0);
            }
            count+=184/iterations;
        }

    }


    public ArrayList<Double> drawDiamond2(Pane pane, double x, double y, double length, double rotate,int count){
        double x1 = 0, y1=0, x2=0, y2=0, x3=0, y3=0;
//        System.out.println("q"+x1);
//        System.out.println("v"+java.lang.Math.cos(rotate));
        x1 = x + length * java.lang.Math.cos(rotate);
//        System.out.println("after"+x1);
        y1 = y - length * java.lang.Math.sin(rotate);
        x2 = x + length * java.lang.Math.cos(rotate +1.05);
        y2 = y - length * java.lang.Math.sin(rotate +1.05);

//        System.out.println("qs"+y1);
//        System.out.println("qss"+x2);
//        System.out.println("qsss"+y2);
        Polygon firstPolygon = new Polygon();
        firstPolygon.getPoints().addAll(new Double[]{
                x, y,
                x1, y1,
                x2, y2 });
        firstPolygon.setFill(Color.rgb(66+count,104,124));
        double middleX = (x1+x2)/2;
        x3 = (middleX-x) + middleX;
        double middleY = (y1+y2)/2;
        y3 = (middleY-y) + middleY;
        Polygon secondPolygon = new Polygon();
        secondPolygon.getPoints().addAll(new Double[]{
                x1, y1,
                x2, y2,
                x3, y3 });
        secondPolygon.setFill(Color.rgb(66+count,104,124));
        ArrayList<Double> points=new ArrayList<>();
        points.add(x1);
        points.add(y1);
        points.add(x2);
        points.add(y2);
        points.add(x3);
        points.add(y3);
        points.add(rotate);
        pane.getChildren().addAll(firstPolygon,secondPolygon);
        return points;
    }

    /*public void drawDiamond(Pane pane,double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        Polygon firstPolygon = new Polygon();
        firstPolygon.getPoints().addAll(new Double[]{
                x1, y1,
                x2, y2,
                x3, y3 });
        firstPolygon.setFill(Color.rgb(66,104,124));
        /*Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                500.0, 380.0,
                485.0, 400.0,
                515.0, 400.0 });
        polygon.setFill(Color.CADETBLUE);*/
        /*Polygon secondPolygon = new Polygon();
        secondPolygon.getPoints().addAll(new Double[]{
                x2, y2,
                x3, y3,
                x4, y4 });
        secondPolygon.setFill(Color.rgb(66,104,124));
        pane.getChildren().addAll(firstPolygon,secondPolygon);
    }*/

    public int powerThree(int power){
        int number=1;
        for(int i=1;i<=power;i++){
            number=number*3;
        }
        return number;
    }
}