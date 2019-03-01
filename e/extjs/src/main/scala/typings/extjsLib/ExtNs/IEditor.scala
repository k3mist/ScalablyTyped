package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditor
  extends extjsLib.ExtNs.containerNs.IContainer {
  /** [Method] private
  		* @param ct Object
  		* @param position Object
  		*/
  @JSName("afterRender")
  var afterRender_IEditor: js.UndefOr[
    js.Function2[/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var allowBlur: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var autoSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Cancels the editing process and hides the editor without persisting any changes
  		* @param remainVisible Boolean Override the default behavior and keep the editor visible after cancel
  		*/
  var cancelEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var cancelOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Ends the editing process persists the changed value to the underlying field and hides the editor
  		* @param remainVisible Boolean Override the default behavior and keep the editor visible after edit
  		*/
  var completeEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var completeOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.form.field.Field) */
  var field: js.UndefOr[extjsLib.ExtNs.formNs.fieldNs.IField] = js.undefined
  /** [Method] Gets the data value of the editor
  		* @returns Object The data value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideEl: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreNoChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number[]) */
  var offsets: js.UndefOr[Array] = js.undefined
  /** [Method] private */
  @JSName("onHide")
  var onHide_IEditor: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] private */
  @JSName("onShow")
  var onShow_IEditor: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var parentEl: js.UndefOr[js.Any] = js.undefined
  /** [Method] Realigns the editor to the bound field based on the current alignment config value
  		* @param autoSize Boolean True to size the field to the dimensions of the bound element.
  		*/
  var realign: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var revertInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the data value of the editor
  		* @param value Object Any valid value supported by the underlying field
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Starts the editing process and shows the editor
  		* @param el String/HTMLElement/Ext.Element The element to edit
  		* @param value String A value to initialize the editor with. If a value is not provided, it defaults to the innerHTML of el.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var swallowKeys: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var updateEl: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IEditor {
  @scala.inline
  def apply(
    IContainer: extjsLib.ExtNs.containerNs.IContainer = null,
    afterRender: js.Function2[/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], scala.Unit] = null,
    alignment: java.lang.String = null,
    allowBlur: js.UndefOr[scala.Boolean] = js.undefined,
    autoSize: js.Any = null,
    baseCls: java.lang.String = null,
    cancelEdit: js.Function1[/* remainVisible */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    cancelOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    completeEdit: js.Function1[/* remainVisible */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    completeOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    constrain: js.UndefOr[scala.Boolean] = js.undefined,
    field: extjsLib.ExtNs.formNs.fieldNs.IField = null,
    focusOnToFront: js.UndefOr[scala.Boolean] = js.undefined,
    getValue: js.Function0[_] = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hideEl: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreNoChange: js.UndefOr[scala.Boolean] = js.undefined,
    layout: js.Any = null,
    offsets: Array = null,
    onHide: js.Function0[scala.Unit] = null,
    onShow: js.Function0[scala.Unit] = null,
    parentEl: js.Any = null,
    realign: js.Function1[/* autoSize */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    revertInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    shadow: js.Any = null,
    startEdit: js.Function2[/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], scala.Unit] = null,
    swallowKeys: js.UndefOr[scala.Boolean] = js.undefined,
    updateEl: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.Any = null
  ): IEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (afterRender != null) __obj.updateDynamic("afterRender")(afterRender)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(allowBlur)) __obj.updateDynamic("allowBlur")(allowBlur)
    if (autoSize != null) __obj.updateDynamic("autoSize")(autoSize)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(cancelEdit)
    if (!js.isUndefined(cancelOnEsc)) __obj.updateDynamic("cancelOnEsc")(cancelOnEsc)
    if (completeEdit != null) __obj.updateDynamic("completeEdit")(completeEdit)
    if (!js.isUndefined(completeOnEnter)) __obj.updateDynamic("completeOnEnter")(completeOnEnter)
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(focusOnToFront)) __obj.updateDynamic("focusOnToFront")(focusOnToFront)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(hideEl)) __obj.updateDynamic("hideEl")(hideEl)
    if (!js.isUndefined(ignoreNoChange)) __obj.updateDynamic("ignoreNoChange")(ignoreNoChange)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (offsets != null) __obj.updateDynamic("offsets")(offsets)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl)
    if (realign != null) __obj.updateDynamic("realign")(realign)
    if (!js.isUndefined(revertInvalid)) __obj.updateDynamic("revertInvalid")(revertInvalid)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (startEdit != null) __obj.updateDynamic("startEdit")(startEdit)
    if (!js.isUndefined(swallowKeys)) __obj.updateDynamic("swallowKeys")(swallowKeys)
    if (!js.isUndefined(updateEl)) __obj.updateDynamic("updateEl")(updateEl)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IEditor]
  }
}

