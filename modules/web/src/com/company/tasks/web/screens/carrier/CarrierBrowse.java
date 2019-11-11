package com.company.tasks.web.screens.carrier;

import com.haulmont.cuba.gui.screen.*;
import com.company.tasks.entity.Carrier;

@UiController("tasks_Carrier.browse")
@UiDescriptor("carrier-browse.xml")
@LookupComponent("carriersTable")
@LoadDataBeforeShow
public class CarrierBrowse extends StandardLookup<Carrier> {
}