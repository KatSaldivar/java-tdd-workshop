package com.xyzcorp.student;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

   /* @Test
    public void test1(){
        String actual = FizzBuzz.convert(1);
        assertThat(actual).isEqualTo("1");
    }*/

    private static Stream<Arguments> intAndStringAnswerProvider(){
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(3, "Fizz"),
                Arguments.of(4, "4"),
                Arguments.of(5, "Buzz"),
                Arguments.of(15, "Fizz Buzz"),
                Arguments.of(19, "19"),
                Arguments.of(30, "Fizz Buzz")
        );
    }

    @ParameterizedTest(name="{index}: int={0}, expected={1}")
    @MethodSource("intAndStringAnswerProvider")
    void testWithMultiArgMethodSource(int num, String expectation) {
        assertThat(FizzBuzz.convert(num)).isEqualTo(expectation);
    }


}
