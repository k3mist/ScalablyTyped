package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDatabaseDdlMetadata extends js.Object {
  /**
    * Reports the commit timestamps of all statements that have
    * succeeded so far, where `commit_timestamps[i]` is the commit
    * timestamp for the statement `statements[i]`.
    */
  var commitTimestamps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The database being modified. */
  var database: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For an update this list contains all the statements. For an
    * individual statement, this list contains only that statement.
    */
  var statements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object UpdateDatabaseDdlMetadata {
  @scala.inline
  def apply(
    commitTimestamps: js.Array[java.lang.String] = null,
    database: java.lang.String = null,
    statements: js.Array[java.lang.String] = null
  ): UpdateDatabaseDdlMetadata = {
    val __obj = js.Dynamic.literal()
    if (commitTimestamps != null) __obj.updateDynamic("commitTimestamps")(commitTimestamps)
    if (database != null) __obj.updateDynamic("database")(database)
    if (statements != null) __obj.updateDynamic("statements")(statements)
    __obj.asInstanceOf[UpdateDatabaseDdlMetadata]
  }
}

