package typings
package extjsLib.ExtNs.panelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeader
  extends extjsLib.ExtNs.containerNs.IContainer {
  /** [Method] Add a tool to the header
  		* @param tool Object
  		*/
  var addTool: js.UndefOr[js.Function1[/* tool */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("addUIClsToElement")
  var addUIClsToElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components  */
  @JSName("afterLayout")
  var afterLayout_IHeader: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the tools for this header
  		* @returns Ext.panel.Tool[] The tools
  		*/
  var getTools: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Set up the tools lt tool type gt link in the owning Panel
  		* @param component Object
  		* @param index Object
  		*/
  @JSName("onAdd")
  var onAdd_IHeader: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("removeUIClsFromElement")
  var removeUIClsFromElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets glyph that provides the icon image for this header
  		* @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the image path that provides the icon image for this header
  		* @param icon String The new icon path
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the CSS class that provides the icon image for this header
  		* @param cls String The new CSS class name
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the title of the header
  		* @param title String The title to be set
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var titlePosition: js.UndefOr[scala.Double] = js.undefined
}

object IHeader {
  @scala.inline
  def apply(
    IContainer: extjsLib.ExtNs.containerNs.IContainer = null,
    addTool: js.Function1[/* tool */ js.UndefOr[js.Any], scala.Unit] = null,
    addUIClsToElement: js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit] = null,
    afterLayout: js.Function0[scala.Unit] = null,
    beforeLayout: js.Function0[scala.Unit] = null,
    componentLayout: js.Any = null,
    defaultType: java.lang.String = null,
    getTools: js.Function0[extjsLib.ExtNs.Array] = null,
    glyph: js.Any = null,
    icon: java.lang.String = null,
    iconCls: java.lang.String = null,
    isHeader: js.UndefOr[scala.Boolean] = js.undefined,
    onAdd: js.Function2[/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], scala.Unit] = null,
    removeUIClsFromElement: js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit] = null,
    renderTpl: js.Any = null,
    setGlyph: js.Function1[/* glyph */ js.UndefOr[js.Any], scala.Unit] = null,
    setIcon: js.Function1[/* icon */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setIconCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit] = null,
    shrinkWrap: js.Any = null,
    title: java.lang.String = null,
    titleAlign: java.lang.String = null,
    titlePosition: scala.Int | scala.Double = null
  ): IHeader = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (addTool != null) __obj.updateDynamic("addTool")(addTool)
    if (addUIClsToElement != null) __obj.updateDynamic("addUIClsToElement")(addUIClsToElement)
    if (afterLayout != null) __obj.updateDynamic("afterLayout")(afterLayout)
    if (beforeLayout != null) __obj.updateDynamic("beforeLayout")(beforeLayout)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (getTools != null) __obj.updateDynamic("getTools")(getTools)
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader)
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd)
    if (removeUIClsFromElement != null) __obj.updateDynamic("removeUIClsFromElement")(removeUIClsFromElement)
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (setGlyph != null) __obj.updateDynamic("setGlyph")(setGlyph)
    if (setIcon != null) __obj.updateDynamic("setIcon")(setIcon)
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(setIconCls)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (shrinkWrap != null) __obj.updateDynamic("shrinkWrap")(shrinkWrap)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeader]
  }
}

