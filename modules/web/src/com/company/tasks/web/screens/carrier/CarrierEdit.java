package com.company.tasks.web.screens.carrier;

import com.company.tasks.entity.Truck;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.tasks.entity.Carrier;

import javax.inject.Inject;

@UiController("tasks_Carrier.edit")
@UiDescriptor("carrier-edit.xml")
@EditedEntityContainer("carrierDc")
@LoadDataBeforeShow
public class CarrierEdit extends StandardEditor<Carrier> {
    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        
    }


    @Inject
    private InstanceContainer<Carrier> carrierDc;
    @Inject
    private CollectionContainer<Truck> trucksDc;


}