package org.springboot.Demo01.Controller;

import org.springboot.Demo01.Entity.HealthDataResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * 第一次访问
     * @return
     */
    @GetMapping("/hello")
    public  String hello(){

        HealthDataResult personOne = new HealthDataResult("小民",11,11,11);

        HealthDataResult personTwo = new HealthDataResult("老王",11,11,11,"良好");

        HealthDataResult personThree = new HealthDataResult("小红",11,11);

        HealthDataResult personFour = new HealthDataResult("小丽小丽",11,11,11,"良好",3);
        System.out.println(personOne.toString());
        System.out.println(personTwo.toString());
        System.out.println(personThree.toString());
        System.out.println(personFour.toString());
        System.out.println("ExerciseTimePerWeek:" + personFour.getExerciseTimePerWeek());

        return "hello Springboot测试哦";
    }
}
