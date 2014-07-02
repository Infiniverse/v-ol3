package org.vaadin.addon.vol3.demoandtestapp;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by mjhosio on 24/06/14.
 */
public class MapTestUI extends UI {

    private Navigator navigator;
    private CssLayout buttonContainer;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout root=new VerticalLayout();
        root.setSizeFull();
        this.setContent(root);
        buttonContainer = new CssLayout();
        buttonContainer.setWidth("100%");
        root.addComponent(buttonContainer);
        VerticalLayout navigatorContainer=new VerticalLayout();
        navigatorContainer.setSizeFull();
        root.addComponent(navigatorContainer);
        root.setExpandRatio(navigatorContainer,1.0f);
        navigator=new Navigator(this, navigatorContainer);
        addViews();
    }

    private void addViews() {
        addView("basic",BasicMapInitialization.class);
        addView("constrained", ConstrainedMap.class);
        addView("multilayer", MultiLayer.class);
        navigator.navigateTo("basic");
    }

    private void addView(String label, Class<? extends View> implementation){
        navigator.addView(label, implementation);
        Button startView=new Button(label);
        startView.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                navigator.navigateTo(event.getButton().getCaption());
            }
        });
        buttonContainer.addComponent(startView);
    }
}