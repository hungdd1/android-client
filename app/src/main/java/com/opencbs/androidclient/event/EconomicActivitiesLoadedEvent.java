package com.opencbs.androidclient.event;

import com.opencbs.androidclient.model.EconomicActivity;

import java.util.List;

public class EconomicActivitiesLoadedEvent extends BusEvent {
    public List<EconomicActivity> economicActivities;
}
