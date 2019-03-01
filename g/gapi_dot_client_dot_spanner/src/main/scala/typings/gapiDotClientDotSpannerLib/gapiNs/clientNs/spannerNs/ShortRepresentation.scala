package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortRepresentation extends js.Object {
  /** A string representation of the expression subtree rooted at this node. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of (subquery variable name) -> (subquery node id) for cases
    * where the `description` string of this node references a `SCALAR`
    * subquery contained in the expression subtree rooted at this node. The
    * referenced `SCALAR` subquery may not necessarily be a direct child of
    * this node.
    */
  var subqueries: js.UndefOr[stdLib.Record[java.lang.String, scala.Double]] = js.undefined
}

object ShortRepresentation {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    subqueries: stdLib.Record[java.lang.String, scala.Double] = null
  ): ShortRepresentation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (subqueries != null) __obj.updateDynamic("subqueries")(subqueries)
    __obj.asInstanceOf[ShortRepresentation]
  }
}

