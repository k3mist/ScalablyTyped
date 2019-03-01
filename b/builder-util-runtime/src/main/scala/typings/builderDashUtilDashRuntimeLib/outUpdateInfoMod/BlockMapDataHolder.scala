package typings
package builderDashUtilDashRuntimeLib.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockMapDataHolder extends js.Object {
  /**
    * The block map file size. Used when block map data is embedded into the file (appimage, windows web installer package).
    * This information can be obtained from the file itself, but it requires additional HTTP request,
    * so, to reduce request count, block map size is specified in the update metadata too.
    */
  var blockMapSize: js.UndefOr[scala.Double] = js.undefined
  val isAdminRightsRequired: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The file checksum.
    */
  val sha512: java.lang.String
  /**
    * The file size. Used to verify downloaded size (save one HTTP request to get length).
    * Also used when block map data is embedded into the file (appimage, windows web installer package).
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object BlockMapDataHolder {
  @scala.inline
  def apply(
    sha512: java.lang.String,
    blockMapSize: scala.Int | scala.Double = null,
    isAdminRightsRequired: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null
  ): BlockMapDataHolder = {
    val __obj = js.Dynamic.literal(sha512 = sha512)
    if (blockMapSize != null) __obj.updateDynamic("blockMapSize")(blockMapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdminRightsRequired)) __obj.updateDynamic("isAdminRightsRequired")(isAdminRightsRequired)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockMapDataHolder]
  }
}

