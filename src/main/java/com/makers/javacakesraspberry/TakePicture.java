package com.makers.javacakesraspberry;

public class TakePicture {

    public TakePicture() {

        try {

            Runtime runtime = Runtime.getRuntime();

            runtime.exec("raspistill -o " +  System.getProperty("user.home") + "/javacakes/images/pic.jpg");

            System.out.println("Picture Taken");

        } catch(Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}
