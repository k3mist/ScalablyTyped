package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequesterPays extends js.Object {
  /** When set to true, bucket is requester pays. */
  var requesterPays: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RequesterPays {
  @scala.inline
  def apply(requesterPays: js.UndefOr[scala.Boolean] = js.undefined): Anon_RequesterPays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requesterPays)) __obj.updateDynamic("requesterPays")(requesterPays)
    __obj.asInstanceOf[Anon_RequesterPays]
  }
}

