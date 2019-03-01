package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPerfSampleSeriesResponse extends js.Object {
  /** The resulting PerfSampleSeries sorted by id */
  var perfSampleSeries: js.UndefOr[js.Array[PerfSampleSeries]] = js.undefined
}

object ListPerfSampleSeriesResponse {
  @scala.inline
  def apply(perfSampleSeries: js.Array[PerfSampleSeries] = null): ListPerfSampleSeriesResponse = {
    val __obj = js.Dynamic.literal()
    if (perfSampleSeries != null) __obj.updateDynamic("perfSampleSeries")(perfSampleSeries)
    __obj.asInstanceOf[ListPerfSampleSeriesResponse]
  }
}

