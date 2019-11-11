package com.company.tasks.web.screens.carrier;

import com.company.tasks.entity.Truck;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.tasks.entity.Carrier;

import javax.inject.Inject;

@UiController("tasks_Carrier.edit")
@UiDescriptor("carrier-edit.xml")
@EditedEntityContainer("carrierDc")
public class CarrierEdit extends StandardEditor<Carrier> {
    @Inject
    private CollectionLoader<Truck> trucksDl;
    @Inject
    private InstanceLoader<Carrier> carrierDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        carrierDl.load();
        if(carrierDc.getItem() != null){

            trucksDl.setParameter("carrier", carrierDc.getItem());
            trucksDl.load();
        }

    }


    @Inject
    private InstanceContainer<Carrier> carrierDc;

}