package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GqlQueryParameter extends js.Object {
  /**
    * A query cursor. Query cursors are returned in query
    * result batches.
    */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /** A value parameter. */
  var value: js.UndefOr[Value] = js.undefined
}

object GqlQueryParameter {
  @scala.inline
  def apply(cursor: java.lang.String = null, value: Value = null): GqlQueryParameter = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GqlQueryParameter]
  }
}

