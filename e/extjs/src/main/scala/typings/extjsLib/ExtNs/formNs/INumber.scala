package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber
  extends extjsLib.ExtNs.formNs.fieldNs.ISpinner {
  /** [Config Option] (Boolean) */
  var allowDecimals: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowExponential: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoStripChars: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var baseChars: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_INumber: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var decimalPrecision: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns String The value to be submitted, or null.
  		*/
  @JSName("getSubmitValue")
  var getSubmitValue_INumber: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var nanText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var negativeText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Replaces any existing maxValue with the new value
  		* @param value Number The maximum value
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new value
  		* @param value Number The minimum value
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets whether the spinner down button is enabled
  		* @param enabled Object
  		* @param internal Object
  		*/
  @JSName("setSpinDownEnabled")
  var setSpinDownEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets whether the spinner up button is enabled
  		* @param enabled Object
  		* @param internal Object
  		*/
  @JSName("setSpinUpEnabled")
  var setSpinUpEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var step: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var submitLocaleSeparator: js.UndefOr[scala.Boolean] = js.undefined
}

object INumber {
  @scala.inline
  def apply(
    ISpinner: extjsLib.ExtNs.formNs.fieldNs.ISpinner = null,
    allowDecimals: js.UndefOr[scala.Boolean] = js.undefined,
    allowExponential: js.UndefOr[scala.Boolean] = js.undefined,
    autoStripChars: js.UndefOr[scala.Boolean] = js.undefined,
    baseChars: java.lang.String = null,
    beforeBlur: () => scala.Unit = null,
    decimalPrecision: scala.Int | scala.Double = null,
    decimalSeparator: java.lang.String = null,
    getErrors: /* value */ js.UndefOr[js.Any] => extjsLib.ExtNs.Array = null,
    getSubmitValue: () => java.lang.String = null,
    initComponent: () => scala.Unit = null,
    maxText: java.lang.String = null,
    maxValue: scala.Int | scala.Double = null,
    minText: java.lang.String = null,
    minValue: scala.Int | scala.Double = null,
    nanText: java.lang.String = null,
    negativeText: java.lang.String = null,
    onSpinDown: () => scala.Unit = null,
    onSpinUp: () => scala.Unit = null,
    rawToValue: /* rawValue */ js.UndefOr[js.Any] => _ = null,
    setMaxValue: /* value */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMinValue: /* value */ js.UndefOr[scala.Double] => scala.Unit = null,
    setSpinDownEnabled: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => scala.Unit = null,
    setSpinUpEnabled: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => scala.Unit = null,
    step: scala.Int | scala.Double = null,
    submitLocaleSeparator: js.UndefOr[scala.Boolean] = js.undefined,
    valueToRaw: /* value */ js.UndefOr[js.Any] => _ = null
  ): INumber = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISpinner)
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals)
    if (!js.isUndefined(allowExponential)) __obj.updateDynamic("allowExponential")(allowExponential)
    if (!js.isUndefined(autoStripChars)) __obj.updateDynamic("autoStripChars")(autoStripChars)
    if (baseChars != null) __obj.updateDynamic("baseChars")(baseChars)
    if (beforeBlur != null) __obj.updateDynamic("beforeBlur")(js.Any.fromFunction0(beforeBlur))
    if (decimalPrecision != null) __obj.updateDynamic("decimalPrecision")(decimalPrecision.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1(getErrors))
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(js.Any.fromFunction0(getSubmitValue))
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (maxText != null) __obj.updateDynamic("maxText")(maxText)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minText != null) __obj.updateDynamic("minText")(minText)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (nanText != null) __obj.updateDynamic("nanText")(nanText)
    if (negativeText != null) __obj.updateDynamic("negativeText")(negativeText)
    if (onSpinDown != null) __obj.updateDynamic("onSpinDown")(js.Any.fromFunction0(onSpinDown))
    if (onSpinUp != null) __obj.updateDynamic("onSpinUp")(js.Any.fromFunction0(onSpinUp))
    if (rawToValue != null) __obj.updateDynamic("rawToValue")(js.Any.fromFunction1(rawToValue))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setSpinDownEnabled != null) __obj.updateDynamic("setSpinDownEnabled")(js.Any.fromFunction2(setSpinDownEnabled))
    if (setSpinUpEnabled != null) __obj.updateDynamic("setSpinUpEnabled")(js.Any.fromFunction2(setSpinUpEnabled))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(submitLocaleSeparator)) __obj.updateDynamic("submitLocaleSeparator")(submitLocaleSeparator)
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(js.Any.fromFunction1(valueToRaw))
    __obj.asInstanceOf[INumber]
  }
}

