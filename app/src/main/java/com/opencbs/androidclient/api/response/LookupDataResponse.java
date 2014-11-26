package com.opencbs.androidclient.api.response;

import com.opencbs.androidclient.model.Branch;
import com.opencbs.androidclient.model.City;
import com.opencbs.androidclient.model.District;
import com.opencbs.androidclient.model.EconomicActivity;
import com.opencbs.androidclient.model.Region;

public class LookupDataResponse {
    public EconomicActivity[] economicActivities;
    public Branch[] branches;
    public City[] cities;
    public District[] districts;
    public Region[] regions;
}
