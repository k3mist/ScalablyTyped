package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayData extends js.Object {
  /** Contains value if the data is of a boolean type. */
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  /** Contains value if the data is of duration type. */
  var durationValue: js.UndefOr[java.lang.String] = js.undefined
  /** Contains value if the data is of float type. */
  var floatValue: js.UndefOr[scala.Double] = js.undefined
  /** Contains value if the data is of int64 type. */
  var int64Value: js.UndefOr[java.lang.String] = js.undefined
  /** Contains value if the data is of java class type. */
  var javaClassValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key identifying the display data.
    * This is intended to be used as a label for the display data
    * when viewed in a dax monitoring system.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** An optional label to display in a dax UI for the element. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The namespace for the key. This is usually a class name or programming
    * language namespace (i.e. python module) which defines the display data.
    * This allows a dax monitoring system to specially handle the data
    * and perform custom rendering.
    */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A possible additional shorter value to display.
    * For example a java_class_name_value of com.mypackage.MyDoFn
    * will be stored with MyDoFn as the short_str_value and
    * com.mypackage.MyDoFn as the java_class_name value.
    * short_str_value can be displayed and java_class_name_value
    * will be displayed as a tooltip.
    */
  var shortStrValue: js.UndefOr[java.lang.String] = js.undefined
  /** Contains value if the data is of string type. */
  var strValue: js.UndefOr[java.lang.String] = js.undefined
  /** Contains value if the data is of timestamp type. */
  var timestampValue: js.UndefOr[java.lang.String] = js.undefined
  /** An optional full URL. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object DisplayData {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[scala.Boolean] = js.undefined,
    durationValue: java.lang.String = null,
    floatValue: scala.Int | scala.Double = null,
    int64Value: java.lang.String = null,
    javaClassValue: java.lang.String = null,
    key: java.lang.String = null,
    label: java.lang.String = null,
    namespace: java.lang.String = null,
    shortStrValue: java.lang.String = null,
    strValue: java.lang.String = null,
    timestampValue: java.lang.String = null,
    url: java.lang.String = null
  ): DisplayData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (durationValue != null) __obj.updateDynamic("durationValue")(durationValue)
    if (floatValue != null) __obj.updateDynamic("floatValue")(floatValue.asInstanceOf[js.Any])
    if (int64Value != null) __obj.updateDynamic("int64Value")(int64Value)
    if (javaClassValue != null) __obj.updateDynamic("javaClassValue")(javaClassValue)
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (shortStrValue != null) __obj.updateDynamic("shortStrValue")(shortStrValue)
    if (strValue != null) __obj.updateDynamic("strValue")(strValue)
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DisplayData]
  }
}

