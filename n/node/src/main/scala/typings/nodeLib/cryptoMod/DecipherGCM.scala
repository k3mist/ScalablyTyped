package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecipherGCM extends Decipher {
  def setAAD(buffer: Binary): this.type = js.native
  def setAAD(buffer: Binary, options: nodeLib.Anon_PlaintextLength): this.type = js.native
  def setAuthTag(buffer: Binary): this.type = js.native
}

