package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledKmsKeyId extends js.Object {
  var enabled: scala.Boolean
  var kmsKeyId: java.lang.String
}

object Anon_EnabledKmsKeyId {
  @scala.inline
  def apply(enabled: scala.Boolean, kmsKeyId: java.lang.String): Anon_EnabledKmsKeyId = {
    val __obj = js.Dynamic.literal(enabled = enabled, kmsKeyId = kmsKeyId)
  
    __obj.asInstanceOf[Anon_EnabledKmsKeyId]
  }
}

