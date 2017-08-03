package com.sencha.gxt.theme.neptune.client.base.mask;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.mask.Css3MaskAppearance.Css3MaskResources {
  private static Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator _instance0 = new Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator();
  private void loadingInitializer() {
    loading = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "loading",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, true, false
    );
  }
  private static class loadingInitializer {
    static {
      _instance0.loadingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return loading;
    }
  }
  public com.google.gwt.resources.client.ImageResource loading() {
    return loadingInitializer.get();
  }
  private void stylesInitializer() {
    styles = new com.sencha.gxt.theme.neptune.client.base.mask.Css3MaskAppearance.Css3MaskStyles() {
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
        return "styles";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GKNJ5M2JQC{z-index:" + ("100")  + ";top:" + ("0")  + ";right:" + ("0")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";position:" + ("absolute")  + ";opacity:" + (theme().mask().opacity() + "")  + ";background-color:" + (theme().mask().backgroundColor() + "")  + ";}.GKNJ5M2IQC{position:" + ("absolute")  + ";border-radius:" + (theme().mask().box().borderRadius() + "px")  + ";border-width:") + ((theme().mask().box().borderWidth() + "px")  + ";border-style:" + (theme().mask().box().borderStyle() + "")  + ";border-color:" + (theme().mask().box().borderColor() + "")  + ";padding:" + (theme().mask().box().radiusMinusBorderWidth() + "px")  + ";overflow:" + ("hidden")  + ";background-color:" + (theme().mask().box().backgroundColor() + "")  + ";}.GKNJ5M2MQC{height:" + ((Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getHeight() + "px")  + ";width:" + ((Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getSafeUri().asString() + "\") -" + (Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getLeft() + "px -" + (Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getTop() + "px  no-repeat")  + ";width:" + ("auto") ) + (";height:" + ("auto")  + ";background-position:" + (theme().mask().box().loadingImagePosition() + "")  + ";margin:" + (theme().mask().box().padding().toString() + "")  + ";padding:" + (theme().mask().box().textPadding().toString() + "")  + ";color:" + (theme().mask().box().text().color() + "")  + ";font-family:" + (theme().mask().box().text().family() + "")  + ";font-weight:" + (theme().mask().box().text().weight() + "")  + ";font-size:" + (theme().mask().box().text().size() + "")  + ";}.GKNJ5M2LQC{position:" + ("relative")  + " !important;}.GKNJ5M2KQC{overflow:" + ("hidden")  + " !important;}.GKNJ5M2KQC select,.GKNJ5M2KQC object,.GKNJ5M2KQC embed{visibility:") + (("hidden")  + ";}")) : ((".GKNJ5M2JQC{z-index:" + ("100")  + ";top:" + ("0")  + ";left:" + ("0")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";position:" + ("absolute")  + ";opacity:" + (theme().mask().opacity() + "")  + ";background-color:" + (theme().mask().backgroundColor() + "")  + ";}.GKNJ5M2IQC{position:" + ("absolute")  + ";border-radius:" + (theme().mask().box().borderRadius() + "px")  + ";border-width:") + ((theme().mask().box().borderWidth() + "px")  + ";border-style:" + (theme().mask().box().borderStyle() + "")  + ";border-color:" + (theme().mask().box().borderColor() + "")  + ";padding:" + (theme().mask().box().radiusMinusBorderWidth() + "px")  + ";overflow:" + ("hidden")  + ";background-color:" + (theme().mask().box().backgroundColor() + "")  + ";}.GKNJ5M2MQC{height:" + ((Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getHeight() + "px")  + ";width:" + ((Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getSafeUri().asString() + "\") -" + (Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getLeft() + "px -" + (Css3MaskAppearance_Css3MaskResources_default_InlineClientBundleGenerator.this.loading()).getTop() + "px  no-repeat")  + ";width:" + ("auto") ) + (";height:" + ("auto")  + ";background-position:" + (theme().mask().box().loadingImagePosition() + "")  + ";margin:" + (theme().mask().box().padding().toString() + "")  + ";padding:" + (theme().mask().box().textPadding().toString() + "")  + ";color:" + (theme().mask().box().text().color() + "")  + ";font-family:" + (theme().mask().box().text().family() + "")  + ";font-weight:" + (theme().mask().box().text().weight() + "")  + ";font-size:" + (theme().mask().box().text().size() + "")  + ";}.GKNJ5M2LQC{position:" + ("relative")  + " !important;}.GKNJ5M2KQC{overflow:" + ("hidden")  + " !important;}.GKNJ5M2KQC select,.GKNJ5M2KQC object,.GKNJ5M2KQC embed{visibility:") + (("hidden")  + ";}"));
      }
      public java.lang.String box() {
        return "GKNJ5M2IQC";
      }
      public java.lang.String mask() {
        return "GKNJ5M2JQC";
      }
      public java.lang.String masked() {
        return "GKNJ5M2KQC";
      }
      public java.lang.String positioned() {
        return "GKNJ5M2LQC";
      }
      public java.lang.String text() {
        return "GKNJ5M2MQC";
      }
    }
    ;
  }
  private static class stylesInitializer {
    static {
      _instance0.stylesInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.mask.Css3MaskAppearance.Css3MaskStyles get() {
      return styles;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.mask.Css3MaskAppearance.Css3MaskStyles styles() {
    return stylesInitializer.get();
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
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhEAAQALMMAKqooJGOhp2bk7e1rZ2bkre1rJCPhqqon8PBudDOxXd1bISCef///wAAAAAAAAAAACH/C05FVFNDQVBFMi4wAwEAAAAh+QQFAAAMACwAAAAAEAAQAAAET5DJyYyhmAZ7sxQEs1nMsmACGJKmSaVEOLXnK1PuBADepCiMg/DQ+/2GRI8RKOxJfpTCIJNIYArS6aRajWYZCASDa41Ow+Fx2YMWOyfpTAQAIfkEBQAADAAsAAAAABAAEAAABE6QyckEoZgKe7MEQMUxhoEd6FFdQWlOqTq15SlT9VQM3rQsjMKO5/n9hANixgjc9SQ/CgKRUSgw0ynFapVmGYkEg3v1gsPibg8tfk7CnggAIfkEBQAADAAsAAAAABAAEAAABE2QycnOoZjaA/IsRWV1goCBoMiUJTW8A0XMBPZmM4Ug3hQEjN2uZygahDyP0RBMEpmTRCKzWGCkUkq1SsFOFQrG1tr9gsPc3jnco4A9EQAh+QQFAAAMACwAAAAAEAAQAAAETpDJyUqhmFqbJ0LMIA7McWDfF5LmAVApOLUvLFMmlSTdJAiM3a73+wl5HYKSEET2lBSFIhMIYKRSimFriGIZiwWD2/WCw+Jt7xxeU9qZCAAh+QQFAAAMACwAAAAAEAAQAAAETZDJyRCimFqbZ0rVxgwF9n3hSJbeSQ2rCWIkpSjddBzMfee7nQ/XCfJ+OQYAQFksMgQBxumkEKLSCfVpMDCugqyW2w18xZmuwZycdDsRACH5BAUAAAwALAAAAAAQABAAAARNkMnJUqKYWpunUtXGIAj2feFIlt5JrWybkdSydNNQMLaND7pC79YBFnY+HENHMRgyhwPGaQhQotGm00oQMLBSLYPQ9QIASrLAq5x0OxEAIfkEBQAADAAsAAAAABAAEAAABE2QycmUopham+da1cYkCfZ94UiW3kmtbJuRlGF0E4Iwto3rut6tA9wFAjiJjkIgZAYDTLNJgUIpgqyAcTgwCuACJssAdL3gpLmbpLAzEQA7";
  private static com.google.gwt.resources.client.ImageResource loading;
  private static com.sencha.gxt.theme.neptune.client.base.mask.Css3MaskAppearance.Css3MaskStyles styles;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      loading(), 
      styles(), 
      theme(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("loading", loading());
        resourceMap.put("styles", styles());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'loading': return this.@com.sencha.gxt.theme.neptune.client.base.mask.Css3MaskAppearance.Css3MaskResources::loading()();
      case 'styles': return this.@com.sencha.gxt.theme.neptune.client.base.mask.Css3MaskAppearance.Css3MaskResources::styles()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.mask.Css3MaskAppearance.Css3MaskResources::theme()();
    }
    return null;
  }-*/;
}
