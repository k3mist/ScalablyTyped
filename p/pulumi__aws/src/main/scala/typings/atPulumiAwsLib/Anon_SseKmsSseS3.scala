package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SseKmsSseS3 extends js.Object {
  var sseKms: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_KeyIdInput]] = js.undefined
  var sseS3: js.UndefOr[atPulumiPulumiLib.outputMod.Input[js.Object]] = js.undefined
}

object Anon_SseKmsSseS3 {
  @scala.inline
  def apply(
    sseKms: atPulumiPulumiLib.outputMod.Input[Anon_KeyIdInput] = null,
    sseS3: atPulumiPulumiLib.outputMod.Input[js.Object] = null
  ): Anon_SseKmsSseS3 = {
    val __obj = js.Dynamic.literal()
    if (sseKms != null) __obj.updateDynamic("sseKms")(sseKms.asInstanceOf[js.Any])
    if (sseS3 != null) __obj.updateDynamic("sseS3")(sseS3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SseKmsSseS3]
  }
}

