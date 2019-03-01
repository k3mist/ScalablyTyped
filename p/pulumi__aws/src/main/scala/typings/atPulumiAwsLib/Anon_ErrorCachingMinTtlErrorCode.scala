package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCachingMinTtlErrorCode extends js.Object {
  var errorCachingMinTtl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var errorCode: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var responseCode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var responsePagePath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_ErrorCachingMinTtlErrorCode {
  @scala.inline
  def apply(
    errorCode: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    errorCachingMinTtl: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    responseCode: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    responsePagePath: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ErrorCachingMinTtlErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    if (errorCachingMinTtl != null) __obj.updateDynamic("errorCachingMinTtl")(errorCachingMinTtl.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    if (responsePagePath != null) __obj.updateDynamic("responsePagePath")(responsePagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorCachingMinTtlErrorCode]
  }
}

