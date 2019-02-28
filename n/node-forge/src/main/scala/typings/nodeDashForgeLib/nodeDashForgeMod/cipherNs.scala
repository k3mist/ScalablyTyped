package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "cipher")
@js.native
object cipherNs extends js.Object {
  trait Algorithm extends js.Object
  
  @js.native
  trait BlockCipher extends js.Object {
    var mode: Mode = js.native
    var output: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer = js.native
    def finish(): scala.Boolean = js.native
    def start(): scala.Unit = js.native
    def start(options: StartOptions): scala.Unit = js.native
    def update(payload: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): scala.Unit = js.native
  }
  
  trait Mode extends js.Object {
    var tag: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer
  }
  
  trait StartOptions extends js.Object {
    var additionalData: js.UndefOr[java.lang.String] = js.undefined
    var iv: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.Bytes] = js.undefined
    var tag: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer] = js.undefined
    var tagLength: js.UndefOr[scala.Double] = js.undefined
  }
  
  def createCipher(algorithm: Algorithm, payload: nodeDashForgeLib.nodeDashForgeMod.Bytes): BlockCipher = js.native
  def createCipher(algorithm: Algorithm, payload: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): BlockCipher = js.native
  def createDecipher(algorithm: Algorithm, payload: nodeDashForgeLib.nodeDashForgeMod.Bytes): BlockCipher = js.native
  def createDecipher(algorithm: Algorithm, payload: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): BlockCipher = js.native
}

