package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicRuleProperties extends js.Object {
  /**
    * Indicates whether the sort should be ascending. This property applies to all mosaic [methods](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) where an ordering is defined except `seamline`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#ascending)
    *
    * @default true
    */
  var ascending: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of raster Ids. All the rasters with the given list of raster Ids are selected to participate in the mosaic. The rasters will be visible at all pixel sizes regardless of the minimum and maximum pixel size range of the locked rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#lockRasterIds)
    */
  var lockRasterIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The mosaic method determines how the selected rasters are ordered.  **Possible Values:** none | center | nadir | viewpoint | attribute | lock-raster | northwest | seamline
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method)
    */
  var method: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.none | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.center | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.nadir | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.viewpoint | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.attribute | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`lock-raster` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.northwest | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.seamline
  ] = js.undefined
  /**
    * A multiple dimensional service can have multiple dimensions for one or more variables. Use multiDimensionalDefinitions to filter data based on a slice or range of data. For example, a single ImageryLayer may have a `depth` dimension storing sea temperatures for the same pixel location at various depths. Another dimension could be `time`, where the same pixel stores multiple values based on a window of time.  This property can be used to filter and display ImageryLayer pixels for specific "slices" in those dimensions (e.g. display sea temperature at 1000m below sea level for a specific week in the year).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.UndefOr[js.Array[DimensionalDefinitionProperties]] = js.undefined
  /**
    * Defines a selection using a set of ObjectIDs. This property applies to all mosaic methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Defines the mosaic operation used to resolve overlapping pixels.  **Possible Values:** first | last | min | max | mean | blend
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#operation)
    */
  var operation: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.first | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.last | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.min | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.max | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.mean | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.blend
  ] = js.undefined
  /**
    * The name of the attribute field that is used with a constant sortValue to define the mosaicking order when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`. The ordering is defined by the absolute value of the difference between the specified sort field value and the sort base value. For example, if the sort field is `Month` and the sort value is `7 (July)`, then the ordering is defined by `ABS(Month -7)`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortField)
    */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A constant value defining a reference or base value for the sort field when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortValue)
    */
  var sortValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the viewpoint location on which the ordering is defined based on the distance from the viewpoint and the nadir of rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#viewpoint)
    */
  var viewpoint: js.UndefOr[PointProperties] = js.undefined
  /**
    * The where clause determines which rasters will participate in the mosaic. This property applies to all mosaic methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where)
    */
  var where: js.UndefOr[java.lang.String] = js.undefined
}

