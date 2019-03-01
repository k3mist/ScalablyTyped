package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFindOneAndRemoveOptions extends js.Object {
  /** puts a time limit on the query - requires mongodb >= 2.6.0 */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  /** like select, it determines which fields to return */
  var projection: js.UndefOr[js.Any] = js.undefined
  /** if true, returns the raw result from the MongoDB driver */
  var rawResult: js.UndefOr[scala.Boolean] = js.undefined
  /** sets the document fields to return */
  var select: js.UndefOr[js.Any] = js.undefined
  /**
    * if multiple docs are found by the conditions, sets the sort order to choose
    * which doc to update
    */
  var sort: js.UndefOr[js.Any] = js.undefined
  /** overwrites the schema's strict mode option for this update */
  var strict: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object QueryFindOneAndRemoveOptions {
  @scala.inline
  def apply(
    maxTimeMS: scala.Int | scala.Double = null,
    projection: js.Any = null,
    rawResult: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.Any = null,
    sort: js.Any = null,
    strict: scala.Boolean | java.lang.String = null
  ): QueryFindOneAndRemoveOptions = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(rawResult)) __obj.updateDynamic("rawResult")(rawResult)
    if (select != null) __obj.updateDynamic("select")(select)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFindOneAndRemoveOptions]
  }
}

