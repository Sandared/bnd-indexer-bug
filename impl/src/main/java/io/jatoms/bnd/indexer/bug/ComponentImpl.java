package io.jatoms.bnd.indexer.bug;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component
public class ComponentImpl {

    @Activate
    private void activate(){
        System.out.println("Hello World!");
    } 
}
