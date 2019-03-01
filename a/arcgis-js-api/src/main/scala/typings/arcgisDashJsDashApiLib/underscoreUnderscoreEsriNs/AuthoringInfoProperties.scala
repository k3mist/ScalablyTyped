package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthoringInfoProperties extends js.Object {
  /**
    * Indicates which classification method was used if a classed color or classed size renderer was generated using one of the Smart Mapping functions.  **Possible Values:** equal-interval | manual | natural-breaks | quantile | standard-deviation
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#classificationMethod)
    */
  var classificationMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html) along with [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2). In the default visualization, the values of this field are rendered along the vertical axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var field1: js.UndefOr[AuthoringInfoField1] = js.undefined
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html) along with [field1](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1). In the default visualization, the values of this field are rendered along the horizontal axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var field2: js.UndefOr[AuthoringInfoField2] = js.undefined
  /**
    * An array of string values representing field names used for creating a [predominance renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#fields)
    */
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The focus of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html). This determines the orientation of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#focus)
    */
  var focus: js.UndefOr[java.lang.String] = js.undefined
  /**
    * **Only applicable to renderer used in web scenes.** Indicates the unit used in real-world sizes.  **Possible Values:** inches | feet | yards | miles | nautical-miles | millimeters | centimeters | decimeters | meters | kilometers | decimal-degrees
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of classes used to classify each field of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html). This determines the number of categories in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#numClasses)
    */
  var numClasses: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the standard deviation interval for each stop in a classed color or classed size renderer that was generated using the `standard-deviation` classification method.  **Possible Values:** 0.25 | 0.33 | 0.5 | 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#standardDeviationInterval)
    */
  var standardDeviationInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the renderer type generated from one of the Smart Mapping functions.  **Possible Values:** class-breaks-size | class-breaks-color | classed-color | classed-size | predominance | relationship | univariate-color-size
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#type)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[AuthoringInfoVisualVariableProperties]] = js.undefined
}

object AuthoringInfoProperties {
  @scala.inline
  def apply(
    classificationMethod: java.lang.String = null,
    field1: AuthoringInfoField1 = null,
    field2: AuthoringInfoField2 = null,
    fields: js.Array[java.lang.String] = null,
    focus: java.lang.String = null,
    lengthUnit: java.lang.String = null,
    numClasses: scala.Int | scala.Double = null,
    standardDeviationInterval: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    visualVariables: js.Array[AuthoringInfoVisualVariableProperties] = null
  ): AuthoringInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (classificationMethod != null) __obj.updateDynamic("classificationMethod")(classificationMethod)
    if (field1 != null) __obj.updateDynamic("field1")(field1)
    if (field2 != null) __obj.updateDynamic("field2")(field2)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (lengthUnit != null) __obj.updateDynamic("lengthUnit")(lengthUnit)
    if (numClasses != null) __obj.updateDynamic("numClasses")(numClasses.asInstanceOf[js.Any])
    if (standardDeviationInterval != null) __obj.updateDynamic("standardDeviationInterval")(standardDeviationInterval.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (visualVariables != null) __obj.updateDynamic("visualVariables")(visualVariables)
    __obj.asInstanceOf[AuthoringInfoProperties]
  }
}

