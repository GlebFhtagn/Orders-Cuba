package com.company.tasks.web.screens.trucktype;

import com.haulmont.cuba.gui.screen.*;
import com.company.tasks.entity.TruckType;

@UiController("tasks_TruckType.browse")
@UiDescriptor("truck-type-browse.xml")
@LookupComponent("truckTypesTable")
@LoadDataBeforeShow
public class TruckTypeBrowse extends StandardLookup<TruckType> {
}