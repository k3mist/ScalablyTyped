package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object CreateChannelOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): CreateChannelOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[CreateChannelOptions]
  }
}

