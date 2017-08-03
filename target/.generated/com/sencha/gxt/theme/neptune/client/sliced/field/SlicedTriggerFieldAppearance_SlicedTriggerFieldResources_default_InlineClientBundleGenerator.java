package com.sencha.gxt.theme.neptune.client.sliced.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.field.SlicedTriggerFieldAppearance.SlicedTriggerFieldResources {
  private static SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator _instance0 = new SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.sliced.field.SlicedTriggerFieldAppearance.SlicedTriggerFieldStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("input.GKNJ5M2FID,textarea.GKNJ5M2FID{border-color:" + (theme().field().focusBorderColor() + "")  + ";}input.GKNJ5M2GID,textarea.GKNJ5M2GID{background-color:" + (theme().field().invalidBackgroundColor() + "")  + ";border:" + ("solid"+ " " +theme().field().invalidBorderColor() + "")  + ";border-width:" + (theme().field().invalidBorderWidth() + "px")  + ";height:" + (theme().field().height() + "px")  + ";line-height:" + (theme().field().height() + "px")  + ";}.GKNJ5M2MID{position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";white-space:") + (("nowrap")  + ";text-align:" + ("right")  + ";position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";white-space:" + ("nowrap")  + ";text-align:" + ("right")  + ";}.GKNJ5M2DID{color:" + (theme().field().text().color() + "")  + ";font-size:" + (theme().field().text().size() + "")  + ";font-family:" + (theme().field().text().family() + "") ) + (";font-weight:" + (theme().field().text().weight() + "")  + ";border-color:" + (theme().field().borderColor() + "")  + ";border-radius:" + ("0")  + ";border-width:" + (theme().field().borderWidth() + "px")  + ";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";border-style:" + ("solid")  + ";}.GKNJ5M2CID{color:") + ((theme().field().emptyTextColor() + "")  + ";}.GKNJ5M2DID{color:" + (theme().field().text().color() + "")  + ";font-size:" + (theme().field().text().size() + "")  + ";font-family:" + (theme().field().text().family() + "")  + ";font-weight:" + (theme().field().text().weight() + "")  + ";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";border:" + ("none") ) + (";background:" + ("none")  + ";}.GKNJ5M2CID{color:" + (theme().field().emptyTextColor() + "")  + ";}.GKNJ5M2KID{height:" + ("auto")  + ";padding:" + (theme().field().padding().toString() + "")  + ";resize:" + ("none")  + ";}.GKNJ5M2AID{padding:" + (theme().field().padding().toString() + "")  + ";resize:" + ("none")  + ";}.GKNJ5M2IID .GKNJ5M2LID{height:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getHeight() + "px")  + ";width:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getSafeUri().asString() + "\") -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getLeft() + "px -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getTop() + "px  no-repeat")  + ";}.GKNJ5M2BID .GKNJ5M2LID{height:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getHeight() + "px")  + ";width:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getSafeUri().asString() + "\") -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getLeft() + "px -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getTop() + "px  no-repeat")  + ";}.GKNJ5M2LID{height:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getHeight() + "px")  + ";width:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getSafeUri().asString() + "\") -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getLeft() + "px -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getTop() + "px  no-repeat")  + ";cursor:" + ("pointer")  + ";}")) : (("input.GKNJ5M2FID,textarea.GKNJ5M2FID{border-color:" + (theme().field().focusBorderColor() + "")  + ";}input.GKNJ5M2GID,textarea.GKNJ5M2GID{background-color:" + (theme().field().invalidBackgroundColor() + "")  + ";border:" + ("solid"+ " " +theme().field().invalidBorderColor() + "")  + ";border-width:" + (theme().field().invalidBorderWidth() + "px")  + ";height:" + (theme().field().height() + "px")  + ";line-height:" + (theme().field().height() + "px")  + ";}.GKNJ5M2MID{position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";white-space:") + (("nowrap")  + ";text-align:" + ("left")  + ";position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";white-space:" + ("nowrap")  + ";text-align:" + ("left")  + ";}.GKNJ5M2DID{color:" + (theme().field().text().color() + "")  + ";font-size:" + (theme().field().text().size() + "")  + ";font-family:" + (theme().field().text().family() + "") ) + (";font-weight:" + (theme().field().text().weight() + "")  + ";border-color:" + (theme().field().borderColor() + "")  + ";border-radius:" + ("0")  + ";border-width:" + (theme().field().borderWidth() + "px")  + ";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";border-style:" + ("solid")  + ";}.GKNJ5M2CID{color:") + ((theme().field().emptyTextColor() + "")  + ";}.GKNJ5M2DID{color:" + (theme().field().text().color() + "")  + ";font-size:" + (theme().field().text().size() + "")  + ";font-family:" + (theme().field().text().family() + "")  + ";font-weight:" + (theme().field().text().weight() + "")  + ";-webkit-box-sizing:" + ("border-box")  + ";-moz-box-sizing:" + ("border-box")  + ";box-sizing:" + ("border-box")  + ";-webkit-box-shadow:" + ("none")  + ";box-shadow:" + ("none")  + ";border:" + ("none") ) + (";background:" + ("none")  + ";}.GKNJ5M2CID{color:" + (theme().field().emptyTextColor() + "")  + ";}.GKNJ5M2KID{height:" + ("auto")  + ";padding:" + (theme().field().padding().toString() + "")  + ";resize:" + ("none")  + ";}.GKNJ5M2AID{padding:" + (theme().field().padding().toString() + "")  + ";resize:" + ("none")  + ";}.GKNJ5M2IID .GKNJ5M2LID{height:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getHeight() + "px")  + ";width:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getSafeUri().asString() + "\") -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getLeft() + "px -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowOver()).getTop() + "px  no-repeat")  + ";}.GKNJ5M2BID .GKNJ5M2LID{height:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getHeight() + "px")  + ";width:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getSafeUri().asString() + "\") -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getLeft() + "px -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrowClick()).getTop() + "px  no-repeat")  + ";}.GKNJ5M2LID{height:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getHeight() + "px")  + ";width:" + ((SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getSafeUri().asString() + "\") -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getLeft() + "px -" + (SlicedTriggerFieldAppearance_SlicedTriggerFieldResources_default_InlineClientBundleGenerator.this.triggerArrow()).getTop() + "px  no-repeat")  + ";cursor:" + ("pointer")  + ";}"));
      }
      public java.lang.String area() {
        return "GKNJ5M2AID";
      }
      public java.lang.String click() {
        return "GKNJ5M2BID";
      }
      public java.lang.String empty() {
        return "GKNJ5M2CID";
      }
      public java.lang.String field() {
        return "GKNJ5M2DID";
      }
      public java.lang.String file() {
        return "GKNJ5M2EID";
      }
      public java.lang.String focus() {
        return "GKNJ5M2FID";
      }
      public java.lang.String invalid() {
        return "GKNJ5M2GID";
      }
      public java.lang.String noedit() {
        return "GKNJ5M2HID";
      }
      public java.lang.String over() {
        return "GKNJ5M2IID";
      }
      public java.lang.String readonly() {
        return "GKNJ5M2JID";
      }
      public java.lang.String text() {
        return "GKNJ5M2KID";
      }
      public java.lang.String trigger() {
        return "GKNJ5M2LID";
      }
      public java.lang.String wrap() {
        return "GKNJ5M2MID";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.sliced.field.SlicedTriggerFieldAppearance.SlicedTriggerFieldStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.sliced.field.SlicedTriggerFieldAppearance.SlicedTriggerFieldStyle style() {
    return styleInitializer.get();
  }
  private void themeInitializer() {
    theme = com.google.gwt.core.client.GWT.create(com.sencha.gxt.theme.neptune.client.ThemeDetails.class);
  }
  private static class themeInitializer {
    static {
      _instance0.themeInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.ThemeDetails get() {
      return theme;
    }
  }
  public com.sencha.gxt.theme.neptune.client.ThemeDetails theme() {
    return themeInitializer.get();
  }
  private void triggerArrowInitializer() {
    triggerArrow = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "triggerArrow",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, false, false
    );
  }
  private static class triggerArrowInitializer {
    static {
      _instance0.triggerArrowInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return triggerArrow;
    }
  }
  public com.google.gwt.resources.client.ImageResource triggerArrow() {
    return triggerArrowInitializer.get();
  }
  private void triggerArrowClickInitializer() {
    triggerArrowClick = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "triggerArrowClick",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 16, 16, false, false
    );
  }
  private static class triggerArrowClickInitializer {
    static {
      _instance0.triggerArrowClickInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return triggerArrowClick;
    }
  }
  public com.google.gwt.resources.client.ImageResource triggerArrowClick() {
    return triggerArrowClickInitializer.get();
  }
  private void triggerArrowOverInitializer() {
    triggerArrowOver = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "triggerArrowOver",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 16, 16, false, false
    );
  }
  private static class triggerArrowOverInitializer {
    static {
      _instance0.triggerArrowOverInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return triggerArrowOver;
    }
  }
  public com.google.gwt.resources.client.ImageResource triggerArrowOver() {
    return triggerArrowOverInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.neptune.client.sliced.field.SlicedTriggerFieldAppearance.SlicedTriggerFieldStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAW0lEQVR42mNgGAXUBd37n63u2v/0Pn78ZHH9/v8sWA3o2v9KAqjoOhD/x4a79z89XL//FQ9eV+AyhCjNaIY8RzLgONGaYaBn/zMNqCHXQQaSFagQQ8jUPAqIBwCbd3VIxhQ77gAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAXElEQVR42mNgGAXUBYcffFp95P6n+3jxg0+L9+//z4LVgP33v0gAFV0H4v9Y8YNPh/dfecWD1xU4DSFGM5ohz5EMOE60Zhg4dv+TBtSQ6yADyQpUkCFkax4FxAMAUUeFQPhHD2kAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAYUlEQVR42mNgGAXUBdtvvF+948b7+/jwzhvvF+/f/58FqwFbr7yS2HHjw3Wgwv848OH9V17x4HUFHkMIa0Yz5DlM886bH44TrRkGdt58owEx5MN1kIFkBSrIELI1jwLiAQDd9YHkkb1TWgAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource triggerArrow;
  private static com.google.gwt.resources.client.ImageResource triggerArrowClick;
  private static com.google.gwt.resources.client.ImageResource triggerArrowOver;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
      theme(), 
      triggerArrow(), 
      triggerArrowClick(), 
      triggerArrowOver(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
        resourceMap.put("triggerArrow", triggerArrow());
        resourceMap.put("triggerArrowClick", triggerArrowClick());
        resourceMap.put("triggerArrowOver", triggerArrowOver());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.sliced.field.SlicedTriggerFieldAppearance.SlicedTriggerFieldResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.field.Css3ValueBaseFieldAppearance.Css3ValueBaseFieldResources::theme()();
      case 'triggerArrow': return this.@com.sencha.gxt.theme.neptune.client.base.field.Css3TriggerFieldAppearance.Css3TriggerFieldResources::triggerArrow()();
      case 'triggerArrowClick': return this.@com.sencha.gxt.theme.neptune.client.base.field.Css3TriggerFieldAppearance.Css3TriggerFieldResources::triggerArrowClick()();
      case 'triggerArrowOver': return this.@com.sencha.gxt.theme.neptune.client.base.field.Css3TriggerFieldAppearance.Css3TriggerFieldResources::triggerArrowOver()();
    }
    return null;
  }-*/;
}
