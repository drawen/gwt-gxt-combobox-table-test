package com.sencha.gxt.theme.neptune.client.base.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources {
  private static Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator _instance0 = new Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator();
  private void arrowInitializer() {
    arrow = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "arrow",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 10, 10, false, false
    );
  }
  private static class arrowInitializer {
    static {
      _instance0.arrowInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return arrow;
    }
  }
  public com.google.gwt.resources.client.ImageResource arrow() {
    return arrowInitializer.get();
  }
  private void arrowBottomInitializer() {
    arrowBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "arrowBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 200, 14, false, false
    );
  }
  private static class arrowBottomInitializer {
    static {
      _instance0.arrowBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return arrowBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource arrowBottom() {
    return arrowBottomInitializer.get();
  }
  private void splitInitializer() {
    split = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "split",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 14, 72, false, false
    );
  }
  private static class splitInitializer {
    static {
      _instance0.splitInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return split;
    }
  }
  public com.google.gwt.resources.client.ImageResource split() {
    return splitInitializer.get();
  }
  private void splitBottomInitializer() {
    splitBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "splitBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 200, 14, false, false
    );
  }
  private static class splitBottomInitializer {
    static {
      _instance0.splitBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return splitBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource splitBottom() {
    return splitBottomInitializer.get();
  }
  private void toolBarArrowInitializer() {
    toolBarArrow = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "toolBarArrow",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 10, 10, false, false
    );
  }
  private static class toolBarArrowInitializer {
    static {
      _instance0.toolBarArrowInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return toolBarArrow;
    }
  }
  public com.google.gwt.resources.client.ImageResource toolBarArrow() {
    return toolBarArrowInitializer.get();
  }
  private void toolBarArrowBottomInitializer() {
    toolBarArrowBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "toolBarArrowBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage4),
      0, 0, 200, 14, false, false
    );
  }
  private static class toolBarArrowBottomInitializer {
    static {
      _instance0.toolBarArrowBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return toolBarArrowBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource toolBarArrowBottom() {
    return toolBarArrowBottomInitializer.get();
  }
  private void toolBarSplitInitializer() {
    toolBarSplit = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "toolBarSplit",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage5),
      0, 0, 14, 72, false, false
    );
  }
  private static class toolBarSplitInitializer {
    static {
      _instance0.toolBarSplitInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return toolBarSplit;
    }
  }
  public com.google.gwt.resources.client.ImageResource toolBarSplit() {
    return toolBarSplitInitializer.get();
  }
  private void toolBarSplitBottomInitializer() {
    toolBarSplitBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "toolBarSplitBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage6),
      0, 0, 200, 14, false, false
    );
  }
  private static class toolBarSplitBottomInitializer {
    static {
      _instance0.toolBarSplitBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return toolBarSplitBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource toolBarSplitBottom() {
    return toolBarSplitBottomInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GKNJ5M2NBC{border-radius:" + (theme().button().borderRadius() + "px")  + ";border-width:" + (theme().button().border().toString() + "")  + ";border-style:" + (theme().button().border().style() + "")  + ";border-color:" + (theme().button().border().color() + "")  + ";background-color:" + ("#3892d3")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";padding:" + (theme().button().radiusMinusBorderWidth().toString() + "")  + ";cursor:") + (("pointer")  + ";outline:" + ("none")  + ";}.GKNJ5M2OBC{padding:" + (theme().button().padding().toString() + "")  + ";text-align:" + ("center")  + ";font-size:" + (theme().button().font().size() + "px")  + ";color:" + (theme().button().font().color() + "")  + ";font-weight:" + (theme().button().font().weight() + "")  + ";font-family:" + (theme().button().font().family() + "")  + ";vertical-align:" + ("middle")  + ";}.GKNJ5M2HCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")") ) + (";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";}.GKNJ5M2ICC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;}.GKNJ5M2PBC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";}.GKNJ5M2JCC{line-height:") + ((theme().button().smallLineHeight() + "px")  + ";font-size:" + (theme().button().smallFontSize() + "px")  + ";}.GKNJ5M2FCC{line-height:" + (theme().button().mediumLineHeight() + "px")  + ";font-size:" + (theme().button().mediumFontSize() + "px")  + ";}.GKNJ5M2ECC{line-height:" + (theme().button().largeLineHeight() + "px")  + ";font-size:" + (theme().button().largeFontSize() + "px")  + ";}.GKNJ5M2BCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-left:" + ("2px")  + ";}.GKNJ5M2CCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle") ) + (";margin-right:" + ("2px")  + ";}.GKNJ5M2DCC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-bottom:" + ("2px")  + ";}.GKNJ5M2ACC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-top:" + ("2px")  + ";}.GKNJ5M2GCC .GKNJ5M2BCC{margin-left:" + ("0")  + ";}.GKNJ5M2GCC .GKNJ5M2CCC{margin-right:" + ("0")  + ";}.GKNJ5M2KCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getHeight() + "px")  + ";width:") + (((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("left"+ " " +"center")  + ";padding-left:" + ("20px")  + ";background-repeat:" + ("no-repeat")  + ";}.GKNJ5M2LCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GKNJ5M2LBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getTop() + "px  no-repeat")  + ";width:") + (("auto")  + ";height:" + ("auto")  + ";padding-left:" + ("10px")  + ";background-position:" + ("left"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.GKNJ5M2MBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto") ) + (";padding-bottom:" + ("14px")  + ";background-position:" + ("center"+ " " +"bottom")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GKNJ5M2NBC{border-radius:" + (theme().toolbar().buttonOverride().borderRadius() + "px")  + ";border-width:" + (theme().toolbar().buttonOverride().border().toString() + "")  + ";border-style:" + (theme().toolbar().buttonOverride().border().style() + "")  + ";border-color:" + (theme().toolbar().buttonOverride().border().color() + "")  + ";background-color:" + ("#3892d3")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:") + (("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";padding:" + (theme().button().radiusMinusBorderWidth().toString() + "")  + ";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";}.x-toolbar-mark .GKNJ5M2OBC{padding:" + (theme().toolbar().buttonOverride().padding().toString() + "")  + ";text-align:" + ("center")  + ";font-size:" + (theme().toolbar().buttonOverride().font().size() + "px")  + ";color:" + (theme().toolbar().buttonOverride().font().color() + "")  + ";font-weight:" + (theme().toolbar().buttonOverride().font().weight() + "")  + ";font-family:" + (theme().toolbar().buttonOverride().font().family() + "") ) + (";}.x-toolbar-mark .GKNJ5M2HCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";}.x-toolbar-mark .GKNJ5M2ICC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;}.x-toolbar-mark .GKNJ5M2PBC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:") + (("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";}.x-toolbar-mark .GKNJ5M2JCC{line-height:" + (theme().toolbar().buttonOverride().smallLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().smallFontSize() + "px")  + ";}.x-toolbar-mark .GKNJ5M2FCC{line-height:" + (theme().toolbar().buttonOverride().mediumLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().mediumFontSize() + "px")  + ";}.x-toolbar-mark .GKNJ5M2ECC{line-height:" + (theme().toolbar().buttonOverride().largeLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().largeFontSize() + "px")  + ";}.x-toolbar-mark .GKNJ5M2BCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-left:" + ("2px") ) + (";}.x-toolbar-mark .GKNJ5M2CCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-right:" + ("2px")  + ";}.x-toolbar-mark .GKNJ5M2DCC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-bottom:" + ("2px")  + ";}.x-toolbar-mark .GKNJ5M2ACC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-top:" + ("2px")  + ";}.x-toolbar-mark .GKNJ5M2GCC .GKNJ5M2BCC{margin-left:" + ("0")  + ";}.x-toolbar-mark .GKNJ5M2GCC .GKNJ5M2CCC{margin-right:") + (("0")  + ";}.x-toolbar-mark .GKNJ5M2KCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("left"+ " " +"center")  + ";padding-left:" + ("20px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GKNJ5M2LCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getHeight() + "px") ) + (";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GKNJ5M2LBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-left:" + ("10px")  + ";background-position:" + ("left"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GKNJ5M2MBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getTop() + "px  no-repeat") ) + (";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-bottom:" + ("14px")  + ";background-position:" + ("center"+ " " +"bottom")  + ";background-repeat:" + ("no-repeat")  + ";}")) : ((".GKNJ5M2NBC{border-radius:" + (theme().button().borderRadius() + "px")  + ";border-width:" + (theme().button().border().toString() + "")  + ";border-style:" + (theme().button().border().style() + "")  + ";border-color:" + (theme().button().border().color() + "")  + ";background-color:" + ("#3892d3")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";padding:" + (theme().button().radiusMinusBorderWidth().toString() + "")  + ";cursor:") + (("pointer")  + ";outline:" + ("none")  + ";}.GKNJ5M2OBC{padding:" + (theme().button().padding().toString() + "")  + ";text-align:" + ("center")  + ";font-size:" + (theme().button().font().size() + "px")  + ";color:" + (theme().button().font().color() + "")  + ";font-weight:" + (theme().button().font().weight() + "")  + ";font-family:" + (theme().button().font().family() + "")  + ";vertical-align:" + ("middle")  + ";}.GKNJ5M2HCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")") ) + (";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";}.GKNJ5M2ICC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;}.GKNJ5M2PBC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";}.GKNJ5M2JCC{line-height:") + ((theme().button().smallLineHeight() + "px")  + ";font-size:" + (theme().button().smallFontSize() + "px")  + ";}.GKNJ5M2FCC{line-height:" + (theme().button().mediumLineHeight() + "px")  + ";font-size:" + (theme().button().mediumFontSize() + "px")  + ";}.GKNJ5M2ECC{line-height:" + (theme().button().largeLineHeight() + "px")  + ";font-size:" + (theme().button().largeFontSize() + "px")  + ";}.GKNJ5M2BCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-right:" + ("2px")  + ";}.GKNJ5M2CCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle") ) + (";margin-left:" + ("2px")  + ";}.GKNJ5M2DCC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-bottom:" + ("2px")  + ";}.GKNJ5M2ACC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-top:" + ("2px")  + ";}.GKNJ5M2GCC .GKNJ5M2BCC{margin-right:" + ("0")  + ";}.GKNJ5M2GCC .GKNJ5M2CCC{margin-left:" + ("0")  + ";}.GKNJ5M2KCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getHeight() + "px")  + ";width:") + (((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("right"+ " " +"center")  + ";padding-right:" + ("20px")  + ";background-repeat:" + ("no-repeat")  + ";}.GKNJ5M2LCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GKNJ5M2LBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getTop() + "px  no-repeat")  + ";width:") + (("auto")  + ";height:" + ("auto")  + ";padding-right:" + ("10px")  + ";background-position:" + ("right"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.GKNJ5M2MBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto") ) + (";padding-bottom:" + ("14px")  + ";background-position:" + ("center"+ " " +"bottom")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GKNJ5M2NBC{border-radius:" + (theme().toolbar().buttonOverride().borderRadius() + "px")  + ";border-width:" + (theme().toolbar().buttonOverride().border().toString() + "")  + ";border-style:" + (theme().toolbar().buttonOverride().border().style() + "")  + ";border-color:" + (theme().toolbar().buttonOverride().border().color() + "")  + ";background-color:" + ("#3892d3")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:") + (("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";padding:" + (theme().button().radiusMinusBorderWidth().toString() + "")  + ";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";}.x-toolbar-mark .GKNJ5M2OBC{padding:" + (theme().toolbar().buttonOverride().padding().toString() + "")  + ";text-align:" + ("center")  + ";font-size:" + (theme().toolbar().buttonOverride().font().size() + "px")  + ";color:" + (theme().toolbar().buttonOverride().font().color() + "")  + ";font-weight:" + (theme().toolbar().buttonOverride().font().weight() + "")  + ";font-family:" + (theme().toolbar().buttonOverride().font().family() + "") ) + (";}.x-toolbar-mark .GKNJ5M2HCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";}.x-toolbar-mark .GKNJ5M2ICC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;}.x-toolbar-mark .GKNJ5M2PBC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:") + (("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";}.x-toolbar-mark .GKNJ5M2JCC{line-height:" + (theme().toolbar().buttonOverride().smallLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().smallFontSize() + "px")  + ";}.x-toolbar-mark .GKNJ5M2FCC{line-height:" + (theme().toolbar().buttonOverride().mediumLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().mediumFontSize() + "px")  + ";}.x-toolbar-mark .GKNJ5M2ECC{line-height:" + (theme().toolbar().buttonOverride().largeLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().largeFontSize() + "px")  + ";}.x-toolbar-mark .GKNJ5M2BCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-right:" + ("2px") ) + (";}.x-toolbar-mark .GKNJ5M2CCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-left:" + ("2px")  + ";}.x-toolbar-mark .GKNJ5M2DCC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-bottom:" + ("2px")  + ";}.x-toolbar-mark .GKNJ5M2ACC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-top:" + ("2px")  + ";}.x-toolbar-mark .GKNJ5M2GCC .GKNJ5M2BCC{margin-right:" + ("0")  + ";}.x-toolbar-mark .GKNJ5M2GCC .GKNJ5M2CCC{margin-left:") + (("0")  + ";}.x-toolbar-mark .GKNJ5M2KCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("right"+ " " +"center")  + ";padding-right:" + ("20px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GKNJ5M2LCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getHeight() + "px") ) + (";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GKNJ5M2LBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-right:" + ("10px")  + ";background-position:" + ("right"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GKNJ5M2MBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getTop() + "px  no-repeat") ) + (";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-bottom:" + ("14px")  + ";background-position:" + ("center"+ " " +"bottom")  + ";background-repeat:" + ("no-repeat")  + ";}"));
      }
      public java.lang.String arrow() {
        return "GKNJ5M2LBC";
      }
      public java.lang.String arrowBottom() {
        return "GKNJ5M2MBC";
      }
      public java.lang.String button() {
        return "GKNJ5M2NBC";
      }
      public java.lang.String buttonInner() {
        return "GKNJ5M2OBC";
      }
      public java.lang.String focused() {
        return "GKNJ5M2PBC";
      }
      public java.lang.String iconBottom() {
        return "GKNJ5M2ACC";
      }
      public java.lang.String iconLeft() {
        return "GKNJ5M2BCC";
      }
      public java.lang.String iconRight() {
        return "GKNJ5M2CCC";
      }
      public java.lang.String iconTop() {
        return "GKNJ5M2DCC";
      }
      public java.lang.String large() {
        return "GKNJ5M2ECC";
      }
      public java.lang.String medium() {
        return "GKNJ5M2FCC";
      }
      public java.lang.String noText() {
        return "GKNJ5M2GCC";
      }
      public java.lang.String over() {
        return "GKNJ5M2HCC";
      }
      public java.lang.String pressed() {
        return "GKNJ5M2ICC";
      }
      public java.lang.String small() {
        return "GKNJ5M2JCC";
      }
      public java.lang.String split() {
        return "GKNJ5M2KCC";
      }
      public java.lang.String splitBottom() {
        return "GKNJ5M2LCC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAK0lEQVR42mNgGELg////6/+jgum4FPIA8Xmoot1AzILPVAUg3g/EAoPIswCE6y6lP53soQAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAAXUlEQVR42u3VsQ1AYBgEUIVSYQSbKiUapTEMoPhGMIIKiSV+fyGhV3ovuQUuuVxRAAAAAAAAX/SxTTnpyT5qBW5tnFUexnIPZG4jlVqBly6OJj9HDLHW2gAAAPinCwVTJCstCkIdAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAABICAYAAADGScSgAAAAWElEQVR42mNgAAKhnPX1Qrnr/zOQCkY1jmoc1TiqcVTjqMZRjYNV4////zf/RwWTidXIA8SXoZq2AzEL0U4FKlYA4v0gQ0ajY1TjqMZRjaMaRzWOahyMGgGDfUO46m5UAwAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAAX0lEQVR42u3VsQmAMBCG0RSWFpIJHFBncAzHsLC0cAgHOlMIEogT+B58Cxz8XErAtzxti6R2Kc9bSGrnhQIAAPxMROxRW10F3oH0pesZx1HqXAXqkYylszS4BgAAwD/dt/UwYsQ5oGoAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAOklEQVR42mNgGEJg8eLF64H4PwwvWbJkOlaFq1at4gEqOA9VtHv//v0sOE2dP3++AlDhfiAtMIg8CwAwxSD4PXKMLAAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage4 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAAWElEQVR42u3ToQ2AMBQE0AokghHYGlnRqhoGQHQERoIvSoJH8l5yOX/JpQQAAAAAAHxRStkj15Na62YVGFprcxzjHOc4eu+TVeAl57zGQXr0Yg0AAIB/ugGNpyD4nm69sQAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage5 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAABICAYAAADGScSgAAAAY0lEQVR42u3RIQ6AMAyF4Qokh+CmHIIDNNncLALZG7RiBxojQSCHm/hfUtfvpUlFeiJid/cmfwMEAoFAIHBWmFI6c87tM8cQLKWsfbm+6DKzZfhUVd06sqeEdwCBQCAQOCO8Abpe6QO3yP03AAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage6 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAAbUlEQVR42u3VIQ7DIBiGYcTkxI7Qm+4YkySAwk5OcAMQPVCHaJOJ7gR9nuQN/kv+EALw3xjjKem80HvfJJ3nCwUAALiYlNI757wdlVJeVoFdrfU+D2Pdj+PTWrtZBX7EGJd5IG2+D2sAAABc0xe2mBOwrkb68gAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource arrow;
  private static com.google.gwt.resources.client.ImageResource arrowBottom;
  private static com.google.gwt.resources.client.ImageResource split;
  private static com.google.gwt.resources.client.ImageResource splitBottom;
  private static com.google.gwt.resources.client.ImageResource toolBarArrow;
  private static com.google.gwt.resources.client.ImageResource toolBarArrowBottom;
  private static com.google.gwt.resources.client.ImageResource toolBarSplit;
  private static com.google.gwt.resources.client.ImageResource toolBarSplitBottom;
  private static com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      arrow(), 
      arrowBottom(), 
      split(), 
      splitBottom(), 
      toolBarArrow(), 
      toolBarArrowBottom(), 
      toolBarSplit(), 
      toolBarSplitBottom(), 
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
        resourceMap.put("arrow", arrow());
        resourceMap.put("arrowBottom", arrowBottom());
        resourceMap.put("split", split());
        resourceMap.put("splitBottom", splitBottom());
        resourceMap.put("toolBarArrow", toolBarArrow());
        resourceMap.put("toolBarArrowBottom", toolBarArrowBottom());
        resourceMap.put("toolBarSplit", toolBarSplit());
        resourceMap.put("toolBarSplitBottom", toolBarSplitBottom());
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'arrow': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::arrow()();
      case 'arrowBottom': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::arrowBottom()();
      case 'split': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::split()();
      case 'splitBottom': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::splitBottom()();
      case 'toolBarArrow': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::toolBarArrow()();
      case 'toolBarArrowBottom': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::toolBarArrowBottom()();
      case 'toolBarSplit': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::toolBarSplit()();
      case 'toolBarSplitBottom': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::toolBarSplitBottom()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::theme()();
    }
    return null;
  }-*/;
}
