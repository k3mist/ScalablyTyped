package typings
package jstsLib.jstsNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.io.GeoJSONWriter")
@js.native
/**
  * Writes the GeoJSON representation of a {@link Geometry}. The
  * The GeoJSON format is defined <A
  * HREF="http://geojson.org/geojson-spec.html">here</A>.
  * <p>
  * The <code>GeoJSONWriter</code> outputs coordinates rounded to the precision
  * model. Only the maximum number of decimal places necessary to represent the
  * ordinates to the required precision will be output.
  * <p>
  *
  * @see WKTReader
  * @constructor
  */
class GeoJSONWriter () extends js.Object {
  /**
    * Converts a <code>Geometry</code> to its GeoJSON representation.
    *
    * @param {jsts.geom.Geometry}
    *          geometry a <code>Geometry</code> to process.
    * @return {Object} The GeoJSON representation of the Geometry.
    */
  def write(geometry: jstsLib.jstsNs.geomNs.Geometry): js.Object = js.native
}

