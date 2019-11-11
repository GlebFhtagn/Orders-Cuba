package com.company.tasks.web.screens.truck;

import com.haulmont.cuba.gui.screen.*;
import com.company.tasks.entity.Truck;

@UiController("tasks_Truck.edit")
@UiDescriptor("truck-edit.xml")
@EditedEntityContainer("truckDc")
@LoadDataBeforeShow
public class TruckEdit extends StandardEditor<Truck> {
}