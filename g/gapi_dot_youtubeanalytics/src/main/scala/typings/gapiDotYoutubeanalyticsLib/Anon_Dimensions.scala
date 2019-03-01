package typings
package gapiDotYoutubeanalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  /**
    * A comma-separated list of YouTube Analytics dimensions, such as views or ageGroup,gender.
    */
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The end date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format.
    */
  var `end-date`: java.lang.String
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of filters that should be applied when retrieving YouTube Analytics data. The Available Reports document identifies the dimensions that can be used to filter each report, and the Dimensions document defines those dimensions. If a request uses multiple filters, join them together with a semicolon (;), and the returned result table will satisfy both filters.
    */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifies the YouTube channel or content owner for which you are retrieving YouTube Analytics data. - To request data for a YouTube user, set the ids parameter value to channel==CHANNEL_ID, where CHANNEL_ID specifies the unique YouTube channel ID. - To request data for a YouTube CMS content owner, set the ids parameter value to contentOwner==OWNER_NAME, where OWNER_NAME is the CMS name of the content owner.
    */
  var ids: java.lang.String
  /**
    * The maximum number of rows to include in the response.
    */
  var `max-results`: js.UndefOr[scala.Double] = js.undefined
  /**
    * A comma-separated list of YouTube Analytics metrics, such as views or likes,dislikes.
    */
  var metrics: java.lang.String
  /**
    * A comma-separated list of dimensions or metrics that determine the sort order for YouTube Analytics data. By default the sort order is ascending. The '-' prefix causes descending sort order.
    */
  var sort: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The start date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format.
    */
  var `start-date`: java.lang.String
  /**
    * An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter (one-based, inclusive).
    */
  var `start-index`: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    `end-date`: java.lang.String,
    ids: java.lang.String,
    metrics: java.lang.String,
    `start-date`: java.lang.String,
    dimensions: java.lang.String = null,
    fields: java.lang.String = null,
    filters: java.lang.String = null,
    `max-results`: scala.Int | scala.Double = null,
    sort: java.lang.String = null,
    `start-index`: scala.Int | scala.Double = null
  ): Anon_Dimensions = {
    val __obj = js.Dynamic.literal(ids = ids, metrics = metrics)
    __obj.updateDynamic("end-date")(`end-date`)
    __obj.updateDynamic("start-date")(`start-date`)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

