package com.codeminders.labs.timeextractor.rules.time;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.codeminders.labs.timeextractor.rules.general.GeneralTest;
import com.codeminders.labs.timeextractor.temporal.entites.TemporalExtraction;

public class Time1RuleTest extends GeneralTest {

    @Test
    public void DayOfWeekOrderRule2Test1() {

        String toPredict = "7pm";
        List<TemporalExtraction> predicted = service.extractDatesAndTimeFromText(toPredict, null);
        assertEquals("7pm", predicted.get(0).getTemporalExpression());
        assertEquals(19, predicted.get(0).getTemporal().get(0).getStartDate().getTime().getHours());

    }

    @Test
    public void DayOfWeekOrderRule2Test2() {

        String toPredict = "12pm";
        List<TemporalExtraction> predicted = service.extractDatesAndTimeFromText(toPredict, null);
        assertEquals("12pm", predicted.get(0).getTemporalExpression());
        assertEquals(12, predicted.get(0).getTemporal().get(0).getStartDate().getTime().getHours());

    }

    @Test
    public void DayOfWeekOrderRule2Test3() {

        String toPredict = "11 a.m.";
        List<TemporalExtraction> predicted = service.extractDatesAndTimeFromText(toPredict, null);
        assertEquals("11 a.m", predicted.get(0).getTemporalExpression());
        assertEquals(11, predicted.get(0).getTemporal().get(0).getStartDate().getTime().getHours());

    }

    @Test
    public void DayOfWeekOrderRule2Test4() {

        String toPredict = "11 p.m.";
        List<TemporalExtraction> predicted = service.extractDatesAndTimeFromText(toPredict, null);
        assertEquals("11 p.m", predicted.get(0).getTemporalExpression());
        assertEquals(23, predicted.get(0).getTemporal().get(0).getStartDate().getTime().getHours());

    }

}