package com.sencha.gxt.theme.neptune.client.base.tips;

public class Css3TipAppearance_Css3TipStyle_headingWrap_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipStyle, java.lang.String> {
  public static final Css3TipAppearance_Css3TipStyle_headingWrap_ValueProviderImpl INSTANCE = new Css3TipAppearance_Css3TipStyle_headingWrap_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipStyle object) {
    return object.headingWrap();
  }
  public void setValue(com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "headingWrap";
  }
}
