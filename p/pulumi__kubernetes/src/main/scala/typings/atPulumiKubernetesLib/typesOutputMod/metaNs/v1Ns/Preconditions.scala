package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
  */
trait Preconditions extends js.Object {
  /**
    * Specifies the target UID.
    */
  val uid: java.lang.String
}

object Preconditions {
  @scala.inline
  def apply(uid: java.lang.String): Preconditions = {
    val __obj = js.Dynamic.literal(uid = uid)
  
    __obj.asInstanceOf[Preconditions]
  }
}

