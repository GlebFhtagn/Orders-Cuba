package com.company.tasks.web.screens.truck;

import com.haulmont.cuba.gui.screen.*;
import com.company.tasks.entity.Truck;

@UiController("tasks_Truck.browse")
@UiDescriptor("truck-browse.xml")
@LookupComponent("trucksTable")
@LoadDataBeforeShow
public class TruckBrowse extends StandardLookup<Truck> {
}