package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalSimpleLocalSimpleStringValueBlock")
@js.native
class LocalSimpleLocalSimpleStringValueBlock ()
  extends asn1jsLib.asn1jsMod.Asn1jsNs.LocalSimpleLocalSimpleStringValueBlock {
  def this(params: asn1jsLib.asn1jsMod.Asn1jsNs.LocalSimpleLocalSimpleStringValueBlockParams) = this()
  /* CompleteClass */
  override var blockLength: scala.Double = js.native
  /* CompleteClass */
  override var error: java.lang.String = js.native
  /* CompleteClass */
  override var valueBeforeDecode: stdLib.ArrayBuffer = js.native
  /* CompleteClass */
  override var warnings: js.Array[java.lang.String] = js.native
  /**
    * Convertion for the block to JSON object
    * 
    * @returns {JsonLocalBaseBlock}
    * 
    * @memberOf LocalBaseBlock
    */
  /* CompleteClass */
  override def toJSON(): asn1jsLib.asn1jsMod.Asn1jsNs.JsonLocalBaseBlock = js.native
}

