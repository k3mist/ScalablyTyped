package typings
package qrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeflateLevel extends js.Object {
  /**
    * Compression level for deflate.
    * Default: 9
    */
  var deflateLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    * Compression strategy for deflate.
    * Default: 3
    */
  var deflateStrategy: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DeflateLevel {
  @scala.inline
  def apply(deflateLevel: scala.Int | scala.Double = null, deflateStrategy: scala.Int | scala.Double = null): Anon_DeflateLevel = {
    val __obj = js.Dynamic.literal()
    if (deflateLevel != null) __obj.updateDynamic("deflateLevel")(deflateLevel.asInstanceOf[js.Any])
    if (deflateStrategy != null) __obj.updateDynamic("deflateStrategy")(deflateStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeflateLevel]
  }
}

