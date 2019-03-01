package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An abstract datatype for specifying an attributed string attribute.
			 */
trait Attribute
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Attribute range.
  				 */
  var range: js.Array[scala.Double]
  /**
  				 * Attribute to apply to the text.
  				 */
  var `type`: scala.Double
  /**
  				 * Attribute value.
  				 */
  var value: scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def getRange(): js.Array[scala.Double]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def getType(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def getValue(): scala.Double
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def setRange(range: js.Array[scala.Double]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def setType(`type`: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def setValue(value: scala.Double): scala.Unit
}

object Attribute {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getRange: js.Function0[js.Array[scala.Double]],
    getType: js.Function0[scala.Double],
    getValue: js.Function0[scala.Double],
    range: js.Array[scala.Double],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setRange: js.Function1[js.Array[scala.Double], scala.Unit],
    setType: js.Function1[scala.Double, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit],
    `type`: scala.Double,
    value: scala.Double,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getRange = getRange, getType = getType, getValue = getValue, range = range, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setRange = setRange, setType = setType, setValue = setValue, `type` = `type`, value = value)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Attribute]
  }
}

