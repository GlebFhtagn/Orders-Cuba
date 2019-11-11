package com.company.tasks.web.screens.trucktype;

import com.haulmont.cuba.gui.screen.*;
import com.company.tasks.entity.TruckType;

@UiController("tasks_TruckType.edit")
@UiDescriptor("truck-type-edit.xml")
@EditedEntityContainer("truckTypeDc")
@LoadDataBeforeShow
public class TruckTypeEdit extends StandardEditor<TruckType> {
}