package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldAttributes extends js.Object {
  var qDec: java.lang.String
  var qFmt: java.lang.String
  var qSAFEARRAY: js.Array[_]
  var qThou: java.lang.String
  var qType: qlikLib.qlikLibStrings.U | qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.I | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.F | qlikLib.qlikLibStrings.M | qlikLib.qlikLibStrings.D | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.TS | qlikLib.qlikLibStrings.IV
  var qUseThou: qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`
  var qnDec: qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1` | qlikLib.qlikLibNumbers.`2` | qlikLib.qlikLibNumbers.`3` | qlikLib.qlikLibNumbers.`4` | qlikLib.qlikLibNumbers.`5` | qlikLib.qlikLibNumbers.`6` | qlikLib.qlikLibNumbers.`7` | qlikLib.qlikLibNumbers.`8` | qlikLib.qlikLibNumbers.`9` | qlikLib.qlikLibNumbers.`10` | qlikLib.qlikLibNumbers.`11` | qlikLib.qlikLibNumbers.`12` | qlikLib.qlikLibNumbers.`13` | qlikLib.qlikLibNumbers.`14` | qlikLib.qlikLibNumbers.`15`
}

object FieldAttributes {
  @scala.inline
  def apply(
    qDec: java.lang.String,
    qFmt: java.lang.String,
    qSAFEARRAY: js.Array[_],
    qThou: java.lang.String,
    qType: qlikLib.qlikLibStrings.U | qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.I | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.F | qlikLib.qlikLibStrings.M | qlikLib.qlikLibStrings.D | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.TS | qlikLib.qlikLibStrings.IV,
    qUseThou: qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`,
    qnDec: qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1` | qlikLib.qlikLibNumbers.`2` | qlikLib.qlikLibNumbers.`3` | qlikLib.qlikLibNumbers.`4` | qlikLib.qlikLibNumbers.`5` | qlikLib.qlikLibNumbers.`6` | qlikLib.qlikLibNumbers.`7` | qlikLib.qlikLibNumbers.`8` | qlikLib.qlikLibNumbers.`9` | qlikLib.qlikLibNumbers.`10` | qlikLib.qlikLibNumbers.`11` | qlikLib.qlikLibNumbers.`12` | qlikLib.qlikLibNumbers.`13` | qlikLib.qlikLibNumbers.`14` | qlikLib.qlikLibNumbers.`15`
  ): FieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec, qFmt = qFmt, qSAFEARRAY = qSAFEARRAY, qThou = qThou, qType = qType.asInstanceOf[js.Any], qUseThou = qUseThou.asInstanceOf[js.Any], qnDec = qnDec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldAttributes]
  }
}

