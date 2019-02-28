package typings
package abstractDashLeveldownLib.abstractDashLeveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBatch[K, V] extends AbstractBatch[K, V] {
  val key: K
  val `type`: abstractDashLeveldownLib.abstractDashLeveldownLibStrings.put
  val value: V
}

