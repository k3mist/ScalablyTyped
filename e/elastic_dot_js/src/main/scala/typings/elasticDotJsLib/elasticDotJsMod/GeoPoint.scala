package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoPoint")
@js.native
class GeoPoint protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint {
  /*
    Defines a point
    */
  def this(p: js.Array[_]) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the GeoPoint from an array point.  The array must contain only
    2 values.  The first value is the lat and the 2nd value is the lon.
    Example:
    [41.12, -71.34]
    */
  /* CompleteClass */
  override def array(a: js.Array[_]): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint = js.native
  /*
    Sets the GeoPoint as a GeoHash.  The hash is a string of
    alpha-numeric characters with a precision length that defaults to 12.
    Example:
    "drm3btev3e86"
    */
  /* CompleteClass */
  override def geohash(hash: java.lang.String, precision: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint = js.native
  /*
    Sets the GeoPoint as properties on an object.  The object must have
    a 'lat' and 'lon' or a 'geohash' property.
    Example:
    {lat: 41.12, lon: -71.34} or {geohash: "drm3btev3e86"}
    */
  /* CompleteClass */
  override def properties(obj: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint = js.native
  /*
    Sets the GeoPoint as a string.  The format is "lat,lon".
    Example:
    "41.12,-71.34"
    */
  /* CompleteClass */
  override def string(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint = js.native
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

