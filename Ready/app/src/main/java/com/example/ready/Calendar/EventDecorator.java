package com.example.ready.Calendar;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.spans.DotSpan;

import java.util.Collection;
import java.util.HashSet;

public class EventDecorator implements DayViewDecorator {
    private String text;
    private final int color;
    private final HashSet<CalendarDay> dates;

    public EventDecorator(String text, int color, Collection<CalendarDay> dates) {
        this.text = text;
        this.color = color;
        this.dates = new HashSet<>(dates);
    }

    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return dates.contains(day);
    }

    @Override
    public void decorate(DayViewFacade view) {
//        view.addSpan(new DotSpan(5, color));
        view.addSpan(new AddTextToDates(this.text, this.color));
    }
}
