package com.serene.interfacepractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class Test {
    public static void main(String[] args) {
        PingPangAthlete pingPangAthlete = new PingPangAthlete();
        PingPangTeacher pingPangTeacher = new PingPangTeacher();

        BasketballAthlete basketballAthlete = new BasketballAthlete();
        BasketballTeacher basketballTeacher = new BasketballTeacher();

        pingPangAthlete.study();
        pingPangAthlete.speakEnglish();
        pingPangTeacher.teach();
        pingPangTeacher.speakEnglish();

        basketballAthlete.study();
        basketballTeacher.teach();


    }

}
