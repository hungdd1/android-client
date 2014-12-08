package com.opencbs.androidclient.events;

import com.opencbs.androidclient.models.EconomicActivity;

import java.util.List;

public class EconomicActivitiesLoadedEvent extends BusEvent {
    public List<EconomicActivity> economicActivities;
}
