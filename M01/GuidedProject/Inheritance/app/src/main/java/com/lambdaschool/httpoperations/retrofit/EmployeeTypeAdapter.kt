package com.lambdaschool.httpoperations.retrofit

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson


// TODO 12: Write type adapter for subclasses

internal class EmployeeTypeAdapter {
    @FromJson
    internal fun eventFromJson(eventJson: EventJson): Event {
        val event = Event()
        event.title = eventJson.title
        event.beginDateAndTime = eventJson.begin_date.toString() + " " + eventJson.begin_time
        return event
    }


}