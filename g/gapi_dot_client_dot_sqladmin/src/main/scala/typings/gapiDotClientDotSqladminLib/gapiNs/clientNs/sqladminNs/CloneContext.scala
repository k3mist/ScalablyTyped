package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneContext extends js.Object {
  /**
    * Binary log coordinates, if specified, indentify the the position up to which the source instance should be cloned. If not specified, the source
    * instance is cloned up to the most recent binary log coordintes.
    */
  var binLogCoordinates: js.UndefOr[BinLogCoordinates] = js.undefined
  /** Name of the Cloud SQL instance to be created as a clone. */
  var destinationInstanceName: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#cloneContext. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object CloneContext {
  @scala.inline
  def apply(
    binLogCoordinates: BinLogCoordinates = null,
    destinationInstanceName: java.lang.String = null,
    kind: java.lang.String = null
  ): CloneContext = {
    val __obj = js.Dynamic.literal()
    if (binLogCoordinates != null) __obj.updateDynamic("binLogCoordinates")(binLogCoordinates)
    if (destinationInstanceName != null) __obj.updateDynamic("destinationInstanceName")(destinationInstanceName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CloneContext]
  }
}

