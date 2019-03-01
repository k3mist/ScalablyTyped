package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelable
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var activeError: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var activeErrorsTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBodyEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterSubTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var autoFitErrors: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var baseBodyCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var formItemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Gets the active error message for this component if any
  		* @returns String The active error message on the component; if there is no error, an empty string is returned.
  		*/
  var getActiveError: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets an Array of any active error messages currently applied to the field
  		* @returns String[] The active error messages on the component; if there are no errors, an empty Array is returned.
  		*/
  var getActiveErrors: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the label for the field
  		* @returns String The configured field label, or empty string if not defined
  		*/
  var getFieldLabel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Get the input id if any for this component
  		* @returns String The input id
  		*/
  var getInputId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the width of the label if visible
  		* @returns Number The label width
  		*/
  var getLabelWidth: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Generates the arguments for the field decorations rendering template
  		* @returns Object The template arguments
  		*/
  var getLabelableRenderData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the markup to be inserted into the outer template s bodyEl
  		* @returns String The markup to be inserted
  		*/
  var getSubTplMarkup: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Tells whether the field currently has an active error message
  		* @returns Boolean
  		*/
  var hasActiveError: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Checks if the field has a visible label
  		* @returns Boolean True if the field has a visible label
  		*/
  var hasVisibleLabel: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideEmptyLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var hideLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var labelAttrTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Ext.Element) */
  var labelCell: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var labelClsExtra: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (Number) */
  var labelPad: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var labelSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var labelStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var labelWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the active error message to the given string
  		* @param msg String The error message
  		*/
  var setActiveError: js.UndefOr[js.Function1[/* msg */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Set the active error message to an Array of error messages
  		* @param errors String[] The error messages
  		*/
  var setActiveErrors: js.UndefOr[js.Function1[/* errors */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit]] = js.undefined
  /** [Method] Applies a set of default configuration values to this Labelable instance
  		* @param defaults Object The defaults to apply to the object.
  		*/
  var setFieldDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Set the label of this field
  		* @param label String The new label. The labelSeparator will be automatically appended to the label string.
  		*/
  var setFieldLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Returns the trimmed label by slicing off the label separator character
  		* @returns String The trimmed field label, or empty string if not defined
  		*/
  var trimLabelSeparator: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ILabelable {
  @scala.inline
  def apply(
    activeError: java.lang.String = null,
    activeErrorsTpl: js.Any = null,
    afterBodyEl: js.Any = null,
    afterLabelTextTpl: js.Any = null,
    afterLabelTpl: js.Any = null,
    afterSubTpl: js.Any = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    autoFitErrors: js.UndefOr[scala.Boolean] = js.undefined,
    baseBodyCls: java.lang.String = null,
    beforeBodyEl: js.Any = null,
    beforeLabelTextTpl: js.Any = null,
    beforeLabelTpl: js.Any = null,
    beforeSubTpl: js.Any = null,
    bodyEl: extjsLib.ExtNs.IElement = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearCls: java.lang.String = null,
    config: js.Any = null,
    errorEl: extjsLib.ExtNs.IElement = null,
    errorMsgCls: java.lang.String = null,
    extend: java.lang.String = null,
    fieldBodyCls: java.lang.String = null,
    fieldLabel: java.lang.String = null,
    formItemCls: java.lang.String = null,
    getActiveError: js.Function0[java.lang.String] = null,
    getActiveErrors: js.Function0[extjsLib.ExtNs.Array] = null,
    getFieldLabel: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getInputId: js.Function0[java.lang.String] = null,
    getLabelWidth: js.Function0[scala.Double] = null,
    getLabelableRenderData: js.Function0[_] = null,
    getSubTplMarkup: js.Function0[java.lang.String] = null,
    hasActiveError: js.Function0[scala.Boolean] = null,
    hasVisibleLabel: js.Function0[scala.Boolean] = null,
    hideEmptyLabel: js.UndefOr[scala.Boolean] = js.undefined,
    hideLabel: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ILabelable] = null,
    initLabelable: js.Function0[scala.Unit] = null,
    invalidCls: java.lang.String = null,
    isFieldLabelable: js.UndefOr[scala.Boolean] = js.undefined,
    labelAlign: java.lang.String = null,
    labelAttrTpl: js.Any = null,
    labelCell: extjsLib.ExtNs.IElement = null,
    labelCls: java.lang.String = null,
    labelClsExtra: java.lang.String = null,
    labelEl: extjsLib.ExtNs.IElement = null,
    labelPad: scala.Int | scala.Double = null,
    labelSeparator: java.lang.String = null,
    labelStyle: java.lang.String = null,
    labelWidth: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    msgTarget: java.lang.String = null,
    preventMark: js.UndefOr[scala.Boolean] = js.undefined,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    setActiveError: js.Function1[/* msg */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setActiveErrors: js.Function1[/* errors */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit] = null,
    setFieldDefaults: js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit] = null,
    setFieldLabel: js.Function1[/* label */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    trimLabelSeparator: js.Function0[java.lang.String] = null,
    unsetActiveError: js.Function0[scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null
  ): ILabelable = {
    val __obj = js.Dynamic.literal()
    if (activeError != null) __obj.updateDynamic("activeError")(activeError)
    if (activeErrorsTpl != null) __obj.updateDynamic("activeErrorsTpl")(activeErrorsTpl)
    if (afterBodyEl != null) __obj.updateDynamic("afterBodyEl")(afterBodyEl)
    if (afterLabelTextTpl != null) __obj.updateDynamic("afterLabelTextTpl")(afterLabelTextTpl)
    if (afterLabelTpl != null) __obj.updateDynamic("afterLabelTpl")(afterLabelTpl)
    if (afterSubTpl != null) __obj.updateDynamic("afterSubTpl")(afterSubTpl)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(autoFitErrors)) __obj.updateDynamic("autoFitErrors")(autoFitErrors)
    if (baseBodyCls != null) __obj.updateDynamic("baseBodyCls")(baseBodyCls)
    if (beforeBodyEl != null) __obj.updateDynamic("beforeBodyEl")(beforeBodyEl)
    if (beforeLabelTextTpl != null) __obj.updateDynamic("beforeLabelTextTpl")(beforeLabelTextTpl)
    if (beforeLabelTpl != null) __obj.updateDynamic("beforeLabelTpl")(beforeLabelTpl)
    if (beforeSubTpl != null) __obj.updateDynamic("beforeSubTpl")(beforeSubTpl)
    if (bodyEl != null) __obj.updateDynamic("bodyEl")(bodyEl)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearCls != null) __obj.updateDynamic("clearCls")(clearCls)
    if (config != null) __obj.updateDynamic("config")(config)
    if (errorEl != null) __obj.updateDynamic("errorEl")(errorEl)
    if (errorMsgCls != null) __obj.updateDynamic("errorMsgCls")(errorMsgCls)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fieldBodyCls != null) __obj.updateDynamic("fieldBodyCls")(fieldBodyCls)
    if (fieldLabel != null) __obj.updateDynamic("fieldLabel")(fieldLabel)
    if (formItemCls != null) __obj.updateDynamic("formItemCls")(formItemCls)
    if (getActiveError != null) __obj.updateDynamic("getActiveError")(getActiveError)
    if (getActiveErrors != null) __obj.updateDynamic("getActiveErrors")(getActiveErrors)
    if (getFieldLabel != null) __obj.updateDynamic("getFieldLabel")(getFieldLabel)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getInputId != null) __obj.updateDynamic("getInputId")(getInputId)
    if (getLabelWidth != null) __obj.updateDynamic("getLabelWidth")(getLabelWidth)
    if (getLabelableRenderData != null) __obj.updateDynamic("getLabelableRenderData")(getLabelableRenderData)
    if (getSubTplMarkup != null) __obj.updateDynamic("getSubTplMarkup")(getSubTplMarkup)
    if (hasActiveError != null) __obj.updateDynamic("hasActiveError")(hasActiveError)
    if (hasVisibleLabel != null) __obj.updateDynamic("hasVisibleLabel")(hasVisibleLabel)
    if (!js.isUndefined(hideEmptyLabel)) __obj.updateDynamic("hideEmptyLabel")(hideEmptyLabel)
    if (!js.isUndefined(hideLabel)) __obj.updateDynamic("hideLabel")(hideLabel)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initLabelable != null) __obj.updateDynamic("initLabelable")(initLabelable)
    if (invalidCls != null) __obj.updateDynamic("invalidCls")(invalidCls)
    if (!js.isUndefined(isFieldLabelable)) __obj.updateDynamic("isFieldLabelable")(isFieldLabelable)
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign)
    if (labelAttrTpl != null) __obj.updateDynamic("labelAttrTpl")(labelAttrTpl)
    if (labelCell != null) __obj.updateDynamic("labelCell")(labelCell)
    if (labelCls != null) __obj.updateDynamic("labelCls")(labelCls)
    if (labelClsExtra != null) __obj.updateDynamic("labelClsExtra")(labelClsExtra)
    if (labelEl != null) __obj.updateDynamic("labelEl")(labelEl)
    if (labelPad != null) __obj.updateDynamic("labelPad")(labelPad.asInstanceOf[js.Any])
    if (labelSeparator != null) __obj.updateDynamic("labelSeparator")(labelSeparator)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (msgTarget != null) __obj.updateDynamic("msgTarget")(msgTarget)
    if (!js.isUndefined(preventMark)) __obj.updateDynamic("preventMark")(preventMark)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setActiveError != null) __obj.updateDynamic("setActiveError")(setActiveError)
    if (setActiveErrors != null) __obj.updateDynamic("setActiveErrors")(setActiveErrors)
    if (setFieldDefaults != null) __obj.updateDynamic("setFieldDefaults")(setFieldDefaults)
    if (setFieldLabel != null) __obj.updateDynamic("setFieldLabel")(setFieldLabel)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (trimLabelSeparator != null) __obj.updateDynamic("trimLabelSeparator")(trimLabelSeparator)
    if (unsetActiveError != null) __obj.updateDynamic("unsetActiveError")(unsetActiveError)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ILabelable]
  }
}

