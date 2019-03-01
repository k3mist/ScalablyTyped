package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AtimeBytesPerSecond extends js.Object {
  var atime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var bytesPerSecond: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var gid: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var mtime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var posixPermissions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var preserveDeletedFiles: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var preserveDevices: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var uid: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var verifyMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_AtimeBytesPerSecond {
  @scala.inline
  def apply(
    atime: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    bytesPerSecond: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    gid: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    mtime: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    posixPermissions: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    preserveDeletedFiles: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    preserveDevices: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    uid: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    verifyMode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_AtimeBytesPerSecond = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (bytesPerSecond != null) __obj.updateDynamic("bytesPerSecond")(bytesPerSecond.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (posixPermissions != null) __obj.updateDynamic("posixPermissions")(posixPermissions.asInstanceOf[js.Any])
    if (preserveDeletedFiles != null) __obj.updateDynamic("preserveDeletedFiles")(preserveDeletedFiles.asInstanceOf[js.Any])
    if (preserveDevices != null) __obj.updateDynamic("preserveDevices")(preserveDevices.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (verifyMode != null) __obj.updateDynamic("verifyMode")(verifyMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AtimeBytesPerSecond]
  }
}

