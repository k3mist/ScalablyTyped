package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataPointChangesResponse extends js.Object {
  /** The data stream ID of the data source with data point changes. */
  var dataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /** Deleted data points for the user. Note, for modifications this should be parsed before handling insertions. */
  var deletedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.undefined
  /** Inserted data points for the user. */
  var insertedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListDataPointChangesResponse {
  @scala.inline
  def apply(
    dataSourceId: java.lang.String = null,
    deletedDataPoint: js.Array[DataPoint] = null,
    insertedDataPoint: js.Array[DataPoint] = null,
    nextPageToken: java.lang.String = null
  ): ListDataPointChangesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId)
    if (deletedDataPoint != null) __obj.updateDynamic("deletedDataPoint")(deletedDataPoint)
    if (insertedDataPoint != null) __obj.updateDynamic("insertedDataPoint")(insertedDataPoint)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListDataPointChangesResponse]
  }
}

