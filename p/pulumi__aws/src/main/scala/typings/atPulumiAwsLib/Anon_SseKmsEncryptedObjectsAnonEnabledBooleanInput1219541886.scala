package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput1219541886 extends js.Object {
  var sseKmsEncryptedObjects: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledBooleanInput_1219541886]] = js.undefined
}

object Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput1219541886 {
  @scala.inline
  def apply(
    sseKmsEncryptedObjects: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledBooleanInput_1219541886] = null
  ): Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput1219541886 = {
    val __obj = js.Dynamic.literal()
    if (sseKmsEncryptedObjects != null) __obj.updateDynamic("sseKmsEncryptedObjects")(sseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput1219541886]
  }
}

