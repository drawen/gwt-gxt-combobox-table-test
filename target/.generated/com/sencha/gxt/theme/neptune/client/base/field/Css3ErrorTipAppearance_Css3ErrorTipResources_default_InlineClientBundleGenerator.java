package com.sencha.gxt.theme.neptune.client.base.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.field.Css3ErrorTipAppearance.Css3ErrorTipResources {
  private static Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator _instance0 = new Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator();
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
    style = new com.sencha.gxt.theme.neptune.client.base.field.Css3ErrorTipAppearance.Css3ErrorTipStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GKNJ5M2AGC{border-color:" + (theme().errortip().border().color() + "")  + ";border-style:" + (theme().errortip().border().style() + "")  + ";border-width:" + (theme().errortip().border().toString() + "")  + ";border-radius:" + (theme().errortip().borderRadius() + "px")  + ";overflow:" + ("hidden")  + ";background-color:" + (theme().errortip().backgroundColor() + "")  + ";opacity:" + (theme().errortip().opacity() + "")  + ";margin:" + (theme().errortip().margin().toString() + "")  + ";padding:" + (theme().errortip().radiusMinusBorderWidth().toString() + "")  + ";}.GKNJ5M2PFC{padding:" + (theme().errortip().padding().toString() + "")  + ";}.GKNJ5M2BGC{float:") + (("left")  + ";}.GKNJ5M2LFC{color:" + (theme().errortip().headerText().color() + "")  + ";font-size:" + (theme().errortip().headerText().size() + "")  + ";font-weight:" + (theme().errortip().headerText().weight() + "")  + ";font-family:" + (theme().errortip().headerText().family() + "")  + ";}.GKNJ5M2MFC{padding:" + (theme().errortip().headerPadding().toString() + "")  + ";}.GKNJ5M2NFC{color:" + (theme().errortip().messageText().color() + "")  + ";font-size:" + (theme().errortip().messageText().size() + "")  + ";font-weight:" + (theme().errortip().messageText().weight() + "")  + ";font-family:" + (theme().errortip().messageText().family() + "")  + ";}.GKNJ5M2OFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getHeight() + "px") ) + (";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("-1"+ " " +"4px")  + ";padding-right:" + ("20px")  + ";margin:" + (theme().errortip().messagePadding().toString() + "")  + ";}.GKNJ5M2HFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getHeight() + "px")  + ";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2JFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getHeight() + "px")  + ";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2IFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getHeight() + "px")  + ";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2KFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getHeight() + "px")  + ";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}")) : ((".GKNJ5M2AGC{border-color:" + (theme().errortip().border().color() + "")  + ";border-style:" + (theme().errortip().border().style() + "")  + ";border-width:" + (theme().errortip().border().toString() + "")  + ";border-radius:" + (theme().errortip().borderRadius() + "px")  + ";overflow:" + ("hidden")  + ";background-color:" + (theme().errortip().backgroundColor() + "")  + ";opacity:" + (theme().errortip().opacity() + "")  + ";margin:" + (theme().errortip().margin().toString() + "")  + ";padding:" + (theme().errortip().radiusMinusBorderWidth().toString() + "")  + ";}.GKNJ5M2PFC{padding:" + (theme().errortip().padding().toString() + "")  + ";}.GKNJ5M2BGC{float:") + (("right")  + ";}.GKNJ5M2LFC{color:" + (theme().errortip().headerText().color() + "")  + ";font-size:" + (theme().errortip().headerText().size() + "")  + ";font-weight:" + (theme().errortip().headerText().weight() + "")  + ";font-family:" + (theme().errortip().headerText().family() + "")  + ";}.GKNJ5M2MFC{padding:" + (theme().errortip().headerPadding().toString() + "")  + ";}.GKNJ5M2NFC{color:" + (theme().errortip().messageText().color() + "")  + ";font-size:" + (theme().errortip().messageText().size() + "")  + ";font-weight:" + (theme().errortip().messageText().weight() + "")  + ";font-family:" + (theme().errortip().messageText().family() + "")  + ";}.GKNJ5M2OFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getHeight() + "px") ) + (";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.errorIcon()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("-1"+ " " +"4px")  + ";padding-left:" + ("20px")  + ";margin:" + (theme().errortip().messagePadding().toString() + "")  + ";}.GKNJ5M2HFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getHeight() + "px")  + ";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2JFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getHeight() + "px")  + ";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorRight()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2IFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getHeight() + "px")  + ";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2KFC{height:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getHeight() + "px")  + ";width:" + ((Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getSafeUri().asString() + "\") -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getLeft() + "px -" + (Css3ErrorTipAppearance_Css3ErrorTipResources_default_InlineClientBundleGenerator.this.anchorTop()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}"));
      }
      public java.lang.String anchor() {
        return "GKNJ5M2GFC";
      }
      public java.lang.String anchorBottom() {
        return "GKNJ5M2HFC";
      }
      public java.lang.String anchorLeft() {
        return "GKNJ5M2IFC";
      }
      public java.lang.String anchorRight() {
        return "GKNJ5M2JFC";
      }
      public java.lang.String anchorTop() {
        return "GKNJ5M2KFC";
      }
      public java.lang.String heading() {
        return "GKNJ5M2LFC";
      }
      public java.lang.String headingWrap() {
        return "GKNJ5M2MFC";
      }
      public java.lang.String text() {
        return "GKNJ5M2NFC";
      }
      public java.lang.String textWrap() {
        return "GKNJ5M2OFC";
      }
      public java.lang.String tip() {
        return "GKNJ5M2PFC";
      }
      public java.lang.String tipWrap() {
        return "GKNJ5M2AGC";
      }
      public java.lang.String tools() {
        return "GKNJ5M2BGC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.field.Css3ErrorTipAppearance.Css3ErrorTipStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.field.Css3ErrorTipAppearance.Css3ErrorTipStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAKCAYAAABmBXS+AAAAa0lEQVR42o2NWQqAMAwF3/1v2USrVqwr1AWMVhCqVnQgH4HJBKaf5WvwS9LGSm6HuNDNok3j4CFiKbrxIemynnCilJLUVBehaJ0Q0YKQvbaGNdaZw52wltte/I4YR82/YZ7whr8mTgRfxN5sVr3Xj3e0QV8AAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAJCAYAAAALpr0TAAAAXUlEQVR42oXOSwrAIAwEUO9/y9RPiCj4gbZ0k6JQUNA0MLs3Q5T6Oesj+/rwFgAAt2Asa/gBg54pXx1NcAcm2MChzRIsF7VFpnTKcCxYCkzlluH4igtZhmPBhdThC+K3wA/dcg9KAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAJCAYAAAALpr0TAAAAX0lEQVR42n2QSwrAIAwFvf8tE8VvqRVbrG5SbCm40ARmN48kT/jcqKP9ToKbXzRbIgB4YcWOjRdJbeeBUWQDM3EMAMpPXksnoVR1udqlQsq4yt5oQmyAeLNf63AUrsYHdZfXXJ9sf8gAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAKCAYAAABmBXS+AAAAZUlEQVR42p2N2wqAIBAF/f+/XE1Ns4sIRb2cUhDKrKCFedrZWcb+DBHhUyAu8CoS52inGVw0eKxI42DDBuV8vRYrxi9Jigipr+K5kjHH26tUVDLxMInS9tBDuAmpFlaobgSrLUt2yYy/50VCmugAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA3ElEQVR42mNgQAN3/CxVbviZN9/0Mz8OxPdB+Jav+f5b/hbVV7xMJRhwgf0ODiw3/M27gRp+A/F/HPg7EBdj1QyyBVWxWT1MHsRGM2gxigE3/SwmY9qG14D/cJfcCjA1wO5cggZ8B4fJTV+z2WQa8B8UsAzQkCbPAGC4MeAOccIGgCyn1IDHIAOeU2DAcZABi/EkHLwYlGIZrgdYOJBpwG9QsoekBT/z1aR6AZTs4SnxSqgDD1DwOrEGgKIPlPxRkjPIEOwuQccWkzE0IwNomCxGi537oBQLSvbo6gFSFryKtaWMlAAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource anchorBottom;
  private static com.google.gwt.resources.client.ImageResource anchorLeft;
  private static com.google.gwt.resources.client.ImageResource anchorRight;
  private static com.google.gwt.resources.client.ImageResource anchorTop;
  private static com.google.gwt.resources.client.ImageResource errorIcon;
  private static com.sencha.gxt.theme.neptune.client.base.field.Css3ErrorTipAppearance.Css3ErrorTipStyle style;
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
      case 'anchorBottom': return this.@com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipResources::anchorBottom()();
      case 'anchorLeft': return this.@com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipResources::anchorLeft()();
      case 'anchorRight': return this.@com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipResources::anchorRight()();
      case 'anchorTop': return this.@com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipResources::anchorTop()();
      case 'errorIcon': return this.@com.sencha.gxt.theme.neptune.client.base.field.Css3ErrorTipAppearance.Css3ErrorTipResources::errorIcon()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.field.Css3ErrorTipAppearance.Css3ErrorTipResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipResources::theme()();
    }
    return null;
  }-*/;
}
