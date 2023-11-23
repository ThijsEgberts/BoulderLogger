package com.thijsegberts.boulderlogger.DataTypes;

public enum BoulderGrades {
    TWO("2"),
    THREE("3"),
    FOUR_A("4A"),
    FOUR_B( "4B"),
    FOUR_C("4C"),
    FIVE_A("5A"),
    FIVE_A_P("5A+"),
    FIVE_B("5B"),
    FIVE_B_P("5B+"),
    FIVE_C("5C"),
    FIVE_C_P("5C+"),
    SIX_A("6A"),
    SIX_A_P("6A+"),
    SIX_B("6B"),
    SIX_B_P("6B+"),
    SIX_C("6C"),
    SIX_C_P("6C+"),
    SEVEN_A("7A"),
    SEVEN_A_P("7A+"),
    SEVEN_B("7B"),
    SEVEN_B_P("7B+"),
    SEVEN_C("7C"),
    SEVEN_C_P("7C+"),
    EIGHT_A("8A");

    private final String grade;
    BoulderGrades(String grade) {
        this.grade = grade;
    }
}
