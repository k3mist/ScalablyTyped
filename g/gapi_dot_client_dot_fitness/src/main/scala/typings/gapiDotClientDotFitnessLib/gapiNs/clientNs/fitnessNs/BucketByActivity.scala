package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketByActivity extends js.Object {
  /** The default activity stream will be used if a specific activityDataSourceId is not specified. */
  var activityDataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies that only activity segments of duration longer than minDurationMillis are considered and used as a container for aggregated data. */
  var minDurationMillis: js.UndefOr[java.lang.String] = js.undefined
}

object BucketByActivity {
  @scala.inline
  def apply(activityDataSourceId: java.lang.String = null, minDurationMillis: java.lang.String = null): BucketByActivity = {
    val __obj = js.Dynamic.literal()
    if (activityDataSourceId != null) __obj.updateDynamic("activityDataSourceId")(activityDataSourceId)
    if (minDurationMillis != null) __obj.updateDynamic("minDurationMillis")(minDurationMillis)
    __obj.asInstanceOf[BucketByActivity]
  }
}

