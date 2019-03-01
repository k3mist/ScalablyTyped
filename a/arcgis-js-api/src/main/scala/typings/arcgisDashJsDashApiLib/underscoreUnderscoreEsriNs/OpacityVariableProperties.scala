package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacityVariableProperties extends VisualVariableProperties {
  /**
    * Name of the numeric attribute field by which to normalize the data. If this field is used, then the values in [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops) should be normalized as percentages or ratios.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#normalizationField)
    */
  var normalizationField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of objects that defines the opacity to apply to features in a layer in a sequence of stops. You must specify 2 - 8 stops. In most cases, no more than five are needed. Features with data values that fall between the given stops will be assigned opacity values linearly interpolated along the ramp in relation to the stop values. The stops must be listed in ascending order based on the value of the `value` property in each stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops)
    */
  var stops: js.UndefOr[js.Array[OpacityStopProperties]] = js.undefined
}

object OpacityVariableProperties {
  @scala.inline
  def apply(
    field: java.lang.String = null,
    index: java.lang.String | scala.Double = null,
    legendOptions: VisualVariableLegendOptions = null,
    normalizationField: java.lang.String = null,
    stops: js.Array[OpacityStopProperties] = null,
    valueExpression: java.lang.String = null,
    valueExpressionTitle: java.lang.String = null
  ): OpacityVariableProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle)
    __obj.asInstanceOf[OpacityVariableProperties]
  }
}

