package typings
package sugarLib.sugarjsNs.RegExpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def addFlags(flags: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp]
  def exec(string: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpExecArray | scala.Null]
  def getFlags(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String]
  def removeFlags(flags: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp]
  def setFlags(flags: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp]
  def test(string: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean]
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    addFlags: js.Function1[java.lang.String, sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp]],
    exec: js.Function1[
      java.lang.String, 
      sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpExecArray | scala.Null]
    ],
    getFlags: js.Function0[sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String]],
    raw: RawValue,
    removeFlags: js.Function1[java.lang.String, sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp]],
    setFlags: js.Function1[java.lang.String, sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp]],
    test: js.Function1[java.lang.String, sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean]],
    toString: js.Function0[java.lang.String],
    valueOf: js.Function0[RawValue]
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(addFlags = addFlags, exec = exec, getFlags = getFlags, raw = raw.asInstanceOf[js.Any], removeFlags = removeFlags, setFlags = setFlags, test = test, toString = toString, valueOf = valueOf)
  
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

