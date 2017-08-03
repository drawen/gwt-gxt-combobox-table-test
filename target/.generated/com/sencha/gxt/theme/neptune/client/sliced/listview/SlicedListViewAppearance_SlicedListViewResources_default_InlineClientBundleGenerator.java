package com.sencha.gxt.theme.neptune.client.sliced.listview;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.listview.SlicedListViewAppearance.SlicedListViewResources {
  private static SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator _instance0 = new SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.neptune.client.sliced.listview.SlicedListViewAppearance.SlicedListViewStyle() {
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
        return "css";
      }
      public String getText() {
        return (".GKNJ5M2FMD{outline:" + ("0"+ " " +"none")  + ";position:" + ("relative")  + ";background-color:" + (theme().listview().backgroundColor() + "")  + ";border-width:" + (theme().listview().border().toString() + "")  + ";border-style:" + (theme().listview().border().style() + "")  + ";border-color:" + (theme().listview().border().color() + "")  + ";overflow-y:" + ("auto")  + ";}.GKNJ5M2CMD{height:" + ((SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemBackground()).getSafeUri().asString() + "\") -" + (SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemBackground()).getLeft() + "px -" + (SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemBackground()).getTop() + "px  repeat-x")  + ";height:") + (("auto")  + ";color:" + (theme().listview().text().color() + "")  + ";font-family:" + (theme().listview().text().family() + "")  + ";font-size:" + (theme().listview().text().size() + "")  + ";font-weight:" + (theme().listview().text().weight() + "")  + ";line-height:" + (theme().listview().lineHeight() + "")  + ";white-space:" + ("nowrap")  + ";text-overflow:" + ("ellipsis")  + ";cursor:" + ("pointer")  + ";border-width:" + (theme().listview().item().border().toString() + "")  + ";border-style:" + (theme().listview().item().border().style() + "") ) + (";border-color:" + (theme().listview().item().border().color() + "")  + ";padding:" + (theme().listview().item().padding() + "")  + ";}.GKNJ5M2DMD{height:" + ((SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemOverBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemOverBackground()).getSafeUri().asString() + "\") -" + (SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemOverBackground()).getLeft() + "px -" + (SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemOverBackground()).getTop() + "px  repeat-x")  + ";height:" + ("auto")  + ";border-width:" + (theme().listview().overItem().border().toString() + "")  + ";border-style:" + (theme().listview().overItem().border().style() + "")  + ";border-color:" + (theme().listview().overItem().border().color() + "")  + ";padding:" + (theme().listview().overItem().padding() + "")  + ";}.GKNJ5M2EMD{height:") + (((SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemSelectedBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemSelectedBackground()).getSafeUri().asString() + "\") -" + (SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemSelectedBackground()).getLeft() + "px -" + (SlicedListViewAppearance_SlicedListViewResources_default_InlineClientBundleGenerator.this.itemSelectedBackground()).getTop() + "px  repeat-x")  + ";height:" + ("auto")  + ";border-width:" + (theme().listview().selectedItem().border().toString() + "")  + ";border-style:" + (theme().listview().selectedItem().border().style() + "")  + ";border-color:" + (theme().listview().selectedItem().border().color() + "")  + ";padding:" + (theme().listview().selectedItem().padding() + "")  + ";}");
      }
      public java.lang.String item() {
        return "GKNJ5M2CMD";
      }
      public java.lang.String over() {
        return "GKNJ5M2DMD";
      }
      public java.lang.String sel() {
        return "GKNJ5M2EMD";
      }
      public java.lang.String view() {
        return "GKNJ5M2FMD";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.sliced.listview.SlicedListViewAppearance.SlicedListViewStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.neptune.client.sliced.listview.SlicedListViewAppearance.SlicedListViewStyle css() {
    return cssInitializer.get();
  }
  private void itemBackgroundInitializer() {
    itemBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "itemBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 800, false, false
    );
  }
  private static class itemBackgroundInitializer {
    static {
      _instance0.itemBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return itemBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource itemBackground() {
    return itemBackgroundInitializer.get();
  }
  private void itemOverBackgroundInitializer() {
    itemOverBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "itemOverBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 1, 800, false, false
    );
  }
  private static class itemOverBackgroundInitializer {
    static {
      _instance0.itemOverBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return itemOverBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource itemOverBackground() {
    return itemOverBackgroundInitializer.get();
  }
  private void itemSelectedBackgroundInitializer() {
    itemSelectedBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "itemSelectedBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 1, 800, false, false
    );
  }
  private static class itemSelectedBackgroundInitializer {
    static {
      _instance0.itemSelectedBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return itemSelectedBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource itemSelectedBackground() {
    return itemSelectedBackgroundInitializer.get();
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
  private static com.sencha.gxt.theme.neptune.client.sliced.listview.SlicedListViewAppearance.SlicedListViewStyle css;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAMgCAYAAADiDQiHAAAAH0lEQVR42u3EMQEAAAwCIPuX1rXYAwfpiSRJkiRJ+mwbFHQ1Chfn/gAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAMgCAMAAADV0/i1AAAAA1BMVEXW6PbsB1qVAAAAFUlEQVR42mNgGAWjYBSMglEwCkgHAAZAAAGx2S2jAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAMgCAMAAADV0/i1AAAAA1BMVEXB3fHJO7h1AAAAFUlEQVR42mNgGAWjYBSMglEwCkgHAAZAAAGx2S2jAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource itemBackground;
  private static com.google.gwt.resources.client.ImageResource itemOverBackground;
  private static com.google.gwt.resources.client.ImageResource itemSelectedBackground;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
      itemBackground(), 
      itemOverBackground(), 
      itemSelectedBackground(), 
      theme(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
        resourceMap.put("itemBackground", itemBackground());
        resourceMap.put("itemOverBackground", itemOverBackground());
        resourceMap.put("itemSelectedBackground", itemSelectedBackground());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.neptune.client.sliced.listview.SlicedListViewAppearance.SlicedListViewResources::css()();
      case 'itemBackground': return this.@com.sencha.gxt.theme.neptune.client.sliced.listview.SlicedListViewAppearance.SlicedListViewResources::itemBackground()();
      case 'itemOverBackground': return this.@com.sencha.gxt.theme.neptune.client.sliced.listview.SlicedListViewAppearance.SlicedListViewResources::itemOverBackground()();
      case 'itemSelectedBackground': return this.@com.sencha.gxt.theme.neptune.client.sliced.listview.SlicedListViewAppearance.SlicedListViewResources::itemSelectedBackground()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewResources::theme()();
    }
    return null;
  }-*/;
}
