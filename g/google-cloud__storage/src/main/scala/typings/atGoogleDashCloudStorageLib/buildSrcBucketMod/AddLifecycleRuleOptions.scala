package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddLifecycleRuleOptions extends js.Object {
  var append: js.UndefOr[scala.Boolean] = js.undefined
}

object AddLifecycleRuleOptions {
  @scala.inline
  def apply(append: js.UndefOr[scala.Boolean] = js.undefined): AddLifecycleRuleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append)
    __obj.asInstanceOf[AddLifecycleRuleOptions]
  }
}

