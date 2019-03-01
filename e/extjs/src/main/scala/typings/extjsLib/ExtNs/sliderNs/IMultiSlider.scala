package typings
package extjsLib.ExtNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiSlider
  extends extjsLib.ExtNs.formNs.fieldNs.IBase {
  /** [Method] Creates a new thumb and adds it to the slider
  		* @param value Number The initial value to set on the thumb.
  		* @returns any The thumb
  		*/
  var addThumb: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IMultiSlider: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clickToChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var constrainThumbs: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number/Boolean) */
  var decimalPrecision: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var dragging: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the current value of the slider
  		* @param index Number The index of the thumb to return a value for
  		* @returns any The current value of the slider at the given index, or an array of all thumb values if no index is given.
  		*/
  @JSName("getValue")
  var getValue_IMultiSlider: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Returns an array of values  one for the location of each thumb
  		* @returns any The set of thumb values
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var keyIncrement: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the maximum value for the slider instance
  		* @param val Number The new maximum value
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the minimum value for the slider instance
  		* @param val Number The new minimum value
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the read only state of this field
  		* @param readOnly Object
  		*/
  @JSName("setReadOnly")
  var setReadOnly_IMultiSlider: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Synchronizes thumbs position to the proper proportion of the total component width based on the current slider value  */
  var syncThumbs: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Array) */
  var thumbs: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Function) */
  var tipText: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Boolean) */
  var useTips: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  @JSName("value")
  var value_IMultiSlider: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number[]) */
  var values: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var zeroBasedSnapping: js.UndefOr[scala.Boolean] = js.undefined
}

object IMultiSlider {
  @scala.inline
  def apply(
    IBase: extjsLib.ExtNs.formNs.fieldNs.IBase = null,
    addThumb: js.Function1[/* value */ js.UndefOr[scala.Double], _] = null,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    beforeDestroy: js.Function0[scala.Unit] = null,
    clickToChange: js.UndefOr[scala.Boolean] = js.undefined,
    componentLayout: js.Any = null,
    constrainThumbs: js.UndefOr[scala.Boolean] = js.undefined,
    decimalPrecision: js.Any = null,
    dragging: js.UndefOr[scala.Boolean] = js.undefined,
    getSubTplData: js.Function0[_] = null,
    getSubmitValue: js.Function0[_] = null,
    getValue: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    getValues: js.Function0[_] = null,
    increment: scala.Int | scala.Double = null,
    initComponent: js.Function0[scala.Unit] = null,
    initValue: js.Function0[scala.Unit] = null,
    keyIncrement: scala.Int | scala.Double = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    onDisable: js.Function0[scala.Unit] = null,
    onEnable: js.Function0[scala.Unit] = null,
    onRender: js.Function0[scala.Unit] = null,
    reset: js.Function0[scala.Unit] = null,
    setMaxValue: js.Function1[/* val */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinValue: js.Function1[/* val */ js.UndefOr[scala.Double], scala.Unit] = null,
    setReadOnly: js.Function1[/* readOnly */ js.UndefOr[js.Any], scala.Unit] = null,
    syncThumbs: js.Function0[scala.Unit] = null,
    thumbs: extjsLib.ExtNs.Array = null,
    tipText: js.Any = null,
    useTips: js.Any = null,
    value: scala.Int | scala.Double = null,
    values: extjsLib.ExtNs.Array = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    zeroBasedSnapping: js.UndefOr[scala.Boolean] = js.undefined
  ): IMultiSlider = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBase)
    if (addThumb != null) __obj.updateDynamic("addThumb")(addThumb)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy)
    if (!js.isUndefined(clickToChange)) __obj.updateDynamic("clickToChange")(clickToChange)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (!js.isUndefined(constrainThumbs)) __obj.updateDynamic("constrainThumbs")(constrainThumbs)
    if (decimalPrecision != null) __obj.updateDynamic("decimalPrecision")(decimalPrecision)
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging)
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(getSubTplData)
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(getSubmitValue)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (getValues != null) __obj.updateDynamic("getValues")(getValues)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (initValue != null) __obj.updateDynamic("initValue")(initValue)
    if (keyIncrement != null) __obj.updateDynamic("keyIncrement")(keyIncrement.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onDisable != null) __obj.updateDynamic("onDisable")(onDisable)
    if (onEnable != null) __obj.updateDynamic("onEnable")(onEnable)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(setMaxValue)
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(setMinValue)
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(setReadOnly)
    if (syncThumbs != null) __obj.updateDynamic("syncThumbs")(syncThumbs)
    if (thumbs != null) __obj.updateDynamic("thumbs")(thumbs)
    if (tipText != null) __obj.updateDynamic("tipText")(tipText)
    if (useTips != null) __obj.updateDynamic("useTips")(useTips)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (!js.isUndefined(zeroBasedSnapping)) __obj.updateDynamic("zeroBasedSnapping")(zeroBasedSnapping)
    __obj.asInstanceOf[IMultiSlider]
  }
}

