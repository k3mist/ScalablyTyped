package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAreaParametersProperties extends js.Object {
  /**
    * The list of network attribute names to be accumulated with the analysis (i.e. which attributes should be returned as part of the response). The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attributes names listed in the Service Directory under `Network Dataset > Network Attributes` as `Usage Type: esriNAUTCost`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A set of attribute parameter values that can be parameterized to determine which network elements can be used by a vehicle. The parameter holding a vehicle characteristic is compared to a value coming from a descriptor attribute to determine whether or not a network element is traversable. For example, a parameterized restriction attribute can compare the height of your vehicle with a descriptor attribute that holds the clearance under overpasses through tunnels. If the vehicle's height is greater than the clearance, the edge is restricted.  Parameterized cost attributes that reference other cost attributes and scale them, can also be used. This is useful when inclement weather like ice, fog or heavy rain, descends on the study area and hinders normal flow of traffic. By having a parameter already outfitted on a cost attribute, travel-time expectations and traversable network paths can be adjusted with respect to changes in traffic speeds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * An array of numbers defining the breaks. The default value is defined in the network analysis layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#defaultBreaks)
    */
  var defaultBreaks: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * When `true`, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#doNotLocateOnRestrictedElements)
    *
    * @default true
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of network source names to NOT use when generating polygons. This property specifies if certain network sources should be excluded from the service area polygon generation. A service area on a multi-modal network where only one mode is being used to compute the service area would get a more appropriate shape if other modes are excluded from the polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#excludeSourcesFromPolygons)
    */
  var excludeSourcesFromPolygons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The set of facilities loaded as network locations during analysis. At ArcGIS Server 10.1, an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using `DataFile`. Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#facilities)
    */
  var facilities: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * The network attribute name used as the impedance attribute in analysis. The default is as defined in the routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset > Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty string, it will use the default of the service.  For example, set `impedanceAttribute = 'Time'` for quickest route and `impedanceAttribute = 'Length'` for shortest drive, assuming the service has those two esriNAUTCost attributes.  View the [Understanding the network attribute](http://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/understanding-network-attributes.htm) ArcGIS desktop help topic for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If `true`, similar ranges will be merged in the resulting polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#mergeSimilarPolygonRanges)
    *
    * @default false
    */
  var mergeSimilarPolygonRanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results. If `outSpatialReference` is not specified, the geometries are returned in the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The precision of the output geometry after generalization. If `0`, no generalization of output geometry is performed. If present and positive, it represents the `MaximumAllowableOffset` parameter and generalization is performed according to IPolycurve.Generalize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[scala.Double] = js.undefined
  /**
    * The units of the output geometry precision.  **Possible Values:** centimeters | decimal-degrees | decimeters | feet | inches | kilometers | meters | miles | millimeters | nautical-miles | points | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of output lines to be generated in the result. The default is defined in the specific routing network layer used in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * Possible Value | Description
    * ---------------|------------
    * none | No lines are returned
    * straight | Only returns straight lines
    * true-shape | Return the true shape of the lines
    * true-shape-with-measure | Return the true shape of the lines with their measurements
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of output polygons to be generated in the result. The default is as defined in the specific routing network layer used in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).  **Possible Values:** none | simplified | detailed
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputPolygons)
    */
  var outputPolygons: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates if the lines should overlap from multiple facilities. The default is defined by the network analysis layer in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#overlapLines)
    *
    * @default false
    */
  var overlapLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the polygons should overlap from multiple facilities. The default is defined by the network analysis layer in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#overlapPolygons)
    *
    * @default false
    */
  var overlapPolygons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The set of point barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * The set of polygon barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * The set of polyline barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * Specifies how U-turns should be handled. The default is defined in the routing network layer used in your RouteTask.
    *
    * Possible Value | Description
    * ---------------|------------
    * allow-backtrack | Allows U-turns on everywhere
    * at-dead-ends-only | Only allows U-turns at dead ends
    * no-backtrack | Restricts U-turns everywhere
    * at-dead-ends-and-intersections | Only allows U-turns at dead ends and intersections
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of network attribute names to be used as restrictions with the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attributes names listed in the Service Directory under `Network Dataset > Network Attributes` as `Usage Type: esriNAUTCost`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnFacilities)
    *
    * @default false
    */
  var returnFacilities: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, point barriers will be returned in the [pointBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#pointBarriers) property of the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnPointBarriers)
    *
    * @default false
    */
  var returnPointBarriers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, polygon barriers will be returned in the [polygonBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polygonBarriers) property of the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnPolygonBarriers)
    *
    * @default false
    */
  var returnPolygonBarriers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, polyline barriers will be returned in the [polylineBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polylineBarriers) property of the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnPolylineBarriers)
    *
    * @default false
    */
  var returnPolylineBarriers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, lines will be split at breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#splitLinesAtBreaks)
    *
    * @default false
    */
  var splitLinesAtBreaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, polygons will be split at breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#splitPolygonsAtBreaks)
    *
    * @default false
    */
  var splitPolygonsAtBreaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Local date and time at the facility. If `travelDirection = "to-facility"`, the `timeOfDay` value specifies arrival time at the facility. if `travelDirection = "from-facility"`, `timeOfDay` specifies departure time from the facility. Requires ArcGIS Server service version 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#timeOfDay)
    */
  var timeOfDay: js.UndefOr[DateProperties] = js.undefined
  /**
    * Options for traveling to or from the facility. Default values are defined by the network layer.
    *
    * Possible Value | Description
    * ---------------|------------
    * from-facility | Sets travel direction from the facility
    * to-facility | Sets travel direction to the facility
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#travelDirection)
    */
  var travelDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Travel modes define how a pedestrian, car, truck or other medium of transportation moves through the street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[js.Any] = js.undefined
  /**
    * If `true`, the outermost polygon (at the maximum break value) will be trimmed. The default is defined in the network analysis layer in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimOuterPolygon)
    *
    * @default false
    */
  var trimOuterPolygon: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If polygons are being trimmed, provides the distance to trim. The default value is defined in the network analysis layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimPolygonDistance)
    */
  var trimPolygonDistance: js.UndefOr[scala.Double] = js.undefined
  /**
    * If polygons are being trimmed, specifies the units of [trimPolygonDistance](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimPolygonDistance). The default is defined in the network analysis layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimPolygonDistanceUnits)
    */
  var trimPolygonDistanceUnits: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When `true`, the hierarchy attributes for the network will be used in the analysis. The default value is defined in the network layer. `useHierarchy` cannot be used in conjunction with [outputLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputLines). Requires an ArcGIS Server service version 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[scala.Boolean] = js.undefined
}

