package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DerivedSource extends js.Object {
  /** What source to base the produced source on (if any). */
  var derivationMode: js.UndefOr[java.lang.String] = js.undefined
  /** Specification of the source. */
  var source: js.UndefOr[Source] = js.undefined
}

object DerivedSource {
  @scala.inline
  def apply(derivationMode: java.lang.String = null, source: Source = null): DerivedSource = {
    val __obj = js.Dynamic.literal()
    if (derivationMode != null) __obj.updateDynamic("derivationMode")(derivationMode)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[DerivedSource]
  }
}

