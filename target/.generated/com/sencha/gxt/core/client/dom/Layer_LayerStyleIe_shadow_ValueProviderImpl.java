package com.sencha.gxt.core.client.dom;

public class Layer_LayerStyleIe_shadow_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.core.client.dom.Layer.LayerStyleIe, java.lang.String> {
  public static final Layer_LayerStyleIe_shadow_ValueProviderImpl INSTANCE = new Layer_LayerStyleIe_shadow_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.core.client.dom.Layer.LayerStyleIe object) {
    return object.shadow();
  }
  public void setValue(com.sencha.gxt.core.client.dom.Layer.LayerStyleIe object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "shadow";
  }
}
