package com.sencha.gxt.theme.neptune.client.sliced.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.field.SlicedErrorTipAppearance.SlicedErrorTipResources {
  private static SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator _instance0 = new SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator();
  private void anchorBottomInitializer() {
    anchorBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "anchorBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 9, 10, false, false
    );
  }
  private static class anchorBottomInitializer {
    static {
      _instance0.anchorBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return anchorBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource anchorBottom() {
    return anchorBottomInitializer.get();
  }
  private void anchorLeftInitializer() {
    anchorLeft = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "anchorLeft",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 10, 9, false, false
    );
  }
  private static class anchorLeftInitializer {
    static {
      _instance0.anchorLeftInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return anchorLeft;
    }
  }
  public com.google.gwt.resources.client.ImageResource anchorLeft() {
    return anchorLeftInitializer.get();
  }
  private void anchorRightInitializer() {
    anchorRight = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "anchorRight",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 10, 9, false, false
    );
  }
  private static class anchorRightInitializer {
    static {
      _instance0.anchorRightInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return anchorRight;
    }
  }
  public com.google.gwt.resources.client.ImageResource anchorRight() {
    return anchorRightInitializer.get();
  }
  private void anchorTopInitializer() {
    anchorTop = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "anchorTop",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 9, 10, false, false
    );
  }
  private static class anchorTopInitializer {
    static {
      _instance0.anchorTopInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return anchorTop;
    }
  }
  public com.google.gwt.resources.client.ImageResource anchorTop() {
    return anchorTopInitializer.get();
  }
  private void errorIconInitializer() {
    errorIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "errorIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 16, 16, false, false
    );
  }
  private static class errorIconInitializer {
    static {
      _instance0.errorIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return errorIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource errorIcon() {
    return errorIconInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.sliced.field.SlicedErrorTipAppearance.SlicedErrorTipStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GKNJ5M2FDD{padding:" + ("2px")  + ";font-size:" + ("12px")  + ";}.GKNJ5M2GDD{float:" + ("left")  + ";}.GKNJ5M2CDD{color:" + ("#444")  + ";font:" + ("bold"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GKNJ5M2DDD{color:" + ("#444")  + ";font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GKNJ5M2OCD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2ADD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2PCD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getTop() + "px  no-repeat") ) + (";position:" + ("absolute")  + ";}.GKNJ5M2BDD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2CDD{color:" + (theme().errortip().headerText().color() + "")  + ";font-size:" + (theme().errortip().headerText().size() + "")  + ";font-weight:" + (theme().errortip().headerText().weight() + "")  + ";font-family:" + (theme().errortip().headerText().family() + "")  + ";padding:") + ((theme().errortip().headerPadding().toString() + "")  + ";}.GKNJ5M2DDD{color:" + (theme().errortip().messageText().color() + "")  + ";font-size:" + (theme().errortip().messageText().size() + "")  + ";font-weight:" + (theme().errortip().messageText().weight() + "")  + ";font-family:" + (theme().errortip().messageText().family() + "")  + ";padding:" + (theme().errortip().messagePadding().toString() + "")  + ";}.GKNJ5M2EDD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getTop() + "px  no-repeat")  + ";width:" + ("auto") ) + (";height:" + ("auto")  + ";background-position:" + ("-1"+ " " +"4px")  + ";padding-right:" + ("20px")  + ";}")) : ((".GKNJ5M2FDD{padding:" + ("2px")  + ";font-size:" + ("12px")  + ";}.GKNJ5M2GDD{float:" + ("right")  + ";}.GKNJ5M2CDD{color:" + ("#444")  + ";font:" + ("bold"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GKNJ5M2DDD{color:" + ("#444")  + ";font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GKNJ5M2OCD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorBottom()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2ADD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorRight()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2PCD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorLeft()).getTop() + "px  no-repeat") ) + (";position:" + ("absolute")  + ";}.GKNJ5M2BDD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.anchorTop()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2CDD{color:" + (theme().errortip().headerText().color() + "")  + ";font-size:" + (theme().errortip().headerText().size() + "")  + ";font-weight:" + (theme().errortip().headerText().weight() + "")  + ";font-family:" + (theme().errortip().headerText().family() + "")  + ";padding:") + ((theme().errortip().headerPadding().toString() + "")  + ";}.GKNJ5M2DDD{color:" + (theme().errortip().messageText().color() + "")  + ";font-size:" + (theme().errortip().messageText().size() + "")  + ";font-weight:" + (theme().errortip().messageText().weight() + "")  + ";font-family:" + (theme().errortip().messageText().family() + "")  + ";padding:" + (theme().errortip().messagePadding().toString() + "")  + ";}.GKNJ5M2EDD{height:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getHeight() + "px")  + ";width:" + ((SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getSafeUri().asString() + "\") -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getLeft() + "px -" + (SlicedErrorTipAppearance_SlicedErrorTipResources_ie10_default_InlineClientBundleGenerator.this.errorIcon()).getTop() + "px  no-repeat")  + ";width:" + ("auto") ) + (";height:" + ("auto")  + ";background-position:" + ("-1"+ " " +"4px")  + ";padding-left:" + ("20px")  + ";}"));
      }
      public java.lang.String anchor() {
        return "GKNJ5M2NCD";
      }
      public java.lang.String anchorBottom() {
        return "GKNJ5M2OCD";
      }
      public java.lang.String anchorLeft() {
        return "GKNJ5M2PCD";
      }
      public java.lang.String anchorRight() {
        return "GKNJ5M2ADD";
      }
      public java.lang.String anchorTop() {
        return "GKNJ5M2BDD";
      }
      public java.lang.String heading() {
        return "GKNJ5M2CDD";
      }
      public java.lang.String text() {
        return "GKNJ5M2DDD";
      }
      public java.lang.String textWrap() {
        return "GKNJ5M2EDD";
      }
      public java.lang.String tip() {
        return "GKNJ5M2FDD";
      }
      public java.lang.String tools() {
        return "GKNJ5M2GDD";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.sliced.field.SlicedErrorTipAppearance.SlicedErrorTipStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.sliced.field.SlicedErrorTipAppearance.SlicedErrorTipStyle style() {
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
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAKCAYAAABmBXS+AAAAVElEQVR42mO4/+nHfxB+9ek/BobJMdTMOP7/5qMPWBWBxEHyYEXztlzHqggkDlYEAthMg5sCA9hMQzEFWSHMNAxTsJmG1RR003AqQDYNryKYQnQxABRnx++6FJdrAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAJCAYAAAALpr0TAAAAOklEQVR42mNgwANqZhz/D8L3P/34j1fBvC3X/9989AFTIbqCV5/+wzFBBXCFhBSQbiJJbiTZ1/jCEQBrQsfv1FZtNAAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAJCAYAAAALpr0TAAAAPElEQVR42mO4/+nH/5oZx8GYAR8AKbz56MP/eVuu49fw6tP//zCMVwOyQrwasCnEpoE8E/G6kWhfExuOAKRxx+8lO1+5AAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAKCAYAAABmBXS+AAAAUElEQVR42mNgQAM1M47/Z8AHQArmbbn+H69CkOTNRx9wK4KZ8urTf9ymwUwBKcJqGrIpMIxhGrIpMIxiGjZTMEzDZgqGafc//fgPwtgUweQAw0vH75rkqhIAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage3 = GWT.getModuleBaseForStaticFiles() + "4569D375C291A47843EF34FCA7063038.cache.png";
  private static com.google.gwt.resources.client.ImageResource anchorBottom;
  private static com.google.gwt.resources.client.ImageResource anchorLeft;
  private static com.google.gwt.resources.client.ImageResource anchorRight;
  private static com.google.gwt.resources.client.ImageResource anchorTop;
  private static com.google.gwt.resources.client.ImageResource errorIcon;
  private static com.sencha.gxt.theme.neptune.client.sliced.field.SlicedErrorTipAppearance.SlicedErrorTipStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      anchorBottom(), 
      anchorLeft(), 
      anchorRight(), 
      anchorTop(), 
      errorIcon(), 
      style(), 
      theme(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("anchorBottom", anchorBottom());
        resourceMap.put("anchorLeft", anchorLeft());
        resourceMap.put("anchorRight", anchorRight());
        resourceMap.put("anchorTop", anchorTop());
        resourceMap.put("errorIcon", errorIcon());
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'anchorBottom': return this.@com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipResources::anchorBottom()();
      case 'anchorLeft': return this.@com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipResources::anchorLeft()();
      case 'anchorRight': return this.@com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipResources::anchorRight()();
      case 'anchorTop': return this.@com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipResources::anchorTop()();
      case 'errorIcon': return this.@com.sencha.gxt.theme.neptune.client.sliced.field.SlicedErrorTipAppearance.SlicedErrorTipResources::errorIcon()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.sliced.field.SlicedErrorTipAppearance.SlicedErrorTipResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.sliced.field.SlicedErrorTipAppearance.SlicedErrorTipResources::theme()();
    }
    return null;
  }-*/;
}
