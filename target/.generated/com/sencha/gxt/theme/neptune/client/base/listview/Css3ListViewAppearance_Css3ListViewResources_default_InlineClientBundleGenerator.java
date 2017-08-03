package com.sencha.gxt.theme.neptune.client.base.listview;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3ListViewAppearance_Css3ListViewResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewResources {
  private static Css3ListViewAppearance_Css3ListViewResources_default_InlineClientBundleGenerator _instance0 = new Css3ListViewAppearance_Css3ListViewResources_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewStyle() {
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
        return (".GKNJ5M2HQC{outline:" + ("0"+ " " +"none")  + ";position:" + ("relative")  + ";background-color:" + (theme().listview().backgroundColor() + "")  + ";border-width:" + (theme().listview().border().toString() + "")  + ";border-style:" + (theme().listview().border().style() + "")  + ";border-color:" + (theme().listview().border().color() + "")  + ";overflow-y:" + ("auto")  + ";}.GKNJ5M2EQC{color:" + (theme().listview().text().color() + "")  + ";font-family:" + (theme().listview().text().family() + "")  + ";font-size:" + (theme().listview().text().size() + "")  + ";font-weight:") + ((theme().listview().text().weight() + "")  + ";line-height:" + (theme().listview().lineHeight() + "")  + ";white-space:" + ("nowrap")  + ";text-overflow:" + ("ellipsis")  + ";cursor:" + ("pointer")  + ";border-width:" + (theme().listview().item().border().toString() + "")  + ";border-style:" + (theme().listview().item().border().style() + "")  + ";border-color:" + (theme().listview().item().border().color() + "")  + ";padding:" + (theme().listview().item().padding() + "")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().listview().item().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().listview().item().gradient() + "" + ")") ) + (";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().listview().item().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().listview().item().gradient() + "" + ")")  + ";}.GKNJ5M2FQC{border-width:" + (theme().listview().overItem().border().toString() + "")  + ";border-style:" + (theme().listview().overItem().border().style() + "")  + ";border-color:" + (theme().listview().overItem().border().color() + "")  + ";padding:" + (theme().listview().overItem().padding() + "")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().listview().overItem().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().listview().overItem().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().listview().overItem().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().listview().overItem().gradient() + "" + ")")  + ";}.GKNJ5M2GQC{border-width:") + ((theme().listview().selectedItem().border().toString() + "")  + ";border-style:" + (theme().listview().selectedItem().border().style() + "")  + ";border-color:" + (theme().listview().selectedItem().border().color() + "")  + ";padding:" + (theme().listview().selectedItem().padding() + "")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().listview().selectedItem().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().listview().selectedItem().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().listview().selectedItem().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().listview().selectedItem().gradient() + "" + ")")  + ";}");
      }
      public java.lang.String item() {
        return "GKNJ5M2EQC";
      }
      public java.lang.String over() {
        return "GKNJ5M2FQC";
      }
      public java.lang.String sel() {
        return "GKNJ5M2GQC";
      }
      public java.lang.String view() {
        return "GKNJ5M2HQC";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewStyle css() {
    return cssInitializer.get();
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
  private static com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewStyle css;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
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
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewResources::css()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewResources::theme()();
    }
    return null;
  }-*/;
}
