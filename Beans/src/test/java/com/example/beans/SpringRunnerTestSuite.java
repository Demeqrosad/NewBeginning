package com.example.beans;

import com.example.beans.shape.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {

    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.beans");
        Shape shape = (Shape)context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        Assertions.assertEquals("This is a circle.", name);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.beans");
        Shape shape = (Shape)context.getBean("triangle");
        //When
        String name = shape.getShapeName();
        //Then
        Assertions.assertEquals("This is a triangle.", name);
    }
    @Test
    public void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.beans");
        Shape shape = (Shape)context.getBean("createSquare");
        //When
        String name = shape.getShapeName();
        //Then
        Assertions.assertEquals("This is a square.", name);
    }
    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.beans");
        //ShapesFactory shapesFactory = new ShapesFactory();
        Shape shape = (Shape)context.getBean("chosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Chosen shape says: " + name);
    }
}

