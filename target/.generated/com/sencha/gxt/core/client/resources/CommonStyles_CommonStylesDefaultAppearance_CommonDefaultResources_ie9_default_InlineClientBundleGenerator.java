package com.sencha.gxt.core.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator implements com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultResources {
  private static CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator _instance0 = new CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator();
  private void shimInitializer() {
    shim = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "shim",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 1, false, false
    );
  }
  private static class shimInitializer {
    static {
      _instance0.shimInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return shim;
    }
  }
  public com.google.gwt.resources.client.ImageResource shim() {
    return shimInitializer.get();
  }
  private void stylesInitializer() {
    styles = new com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GKNJ5M2FK,.GKNJ5M2FK:focus{outline:" + ("none")  + ";}.GKNJ5M2IK{position:" + ("absolute")  + " !important;right:" + ("0")  + ";top:" + ("0")  + ";}.GKNJ5M2AK{display:" + ("none")  + " !important;}.GKNJ5M2BK{position:" + ("absolute")  + " !important;right:" + ("-10000px")  + " !important;top:" + ("-10000px")  + " !important;visibility:" + ("hidden")  + " !important;}.GKNJ5M2CK{visibility:" + ("hidden")  + " !important;}.GKNJ5M2LK,.GKNJ5M2LK *{-moz-user-select:") + (("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.GKNJ5M2MK{-moz-user-select:" + ("-moz-none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.x-clear{clear:" + ("both")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";font-size:" + ("0")  + ";}.GKNJ5M2OJ{float:" + ("right") ) + (";}.GKNJ5M2PJ{float:" + ("left")  + ";}.GKNJ5M2MJ{cursor:" + ("w-resize")  + ";cursor:" + ("col-resize")  + ";}.GKNJ5M2NJ{cursor:" + ("n-resize")  + ";cursor:" + ("row-resize")  + ";}.GKNJ5M2EK{position:" + ("relative")  + ";display:" + ("inline-block")  + ";}.GKNJ5M2HK{white-space:" + ("nowrap")  + ";}.GKNJ5M2KK{height:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";width:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("20000")  + ";}")) : ((".GKNJ5M2FK,.GKNJ5M2FK:focus{outline:" + ("none")  + ";}.GKNJ5M2IK{position:" + ("absolute")  + " !important;left:" + ("0")  + ";top:" + ("0")  + ";}.GKNJ5M2AK{display:" + ("none")  + " !important;}.GKNJ5M2BK{position:" + ("absolute")  + " !important;left:" + ("-10000px")  + " !important;top:" + ("-10000px")  + " !important;visibility:" + ("hidden")  + " !important;}.GKNJ5M2CK{visibility:" + ("hidden")  + " !important;}.GKNJ5M2LK,.GKNJ5M2LK *{-moz-user-select:") + (("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.GKNJ5M2MK{-moz-user-select:" + ("-moz-none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.x-clear{clear:" + ("both")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";font-size:" + ("0")  + ";}.GKNJ5M2OJ{float:" + ("left") ) + (";}.GKNJ5M2PJ{float:" + ("right")  + ";}.GKNJ5M2MJ{cursor:" + ("e-resize")  + ";cursor:" + ("col-resize")  + ";}.GKNJ5M2NJ{cursor:" + ("n-resize")  + ";cursor:" + ("row-resize")  + ";}.GKNJ5M2EK{position:" + ("relative")  + ";display:" + ("inline-block")  + ";}.GKNJ5M2HK{white-space:" + ("nowrap")  + ";}.GKNJ5M2KK{height:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";width:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_ie9_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("20000")  + ";}"));
      }
      public java.lang.String clear() {
        return "x-clear";
      }
      public java.lang.String columnResize() {
        return "GKNJ5M2MJ";
      }
      public java.lang.String columnRowResize() {
        return "GKNJ5M2NJ";
      }
      public java.lang.String floatLeft() {
        return "GKNJ5M2OJ";
      }
      public java.lang.String floatRight() {
        return "GKNJ5M2PJ";
      }
      public java.lang.String hideDisplay() {
        return "GKNJ5M2AK";
      }
      public java.lang.String hideOffsets() {
        return "GKNJ5M2BK";
      }
      public java.lang.String hideVisibility() {
        return "GKNJ5M2CK";
      }
      public java.lang.String ignore() {
        return "GKNJ5M2DK";
      }
      public java.lang.String inlineBlock() {
        return "GKNJ5M2EK";
      }
      public java.lang.String noFocusOutline() {
        return "GKNJ5M2FK";
      }
      public java.lang.String nodrag() {
        return "GKNJ5M2GK";
      }
      public java.lang.String nowrap() {
        return "GKNJ5M2HK";
      }
      public java.lang.String positionable() {
        return "GKNJ5M2IK";
      }
      public java.lang.String repaint() {
        return "GKNJ5M2JK";
      }
      public java.lang.String shim() {
        return "GKNJ5M2KK";
      }
      public java.lang.String unselectable() {
        return "GKNJ5M2LK";
      }
      public java.lang.String unselectableSingle() {
        return "GKNJ5M2MK";
      }
    }
    ;
  }
  private static class stylesInitializer {
    static {
      _instance0.stylesInitializer();
    }
    static com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles get() {
      return styles;
    }
  }
  public com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles styles() {
    return stylesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhAQABAID/AMDAwAAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==";
  private static com.google.gwt.resources.client.ImageResource shim;
  private static com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles styles;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      shim(), 
      styles(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("shim", shim());
        resourceMap.put("styles", styles());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'shim': return this.@com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultResources::shim()();
      case 'styles': return this.@com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultResources::styles()();
    }
    return null;
  }-*/;
}
