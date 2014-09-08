package com.codemonders.labs.timeextractor.rules.dates;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.codeminders.labs.timeextractor.service.SUTimeService;
import com.codeminders.labs.timeextractor.temporal.entites.TemporalExtraction;

public class MonthAndDayRule1Test {
    private SUTimeService service;

    @Before
    public void before() {
        service = new SUTimeService();
    }

    @Test
    public void MonthAndDayRule0Test1() {

        String toPredict = "July 14th 2014";
        List<TemporalExtraction> predicted = service.extractDatesAndTimeFromText(toPredict, null);
        assertEquals("July 14th 2014", predicted.get(0).getTemporalExpression());
        assertEquals(7, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getMonth());
        assertEquals(14, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getDay());
        assertEquals(2014, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getYear());

    }

    @Test
    public void MonthAndDayRule0Test2() {

        String toPredict = "July the 14th 2014";
        List<TemporalExtraction> predicted = service.extractDatesAndTimeFromText(toPredict, null);
        assertEquals("July the 14th 2014", predicted.get(0).getTemporalExpression());
        assertEquals(7, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getMonth());
        assertEquals(14, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getDay());
        assertEquals(2014, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getYear());

    }

    @Test
    public void MonthAndDayRule0Test3() {

        String toPredict = "July the 14th of 2014";
        List<TemporalExtraction> predicted = service.extractDatesAndTimeFromText(toPredict, null);
        assertEquals("July the 14th of 2014", predicted.get(0).getTemporalExpression());
        assertEquals(7, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getMonth());
        assertEquals(14, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getDay());
        assertEquals(2014, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getYear());

    }

    @Test
    public void MonthAndDayRule0Test4() {

        String toPredict = "July the 14th";
        List<TemporalExtraction> predicted = service.extractDatesAndTimeFromText(toPredict, null);
        assertEquals("July the 14th", predicted.get(0).getTemporalExpression());
        assertEquals(7, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getMonth());
        assertEquals(14, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getDay());

    }

    @Test
    public void MonthAndDayRule0Test5() {

        String toPredict = "July 14th";
        List<TemporalExtraction> predicted = service.extractDatesAndTimeFromText(toPredict, null);
        assertEquals("July 14th", predicted.get(0).getTemporalExpression());
        assertEquals(7, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getMonth());
        assertEquals(14, predicted.get(0).getTemporal().get(0).getStartDate().getDate().getDay());

    }
}
