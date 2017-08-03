package com.sencha.gxt.theme.neptune.client.base.tips;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipResources {
  private static Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator _instance0 = new Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator();
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
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GKNJ5M2I1C{border-color:" + (theme().tip().border().color() + "")  + ";border-style:" + (theme().tip().border().style() + "")  + ";border-width:" + (theme().tip().border().toString() + "")  + ";border-radius:" + (theme().tip().borderRadius() + "px")  + ";background-color:" + (theme().tip().backgroundColor() + "")  + ";opacity:" + (theme().tip().opacity() + "")  + ";margin:" + (theme().tip().margin().toString() + "")  + ";padding:" + (theme().tip().radiusMinusBorderWidth().toString() + "")  + ";}.GKNJ5M2H1C{padding:" + (theme().tip().padding().toString() + "")  + ";}.GKNJ5M2J1C{float:" + ("left")  + ";}.GKNJ5M2D1C{color:") + ((theme().tip().headerText().color() + "")  + ";font-size:" + (theme().tip().headerText().size() + "")  + ";font-weight:" + (theme().tip().headerText().weight() + "")  + ";font-family:" + (theme().tip().headerText().family() + "")  + ";}.GKNJ5M2E1C{padding:" + (theme().tip().headerPadding().toString() + "")  + ";}.GKNJ5M2F1C{color:" + (theme().tip().messageText().color() + "")  + ";font-size:" + (theme().tip().messageText().size() + "")  + ";font-weight:" + (theme().tip().messageText().weight() + "")  + ";font-family:" + (theme().tip().messageText().family() + "")  + ";}.GKNJ5M2G1C{padding:" + (theme().tip().messagePadding().toString() + "")  + ";}.GKNJ5M2P0C{height:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getHeight() + "px") ) + (";width:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getSafeUri().asString() + "\") -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getLeft() + "px -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2B1C{height:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getHeight() + "px")  + ";width:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getSafeUri().asString() + "\") -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getLeft() + "px -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2A1C{height:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getHeight() + "px")  + ";width:") + (((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getSafeUri().asString() + "\") -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getLeft() + "px -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2C1C{height:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getHeight() + "px")  + ";width:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getSafeUri().asString() + "\") -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getLeft() + "px -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}")) : ((".GKNJ5M2I1C{border-color:" + (theme().tip().border().color() + "")  + ";border-style:" + (theme().tip().border().style() + "")  + ";border-width:" + (theme().tip().border().toString() + "")  + ";border-radius:" + (theme().tip().borderRadius() + "px")  + ";background-color:" + (theme().tip().backgroundColor() + "")  + ";opacity:" + (theme().tip().opacity() + "")  + ";margin:" + (theme().tip().margin().toString() + "")  + ";padding:" + (theme().tip().radiusMinusBorderWidth().toString() + "")  + ";}.GKNJ5M2H1C{padding:" + (theme().tip().padding().toString() + "")  + ";}.GKNJ5M2J1C{float:" + ("right")  + ";}.GKNJ5M2D1C{color:") + ((theme().tip().headerText().color() + "")  + ";font-size:" + (theme().tip().headerText().size() + "")  + ";font-weight:" + (theme().tip().headerText().weight() + "")  + ";font-family:" + (theme().tip().headerText().family() + "")  + ";}.GKNJ5M2E1C{padding:" + (theme().tip().headerPadding().toString() + "")  + ";}.GKNJ5M2F1C{color:" + (theme().tip().messageText().color() + "")  + ";font-size:" + (theme().tip().messageText().size() + "")  + ";font-weight:" + (theme().tip().messageText().weight() + "")  + ";font-family:" + (theme().tip().messageText().family() + "")  + ";}.GKNJ5M2G1C{padding:" + (theme().tip().messagePadding().toString() + "")  + ";}.GKNJ5M2P0C{height:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getHeight() + "px") ) + (";width:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getSafeUri().asString() + "\") -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getLeft() + "px -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorBottom()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2B1C{height:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getHeight() + "px")  + ";width:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getSafeUri().asString() + "\") -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getLeft() + "px -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorRight()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2A1C{height:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getHeight() + "px")  + ";width:") + (((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getSafeUri().asString() + "\") -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getLeft() + "px -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorLeft()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GKNJ5M2C1C{height:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getHeight() + "px")  + ";width:" + ((Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getSafeUri().asString() + "\") -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getLeft() + "px -" + (Css3TipAppearance_Css3TipResources_default_InlineClientBundleGenerator.this.anchorTop()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}"));
      }
      public java.lang.String anchor() {
        return "GKNJ5M2O0C";
      }
      public java.lang.String anchorBottom() {
        return "GKNJ5M2P0C";
      }
      public java.lang.String anchorLeft() {
        return "GKNJ5M2A1C";
      }
      public java.lang.String anchorRight() {
        return "GKNJ5M2B1C";
      }
      public java.lang.String anchorTop() {
        return "GKNJ5M2C1C";
      }
      public java.lang.String heading() {
        return "GKNJ5M2D1C";
      }
      public java.lang.String headingWrap() {
        return "GKNJ5M2E1C";
      }
      public java.lang.String text() {
        return "GKNJ5M2F1C";
      }
      public java.lang.String textWrap() {
        return "GKNJ5M2G1C";
      }
      public java.lang.String tip() {
        return "GKNJ5M2H1C";
      }
      public java.lang.String tipWrap() {
        return "GKNJ5M2I1C";
      }
      public java.lang.String tools() {
        return "GKNJ5M2J1C";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipStyle style() {
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
  private static com.google.gwt.resources.client.ImageResource anchorBottom;
  private static com.google.gwt.resources.client.ImageResource anchorLeft;
  private static com.google.gwt.resources.client.ImageResource anchorRight;
  private static com.google.gwt.resources.client.ImageResource anchorTop;
  private static com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      anchorBottom(), 
      anchorLeft(), 
      anchorRight(), 
      anchorTop(), 
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
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.tips.Css3TipAppearance.Css3TipResources::theme()();
    }
    return null;
  }-*/;
}
