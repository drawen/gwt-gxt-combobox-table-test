package com.sencha.gxt.theme.neptune.client.base.listview;

public class Css3ListViewAppearance_Css3ListViewStyle_view_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewStyle, java.lang.String> {
  public static final Css3ListViewAppearance_Css3ListViewStyle_view_ValueProviderImpl INSTANCE = new Css3ListViewAppearance_Css3ListViewStyle_view_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewStyle object) {
    return object.view();
  }
  public void setValue(com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "view";
  }
}
