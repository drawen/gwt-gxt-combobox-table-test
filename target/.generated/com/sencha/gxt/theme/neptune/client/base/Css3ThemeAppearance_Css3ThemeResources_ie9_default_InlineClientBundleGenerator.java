package com.sencha.gxt.theme.neptune.client.base;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3ThemeAppearance_Css3ThemeResources_ie9_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeResources {
  private static Css3ThemeAppearance_Css3ThemeResources_ie9_default_InlineClientBundleGenerator _instance0 = new Css3ThemeAppearance_Css3ThemeResources_ie9_default_InlineClientBundleGenerator();
  private void moreIconInitializer() {
    moreIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "moreIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 1, false, false
    );
  }
  private static class moreIconInitializer {
    static {
      _instance0.moreIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return moreIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource moreIcon() {
    return moreIconInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeStyles() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GKNJ5M2FBC{border:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2HBC{border:" + ("none")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2IBC{border:" + ("none")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2JBC{border:" + ("none")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2GBC{border:" + ("none")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2KBC{color:" + (theme().disabledTextColor() + "")  + " !important;cursor:") + (("default")  + " !important;opacity:" + (theme().disabledOpacity() + "")  + ";}.GKNJ5M2KBC *{cursor:" + ("default")  + " !important;}")) : ((".GKNJ5M2FBC{border:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2HBC{border:" + ("none")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2IBC{border:" + ("none")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2JBC{border:" + ("none")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2GBC{border:" + ("none")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GKNJ5M2KBC{color:" + (theme().disabledTextColor() + "")  + " !important;cursor:") + (("default")  + " !important;opacity:" + (theme().disabledOpacity() + "")  + ";}.GKNJ5M2KBC *{cursor:" + ("default")  + " !important;}"));
      }
      public java.lang.String border() {
        return "GKNJ5M2FBC";
      }
      public java.lang.String borderBottom() {
        return "GKNJ5M2GBC";
      }
      public java.lang.String borderLeft() {
        return "GKNJ5M2HBC";
      }
      public java.lang.String borderRight() {
        return "GKNJ5M2IBC";
      }
      public java.lang.String borderTop() {
        return "GKNJ5M2JBC";
      }
      public java.lang.String disabled() {
        return "GKNJ5M2KBC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeStyles get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeStyles style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAAC0lEQVR42mNgAAIAAAUAAen63NgAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource moreIcon;
  private static com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeStyles style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      moreIcon(), 
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
        resourceMap.put("moreIcon", moreIcon());
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'moreIcon': return this.@com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeResources::moreIcon()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeResources::theme()();
    }
    return null;
  }-*/;
}
