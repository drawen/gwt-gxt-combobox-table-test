package com.sencha.gxt.theme.neptune.client.base.listview;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class Css3ListViewAppearance_Css3ListViewTemplatesImpl implements com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewTemplates {
  public com.google.gwt.safehtml.shared.SafeHtml renderBody(com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class='{0}'></div>
     * params:
       * com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance_Css3ListViewStyle_view_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance_Css3ListViewTemplates_renderBody_SafeHtml__Css3ListViewStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance_Css3ListViewTemplates_renderBody_SafeHtml__Css3ListViewStyle_style___SafeHtmlTemplates.class).renderBody0(com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance_Css3ListViewStyle_view_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
  public com.google.gwt.safehtml.shared.SafeHtml renderItem(com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance.Css3ListViewStyle style, com.google.gwt.safehtml.shared.SafeHtml content){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class='{0}'>{1}</div>
     * params:
       * com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance_Css3ListViewStyle_item_ValueProviderImpl.INSTANCE.getValue(style), content
     */
    outer = GWT.<com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance_Css3ListViewTemplates_renderItem_SafeHtml__Css3ListViewStyle_style__SafeHtml_content___SafeHtmlTemplates>create(com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance_Css3ListViewTemplates_renderItem_SafeHtml__Css3ListViewStyle_style__SafeHtml_content___SafeHtmlTemplates.class).renderItem0(com.sencha.gxt.theme.neptune.client.base.listview.Css3ListViewAppearance_Css3ListViewStyle_item_ValueProviderImpl.INSTANCE.getValue(style), content);
    return outer;
  }
}
