package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeBucketPrivateOptions extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var includeFiles: js.UndefOr[scala.Boolean] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object MakeBucketPrivateOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[scala.Boolean] = js.undefined,
    includeFiles: js.UndefOr[scala.Boolean] = js.undefined,
    userProject: java.lang.String = null
  ): MakeBucketPrivateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(includeFiles)) __obj.updateDynamic("includeFiles")(includeFiles)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[MakeBucketPrivateOptions]
  }
}

