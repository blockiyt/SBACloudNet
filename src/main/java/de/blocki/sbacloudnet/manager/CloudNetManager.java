package de.blocki.sbacloudnet.manager;

import de.dytanic.cloudnet.driver.CloudNetDriver;
import de.dytanic.cloudnet.driver.service.ServiceInfoSnapshot;
import de.dytanic.cloudnet.driver.service.ServiceTask;

public class CloudNetManager {

    public static void createCloudServiceByTask(String taskName) {
        if (CloudNetDriver.getInstance().getServiceTaskProvider().isServiceTaskPresent(taskName)) {
            ServiceTask serviceTask = CloudNetDriver.getInstance().getServiceTaskProvider().getServiceTask(taskName); //getDef ServiceTask instance
            ServiceInfoSnapshot serviceInfoSnapshot = CloudNetDriver.getInstance().getCloudServiceFactory().createCloudService(serviceTask); //Creates a service on cluster and returns the initial snapshot

            if (serviceInfoSnapshot != null) {
                serviceInfoSnapshot.provider().start(); //Starting service
            }
        }
    }

}
