package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServingRestriction extends js.Object {
  /** The contexts for the restriction. */
  var contexts: js.UndefOr[js.Array[ServingContext]] = js.undefined
  /**
    * Any disapprovals bound to this restriction.
    * Only present if status=DISAPPROVED.
    * Can be used to filter the response of the
    * creatives.list
    * method.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Disapproval]] = js.undefined
  /**
    * The status of the creative in this context (for example, it has been
    * explicitly disapproved or is pending review).
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ServingRestriction {
  @scala.inline
  def apply(
    contexts: js.Array[ServingContext] = null,
    disapprovalReasons: js.Array[Disapproval] = null,
    status: java.lang.String = null
  ): ServingRestriction = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (disapprovalReasons != null) __obj.updateDynamic("disapprovalReasons")(disapprovalReasons)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ServingRestriction]
  }
}

