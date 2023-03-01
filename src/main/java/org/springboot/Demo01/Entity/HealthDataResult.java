package org.springboot.Demo01.Entity;

import org.springboot.Demo01.Demo01Constasnt.healthConstant;

public class HealthDataResult {

    private String personName;

    private Integer ageNum;

    private Integer weightNum;

    private Integer highNum;

    private String healthPraise;

    private Integer exerciseTimePerWeek;

    public HealthDataResult() {
    }

    ;

    public HealthDataResult(String personName, Integer ageNum, Integer weightNum, Integer highNum, String healthPraise) {
        this(personName, ageNum, weightNum, highNum, healthPraise, healthConstant.DEFAULT_NUM_ZERO);
    }

    public HealthDataResult(String personName, Integer ageNum, Integer weightNum, Integer highNum) {
        this(personName, ageNum, weightNum, highNum, healthConstant.DEFAULT_STRING_NULL, healthConstant.DEFAULT_NUM_ZERO);
    }

    public HealthDataResult(String personName, Integer ageNum, Integer weightNum) {
        this(personName, ageNum, weightNum, healthConstant.DEFAULT_NUM_ZERO, healthConstant.DEFAULT_STRING_NULL, healthConstant.DEFAULT_NUM_ZERO) ;
    }

    public HealthDataResult(String personName, Integer ageNum, Integer weightNum, Integer highNum, String healthPraise, Integer exerciseTimePerWeek) {
        this.personName = personName;
        this.ageNum = ageNum;
        this.weightNum = weightNum;
        this.highNum = highNum;
        this.healthPraise = healthPraise;
        this.exerciseTimePerWeek = exerciseTimePerWeek;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getAgeNum() {
        return ageNum;
    }

    public void setAgeNum(Integer ageNum) {
        this.ageNum = ageNum;
    }

    public Integer getWeightNum() {
        return weightNum;
    }

    public void setWeightNum(Integer weightNum) {
        this.weightNum = weightNum;
    }

    public Integer getHighNum() {
        return highNum;
    }

    public void setHighNum(Integer highNum) {
        this.highNum = highNum;
    }

    public String getHealthPraise() {
        return healthPraise;
    }

    public void setHealthPraise(String healthPraise) {
        this.healthPraise = healthPraise;
    }

    public Integer getExerciseTimePerWeek() {
        return exerciseTimePerWeek;
    }

    public void setExerciseTimePerWeek(Integer exerciseTimePerWeek) {
        this.exerciseTimePerWeek = exerciseTimePerWeek;
    }

    @Override
    public String toString() {
        return "HealthDataResult{" + "personName='" + personName + '\'' + ", ageNum=" + ageNum + ", weightNum=" + weightNum + ", highNum=" + highNum + ", healthPraise='" + healthPraise + '\'' + ", exerciseTimePerWeek=" + exerciseTimePerWeek + '}';
    }
}