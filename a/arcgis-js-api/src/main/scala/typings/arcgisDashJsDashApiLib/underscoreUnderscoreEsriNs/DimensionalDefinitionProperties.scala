package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionalDefinitionProperties extends js.Object {
  /**
    * The dimension associated with the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#dimensionName)
    */
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the values indicate slices (rather than ranges).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice)
    *
    * @default false
    */
  var isSlice: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of tuples [min, max] each defining a range of valid values along the specified dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#values)
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The required variable name by which to filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#variableName)
    */
  var variableName: js.UndefOr[java.lang.String] = js.undefined
}

object DimensionalDefinitionProperties {
  @scala.inline
  def apply(
    dimensionName: java.lang.String = null,
    isSlice: js.UndefOr[scala.Boolean] = js.undefined,
    values: js.Array[_] = null,
    variableName: java.lang.String = null
  ): DimensionalDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (!js.isUndefined(isSlice)) __obj.updateDynamic("isSlice")(isSlice)
    if (values != null) __obj.updateDynamic("values")(values)
    if (variableName != null) __obj.updateDynamic("variableName")(variableName)
    __obj.asInstanceOf[DimensionalDefinitionProperties]
  }
}

