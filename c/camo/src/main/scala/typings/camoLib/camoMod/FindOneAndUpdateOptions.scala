package typings
package camoLib.camoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneAndUpdateOptions extends js.Object {
  /**
  		 * Return a new document if one is not found with the given query.
  		 *
  		 * @type {boolean}
  		 */
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
}

object FindOneAndUpdateOptions {
  @scala.inline
  def apply(upsert: js.UndefOr[scala.Boolean] = js.undefined): FindOneAndUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[FindOneAndUpdateOptions]
  }
}

