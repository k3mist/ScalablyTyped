package typings
package osrmLib.osrmMod.OSRMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The trip plugin solves the Traveling Salesman Problem using a greedy heuristic (farthest-insertion algorithm).
  * The returned path does not have to be the fastest path, as TSP is NP-hard it is only an approximation.
  * Note that all input coordinates have to be connected for the trip service to work.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#trip
  */
trait TripOptions extends Options {
  /**
    * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
    * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
    */
  var annotations: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
    * Return route ends at any coordinate. Can also be last. (optional, default any)
    */
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add overview geometry either full, simplified (optional, default simplified)
    */
  var overview: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return route is a roundtrip. (optional, default true)
    */
  var roundtrip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Return route starts at any coordinate. Can also be first. (optional, default any)
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[scala.Boolean] = js.undefined
}

object TripOptions {
  @scala.inline
  def apply(
    annotations: scala.Boolean | js.Array[java.lang.String] = null,
    bearings: js.Array[Bearing] = null,
    coordinates: js.Array[Coordinate] = null,
    destination: java.lang.String = null,
    generate_hints: js.UndefOr[scala.Boolean] = js.undefined,
    geometries: java.lang.String = null,
    hints: js.Array[Hint] = null,
    overview: java.lang.String = null,
    radiuses: js.Array[Radius] = null,
    roundtrip: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    steps: js.UndefOr[scala.Boolean] = js.undefined
  ): TripOptions = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (bearings != null) __obj.updateDynamic("bearings")(bearings)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (!js.isUndefined(generate_hints)) __obj.updateDynamic("generate_hints")(generate_hints)
    if (geometries != null) __obj.updateDynamic("geometries")(geometries)
    if (hints != null) __obj.updateDynamic("hints")(hints)
    if (overview != null) __obj.updateDynamic("overview")(overview)
    if (radiuses != null) __obj.updateDynamic("radiuses")(radiuses)
    if (!js.isUndefined(roundtrip)) __obj.updateDynamic("roundtrip")(roundtrip)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[TripOptions]
  }
}

