package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsRoute extends js.Object {
  /** contains the viewport bounding box of the `overview_polyline`. */
  var bounds: LatLngBounds
  /** contains the copyrights text to be displayed for this route. You must handle and display this information yourself. */
  var copyrights: java.lang.String
  /**
    * If present, contains the total fare (that is, the total ticket costs) on this route.
    * This property is only returned for transit requests and only for routes where fare information is available for all transit legs.
    *
    * **Note:** The Directions API only returns fare information for requests that contain either an API key or a client ID
    * and digital signature.
    */
  var fare: TransitFare
  /**
    * contains an array which contains information about a leg of the route, between two locations within the given route.
    * A separate leg will be present for each waypoint or destination specified.
    * (A route with no waypoints will contain exactly one leg within the `legs` array.)
    * Each leg consists of a series of `steps`.
    */
  var legs: js.Array[RouteLeg]
  /**
    * An array of LatLngs representing the entire course of this route. The path is simplified in order to make
    * it suitable in contexts where a small number of vertices is required (such as Static Maps API URLs).
    */
  var overview_path: js.Array[LatLngLiteral]
  /**
    * contains a single `points` object that holds an encoded polyline representation of the route.
    * This polyline is an approximate (smoothed) path of the resulting directions.
    */
  var overview_polyline: atGoogleMapsLib.Anon_Points
  /** contains a short textual description for the route, suitable for naming and disambiguating the route from alternatives. */
  var summary: java.lang.String
  /** contains an array of warnings to be displayed when showing these directions. You must handle and display these warnings yourself. */
  var warnings: js.Array[java.lang.String]
  /**
    * contains an array indicating the order of any waypoints in the calculated route.
    * This waypoints may be reordered if the request was passed `optimize:true` within its `waypoints` parameter.
    */
  var waypoint_order: js.Array[scala.Double]
}

object DirectionsRoute {
  @scala.inline
  def apply(
    bounds: LatLngBounds,
    copyrights: java.lang.String,
    fare: TransitFare,
    legs: js.Array[RouteLeg],
    overview_path: js.Array[LatLngLiteral],
    overview_polyline: atGoogleMapsLib.Anon_Points,
    summary: java.lang.String,
    warnings: js.Array[java.lang.String],
    waypoint_order: js.Array[scala.Double]
  ): DirectionsRoute = {
    val __obj = js.Dynamic.literal(bounds = bounds, copyrights = copyrights, fare = fare, legs = legs, overview_path = overview_path, overview_polyline = overview_polyline, summary = summary, warnings = warnings, waypoint_order = waypoint_order)
  
    __obj.asInstanceOf[DirectionsRoute]
  }
}

